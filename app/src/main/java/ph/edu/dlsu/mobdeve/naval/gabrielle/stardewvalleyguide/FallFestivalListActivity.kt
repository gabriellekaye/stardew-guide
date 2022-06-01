package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FestivalAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

class FallFestivalListActivity : AppCompatActivity() {
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
        binding.seasonText.text = "Fall Festival"
    }

    private fun init(){
        var dao: FestivalDAO = FestivalDAOArrayImpl()

        var festival1 = Festival()
        festival1.name = "Stardew Valley Fair"
        festival1.season = "Fall"
        festival1.date = "16th"
        festival1.location = "Pelican Town"
        festival1.time = "9am - 3pm"

        var festival2 = Festival()
        festival2.name = "Spirit's Eve"
        festival2.season = "Fall"
        festival2.date = "27th"
        festival2.location = "Pelican Town"
        festival2.time = "10pm - 11:50pm"

        dao.addFestival(festival1)
        dao.addFestival(festival2)

        festivalArrayList = dao.getFestival()
    }
}