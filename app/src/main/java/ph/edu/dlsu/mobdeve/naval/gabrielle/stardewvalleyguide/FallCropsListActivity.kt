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

        var crop7 = Crop()
        crop7.name = "Bok Choy"
        crop7.season = "Fall"
        crop7.img = R.drawable.bokchoy
        crop7.growth = "4 days"
        crop7.regrowth = "No"
        crop7.sell = "80g - 160g"
        crop7.pierre = "50g"
        crop7.joja = "62g"

        var crop8 = Crop()
        crop8.name = "Beet"
        crop8.season = "Fall"
        crop8.img = R.drawable.beet
        crop8.growth = "6 days"
        crop8.regrowth = "No"
        crop8.sell = "100g - 200g"
        crop8.pierre = "Not Sold Here"
        crop8.joja = "Not Sold here"

        var crop9 = Crop()
        crop9.name = "Artichoke"
        crop9.season = "Fall"
        crop9.img = R.drawable.artichoke
        crop9.growth = "8 days"
        crop9.regrowth = "No"
        crop9.sell = "160g - 320g"
        crop9.pierre = "30g"
        crop9.joja = "Not Sold here"

        var crop10 = Crop()
        crop10.name = "Amaranth"
        crop10.season = "Fall"
        crop10.img = R.drawable.amaranth
        crop10.growth = "7 days"
        crop10.regrowth = "No"
        crop10.sell = "150g - 300g"
        crop10.pierre = "70g"
        crop10.joja = "87g"

        dao.addCrop(crop1)
        dao.addCrop(crop2)
        dao.addCrop(crop3)
        dao.addCrop(crop4)
        dao.addCrop(crop5)
        dao.addCrop(crop6)
        dao.addCrop(crop7)
        dao.addCrop(crop8)
        dao.addCrop(crop9)
        dao.addCrop(crop10)

        cropArrayList = dao.getCrop()
    }
}