package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalSeasonListBinding

class FestivalSeasonListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFestivalSeasonListBinding
    private val bottomNavBar = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.events -> {
                return@OnNavigationItemSelectedListener false
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
                var goToFishLists = Intent(this, FishSeasonListActivity::class.java)
                startActivity(goToFishLists)
                return@OnNavigationItemSelectedListener true
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

        binding.bnvNavbar.itemIconTintList = null

        var navbar = findViewById<BottomNavigationView>(R.id.bnv_navbar)
        navbar.selectedItemId = R.id.events
        navbar.setOnNavigationItemSelectedListener(bottomNavBar)
    }
}