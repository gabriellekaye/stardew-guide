package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropsListBinding

class CropsListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCropsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCropsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Spring crops list
        binding.spring.setOnClickListener{
            val goToSpringCrops = Intent(this, SpringCropsListActivity::class.java)
            startActivity(goToSpringCrops) //go to spring crops list
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
    }
}