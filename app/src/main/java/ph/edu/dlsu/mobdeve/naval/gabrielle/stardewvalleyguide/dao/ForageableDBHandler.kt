package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.R


class ForageableDBHandler (context: Context): SQLiteOpenHelper(context, ForageableDBHandler.DBName, null, ForageableDBHandler.DBVersion) {
    companion object {
        private val DBVersion = 1
        private val DBName = "ForageDatabase"

        //table name
        val TABLEFORAGE = "ForageTable"

        val KEYID = "id"
        val KEYNAME = "name"
        val KEYDESCRIPTION = "description"
        val KEYSELL = "sell"
        val KEYFOUND = "found"
        val KEYIMG = "img"
        val KEYSPRING = "spring"
        val KEYSUMMER = "summer"
        val KEYFALL = "fall"
        val KEYWINTER = "winter"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATEFORAGETABLE = "CREATE TABLE $TABLEFORAGE " +
                "($KEYID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$KEYNAME TEXT, " +
                "$KEYDESCRIPTION TEXT, " +
                "$KEYSELL TEXT, " +
                "$KEYFOUND TEXT, " +
                "$KEYIMG INT, " +
                "$KEYSPRING INT, " +
                "$KEYSUMMER INT, " +
                "$KEYFALL INT, " +
                "$KEYWINTER INT)"
        db!!.execSQL(CREATEFORAGETABLE)

        with(ContentValues()) {
            put(KEYNAME, "Sap")
            put(KEYDESCRIPTION, "A fluid obtained from trees.")
            put(KEYSELL, "2g")
            put(KEYFOUND, "In any tree")
            put(KEYIMG, R.drawable.sap)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 1)
            put(KEYFALL, 1)
            put(KEYWINTER, 1)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Wild Horseradish")
            put(KEYDESCRIPTION, "A spicy root found in the spring.")
            put(KEYSELL, "50g - 100g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.wildhorseradish)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Daffodil")
            put(KEYDESCRIPTION, "A traditional spring flower that makes a nice gift.")
            put(KEYSELL, "30g - 60g")
            put(KEYFOUND, "Pelican Town")
            put(KEYIMG, R.drawable.daffodil)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Leek")
            put(KEYDESCRIPTION, "A tasty relative of the onion.")
            put(KEYSELL, "60g - 120g")
            put(KEYFOUND, "Backwoods")
            put(KEYIMG, R.drawable.leek)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Dandelion")
            put(KEYDESCRIPTION, "Not the prettiest flower, but the leaves make a good salad.")
            put(KEYSELL, "40g - 80g")
            put(KEYFOUND, "Cindersap Forest")
            put(KEYIMG, R.drawable.dandelion)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Spring Onion")
            put(KEYDESCRIPTION, "These grow wild during the spring.")
            put(KEYSELL, "8g - 16g")
            put(KEYFOUND, "Cindersap Forest")
            put(KEYIMG, R.drawable.springonion)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Morel")
            put(KEYDESCRIPTION, "Sought after for its unique nutty flavor.")
            put(KEYSELL, "150g - 300g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.morel)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Common Mushroom")
            put(KEYDESCRIPTION, "Slightly nutty, with good texture.")
            put(KEYSELL, "40g - 80g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.commonmushroom)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 1)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Salmonberry")
            put(KEYDESCRIPTION, "A spring-time berry with the flavor of the forest.")
            put(KEYSELL, "5g - 10g")
            put(KEYFOUND, "On bushes")
            put(KEYIMG, R.drawable.salmonberry)
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Grape")
            put(KEYDESCRIPTION, "A sweet cluster of fruit.")
            put(KEYSELL, "80g - 160g")
            put(KEYFOUND, "Backwoods")
            put(KEYIMG, R.drawable.grapes)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Spice Berry")
            put(KEYDESCRIPTION, "It fills the air with a pungent aroma.")
            put(KEYSELL, "80g - 160g")
            put(KEYFOUND, "Cindersap Forest")
            put(KEYIMG, R.drawable.spiceberry)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Sweet Pea")
            put(KEYDESCRIPTION, "A fragrant summer flower.")
            put(KEYSELL, "50g - 100g")
            put(KEYFOUND, "Pelican Town")
            put(KEYIMG, R.drawable.sweetpea)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Red Mushroom")
            put(KEYDESCRIPTION, "A spotted mushroom sometimes found in caves.")
            put(KEYSELL, "75g - 150g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.redmushroom)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Fiddle Fern")
            put(KEYDESCRIPTION, "The young shoots are an edible specialty.")
            put(KEYSELL, "90g - 180g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.fiddleheadfern)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Wild Plum")
            put(KEYDESCRIPTION, "Tart and juicy with a pungent aroma.")
            put(KEYSELL, "80g - 160g")
            put(KEYFOUND, "Bus Stop")
            put(KEYIMG, R.drawable.wildplum)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Hazelnut")
            put(KEYDESCRIPTION, "That's one big hazelnut!")
            put(KEYSELL, "90g - 180g")
            put(KEYFOUND, "Backwoods")
            put(KEYIMG, R.drawable.hazelnut)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Blackberry")
            put(KEYDESCRIPTION, "An early-fall treat.")
            put(KEYSELL, "20g - 40g")
            put(KEYFOUND, "Pelican Town")
            put(KEYIMG, R.drawable.blackberry)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Chanterelle")
            put(KEYDESCRIPTION, "A tasty mushroom with a fruity smell and slightly peppery flavor.")
            put(KEYSELL, "160g - 320g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.chanterelle)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Purple Mushroom")
            put(KEYDESCRIPTION, "A rare mushroom found deep in caves.")
            put(KEYSELL, "250g - 500g")
            put(KEYFOUND, "Forest Farm")
            put(KEYIMG, R.drawable.purplemushroom)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Winter Root")
            put(KEYDESCRIPTION, "A starchy tuber.")
            put(KEYSELL, "70g - 140g")
            put(KEYFOUND, "By tilling soil")
            put(KEYIMG, R.drawable.winterroot)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Crystal Fruit")
            put(KEYDESCRIPTION, "A delicate fruit that pops up from the snow.")
            put(KEYSELL, "150g - 300g")
            put(KEYFOUND, "Railroad")
            put(KEYIMG, R.drawable.crystalfruit)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Snow Yam")
            put(KEYDESCRIPTION, "This little yam was hiding beneath the snow.")
            put(KEYSELL, "100g - 200g")
            put(KEYFOUND, "By tilling soil")
            put(KEYIMG, R.drawable.snowyam)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Crocus")
            put(KEYDESCRIPTION, "A flower that can bloom in the winter.")
            put(KEYSELL, "60g - 120g")
            put(KEYFOUND, "Pelican Town")
            put(KEYIMG, R.drawable.crocus)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            db.insert(TABLEFORAGE, null, this)

            put(KEYNAME, "Holly")
            put(KEYDESCRIPTION, "The leaves and bright red berries make a popular winter decoration.")
            put(KEYSELL, "80g - 160g")
            put(KEYFOUND, "Secret Woods")
            put(KEYIMG, R.drawable.holly)
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            db.insert(TABLEFORAGE, null, this)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLEFORAGE)
        onCreate(db)
    }
}