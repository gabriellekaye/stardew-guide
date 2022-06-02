package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityMainBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityRegisterBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.User
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util.StoragePreferences

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegisterBinding
    private lateinit var database : DatabaseReference
    private val dbURL = "https://stardewvalleyguide-f1bc9-default-rtdb.asia-southeast1.firebasedatabase.app/"
    private lateinit var storagePreferences: StoragePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storagePreferences = StoragePreferences(applicationContext)

        binding.btnRegister.setOnClickListener{
            checkFields()
        }
    }

    private fun checkFields() {
        binding.tvError.text = ""
        var username = binding.etUsername.text.toString()
        var name = binding.etName.text.toString()
        var farmName = binding.etFarmName.text.toString()
        var gender = binding.etGender.text.toString()
        var farmType = binding.etFarmType.text.toString()
        var currSeason = binding.etCurrSeason.text.toString()
        var password = binding.etPassword.text.toString()

        if (username.isNullOrBlank() || password.isNullOrBlank() || name.isNullOrBlank() ||
            farmName.isNullOrBlank() || gender.isNullOrBlank() || farmType.isNullOrBlank() ||
            currSeason.isNullOrBlank()) {
            binding.tvError.text = "Please fill out all fields."
        }
        else {
//            Toast.makeText(applicationContext,"Loading...", Toast.LENGTH_SHORT).show()
            database = FirebaseDatabase.getInstance(dbURL).getReference("Users")
            val User = User(username, name, farmName, gender, farmType, currSeason, password)

            database.child(username).get().addOnSuccessListener {
                if (it.exists()){
                    //username is registered
                    binding.tvError.text = "Username already taken."
                }
                else {
                    //username used as key; should be unique
                    database.child(username).setValue(User).addOnSuccessListener {
                        binding.etUsername.text.clear()
                        binding.etName.text.clear()
                        binding.etFarmName.text.clear()
                        binding.etGender.text.clear()
                        binding.etFarmType.text.clear()
                        binding.etCurrSeason.text.clear()
                        binding.etPassword.text.clear()
                        binding.tvError.text = ""

                        Toast.makeText(applicationContext,"Welcome $username!", Toast.LENGTH_SHORT).show()

                        var goToHome = Intent(this, HomeActivity::class.java)

                        storagePreferences.saveStringPreferences("username", username)
                        startActivity(goToHome)
                        finish()
                    }.addOnFailureListener {
                        binding.tvError.text = "Account creation failed."
                    }
                }
            }.addOnFailureListener{
                binding.tvError.text = "Checking of username failed"
            }
        }
    }
}