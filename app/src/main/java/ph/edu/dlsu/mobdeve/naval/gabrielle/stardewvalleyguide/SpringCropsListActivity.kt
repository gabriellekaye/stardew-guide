package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivitySpringCropsListBinding

class SpringCropsListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpringCropsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpringCropsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Blue Jazz
        binding.crop1.setOnClickListener {
            val goToCrop1 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.Blue_Jazz)
            bundle.putString("name", "Blue Jazz")
            bundle.putString("growTime","7 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "50g - 100g")
            bundle.putString("pPrice","30g")
            bundle.putString("jPrice","37g")

            goToCrop1.putExtras(bundle)
            startActivity(goToCrop1)
        }

        //Cauliflower
        binding.crop2.setOnClickListener {
            val goToCrop2 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.cauliflower)
            bundle.putString("name", "Cauliflower")
            bundle.putString("growTime","12 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "175g - 350g")
            bundle.putString("pPrice","80g")
            bundle.putString("jPrice","100g")

            goToCrop2.putExtras(bundle)
            startActivity(goToCrop2)
        }

        //Coffee Bean
        binding.crop3.setOnClickListener {
            val goToCrop3 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.coffeebean)
            bundle.putString("name", "Coffee Bean")
            bundle.putString("growTime","10 days")
            bundle.putString("regrowth", "2 days")
            bundle.putString("sellPrice", "15g - 30g")
            bundle.putString("pPrice","Not Sold Here")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop3.putExtras(bundle)
            startActivity(goToCrop3)
        }

        //Garlic
        binding.crop4.setOnClickListener {
            val goToCrop4 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.garlic)
            bundle.putString("name", "Garlic")
            bundle.putString("growTime","10 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "60g - 120g")
            bundle.putString("pPrice","40g")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop4.putExtras(bundle)
            startActivity(goToCrop4)
        }

        //Green Bean
        binding.crop5.setOnClickListener {
            val goToCrop5 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.greenbean)
            bundle.putString("name", "Green Bean")
            bundle.putString("growTime","10 days")
            bundle.putString("regrowth", "3 days")
            bundle.putString("sellPrice", "40g - 80g")
            bundle.putString("pPrice","60g")
            bundle.putString("jPrice","75g")

            goToCrop5.putExtras(bundle)
            startActivity(goToCrop5)
        }

        //Kale
        binding.crop6.setOnClickListener {
            val goToCrop6 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.kale)
            bundle.putString("name", "Kale")
            bundle.putString("growTime","6 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "110g - 220g")
            bundle.putString("pPrice","70g")
            bundle.putString("jPrice","87g")

            goToCrop6.putExtras(bundle)
            startActivity(goToCrop6)
        }

        //Parsnip
        binding.crop7.setOnClickListener {
            val goToCrop7 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.parsnip)
            bundle.putString("name", "Parsnip")
            bundle.putString("growTime","4 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "35g - 70g")
            bundle.putString("pPrice","20g")
            bundle.putString("jPrice","25g")

            goToCrop7.putExtras(bundle)
            startActivity(goToCrop7)
        }

        //Potato
        binding.crop8.setOnClickListener {
            val goToCrop8 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.potato)
            bundle.putString("name", "Potato")
            bundle.putString("growTime","6 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "80g - 160g")
            bundle.putString("pPrice","50g")
            bundle.putString("jPrice","62g")

            goToCrop8.putExtras(bundle)
            startActivity(goToCrop8)
        }

        //Rhubarb
        binding.crop9.setOnClickListener {
            val goToCrop9 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.rhubarb)
            bundle.putString("name", "Rhubarb")
            bundle.putString("growTime","13 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "220g - 440g")
            bundle.putString("pPrice","Not Sold Here")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop9.putExtras(bundle)
            startActivity(goToCrop9)
        }

        //Strawberry
        binding.crop10.setOnClickListener {
            val goToCrop10 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.strawberry)
            bundle.putString("name", "Strawberry")
            bundle.putString("growTime","8 days")
            bundle.putString("regrowth", "4 days")
            bundle.putString("sellPrice", "120g - 240g")
            bundle.putString("pPrice","100g")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop10.putExtras(bundle)
            startActivity(goToCrop10)
        }

        //Tulip
        binding.crop11.setOnClickListener {
            val goToCrop11 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.tulip)
            bundle.putString("name", "Tulip")
            bundle.putString("growTime","6 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "30g - 60g")
            bundle.putString("pPrice","20g")
            bundle.putString("jPrice","25g")

            goToCrop11.putExtras(bundle)
            startActivity(goToCrop11)
        }

        //Unmilled Rice
        binding.crop12.setOnClickListener {
            val goToCrop12 = Intent(this, Crop::class.java)
            val bundle = Bundle()

            bundle.putInt("img", R.drawable.unmilledrice)
            bundle.putString("name", "Unmilled Rice")
            bundle.putString("growTime","8 days")
            bundle.putString("regrowth", "No")
            bundle.putString("sellPrice", "30g - 60g")
            bundle.putString("pPrice","40g")
            bundle.putString("jPrice","Not Sold Here")

            goToCrop12.putExtras(bundle)
            startActivity(goToCrop12)
        }
    }
}