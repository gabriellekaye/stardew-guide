package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if (checkFields()) {
                var goToHome = Intent(this, HomeActivity::class.java)
                startActivity(goToHome)
            }
        }

        binding.tvRegister.setOnClickListener {
            var goToRegister = Intent(this, RegisterActivity::class.java)
            startActivity(goToRegister)
        }
    }

    fun checkFields(): Boolean {
        var username = binding.etUsername.text.toString()
        var password = binding.etPassword.text.toString()

        if (username.isNullOrBlank() || password.isNullOrBlank()) {
            binding.tvError.text = "Please fill out all fields."
            return false
        }
        else
            return true
    }
}