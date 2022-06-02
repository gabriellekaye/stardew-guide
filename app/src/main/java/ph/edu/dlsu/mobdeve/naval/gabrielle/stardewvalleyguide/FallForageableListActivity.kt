package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.ForageableAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.ForageableDAOSQLImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

class FallForageableListActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityListItemsBinding
    private lateinit var forageableAdapter: ForageableAdapter
    private lateinit var forageArrayList: ArrayList<Forageable>
    private lateinit var dao: ForageableDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dao = ForageableDAOSQLImpl(applicationContext)
        forageArrayList = dao.getFallForageables()

        binding.list.setLayoutManager(LinearLayoutManager(applicationContext))

        forageableAdapter = ForageableAdapter(applicationContext, forageArrayList)
        binding.list.setAdapter(forageableAdapter)
        binding.seasonText.text = "Fall Forageables"
    }
}