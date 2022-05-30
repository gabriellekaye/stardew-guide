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

        //Spring forageables
        binding.spring.setOnClickListener{
            //val goToSpring = Intent(this, SpringForageablesListActivity::class.java)
            //startActivity(goToSpring)
        }

        //Summer forageables
        binding.summer.setOnClickListener{
            //val goToSummer = Intent(this, SummerForageablesListActivity::class.java)
            //startActivity(goToSummer)
        }

        //Fall forageables
        binding.fall.setOnClickListener {
            //val goToFall = Intent(this, FallForageablesListActivity::class.java)
            //startActivity(goToFall)
        }

        //Winter forageables
        binding.winter.setOnClickListener{
            //val goToWinter = Intent(this, WinterForageablesActivity::class.java)
            //startActivity(goToWinter)
        }
    }
}