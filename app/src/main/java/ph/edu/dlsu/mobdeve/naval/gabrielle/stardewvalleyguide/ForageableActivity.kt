package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityForageableBinding

class ForageableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForageableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForageableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        binding.img.setImageResource(bundle!!.getInt("img"))
        binding.name.text = bundle.getString("name")
        binding.season.text = bundle.getString("season")
        binding.sell.text = bundle.getString("sell")
        binding.description.text = bundle.getString("description")
        binding.found.text = bundle.getString("found")
    }
}