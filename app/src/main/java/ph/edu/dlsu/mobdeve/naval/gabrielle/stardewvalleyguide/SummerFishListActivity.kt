package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FishAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFishListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

class SummerFishListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFishListBinding
    private lateinit var fishAdapter: FishAdapter
    private lateinit var fishArrayList: ArrayList<Fish>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFishListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

        binding.fishList.setLayoutManager(LinearLayoutManager(applicationContext))

        fishAdapter = FishAdapter(applicationContext, fishArrayList)
        binding.fishList.setAdapter(fishAdapter)
        binding.seasonText.text = "Summer Fish"
    }

    private fun init(){
        var dao: FishDAO = FishDAOArrayImpl()

        var fish1 = Fish()
        fish1.name = "Anchovy"
        fish1.season = "Spring & Fall"
        fish1.foundin = "Ocean"
        fish1.time = "Any"
        fish1.weather = "Any"
        fish1.size = "1 - 17"
        fish1.heal = "13 - 33 Energy & 5 - 14 Health"
        fish1.sell = "30g - 60g"

        var fish2 = Fish()
        fish2.name = "Sardine"
        fish2.season = "Spring, Fall & Winter"
        fish2.foundin = "Ocean"
        fish2.time = "6am - 7pm"
        fish2.weather = "Any"
        fish2.size = "1 - 13"
        fish2.heal = "13 - 33 Energy & 5 - 14 Health"
        fish2.sell = "40g - 80g"

        dao.addFish(fish1)
        dao.addFish(fish2)

        fishArrayList = dao.getFish()
    }
}