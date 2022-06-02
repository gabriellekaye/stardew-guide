package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeBinding
    private val bottomNavBar = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.events -> {
//                var goToFestivalLists = Intent(this, FestivalSeasonListActivity::class.java)
//                startActivity(goToFestivalLists)
                return@OnNavigationItemSelectedListener true
            }
            R.id.crops -> {
                var goToCropLists = Intent(this, CropsSeasonListActivity::class.java)
                startActivity(goToCropLists)
                return@OnNavigationItemSelectedListener true
            }
            R.id.home -> {
                return@OnNavigationItemSelectedListener false
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
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profileBtn.setOnClickListener {
            var goToProfile = Intent(this, ProfileActivity::class.java)
//            goToProfile.putExtras(intent.extras!!)
            startActivity(goToProfile)
//            finish()
        }

//        binding.crops.setOnClickListener {
//            var goToCropLists = Intent(this, CropsSeasonListActivity::class.java)
//            startActivity(goToCropLists)
//        }
//
//        binding.forage.setOnClickListener {
//            var goToForageableList = Intent(this, ForageableSeasonListActivity::class.java)
//            startActivity(goToForageableList)
//        }

        binding.bnvNavbar.itemIconTintList = null

        var navbar = findViewById<BottomNavigationView>(R.id.bnv_navbar)
        navbar.selectedItemId = R.id.home
        navbar.setOnNavigationItemSelectedListener(bottomNavBar)
    }
}