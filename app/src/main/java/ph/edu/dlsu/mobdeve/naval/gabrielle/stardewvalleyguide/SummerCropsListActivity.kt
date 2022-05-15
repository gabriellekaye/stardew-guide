package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivitySummerCropsListBinding

class SummerCropsListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySummerCropsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySummerCropsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Blueberry
        binding.crop1.setOnClickListener {
            val goToCrop1 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.blueberry)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Blueberry")
            bundle.putString("growTime","13 days")
            bundle.putString("regrowth", "4 days")
            bundle.putString("sellPrice", "50g - 100g")
            bundle.putString("pPrice","80g")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop1.putExtras(bundle)
            startActivity(goToCrop1)
        }
        //Corn
        binding.crop2.setOnClickListener {
            val goToCrop2 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.corn)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Corn")
            bundle.putString("growTime","14 days")
            bundle.putString("regrowth", "4 days")
            bundle.putString("sellPrice", "50g - 100g")
            bundle.putString("pPrice","150g")
            bundle.putString("jPrice","187g")

            goToCrop2.putExtras(bundle)
            startActivity(goToCrop2)
        }
        //Hops
        binding.crop3.setOnClickListener {
            val goToCrop3 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.hops)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Hops")
            bundle.putString("growTime","11 days")
            bundle.putString("regrowth", "1 day")
            bundle.putString("sellPrice", "25g - 50g")
            bundle.putString("pPrice","60g")
            bundle.putString("jPrice","75g")

            goToCrop3.putExtras(bundle)
            startActivity(goToCrop3)
        }
        //Hot Pepper
        binding.crop4.setOnClickListener {
            val goToCrop4 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.hotpepper)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Hot Pepper")
            bundle.putString("growTime","5 days")
            bundle.putString("regrowth", "3 days")
            bundle.putString("sellPrice", "40g - 80g")
            bundle.putString("pPrice","40g")
            bundle.putString("jPrice","50g")

            goToCrop4.putExtras(bundle)
            startActivity(goToCrop4)
        }
        //Melon
        binding.crop5.setOnClickListener {
            val goToCrop5 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.melon)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Melon")
            bundle.putString("growTime","12 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "250g - 500g")
            bundle.putString("pPrice","80g")
            bundle.putString("jPrice","100g")

            goToCrop5.putExtras(bundle)
            startActivity(goToCrop5)
        }
        //Poppy
        binding.crop6.setOnClickListener {
            val goToCrop6 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.poppy)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Poppy")
            bundle.putString("growTime","7 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "140g - 280g")
            bundle.putString("pPrice","100g")
            bundle.putString("jPrice","125g")

            goToCrop6.putExtras(bundle)
            startActivity(goToCrop6)
        }
        //Radish
        binding.crop7.setOnClickListener {
            val goToCrop7 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.radish)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Radish")
            bundle.putString("growTime","6 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "90g - 180g")
            bundle.putString("pPrice","40g")
            bundle.putString("jPrice","50g")

            goToCrop7.putExtras(bundle)
            startActivity(goToCrop7)
        }
        //Red Cabbage
        binding.crop8.setOnClickListener {
            val goToCrop8 = Intent(this, Crop::class.java)
            val bundle = Bundle()
            bundle.putInt("img", R.drawable.redcabbage)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Red Cabbage")
            bundle.putString("growTime","9 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "260g - 520g")
            bundle.putString("pPrice","100g")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop8.putExtras(bundle)
            startActivity(goToCrop8)
        }
        //Starfruit
        binding.crop9.setOnClickListener {
            val goToCrop9 = Intent(this, Crop::class.java)
            val bundle = Bundle()
            bundle.putInt("img", R.drawable.starfruit)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Starfruit")
            bundle.putString("growTime","13 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "750g - 1500g")
            bundle.putString("pPrice","Not Sold Here")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop9.putExtras(bundle)
            startActivity(goToCrop9)
        }
        //Summer Spangle
        binding.crop10.setOnClickListener {
            val goToCrop10 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.summersprangle)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Summer Sprangle")
            bundle.putString("growTime","8 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "90g - 180g")
            bundle.putString("pPrice","50g")
            bundle.putString("jPrice","62g")

            goToCrop10.putExtras(bundle)
            startActivity(goToCrop10)
        }
        //Sunflower
        binding.crop11.setOnClickListener {
            val goToCrop11 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.sunflower)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Sunflower")
            bundle.putString("growTime","8 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "80g - 160g")
            bundle.putString("pPrice","200g")
            bundle.putString("jPrice","125g")

            goToCrop11.putExtras(bundle)
            startActivity(goToCrop11)
        }
        //Tomato
        binding.crop12.setOnClickListener {
            val goToCrop12 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.tomato)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Tomato")
            bundle.putString("growTime","11 days")
            bundle.putString("regrowth", "4 days")
            bundle.putString("sellPrice", "60g - 120g")
            bundle.putString("pPrice","50g")
            bundle.putString("jPrice","62g")

            goToCrop12.putExtras(bundle)
            startActivity(goToCrop12)
        }
        //Wheat
        binding.crop13.setOnClickListener {
            val goToCrop13 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.wheat)
            bundle.putString("season", "Summer")
            bundle.putString("name", "Wheat")
            bundle.putString("growTime","4 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "25g - 50g")
            bundle.putString("pPrice","10g")
            bundle.putString("jPrice","12g")

            goToCrop13.putExtras(bundle)
            startActivity(goToCrop13)
        }
    }
}