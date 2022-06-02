package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.R

class CropDBHandler (context: Context): SQLiteOpenHelper(context, DBName, null, DBVersion) {
    companion object {
        private val DBVersion = 1
        private val DBName = "CropsDatabase"

        //table name
        val TABLECROPS = "CropsTable"

        val KEYID = "id"
        val KEYNAME = "name"
        val KEYGROWTH = "growth"
        val KEYREGROWTH = "regrowth"
        val KEYSELL = "sell"
        val KEYPIERRE = "pierre"
        val KEYJOJA = "joja"
        val KEYIMG = "img"
        val KEYSPRING = "spring"
        val KEYSUMMER = "summer"
        val KEYFALL = "fall"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATECROPSTABLE = "CREATE TABLE $TABLECROPS " +
                "($KEYID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$KEYNAME TEXT, " +
                "$KEYGROWTH TEXT, " +
                "$KEYREGROWTH TEXT, " +
                "$KEYSELL TEXT, " +
                "$KEYPIERRE TEXT, " +
                "$KEYJOJA TEXT, " +
                "$KEYIMG INT, " +
                "$KEYSPRING INT, " +
                "$KEYSUMMER INT, " +
                "$KEYFALL INT)"
        db!!.execSQL(CREATECROPSTABLE)

        with(ContentValues()) {
            put(KEYNAME, "Blue Jazz")
            put(KEYGROWTH, "7 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "50g - 100g")
            put(KEYPIERRE, "30g")
            put(KEYJOJA, "37g")
            put(KEYIMG, R.drawable.bluejazz)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Cauliflower")
            put(KEYGROWTH, "12 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "175g - 350g")
            put(KEYPIERRE, "80g")
            put(KEYJOJA, "100g")
            put(KEYIMG, R.drawable.cauliflower)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Coffee Bean")
            put(KEYGROWTH, "10 days")
            put(KEYREGROWTH, "2 days")
            put(KEYSELL, "15g - 30g")
            put(KEYPIERRE, "Not sold here")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.coffeebean)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Garlic")
            put(KEYGROWTH, "4 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "60g - 120g")
            put(KEYPIERRE, "40g")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.garlic)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Green Bean")
            put(KEYGROWTH, "10 days")
            put(KEYREGROWTH, "3 days")
            put(KEYSELL, "40g - 80g")
            put(KEYPIERRE, "60g")
            put(KEYJOJA, "75g")
            put(KEYIMG, R.drawable.greenbean)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Kale")
            put(KEYGROWTH, "6 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "110g - 220g")
            put(KEYPIERRE, "70g")
            put(KEYJOJA, "87g")
            put(KEYIMG, R.drawable.kale)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Parsnip")
            put(KEYGROWTH, "4 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "35g - 70g")
            put(KEYPIERRE, "20g")
            put(KEYJOJA, "25g")
            put(KEYIMG, R.drawable.parsnip)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Potato")
            put(KEYGROWTH, "6 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "80g - 160g")
            put(KEYPIERRE, "50g")
            put(KEYJOJA, "62g")
            put(KEYIMG, R.drawable.potato)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Rhubarb")
            put(KEYGROWTH, "13 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "220g - 440g")
            put(KEYPIERRE, "Not sold here")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.rhubarb)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Strawberry")
            put(KEYGROWTH, "8 days")
            put(KEYREGROWTH, "4 days")
            put(KEYSELL, "120g - 240g")
            put(KEYPIERRE, "100g (Egg Festival)")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.strawberry)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Tulip")
            put(KEYGROWTH, "6 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "30g - 60g")
            put(KEYPIERRE, "20g")
            put(KEYJOJA, "25g")
            put(KEYIMG, R.drawable.tulip)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Unmilled Rice")
            put(KEYGROWTH, "8-6 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "30g - 60g")
            put(KEYPIERRE, "40g")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.unmilledrice)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Blueberry")
            put(KEYGROWTH, "13 days")
            put(KEYREGROWTH, "4 days")
            put(KEYSELL, "50g - 100g")
            put(KEYPIERRE, "80g")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.blueberry)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Corn")
            put(KEYGROWTH, "14 days")
            put(KEYREGROWTH, "4 days")
            put(KEYSELL, "50g - 100g")
            put(KEYPIERRE, "150g")
            put(KEYJOJA, "187g")
            put(KEYIMG, R.drawable.corn)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Hops")
            put(KEYGROWTH, "11 days")
            put(KEYREGROWTH, "1 day")
            put(KEYSELL, "25g - 50g")
            put(KEYPIERRE, "60g")
            put(KEYJOJA, "75g")
            put(KEYIMG, R.drawable.hops)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Hot Pepper")
            put(KEYGROWTH, "5 days")
            put(KEYREGROWTH, "3 days")
            put(KEYSELL, "40g - 80g")
            put(KEYPIERRE, "40g")
            put(KEYJOJA, "50g")
            put(KEYIMG, R.drawable.hotpepper)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Melon")
            put(KEYGROWTH, "12 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "250g - 500g")
            put(KEYPIERRE, "80g")
            put(KEYJOJA, "100g")
            put(KEYIMG, R.drawable.melon)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Poppy")
            put(KEYGROWTH, "7 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "140g - 280g")
            put(KEYPIERRE, "100g")
            put(KEYJOJA, "125g")
            put(KEYIMG, R.drawable.poppy)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Radish")
            put(KEYGROWTH, "6 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "90g - 180g")
            put(KEYPIERRE, "40g")
            put(KEYJOJA, "50g")
            put(KEYIMG, R.drawable.radish)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Red Cabbage")
            put(KEYGROWTH, "9 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "260g - 520g")
            put(KEYPIERRE, "100g")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.redcabbage)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Starfruit")
            put(KEYGROWTH, "13 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "750g - 1500g")
            put(KEYPIERRE, "Not sold here")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.starfruit)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Summer Spangle")
            put(KEYGROWTH, "8 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "90g - 180g")
            put(KEYPIERRE, "50g")
            put(KEYJOJA, "62g")
            put(KEYIMG, R.drawable.summersprangle)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Sunflower")
            put(KEYGROWTH, "8 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "80g - 160g")
            put(KEYPIERRE, "200g")
            put(KEYJOJA, "125g")
            put(KEYIMG, R.drawable.sunflower)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Tomato")
            put(KEYGROWTH, "11 days")
            put(KEYREGROWTH, "4 days")
            put(KEYSELL, "60g - 120g")
            put(KEYPIERRE, "50g")
            put(KEYJOJA, "62g")
            put(KEYIMG, R.drawable.tomato)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Wheat")
            put(KEYGROWTH, "4 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "25g - 50g")
            put(KEYPIERRE, "10g")
            put(KEYJOJA, "12g")
            put(KEYIMG, R.drawable.wheat)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Amaranth")
            put(KEYGROWTH, "7 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "150g - 300g")
            put(KEYPIERRE, "70g")
            put(KEYJOJA, "87g")
            put(KEYIMG, R.drawable.amaranth)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Artichoke")
            put(KEYGROWTH, "8 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "160g - 320g")
            put(KEYPIERRE, "30g")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.artichoke)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Beet")
            put(KEYGROWTH, "6 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "100g - 200g")
            put(KEYPIERRE, "Not sold here")
            put(KEYJOJA, "Not sold here")
            put(KEYIMG, R.drawable.beet)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Bok Choy")
            put(KEYGROWTH, "4 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "80g - 160g")
            put(KEYPIERRE, "50g")
            put(KEYJOJA, "62g")
            put(KEYIMG, R.drawable.bokchoy)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Cranberries")
            put(KEYGROWTH, "7 days")
            put(KEYREGROWTH, "5 days")
            put(KEYSELL, "75g - 150g")
            put(KEYPIERRE, "240g")
            put(KEYJOJA, "300g")
            put(KEYIMG, R.drawable.cranberries)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Eggplant")
            put(KEYGROWTH, "5 days")
            put(KEYREGROWTH, "5 days")
            put(KEYSELL, "60g - 120g")
            put(KEYPIERRE, "20g")
            put(KEYJOJA, "25g")
            put(KEYIMG, R.drawable.eggplant)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Fairy Rose")
            put(KEYGROWTH, "12 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "290g - 580g")
            put(KEYPIERRE, "200g")
            put(KEYJOJA, "250g")
            put(KEYIMG, R.drawable.fairyrose)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Grape")
            put(KEYGROWTH, "10 days")
            put(KEYREGROWTH, "3 days")
            put(KEYSELL, "80g - 160g")
            put(KEYPIERRE, "60g")
            put(KEYJOJA, "75g")
            put(KEYIMG, R.drawable.grapes)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Pumpkin")
            put(KEYGROWTH, "13 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "320g - 640g")
            put(KEYPIERRE, "100g")
            put(KEYJOJA, "125g")
            put(KEYIMG, R.drawable.pumpkin)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)

            put(KEYNAME, "Yam")
            put(KEYGROWTH, "10 days")
            put(KEYREGROWTH, "No")
            put(KEYSELL, "160g - 320g")
            put(KEYPIERRE, "60g")
            put(KEYJOJA, "75g")
            put(KEYIMG, R.drawable.yam)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            db.insert(TABLECROPS, null, this)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLECROPS)
        onCreate(db)
    }
}