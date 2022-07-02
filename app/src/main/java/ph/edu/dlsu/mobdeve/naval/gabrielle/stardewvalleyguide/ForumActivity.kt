package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.PostAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityForumBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityProfileBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Post
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util.StoragePreferences
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class ForumActivity : AppCompatActivity() {
    private lateinit var binding : ActivityForumBinding
    private lateinit var database : DatabaseReference
    private val dbURL = "https://stardewvalleyguide-f1bc9-default-rtdb.asia-southeast1.firebasedatabase.app/"
    private lateinit var storagePreferences: StoragePreferences
    private lateinit var postAdapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storagePreferences = StoragePreferences(applicationContext)

        var currUser = storagePreferences.getStringPreferences("username")
        var currName = storagePreferences.getStringPreferences("name")

        database = FirebaseDatabase.getInstance(dbURL).getReference("Posts")
        database.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                var postArrayList = ArrayList<Post>()
                 if (snapshot.exists()){
                     for (postSnapshot in snapshot.children) {
                         val post = postSnapshot.getValue(Post::class.java)
                         if(post!!.show)
                             postArrayList.add(0,post!!)
                     }

                     binding.postList.setLayoutManager(LinearLayoutManager(applicationContext))

                     postAdapter = PostAdapter(applicationContext, postArrayList)
                     binding.postList.setAdapter(postAdapter)
                 }

            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(applicationContext,"Failed to load entries.", Toast.LENGTH_SHORT).show()
            }

        })

        binding.btnPost.setOnClickListener {
            var text = binding.etPost.text.toString()
            if (text.isNotBlank()) {
                binding.etPost.setBackgroundColor(Color.LTGRAY)
                var post = Post()
                post.dateTime = getDateTime()
                post.name = currName!!
                post.username = currUser!!
                post.text = text

                database.child(post.dateTime).setValue(post).addOnSuccessListener {
                    binding.etPost.text.clear()
                    Toast.makeText(applicationContext,"Post added.", Toast.LENGTH_SHORT).show()
                    binding.etPost.setBackgroundResource(R.color.post_color)
//                    storagePreferences.saveStringPreferences("username", username)
//                    startActivity(goToHome)
//                    finish()
                }.addOnFailureListener {
                    Toast.makeText(applicationContext,"Posting failed.", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }

    private fun getDateTime(): String {
        val current = Calendar.getInstance().time
        val formatter = SimpleDateFormat("MMMM dd, yyyy hh:mm:SS a")
        return formatter.format(current)
    }

}