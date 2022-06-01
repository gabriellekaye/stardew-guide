package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFishSeasonListBinding

class FishSeasonListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFishSeasonListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFishSeasonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Spring Fish List
        binding.spring.setOnClickListener{
            val goToSpringFish = Intent(this, SpringFishListActivity::class.java)
            startActivity(goToSpringFish)
        }
        //Summer Fish List
        binding.summer.setOnClickListener{
            val goToSummerFish = Intent(this, SummerFishListActivity::class.java)
            startActivity(goToSummerFish)
        }
        //Fall Fish List
        binding.fall.setOnClickListener{
            val goToFallFish = Intent(this, FallFishListActivity::class.java)
            startActivity(goToFallFish)
        }
        //Winter Fish List
        binding.winter.setOnClickListener{
            val goToWinterFish = Intent(this, WinterFishListActivity::class.java)
            startActivity(goToWinterFish)
        }
    }
}