package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityMainBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityProfileBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util.StoragePreferences

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProfileBinding
    private lateinit var database : DatabaseReference
    private val dbURL = "https://stardewvalleyguide-f1bc9-default-rtdb.asia-southeast1.firebasedatabase.app/"
    private lateinit var storagePreferences: StoragePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storagePreferences = StoragePreferences(applicationContext)

        var username = storagePreferences.getStringPreferences("username")

        database = FirebaseDatabase.getInstance(dbURL).getReference("Users")
        database.child(username!!).get().addOnSuccessListener {
            if (it.exists()){
                //account details found
                binding.tvPlayerName.text = it.child("name").value.toString()
                binding.tvFarmName.text = it.child("farmName").value.toString()
                binding.tvCurrseason.text = it.child("currSeason").value.toString()
                binding.tvGender.text = it.child("gender").value.toString()
                binding.tvFarmtype.text = it.child("farmType").value.toString()
            }
        }.addOnFailureListener{
            Toast.makeText(applicationContext,"Loading $username details...", Toast.LENGTH_SHORT).show()
        }

        binding.btnEditAccount.setOnClickListener {
            var goToEdit = Intent(this, EditProfileActivity::class.java)
            startActivity(goToEdit)
//            finish()
        }
        binding.btnLogout.setOnClickListener {
            storagePreferences.clearStringPreferences()

            var goToMain = Intent(this, MainActivity::class.java)
            startActivity(goToMain)
            finish()
        }
    }
}