package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FishAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAOSQLImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

class SummerFishListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListItemsBinding
    private lateinit var fishAdapter: FishAdapter
    private lateinit var fishArrayList: ArrayList<Fish>
    private lateinit var dao: FishDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dao = FishDAOSQLImpl(applicationContext)
        fishArrayList = dao.getSummerFish()

        binding.list.setLayoutManager(LinearLayoutManager(applicationContext))

        fishAdapter = FishAdapter(applicationContext, fishArrayList)
        binding.list.setAdapter(fishAdapter)
        binding.seasonText.text = "Summer Fish"
    }
}