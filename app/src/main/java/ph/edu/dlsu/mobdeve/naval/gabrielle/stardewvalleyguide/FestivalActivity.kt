package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalBinding

class FestivalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFestivalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFestivalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        binding.name.text = bundle!!.getString("name")
        binding.season.text = bundle!!.getString("season")
        binding.date.text = bundle!!.getString("date")
        binding.location.text = bundle!!.getString("location")
        binding.time.text = bundle!!.getString("time")
        binding.festimg.setImageResource(bundle!!.getInt("img"))
    }
}