package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropBinding

class CropActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCropBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCropBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        binding.img.setImageResource(bundle!!.getInt("img"))
        binding.name.text = bundle.getString("name")
        binding.growTime.text = bundle.getString("growth")
        binding.regrowTime.text = bundle.getString("regrowth")
        binding.season.text = bundle.getString("season")
        binding.sellPrice.text = bundle.getString("sell")
        binding.pierrePrice.text = bundle.getString("pierre")
        binding.jojaPrice.text = bundle.getString("joja")
    }
}