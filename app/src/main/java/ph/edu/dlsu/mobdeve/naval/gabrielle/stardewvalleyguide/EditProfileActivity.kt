package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityEditProfileBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityProfileBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util.StoragePreferences

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivityEditProfileBinding
    private lateinit var database : DatabaseReference
    private val dbURL = "https://stardewvalleyguide-f1bc9-default-rtdb.asia-southeast1.firebasedatabase.app/"
    private lateinit var storagePreferences: StoragePreferences
    private lateinit var currPassword: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storagePreferences = StoragePreferences(applicationContext)

        var username = storagePreferences.getStringPreferences("username")

        database = FirebaseDatabase.getInstance(dbURL).getReference("Users")
        database.child(username!!).get().addOnSuccessListener {
            if (it.exists()){
                //account details found
                currPassword = it.child("password").value.toString()

                binding.etName.setText(it.child("name").value.toString())
            }
        }.addOnFailureListener{
            Toast.makeText(applicationContext,"Loading $username details...", Toast.LENGTH_SHORT).show()
        }

        binding.btnSave.setOnClickListener {
            binding.tvError.text = ""
            if (checkPassword()) {
                var name = binding.etName.text.toString()
                var newPassword = binding.etPasswordNew.text.toString()

                if (name.isNullOrBlank() && newPassword.isNullOrBlank())
                    binding.tvError.text = "Enter new name or password."
                else {
                    if (!name.isNullOrBlank())
                        database.child(username).child("name").setValue(name)

                    if (!newPassword.isNullOrBlank()) //if there is new password
                        database.child(username).child("password").setValue(newPassword)

                    Toast.makeText(applicationContext,"Changes saved.", Toast.LENGTH_SHORT).show()
                    var goToProfile = Intent(this, ProfileActivity::class.java)
                    startActivity(goToProfile)
                    finish()
                }

            }
            else
                binding.tvError.text = "Incorrect password."
        }

        binding.btnDelete.setOnClickListener {
            binding.tvError.text = ""
            if (checkPassword()) {
                database.child(username!!).removeValue().addOnSuccessListener {
                    Toast.makeText(applicationContext,"Account successfully deleted.", Toast.LENGTH_SHORT).show()
                }.addOnFailureListener {
                    Toast.makeText(applicationContext,"Account deletion failed.", Toast.LENGTH_SHORT).show()
                }

                //logout
                storagePreferences.clearStringPreferences()
                var goToMain = Intent(this, MainActivity::class.java)
                startActivity(goToMain)
                finish()
            }
            else
                binding.tvError.text = "Incorrect password."
        }
    }

    private fun checkPassword():Boolean {
        var oldPassword = binding.etPasswordOld.text.toString()

        return oldPassword == currPassword
    }
}