package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFishSeasonListBinding

class FishSeasonListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFishSeasonListBinding
    private val bottomNavBar = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.events -> {
                var goToFestivalLists = Intent(this, FestivalSeasonListActivity::class.java)
                startActivity(goToFestivalLists)
                return@OnNavigationItemSelectedListener true
            }
            R.id.crops -> {
                var goToCropLists = Intent(this, CropsSeasonListActivity::class.java)
                startActivity(goToCropLists)
                return@OnNavigationItemSelectedListener true
            }
            R.id.home -> {
                var goToHome = Intent(this, HomeActivity::class.java)
                startActivity(goToHome)
                return@OnNavigationItemSelectedListener true
            }
            R.id.fish -> {
                return@OnNavigationItemSelectedListener false
            }
            R.id.items -> {
                var goToForageableList = Intent(this, ForageableSeasonListActivity::class.java)
                startActivity(goToForageableList)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

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

        binding.bnvNavbar.itemIconTintList = null

        var navbar = findViewById<BottomNavigationView>(R.id.bnv_navbar)
        navbar.selectedItemId = R.id.fish
        navbar.setOnNavigationItemSelectedListener(bottomNavBar)
    }
}