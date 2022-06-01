package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FestivalAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

class WinterFestivalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFestivalListBinding
    private lateinit var festivalAdapter: FestivalAdapter
    private lateinit var festivalArrayList: ArrayList<Festival>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFestivalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

        binding.festivalList.setLayoutManager(LinearLayoutManager(applicationContext))

        festivalAdapter = FestivalAdapter(applicationContext, festivalArrayList)
        binding.festivalList.setAdapter(festivalAdapter)
        binding.seasonText.text = "Winter Festival"
    }

    private fun init(){
        var dao: FestivalDAO = FestivalDAOArrayImpl()

        var festival1 = Festival()
        festival1.name = "Festival of Ice"
        festival1.season = "Winter"
        festival1.date = "8th"
        festival1.location = "Cindersap Forest"
        festival1.time = "9am - 2pm"

        var festival2 = Festival()
        festival2.name = "Night Market"
        festival2.season = "Winter"
        festival2.date = "15th - 17th"
        festival2.location = "The Beach"
        festival2.time = "5pm - 2am"

        var festival3 = Festival()
        festival3.name = "Feast of the Winter Star"
        festival3.season = "Winter"
        festival3.date = "25th"
        festival3.location = "Pelican Town"
        festival3.time = "9am - 2pm"

        dao.addFestival(festival1)
        dao.addFestival(festival2)
        dao.addFestival(festival3)

        festivalArrayList = dao.getFestival()
    }
}