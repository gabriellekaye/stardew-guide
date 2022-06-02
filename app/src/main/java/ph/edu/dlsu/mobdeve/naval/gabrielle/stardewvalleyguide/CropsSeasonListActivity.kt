package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropsSeasonListBinding

class CropsSeasonListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCropsSeasonListBinding
    private val bottomNavBar = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.events -> {
//                var goToFestivalLists = Intent(this, FestivalSeasonListActivity::class.java)
//                startActivity(goToFestivalLists)
                return@OnNavigationItemSelectedListener true
            }
            R.id.crops -> {
                return@OnNavigationItemSelectedListener false
            }
            R.id.home -> {
                var goToHome = Intent(this, HomeActivity::class.java)
                startActivity(goToHome)
                return@OnNavigationItemSelectedListener true
            }
            R.id.fish -> {
//                var goToFishLists = Intent(this, FishSeasonListActivity::class.java)
//                startActivity(goToFishLists)
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
        binding = ActivityCropsSeasonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Spring crops list
        binding.spring.setOnClickListener{
            val goToSpringCrops = Intent(this, SpringCropsListActivity::class.java)
            startActivity(goToSpringCrops)
        }

        //Summer
        binding.summer.setOnClickListener{
            val goToSummerCrops = Intent(this, SummerCropsListActivity::class.java)
            startActivity(goToSummerCrops)
        }

        //Fall
        binding.fall.setOnClickListener {
            val goToFallCrops = Intent(this, FallCropsListActivity::class.java)
            startActivity(goToFallCrops)
        }

        binding.bnvNavbar.itemIconTintList = null

        var navbar = findViewById<BottomNavigationView>(R.id.bnv_navbar)
        navbar.selectedItemId = R.id.crops
        navbar.setOnNavigationItemSelectedListener(bottomNavBar)
    }
}