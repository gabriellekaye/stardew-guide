package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.R

class FestivalDBHandler (context: Context): SQLiteOpenHelper(context, DBName, null, DBVersion) {
    companion object {
        private val DBVersion = 1
        private val DBName = "FestivalDatabase"

        //table name
        val TABLEFESTIVAL = "FestivalTable"

        val KEYID = "id"
        val KEYNAME = "name"
        val KEYSPRING = "spring"
        val KEYSUMMER = "summer"
        val KEYFALL = "fall"
        val KEYWINTER = "winter"
        val KEYDATE = "date"
        val KEYLOCATION = "location"
        val KEYTIME = "time"
        val KEYDESCRIPTION = "description"
        val KEYIMG = "img"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATEFESTIVALTABLE = "CREATE TABLE $TABLEFESTIVAL " +
                "($KEYID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$KEYNAME TEXT, " +
                "$KEYSPRING INT, " +
                "$KEYSUMMER INT, " +
                "$KEYFALL INT, " +
                "$KEYWINTER INT, " +
                "$KEYDATE TEXT, " +
                "$KEYLOCATION TEXT, " +
                "$KEYTIME TEXT, " +
                "$KEYDESCRIPTION TEXT, " +
                "$KEYIMG INT)"
        db!!.execSQL(CREATEFESTIVALTABLE)

        with(ContentValues()) {
            put(KEYNAME, "Egg Festival")
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            put(KEYDATE, "13th")
            put(KEYLOCATION, "Pelican Town Square")
            put(KEYTIME, "9am - 2pm")
            put(KEYDESCRIPTION, "The Egg Hunt is where the player and some other villagers search for small colored eggs hidden around Pelican Town.")
            put(KEYIMG, R.drawable.eggfestival_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Flower Dance")
            put(KEYSPRING, 1)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            put(KEYDATE, "24th")
            put(KEYLOCATION, "Cindersap Forest")
            put(KEYTIME, "9am - 2pm")
            put(KEYDESCRIPTION, "During this festival, the player can dance with one of the bachelors or bachelorettes.")
            put(KEYIMG, R.drawable.flowerdance_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Luau")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            put(KEYDATE, "11th")
            put(KEYLOCATION, "The Beach")
            put(KEYTIME, "9am - 2pm")
            put(KEYDESCRIPTION, "A central feature of the Luau is the potluck soup. Villagers bring different ingredients to prepare this soup for the Governor, who tastes and judges it.")
            put(KEYIMG, R.drawable.luau_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Dance of the Moonlight Jellies")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 1)
            put(KEYFALL, 0)
            put(KEYWINTER, 0)
            put(KEYDATE, "28th")
            put(KEYLOCATION, "The Beach")
            put(KEYTIME, "10pm - 12am")
            put(KEYDESCRIPTION, "During the festival, villagers gather at the docks to watch migrating jellyfish who are attracted to the light of a torch that Mayor Lewis lights.")
            put(KEYIMG, R.drawable.danceofthemoonlightjellies_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Stardew Valley Fair")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            put(KEYDATE, "16th")
            put(KEYLOCATION, "Pelican Town")
            put(KEYTIME, "9am - 3pm")
            put(KEYDESCRIPTION, "There are several games where the player can gain Star Tokens, a currency that can be exchanged for prizes at the Shop near the entrance to the Bus Stop. The Fair also has a Grange Display contest where the player can show the products of the farm and gain Star Tokens.")
            put(KEYIMG, R.drawable.stardewvalleyfair_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Spirit's Eve")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 1)
            put(KEYWINTER, 0)
            put(KEYDATE, "27th")
            put(KEYLOCATION, "Pelican Town")
            put(KEYTIME, "10pm - 11:50pm")
            put(KEYDESCRIPTION, "The festival features a maze where it is possible to obtain the Golden Pumpkin.")
            put(KEYIMG, R.drawable.spiritseve_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Festival of Ice")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            put(KEYDATE, "8th")
            put(KEYLOCATION, "Cindersap Forest")
            put(KEYTIME, "9am - 2pm")
            put(KEYDESCRIPTION, "At the festival there are ice sculptures and igloos set up. There's also an Ice Fishing Contest the player can take part in.")
            put(KEYIMG, R.drawable.festivalofice_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Night Market")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            put(KEYDATE, "15th - 17th")
            put(KEYLOCATION, "The Beach")
            put(KEYTIME, "5pm - 2am")
            put(KEYDESCRIPTION, "The festival features shops, a mermaid show, and a deep-sea fishing submarine where the player can catch unique fish.")
            put(KEYIMG, R.drawable.nightmarket_small)
            db.insert(TABLEFESTIVAL, null, this)

            put(KEYNAME, "Feast of the Winter Star")
            put(KEYSPRING, 0)
            put(KEYSUMMER, 0)
            put(KEYFALL, 0)
            put(KEYWINTER, 1)
            put(KEYDATE, "25th")
            put(KEYLOCATION, "Pelican Town")
            put(KEYTIME, "9am - 2pm")
            put(KEYDESCRIPTION, "The main event of the Feast of the Winter Star is secret gift-giving. A random villager will be selected to give the player a gift, and they are assigned a random villager to give a gift to.")
            put(KEYIMG, R.drawable.feastofthewinterstar_small)
            db.insert(TABLEFESTIVAL, null, this)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLEFESTIVAL)
        onCreate(db)
    }
}