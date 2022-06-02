package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityForageableSeasonListBinding

class ForageableSeasonListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityForageableSeasonListBinding

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
    }
}