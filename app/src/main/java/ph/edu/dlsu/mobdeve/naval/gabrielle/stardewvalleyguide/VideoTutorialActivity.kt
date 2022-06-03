package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityVideoTutorialBinding

class VideoTutorialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoTutorialBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}