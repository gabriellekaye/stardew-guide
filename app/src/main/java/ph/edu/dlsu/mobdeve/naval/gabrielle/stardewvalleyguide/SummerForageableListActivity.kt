package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.ForageableAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

class SummerForageableListActivity : AppCompatActivity() {

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
        binding.seasonText.text = "Summer Forageables"
    }

    private fun init() {
        var dao: ForageableDAO = ForageableDADArrayImpl()

        var forage1 = Forageable()
        forage1.name = "Common Mushroom"
        forage1.season = "All except Winter"
        forage1.description = "Slightly nutty, with good texture."
        forage1.found = "Forest Farm"
        forage1.sell = "40g - 80g"
        forage1.img = R.drawable.commonmushroom

        var forage2 = Forageable()
        forage2.name = "Fiddlehead Fern"
        forage2.season = "Summer"
        forage2.description = "The young shoots are an edible specialty."
        forage2.found = "Secret Woods"
        forage2.sell = "90g - 180g"
        forage2.img = R.drawable.fiddleheadfern

        var forage3 = Forageable()
        forage3.name = "Red Mushroom"
        forage3.season = "Summer, Fall"
        forage3.description = "A spotted mushroom sometimes found in caves."
        forage3.found = "Secret Woods"
        forage3.sell = "75g - 150g"
        forage3.img = R.drawable.redmushroom

        var forage4 = Forageable()
        forage4.name = "Sweet Pea"
        forage4.season = "Summer"
        forage4.description = "A fragrant summer flower."
        forage4.found = "Pelican Town"
        forage4.sell = "50g - 100g"
        forage4.img = R.drawable.sweetpea

        var forage5 = Forageable()
        forage5.name = "Spice Berry"
        forage5.season = "Summer"
        forage5.description = "It fills the air with a pungent aroma."
        forage5.found = "Cindersap Forest"
        forage5.sell = "80g - 160g"
        forage5.img = R.drawable.spiceberry

        var forage6 = Forageable()
        forage6.name = "Grape"
        forage6.season = "Summer"
        forage6.description = "A sweet cluster of fruit."
        forage6.found = "Backwoods"
        forage6.sell = "80g - 160g"
        forage6.img = R.drawable.grapes

        dao.addForageable(forage1)
        dao.addForageable(forage2)
        dao.addForageable(forage3)
        dao.addForageable(forage4)
        dao.addForageable(forage5)
        dao.addForageable(forage6)

        forageArrayList = dao.getForageable()
    }

}