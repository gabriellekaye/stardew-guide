package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.ForageableAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

class WinterForageableListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListItemsBinding
    private lateinit var forageableAdapter: ForageableAdapter
    private lateinit var forageArrayList: ArrayList<Forageable>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

        binding.list.setLayoutManager(LinearLayoutManager(applicationContext))

        forageableAdapter = ForageableAdapter(applicationContext, forageArrayList)
        binding.list.setAdapter(forageableAdapter)
        binding.seasonText.text = "Winter Forageables"
    }

    private fun init() {
        var dao: ForageableDAO = ForageableDADArrayImpl()

        var forage1 = Forageable()
        forage1.name = "Winter Root"
        forage1.season = "Winter"
        forage1.description = "A starchy tuber."
        forage1.found = "Tilling soil"
        forage1.sell = "70g - 140g"
        forage1.img = R.drawable.winterroot

        var forage2 = Forageable()
        forage2.name = "Snow Yam"
        forage2.season = "Winter"
        forage2.description = "This little yam was hiding beneath the snow."
        forage2.found = "Tilling Soil"
        forage2.sell = "100g - 200g"
        forage2.img = R.drawable.snowyam

        var forage3 = Forageable()
        forage3.name = "Holly"
        forage3.season = "Fall"
        forage3.description = "The leaves and bright red berries make a popular winter decoration."
        forage3.found = "Secret Woods"
        forage3.sell = "80g - 160g"
        forage3.img = R.drawable.holly

        var forage4 = Forageable()
        forage4.name = "Crystal Fruit"
        forage4.season = "Fall"
        forage4.description = "A delicate fruit that pops up from the snow."
        forage4.found = "Railroad"
        forage4.sell = "150g - 300g"
        forage4.img = R.drawable.crystalfruit

        var forage5 = Forageable()
        forage5.name = "Crocus"
        forage5.season = "Winter"
        forage5.description = "A flower that can bloom in the winter."
        forage5.found = "Pelican Town"
        forage5.sell = "60g - 120g"
        forage5.img = R.drawable.crocus

        dao.addForageable(forage1)
        dao.addForageable(forage2)
        dao.addForageable(forage3)
        dao.addForageable(forage4)
        dao.addForageable(forage5)

        forageArrayList = dao.getForageable()
    }
}