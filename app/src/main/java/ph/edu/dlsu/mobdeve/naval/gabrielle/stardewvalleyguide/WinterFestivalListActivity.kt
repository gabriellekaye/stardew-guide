package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FestivalAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAOSQLImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

class WinterFestivalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListItemsBinding
    private lateinit var festivalAdapter: FestivalAdapter
    private lateinit var festivalArrayList: ArrayList<Festival>
    private lateinit var dao: FestivalDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dao = FestivalDAOSQLImpl(applicationContext)
        festivalArrayList = dao.getWinterFestival()

        binding.list.setLayoutManager(LinearLayoutManager(applicationContext))

        festivalAdapter = FestivalAdapter(applicationContext, festivalArrayList)
        binding.list.setAdapter(festivalAdapter)
        binding.seasonText.text = "Winter Festival"
    }
}