package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.CropAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityCropListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop

class SummerCropsListActivity : AppCompatActivity() {

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
        binding.seasonText.text = "Summer Crops"
    }

    private fun init(){
        var dao: CropsDAO = CropsDADArrayImpl()

        var crop1 = Crop()
        crop1.name = "Wheat"
        crop1.season = "Summer"
        crop1.img = R.drawable.wheat
        crop1.growth = "4 days"
        crop1.regrowth = "No"
        crop1.sell = "25g - 50g"
        crop1.pierre = "10g"
        crop1.joja = "12g"

        var crop2 = Crop()
        crop2.name = "Tomato"
        crop2.season = "Summer"
        crop2.img = R.drawable.tomato
        crop2.growth = "11 days"
        crop2.regrowth = "4 days"
        crop2.sell = "60g - 120g"
        crop2.pierre = "50g"
        crop2.joja = "62g"

        var crop3 = Crop()
        crop3.name = "Sunflower"
        crop3.season = "Summer"
        crop3.img = R.drawable.sunflower
        crop3.growth = "8 days"
        crop3.regrowth = "No"
        crop3.sell = "80g - 160g"
        crop3.pierre = "200g"
        crop3.joja = "125g"

        var crop4 = Crop()
        crop4.name = "Summer Spangle"
        crop4.season = "Summer"
        crop4.img = R.drawable.wheat
        crop4.growth = "8 days"
        crop4.regrowth = "No"
        crop4.sell = "90g - 180g"
        crop4.pierre = "50g"
        crop4.joja = "62g"

        var crop5 = Crop()
        crop5.name = "Starfruit"
        crop5.season = "Summer"
        crop5.img = R.drawable.starfruit
        crop5.growth = "12 days"
        crop5.regrowth = "No"
        crop5.sell = "750g - 1500g"
        crop5.pierre = "Not Sold Here"
        crop5.joja = "Not Sold Here"

        var crop6 = Crop()
        crop6.name = "Red Cabbage"
        crop6.season = "Summer"
        crop6.img = R.drawable.redcabbage
        crop6.growth = "9 days"
        crop6.regrowth = "No"
        crop6.sell = "260g - 520g"
        crop6.pierre = "100g"
        crop6.joja = "Not Sold Here"

        var crop7 = Crop()
        crop7.name = "Radish"
        crop7.season = "Summer"
        crop7.img = R.drawable.radish
        crop7.growth = "6 days"
        crop7.regrowth = "No"
        crop7.sell = "90g - 180g"
        crop7.pierre = "40g"
        crop7.joja = "50g"

        var crop8 = Crop()
        crop8.name = "Poppy"
        crop8.season = "Summer"
        crop8.img = R.drawable.poppy
        crop8.growth = "7 days"
        crop8.regrowth = "No"
        crop8.sell = "140g - 280g"
        crop8.pierre = "100g"
        crop8.joja = "125g"

        var crop9 = Crop()
        crop9.name = "Melon"
        crop9.season = "Summer"
        crop9.img = R.drawable.melon
        crop9.growth = "12 days"
        crop9.regrowth = "No"
        crop9.sell = "250g - 500g"
        crop9.pierre = "80g"
        crop9.joja = "100g"

        var crop10 = Crop()
        crop10.name = "Hot Pepper"
        crop10.season = "Summer"
        crop10.img = R.drawable.hotpepper
        crop10.growth = "5 days"
        crop10.regrowth = "3 days"
        crop10.sell = "40g - 80g"
        crop10.pierre = "40g"
        crop10.joja = "50g"

        var crop11 = Crop()
        crop11.name = "Hops"
        crop11.season = "Summer"
        crop11.img = R.drawable.hops
        crop11.growth = "11 days"
        crop11.regrowth = "1 days"
        crop11.sell = "25g - 50g"
        crop11.pierre = "60g"
        crop11.joja = "75g"

        var crop12 = Crop()
        crop12.name = "Corn"
        crop12.season = "Summer"
        crop12.img = R.drawable.corn
        crop12.growth = "14 days"
        crop12.regrowth = "4 days"
        crop12.sell = "50g - 100g"
        crop12.pierre = "150g"
        crop12.joja = "187g"

        var crop13 = Crop()
        crop13.name = "Blueberry"
        crop13.season = "Summer"
        crop13.img = R.drawable.blueberry
        crop13.growth = "13 days"
        crop13.regrowth = "4 days"
        crop13.sell = "50g - 100g"
        crop13.pierre = "80g"
        crop13.joja = "Not Sold Here"

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
        dao.addCrop(crop13)

        cropArrayList = dao.getCrop()
    }
}