package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.FestivalAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.FestivalDAOArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFestivalListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

class SummerFestivalListActivity : AppCompatActivity() {
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
        binding.seasonText.text = "Summer Festival"
    }

    private fun init(){
        var dao: FestivalDAO = FestivalDAOArrayImpl()

        var festival1 = Festival()
        festival1.name = "Luau"
        festival1.season = "Summer"
        festival1.date = "11th"
        festival1.location = "The Beach"
        festival1.time = "9am - 2pm"

        var festival2 = Festival()
        festival2.name = "Dance of the Moonlight Jellies"
        festival2.season = "Summer"
        festival2.date = "28th"
        festival2.location = "The Beach"
        festival2.time = "10pm - 12am"

        dao.addFestival(festival1)
        dao.addFestival(festival2)

        festivalArrayList = dao.getFestival()
    }
}