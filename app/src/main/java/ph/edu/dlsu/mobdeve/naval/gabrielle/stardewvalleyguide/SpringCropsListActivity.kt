package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.CropAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop

class SpringCropsListActivity : AppCompatActivity() {

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
    }

    private fun init() {
        var dao: CropsDAO = CropsDADArrayImpl()

        var crop1 = Crop()
        crop1.name = "Blue Jazz"
        crop1.season = "Spring"
        crop1.img = R.drawable.bluejazz
        crop1.growth = "7 days"
        crop1.regrowth = "No"
        crop1.sell = "50g - 100g"
        crop1.pierre = "30g"
        crop1.joja = "37g"

        var crop2 = Crop()
        crop2.name = "Cauliflower"
        crop2.season = "Spring"
        crop2.img = R.drawable.cauliflower
        crop2.growth = "12 days"
        crop2.regrowth = "No"
        crop2.sell = "50g - 100g"
        crop2.pierre = "30g"
        crop2.joja = "37g"

        var crop3 = Crop()
        crop3.name = "Coffee Bean"
        crop3.season = "Spring"
        crop3.img = R.drawable.coffeebean
        crop3.growth = "10 days"
        crop3.regrowth = "2 days"
        crop3.sell = "15g - 30g"
        crop3.pierre = "Not Sold Here"
        crop3.joja = "Not Sold Here"

        var crop4 = Crop()
        crop4.name = "Garlic"
        crop4.season = "Spring"
        crop4.img = R.drawable.garlic
        crop4.growth = "4 days"
        crop4.regrowth = "No"
        crop4.sell = "60g - 120g"
        crop4.pierre = "40g"
        crop4.joja = "Not Sold Here"

        var crop5 = Crop()
        crop5.name = "Green Bean"
        crop5.season = "Spring"
        crop5.img = R.drawable.greenbean
        crop5.growth = "10 days"
        crop5.regrowth = "3 days"
        crop5.sell = "40g - 80g"
        crop5.pierre = "60g"
        crop5.joja = "75g"

        var crop6 = Crop()
        crop6.name = "Kale"
        crop6.season = "Spring"
        crop6.img = R.drawable.kale
        crop6.growth = "6 days"
        crop6.regrowth = "No"
        crop6.sell = "100g - 220g"
        crop6.pierre = "70g"
        crop6.joja = "87g"

        var crop7 = Crop()
        crop7.name = "Parsnip"
        crop7.season = "Spring"
        crop7.img = R.drawable.parsnip
        crop7.growth = "4 days"
        crop7.regrowth = "No"
        crop7.sell = "35g - 70g"
        crop7.pierre = "20g"
        crop7.joja = "25g"

        var crop8 = Crop()
        crop8.name = "Potato"
        crop8.season = "Spring"
        crop8.img = R.drawable.potato
        crop8.growth = "6 days"
        crop8.regrowth = "No"
        crop8.sell = "80g - 160g"
        crop8.pierre = "50g"
        crop8.joja = "62g"

        var crop9 = Crop()
        crop9.name = "Rhubarb"
        crop9.season = "Spring"
        crop9.img = R.drawable.rhubarb
        crop9.growth = "13 days"
        crop9.regrowth = "No"
        crop9.sell = "220g - 440g"
        crop9.pierre = "Not Sold Here"
        crop9.joja = "Not Sold Here"

        var crop10 = Crop()
        crop10.name = "Strawberry"
        crop10.season = "Spring"
        crop10.img = R.drawable.strawberry
        crop10.growth = "8 days"
        crop10.regrowth = "4 days"
        crop10.sell = "120g - 240g"
        crop10.pierre = "200g (Egg Festival)"
        crop10.joja = "Not Sold Here"

        var crop11 = Crop()
        crop11.name = "Tulip"
        crop11.season = "Spring"
        crop11.img = R.drawable.tulip
        crop11.growth = "6 days"
        crop11.regrowth = "No"
        crop11.sell = "30g - 60g"
        crop11.pierre = "20g"
        crop11.joja = "25g"

        var crop12 = Crop()
        crop12.name = "Unmilled Rice"
        crop12.season = "Spring"
        crop12.img = R.drawable.unmilledrice
        crop12.growth = "8-6 days"
        crop12.regrowth = "No"
        crop12.sell = "30g - 60g"
        crop12.pierre = "40g"
        crop12.joja = "Not Sold Here"

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
        dao.addCrop(crop11)
        dao.addCrop(crop12)

        cropArrayList = dao.getCrop()
    }
}