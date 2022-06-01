package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FishAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FishDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFishListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

class FallFishListActivity : AppCompatActivity() {
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
        binding.seasonText.text = "Fall Fish"
    }

    private fun init(){
        var dao: FishDAO = FishDAOArrayImpl()

        var fish1 = Fish()
        fish1.name = "Salmon"
        fish1.season = "Fall"
        fish1.foundin = "River"
        fish1.time = "6am - 7pm"
        fish1.weather = "Any"
        fish1.size = "24 - 66"
        fish1.heal = "38 - 98 Energy & 17 - 44 Health"
        fish1.sell = "75g - 150g"

        var fish2 = Fish()
        fish2.name = "Walleye"
        fish2.season = "Fall (Winter with Rain Token)"
        fish2.foundin = "River, Mountain Lake, Forest Pond & Forest Farm Pond"
        fish2.time = "12pm - 2am"
        fish2.weather = "Rainy"
        fish2.size = "10 - 41"
        fish2.heal = "30 - 78 Energy & 13 - 35 Health"
        fish2.sell = "105g - 210g"

        dao.addFish(fish1)
        dao.addFish(fish2)

        fishArrayList = dao.getFish()
    }
}