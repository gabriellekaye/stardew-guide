package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalSeasonListBinding

class FestivalSeasonListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFestivalSeasonListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFestivalSeasonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Spring Festival List
        binding.spring.setOnClickListener{
            val goToSpringFestival = Intent(this, SpringFestivalListActivity::class.java)
            startActivity(goToSpringFestival)
        }
        //Summer Festival List
        binding.summer.setOnClickListener{
            val goToSummerFestival = Intent(this, SummerFestivalListActivity::class.java)
            startActivity(goToSummerFestival)
        }
        //Fall Festival List
        binding.fall.setOnClickListener{
            val goToFallFestival = Intent(this, FallFestivalListActivity::class.java)
            startActivity(goToFallFestival)
        }
        //Winter Festival List
        binding.winter.setOnClickListener{
            val goToWinterFestival = Intent(this, WinterFestivalListActivity::class.java)
            startActivity(goToWinterFestival)
        }
    }
}