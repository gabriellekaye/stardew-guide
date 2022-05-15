package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityForagingBinding

class Foraging : AppCompatActivity() {
    
    private lateinit var binding : ActivityForagingBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForagingBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}