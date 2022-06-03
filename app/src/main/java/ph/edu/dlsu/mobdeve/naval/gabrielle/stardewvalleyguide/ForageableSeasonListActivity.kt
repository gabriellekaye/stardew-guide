package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityForageableSeasonListBinding

class ForageableSeasonListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityForageableSeasonListBinding
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
                var goToFishLists = Intent(this, FishSeasonListActivity::class.java)
                startActivity(goToFishLists)
                return@OnNavigationItemSelectedListener true
            }
            R.id.items -> {
                return@OnNavigationItemSelectedListener false
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForageableSeasonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Spring
        binding.spring.setOnClickListener{
            val goToSpring = Intent(this, SpringForageableListActivity::class.java)
            startActivity(goToSpring)
        }

        //Summer
        binding.summer.setOnClickListener{
            val goToSummer = Intent(this, SummerForageableListActivity::class.java)
            startActivity(goToSummer)
        }

        //Fall
        binding.fall.setOnClickListener {
            val goToFall = Intent(this, FallForageableListActivity::class.java)
            startActivity(goToFall)
        }

        //Winter
        binding.winter.setOnClickListener{
            val goToWinter = Intent(this, WinterForageableListActivity::class.java)
            startActivity(goToWinter)
        }

        binding.bnvNavbar.itemIconTintList = null

        var navbar = findViewById<BottomNavigationView>(R.id.bnv_navbar)
        navbar.selectedItemId = R.id.items
        navbar.setOnNavigationItemSelectedListener(bottomNavBar)
    }
}