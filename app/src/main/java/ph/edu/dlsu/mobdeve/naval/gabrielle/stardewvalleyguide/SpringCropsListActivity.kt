package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.CropAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDADArrayImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivitySpringCropsListBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop

class SpringCropsListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpringCropsListBinding
    private lateinit var cropAdapter: CropAdapter
    private lateinit var cropArrayList: ArrayList<Crop>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpringCropsListBinding.inflate(layoutInflater)
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

        dao.addCrop(crop1)
        dao.addCrop(crop2)

        cropArrayList = dao.getCrop()
    }
}