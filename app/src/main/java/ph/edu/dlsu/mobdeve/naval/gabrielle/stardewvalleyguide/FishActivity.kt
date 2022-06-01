package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFishBinding

class FishActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        binding.name.text = bundle!!.getString("name")
        binding.season.text = bundle!!.getString("season")
        binding.foundin.text = bundle!!.getString("foundin")
        binding.time.text = bundle!!.getString("time")
        binding.weather.text = bundle!!.getString("weather")
        binding.size.text = bundle!!.getString("size")
        binding.heal.text = bundle!!.getString("heal")
        binding.sell.text = bundle!!.getString("sell")
        binding.fishimg.setImageResource(bundle!!.getInt("img"))
    }
}