package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter.CropAdapter
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDAO
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao.CropsDAOSQLImpl
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityListItemsBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop


class SpringCropsListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListItemsBinding
    private lateinit var cropAdapter: CropAdapter
    private lateinit var cropArrayList: ArrayList<Crop>
    private lateinit var dao: CropsDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dao = CropsDAOSQLImpl(applicationContext)
        cropArrayList = dao.getSpringCrops()

        binding.list.setLayoutManager(LinearLayoutManager(applicationContext))

        cropAdapter = CropAdapter(applicationContext, cropArrayList)
        binding.list.setAdapter(cropAdapter)
        binding.seasonText.text = "Spring Crops"
    }
}