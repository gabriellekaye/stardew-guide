package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fishingTutorialBtn.setOnClickListener{
            val goToFishList = Intent(this, FishSeasonListActivity::class.java)
            startActivity(goToFishList)
        }

        binding.festivalTutorialBtn.setOnClickListener{
            val goToFestivalList = Intent(this, FestivalSeasonListActivity::class.java)
            startActivity(goToFestivalList)
        }
    }
}