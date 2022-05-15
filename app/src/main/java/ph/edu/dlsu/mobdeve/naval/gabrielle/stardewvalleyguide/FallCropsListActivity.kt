package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityFallCropsListBinding

class FallCropsListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFallCropsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFallCropsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Amaranth
        binding.crop1.setOnClickListener {
            val goToCrop1 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.amaranth)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Amaranth")
            bundle.putString("growTime","7 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "150g - 300g")
            bundle.putString("pPrice","70g")
            bundle.putString("jPrice","87g")

            goToCrop1.putExtras(bundle)
            startActivity(goToCrop1)
        }
        //Artichoke
        binding.crop2.setOnClickListener {
            val goToCrop2 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.artichoke)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Artichoke")
            bundle.putString("growTime","8 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "160g - 320g")
            bundle.putString("pPrice","30g")
            bundle.putString("jPrice","Not Sold here")

            goToCrop2.putExtras(bundle)
            startActivity(goToCrop2)
        }
        //Beet
        binding.crop3.setOnClickListener {
            val goToCrop3 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.beet)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Beet")
            bundle.putString("growTime","6 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "100g - 200g")
            bundle.putString("pPrice","Not Sold Here")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop3.putExtras(bundle)
            startActivity(goToCrop3)
        }
        //Bok Choy
        binding.crop4.setOnClickListener {
            val goToCrop4 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.bokchoy)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Bok Choy")
            bundle.putString("growTime","4 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "80g - 160g")
            bundle.putString("pPrice","50g")
            bundle.putString("jPrice","62g")

            goToCrop4.putExtras(bundle)
            startActivity(goToCrop4)
        }
        //Cranberries
        binding.crop5.setOnClickListener {
            val goToCrop5 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.cranberries)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Cranberries")
            bundle.putString("growTime","7 days")
            bundle.putString("regrowth", "5 days")
            bundle.putString("sellPrice", "75g - 150g")
            bundle.putString("pPrice","240g")
            bundle.putString("jPrice","300g")

            goToCrop5.putExtras(bundle)
            startActivity(goToCrop5)
        }
        //Eggplant
        binding.crop6.setOnClickListener {
            val goToCrop6 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.eggplant)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Eggplant")
            bundle.putString("growTime","5 days")
            bundle.putString("regrowth", "5 days")
            bundle.putString("sellPrice", "60g - 120g")
            bundle.putString("pPrice","20g")
            bundle.putString("jPrice","25g")

            goToCrop6.putExtras(bundle)
            startActivity(goToCrop6)
        }
        //Fairy Rose
        binding.crop7.setOnClickListener {
            val goToCrop7 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.fairyrose)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Fairy Rose")
            bundle.putString("growTime","12 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "290g - 580g")
            bundle.putString("pPrice","200g")
            bundle.putString("jPrice","250g")

            goToCrop7.putExtras(bundle)
            startActivity(goToCrop7)
        }
        //Grape
        binding.crop8.setOnClickListener {
            val goToCrop8 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.grapes)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Grape")
            bundle.putString("growTime","10 days")
            bundle.putString("regrowth", "3 days")
            bundle.putString("sellPrice", "80g - 160g")
            bundle.putString("pPrice","60g")
            bundle.putString("jPrice","75g")

            goToCrop8.putExtras(bundle)
            startActivity(goToCrop8)
        }
        //Pumpkin
        binding.crop9.setOnClickListener {
            val goToCrop9 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.pumpkin)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Pumpkin")
            bundle.putString("growTime","13 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "320g - 640g")
            bundle.putString("pPrice","100g")
            bundle.putString("jPrice","125g")

            goToCrop9.putExtras(bundle)
            startActivity(goToCrop9)
        }
        //Yam
        binding.crop10.setOnClickListener {
            val goToCrop10 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.yam)
            bundle.putString("season", "Fall")
            bundle.putString("name", "Yam")
            bundle.putString("growTime","10 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "160g - 320g")
            bundle.putString("pPrice","60g")
            bundle.putString("jPrice","75g")

            goToCrop10.putExtras(bundle)
            startActivity(goToCrop10)
        }
    }
}