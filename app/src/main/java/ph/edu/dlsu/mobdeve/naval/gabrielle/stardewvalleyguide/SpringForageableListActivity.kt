package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.ForageableAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

class SpringForageableListActivity : AppCompatActivity() {

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
        binding.seasonText.text = "Spring Forageables"
    }

    private fun init() {
        var dao: ForageableDAO = ForageableDADArrayImpl()

        var forage1 = Forageable()
        forage1.name = "Salmonberry"
        forage1.season = "Spring"
        forage1.description = "A spring-time berry with the flavor of the forest."
        forage1.found = "Bushes"
        forage1.sell = "5g - 10g"
        forage1.img = R.drawable.salmonberry

        var forage2 = Forageable()
        forage2.name = "Common Mushroom"
        forage2.season = "All except Winter"
        forage2.description = "Slightly nutty, with good texture."
        forage2.found = "Secret Woods"
        forage2.sell = "40g - 80g"
        forage2.img = R.drawable.commonmushroom

        var forage3 = Forageable()
        forage3.name = "Spring Onion"
        forage3.season = "Spring"
        forage3.description = "These grow wild during the spring."
        forage3.found = "Cidersap Forest"
        forage3.sell = "8g - 16g"
        forage3.img = R.drawable.springonion

        var forage4 = Forageable()
        forage4.name = "Dandelion"
        forage4.season = "Spring"
        forage4.description = "Not the prettiest flower, but the leaves make a good salad."
        forage4.found = "Cidersap Forest"
        forage4.sell = "40g - 80g"
        forage4.img = R.drawable.dandelion

        var forage5 = Forageable()
        forage5.name = "Leek"
        forage5.season = "Spring"
        forage5.description = "A tasty relative of the onion."
        forage5.found = "Backwoods"
        forage5.sell = "60g - 120g"
        forage5.img = R.drawable.leek

        var forage6 = Forageable()
        forage6.name = "Daffodil"
        forage6.season = "Spring"
        forage6.description = "A traditional spring flower that makes a nice gift."
        forage6.found = "Pelican Town"
        forage6.sell = "30g - 60g"
        forage6.img = R.drawable.daffodil

        var forage7 = Forageable()
        forage7.name = "Wild Horseradish"
        forage7.season = "Spring"
        forage7.description = "A spicy root found in the spring."
        forage7.found = "Secret Woods"
        forage7.sell = "60g - 120g"
        forage7.img = R.drawable.wildhorseradish

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
