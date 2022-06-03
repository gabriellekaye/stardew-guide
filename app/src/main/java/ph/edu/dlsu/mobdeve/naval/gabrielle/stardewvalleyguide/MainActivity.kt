package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityMainBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.User
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.util.StoragePreferences

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var database : DatabaseReference
    private val dbURL = "https://stardewvalleyguide-f1bc9-default-rtdb.asia-southeast1.firebasedatabase.app/"
    private lateinit var storagePreferences: StoragePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        storagePreferences = StoragePreferences(applicationContext)

        binding.btnLogin.setOnClickListener {
            checkFields()
        }

        binding.tvRegister.setOnClickListener {
            var goToRegister = Intent(this, RegisterActivity::class.java)
            startActivity(goToRegister)
        }
    }

    private fun checkFields() {
        binding.tvError.text = ""
        var username = binding.etUsername.text.toString()
        var password = binding.etPassword.text.toString()

        if (username.isNullOrBlank() || password.isNullOrBlank()) {
            binding.tvError.text = "Please fill out all fields."
        }
        else {
            database = FirebaseDatabase.getInstance(dbURL).getReference("Users")
            database.child(username).get().addOnSuccessListener {
                if (it.exists()){
                    //username is registered
                    if (password == it.child("password").value) {
                        //correct password
                        binding.tvError.text = ""
                        Toast.makeText(applicationContext,"Welcome back ${it.child("username").value}", Toast.LENGTH_SHORT).show()

                        var goToHome = Intent(this, HomeActivity::class.java)

                        storagePreferences.saveStringPreferences("username", it.child("username").value.toString())
                        startActivity(goToHome)
                        finish()
                    }
                    else {
                        binding.tvError.text = "Incorrect password."
                    }
                } else {
                    binding.tvError.text = "Invalid username."
                }
            }.addOnFailureListener{
                binding.tvError.text = "Login failed"
            }
        }
    }

    override fun onResume() {
        super.onResume();

        var username = storagePreferences.getStringPreferences("username")

        if (username != "") {
            var goToHome = Intent(this, HomeActivity::class.java)

            startActivity(goToHome)
            finish()
        }

        binding.videoTutorialBtn.setOnClickListener{
            val goToVideoTutorials = Intent(this, VideoTutorialActivity::class.java)
            startActivity(goToVideoTutorials)
        }
    }
}