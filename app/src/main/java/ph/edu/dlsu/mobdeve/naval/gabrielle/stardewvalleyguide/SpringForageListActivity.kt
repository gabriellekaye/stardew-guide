package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivitySpringForageListBinding

class SpringForageListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpringForageListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpringForageListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.f1.setOnClickListener{
            val f1 = Intent(this, Foraging::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.commonmushroom)
            bundle.putString("season", "Spring")
            bundle.putString("sell", "40g - 80g")

            f1.putExtras(bundle)
            startActivity(f1)
        }

        binding.f2.setOnClickListener{
            val f2 = Intent(this, Foraging::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.daffodil)
            bundle.putString("season", "Spring")
            bundle.putString("sell", "30g - 60g")

            f2.putExtras(bundle)
            startActivity(f2)
        }
    }
}