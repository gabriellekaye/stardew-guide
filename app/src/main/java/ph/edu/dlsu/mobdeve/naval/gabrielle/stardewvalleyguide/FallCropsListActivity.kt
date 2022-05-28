package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.CropAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop

class FallCropsListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCropListBinding
    private lateinit var cropAdapter: CropAdapter
    private lateinit var cropArrayList: ArrayList<Crop>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCropListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

        binding.cropsList.setLayoutManager(LinearLayoutManager(applicationContext))

        cropAdapter = CropAdapter(applicationContext, cropArrayList)
        binding.cropsList.setAdapter(cropAdapter)
        binding.seasonText.text = "Fall Crops"
    }

    private fun init() {
        var dao: CropsDAO = CropsDADArrayImpl()

        var crop1 = Crop()
        crop1.name = "Yam"
        crop1.season = "Fall"
        crop1.img = R.drawable.yam
        crop1.growth = "10 days"
        crop1.regrowth = "No"
        crop1.sell = "160g - 320g"
        crop1.pierre = "60g"
        crop1.joja = "75g"

        var crop2 = Crop()
        crop2.name = "Pumpkin"
        crop2.season = "Fall"
        crop2.img = R.drawable.pumpkin
        crop2.growth = "13 days"
        crop2.regrowth = "No"
        crop2.sell = "320g - 640g"
        crop2.pierre = "100g"
        crop2.joja = "125g"

        var crop3 = Crop()
        crop3.name = "Grape"
        crop3.season = "Fall"
        crop3.img = R.drawable.grapes
        crop3.growth = "10 days"
        crop3.regrowth = "3 days"
        crop3.sell = "80g - 160g"
        crop3.pierre = "60g"
        crop3.joja = "75g"

        var crop4 = Crop()
        crop4.name = "Fairy Rose"
        crop4.season = "Fall"
        crop4.img = R.drawable.fairyrose
        crop4.growth = "12 days"
        crop4.regrowth = "No"
        crop4.sell = "290g - 580g"
        crop4.pierre = "200g"
        crop4.joja = "250g"

        var crop5 = Crop()
        crop5.name = "Eggplant"
        crop5.season = "Fall"
        crop5.img = R.drawable.eggplant
        crop5.growth = "5 days"
        crop5.regrowth = "5 days"
        crop5.sell = "60g - 120g"
        crop5.pierre = "20g"
        crop5.joja = "25g"

        var crop6 = Crop()
        crop6.name = "Cranberries"
        crop6.season = "Fall"
        crop6.img = R.drawable.cranberries
        crop6.growth = "7 days"
        crop6.regrowth = "5 days"
        crop6.sell = "75g - 320g"
        crop6.pierre = "60g"
        crop6.joja = "75g"
    }
}