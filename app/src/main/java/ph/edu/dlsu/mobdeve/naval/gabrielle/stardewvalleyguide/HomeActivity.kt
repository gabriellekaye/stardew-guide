package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profileBtn.setOnClickListener {
            var goToProfile = Intent(this, ProfileActivity::class.java)
//            goToProfile.putExtras(intent.extras!!)
            startActivity(goToProfile)
//            finish()
        }

        binding.crops.setOnClickListener {
            var goToCropLists = Intent(this, CropsSeasonListActivity::class.java)
            startActivity(goToCropLists)
        }

        binding.forage.setOnClickListener {
            var goToForageableList = Intent(this, ForageableSeasonListActivity::class.java)
            startActivity(goToForageableList)
        }

        binding.festival.setOnClickListener {
            var goToFestivalList = Intent(this, FestivalSeasonListActivity::class.java)
            startActivity(goToFestivalList)
        }

        binding.fish.setOnClickListener {
            var goToFishList = Intent(this, FishSeasonListActivity::class.java)
            startActivity(goToFishList)
        }
    }
}