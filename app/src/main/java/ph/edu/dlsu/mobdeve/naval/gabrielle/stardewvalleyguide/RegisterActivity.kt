package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityMainBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener{
            if (checkFields()) {
                var goToHome = Intent(this, HomeActivity::class.java)
                startActivity(goToHome)
                finish()
            }
        }
    }

    fun checkFields(): Boolean {
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
            return false
        }
        else
            return true
    }
}