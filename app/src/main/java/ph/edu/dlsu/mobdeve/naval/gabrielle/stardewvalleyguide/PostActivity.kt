package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.ReplyAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityPostBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Reply
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util.StoragePreferences
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PostActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPostBinding
    private lateinit var database : DatabaseReference
    private val dbURL = "https://stardewvalleyguide-f1bc9-default-rtdb.asia-southeast1.firebasedatabase.app/"
    private lateinit var storagePreferences: StoragePreferences
    private lateinit var replyAdapter: ReplyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storagePreferences = StoragePreferences(applicationContext)

        var currUser = storagePreferences.getStringPreferences("username")
        var currName = storagePreferences.getStringPreferences("name")

        var post = intent.extras!!.getString("dateTime")
        var postUser = intent.extras!!.getString("username")
        var postName = intent.extras!!.getString("name")
        var postText = intent.extras!!.getString("text")

        binding.tvUsername.text = postUser
        binding.tvName.text = postName
        binding.tvDateTime.text = post
        binding.tvText.text = postText

        if (postUser != currUser)
            binding.tvDelete.visibility = View.GONE

        database = FirebaseDatabase.getInstance(dbURL).getReference("Posts")
        database.child(post!!).child("replies").addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                var replyArrayList = ArrayList<Reply>()
                if (snapshot.exists()){
                    for (replySnapshot in snapshot.children) {
                        val reply = replySnapshot.getValue(Reply::class.java)
                        if(reply!!.show)
                            replyArrayList.add(reply!!)
                    }

                    binding.replyList.setLayoutManager(LinearLayoutManager(applicationContext))

                    replyAdapter = ReplyAdapter(applicationContext, replyArrayList)
                    binding.replyList.setAdapter(replyAdapter)
                }

            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(applicationContext,"Failed to load entries.", Toast.LENGTH_SHORT).show()
            }

        })

        binding.btnReply.setOnClickListener {
            var text = binding.etReply.text.toString()
            if (text.isNotBlank()) {
                binding.etReply.setBackgroundColor(Color.LTGRAY)
                var reply = Reply()
                reply.dateTime = getDateTime()
                reply.name = currName!!
                reply.username = currUser!!
                reply.text = text

                database.child(post!!).child("replies").child(reply.dateTime).setValue(reply).addOnSuccessListener {
                    binding.etReply.text.clear()
                    Toast.makeText(applicationContext,"Reply added.", Toast.LENGTH_SHORT).show()
                    binding.etReply.setBackgroundResource(R.color.post_color)
                }.addOnFailureListener {
                    Toast.makeText(applicationContext,"Replying failed.", Toast.LENGTH_SHORT).show()
                }
            }

        }

        binding.tvDelete.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            with(builder)
            {
                setTitle("Deleting Post")
                setMessage("Are you sure you want to delete this post and all replies under it?")
                setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    proceedDeletePost(post!!)
                })
                setNegativeButton("Cancel", null)
                show()
            }
        }
    }

    private fun getDateTime(): String {
        val current = Calendar.getInstance().time
        val formatter = SimpleDateFormat("MMMM dd, yyyy hh:mm:SS a")
        return formatter.format(current)
    }

    private fun proceedDeletePost(post: String) {
        database.child(post!!).child("show").setValue(false)
        finish()
    }

}