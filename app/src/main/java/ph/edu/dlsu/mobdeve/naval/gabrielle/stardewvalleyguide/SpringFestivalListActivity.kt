package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FestivalAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

class SpringFestivalListActivity : AppCompatActivity() {
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
        binding.seasonText.text = "Spring Festival"
    }

    private fun init(){
        var dao: FestivalDAO = FestivalDAOArrayImpl()

        var festival1 = Festival()
        festival1.name = "Egg Festival"
        festival1.season = "Spring"
        festival1.date = "13th"
        festival1.location = "Pelican Town Square"
        festival1.time = "9am - 2pm"

        var festival2 = Festival()
        festival2.name = "Flower Dance"
        festival2.season = "Spring"
        festival2.date = "24th"
        festival2.location = "Cindersap Forest"
        festival2.time = "9am - 2pm"

        dao.addFestival(festival1)
        dao.addFestival(festival2)

        festivalArrayList = dao.getFestival()
    }
}