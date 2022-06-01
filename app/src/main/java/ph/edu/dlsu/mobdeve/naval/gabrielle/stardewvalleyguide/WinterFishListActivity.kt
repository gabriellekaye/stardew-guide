package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FishAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFishListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

class WinterFishListActivity : AppCompatActivity() {
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
        binding.seasonText.text = "Winter Fish"
    }

    private fun init(){
        var dao: FishDAO = FishDAOArrayImpl()

        var fish1 = Fish()
        fish1.name = "Perch"
        fish1.season = "Winter"
        fish1.foundin = "River, Mountain Lake & Forest Pond"
        fish1.time = "Any"
        fish1.weather = "Any"
        fish1.size = "10 - 25"
        fish1.heal = "25 - 65 Energy & 11 - 29 Health"
        fish1.sell = "55g - 110g"

        var fish2 = Fish()
        fish2.name = "Squid"
        fish2.season = "Winter"
        fish2.foundin = "Ocean"
        fish2.time = "6pm - 2am"
        fish2.weather = "Winter"
        fish2.size = "12 - 49"
        fish2.heal = "25 - 65 Energy & 11 - 29 Health"
        fish2.sell = "80g - 160g"

        dao.addFish(fish1)
        dao.addFish(fish2)

        fishArrayList = dao.getFish()
    }
}