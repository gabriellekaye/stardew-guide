package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.ForageableAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

class FallForageableListActivity : AppCompatActivity()  {
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
        binding.seasonText.text = "Fall Forageables"
    }

    private fun init() {
        var dao: ForageableDAO = ForageableDADArrayImpl()

        var forage1 = Forageable()
        forage1.name = "Purple Mushroom"
        forage1.season = "Fall"
        forage1.description = "A rare mushroom found deep in caves."
        forage1.found = "Forest Farm"
        forage1.sell = "250g - 500g"
        forage1.img = R.drawable.purplemushroom

        var forage2 = Forageable()
        forage2.name = "Red Mushroom"
        forage2.season = "Summer, Fall"
        forage2.description = "A spotted mushroom sometimes found in caves."
        forage2.found = "Secret Woods"
        forage2.sell = "75g - 150g"
        forage2.img = R.drawable.redmushroom

        var forage3 = Forageable()
        forage3.name = "Chanterelle"
        forage3.season = "Fall"
        forage3.description = "A tasty mushroom with a fruity smell and slightly peppery flavor."
        forage3.found = "Secret Woods"
        forage3.sell = "160g - 320g"
        forage3.img = R.drawable.chanterelle

        var forage4 = Forageable()
        forage4.name = "Blackberry"
        forage4.season = "Fall"
        forage4.description = "An early-fall treat."
        forage4.found = "Pelian Town"
        forage4.sell = "20g - 40g"
        forage4.img = R.drawable.blackberry

        var forage5 = Forageable()
        forage5.name = "Hazelnut"
        forage5.season = "Fall"
        forage5.description = "That's one big hazelnut!"
        forage5.found = "Backwoods"
        forage5.sell = "90g - 180g"
        forage5.img = R.drawable.hazelnut

        var forage6 = Forageable()
        forage6.name = "Wild Plum"
        forage6.season = "Fall"
        forage6.description = "Tart and juicy with a pungent aroma."
        forage6.found = "Bus Stop"
        forage6.sell = "80g - 160g"
        forage6.img = R.drawable.wildplum

        var forage7 = Forageable()
        forage7.name = "Common Mushroom"
        forage7.season = "All except Winter"
        forage7.description = "Slightly nutty, with good texture."
        forage7.found = "Forest Farm"
        forage7.sell = "40g - 80g"
        forage7.img = R.drawable.commonmushroom

        dao.addForageable(forage1)
        dao.addForageable(forage2)
        dao.addForageable(forage3)
        dao.addForageable(forage4)
        dao.addForageable(forage5)
        dao.addForageable(forage6)
        dao.addForageable(forage7)

        forageArrayList = dao.getForageable()
    }
}