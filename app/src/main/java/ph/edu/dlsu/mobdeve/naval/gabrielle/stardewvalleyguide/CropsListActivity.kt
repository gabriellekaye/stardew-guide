package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropsListBinding

class CropsListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCropsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCropsListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}