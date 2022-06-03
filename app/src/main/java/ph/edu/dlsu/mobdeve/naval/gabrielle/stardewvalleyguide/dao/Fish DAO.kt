package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

interface FishDAO {
    fun getSpringFish(): ArrayList<Fish>
    fun getSummerFish(): ArrayList<Fish>
    fun getFallFish(): ArrayList<Fish>
    fun getWinterFish(): ArrayList<Fish>
}

class FishDAOSQLImpl(var context: Context): FishDAO{
    override fun getSpringFish(): ArrayList<Fish> {
        val fishList:ArrayList<Fish> = ArrayList<Fish>()
        val selectQuery = "SELECT * FROM ${FishDBHandler.TABLEFISH}" +
                " WHERE ${FishDBHandler.KEYSPRING} == 1"
        var fishDBHandler: FishDBHandler = FishDBHandler(context)
        val db = fishDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var fish = Fish()

        if(cursor.moveToFirst()) {
            do{
                fish = Fish()
                fish.name = cursor.getString(1)
                fish.spring = cursor.getInt(2)
                fish.summer = cursor.getInt(3)
                fish.fall = cursor.getInt(4)
                fish.winter = cursor.getInt(5)
                fish.foundin = cursor.getString(6)
                fish.time = cursor.getString(7)
                fish.weather = cursor.getString(8)
                fish.size = cursor.getString(9)
                fish.heal = cursor.getString(10)
                fish.sell = cursor.getString(11)
                fish.img = cursor.getInt(12)


                fishList.add(fish)
            } while (cursor.moveToNext())
        }
        return fishList
    }

    override fun getSummerFish(): ArrayList<Fish> {
        val fishList:ArrayList<Fish> = ArrayList<Fish>()
        val selectQuery = "SELECT * FROM ${FishDBHandler.TABLEFISH}" +
                " WHERE ${FishDBHandler.KEYSUMMER} == 1"
        var fishDBHandler: FishDBHandler = FishDBHandler(context)
        val db = fishDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var fish = Fish()

        if(cursor.moveToFirst()) {
            do{
                fish = Fish()
                fish.name = cursor.getString(1)
                fish.spring = cursor.getInt(2)
                fish.summer = cursor.getInt(3)
                fish.fall = cursor.getInt(4)
                fish.winter = cursor.getInt(5)
                fish.foundin = cursor.getString(6)
                fish.time = cursor.getString(7)
                fish.weather = cursor.getString(8)
                fish.size = cursor.getString(9)
                fish.heal = cursor.getString(10)
                fish.sell = cursor.getString(11)
                fish.img = cursor.getInt(12)


                fishList.add(fish)
            } while (cursor.moveToNext())
        }
        return fishList
    }

    override fun getFallFish(): ArrayList<Fish> {
        val fishList:ArrayList<Fish> = ArrayList<Fish>()
        val selectQuery = "SELECT * FROM ${FishDBHandler.TABLEFISH}" +
                " WHERE ${FishDBHandler.KEYFALL} == 1"
        var fishDBHandler: FishDBHandler = FishDBHandler(context)
        val db = fishDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var fish = Fish()

        if(cursor.moveToFirst()) {
            do{
                fish = Fish()
                fish.name = cursor.getString(1)
                fish.spring = cursor.getInt(2)
                fish.summer = cursor.getInt(3)
                fish.fall = cursor.getInt(4)
                fish.winter = cursor.getInt(5)
                fish.foundin = cursor.getString(6)
                fish.time = cursor.getString(7)
                fish.weather = cursor.getString(8)
                fish.size = cursor.getString(9)
                fish.heal = cursor.getString(10)
                fish.sell = cursor.getString(11)
                fish.img = cursor.getInt(12)


                fishList.add(fish)
            } while (cursor.moveToNext())
        }
        return fishList
    }

    override fun getWinterFish(): ArrayList<Fish> {
        val fishList:ArrayList<Fish> = ArrayList<Fish>()
        val selectQuery = "SELECT * FROM ${FishDBHandler.TABLEFISH}" +
                " WHERE ${FishDBHandler.KEYWINTER} == 1"
        var fishDBHandler: FishDBHandler = FishDBHandler(context)
        val db = fishDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var fish = Fish()

        if(cursor.moveToFirst()) {
            do{
                fish = Fish()
                fish.name = cursor.getString(1)
                fish.spring = cursor.getInt(2)
                fish.summer = cursor.getInt(3)
                fish.fall = cursor.getInt(4)
                fish.winter = cursor.getInt(5)
                fish.foundin = cursor.getString(6)
                fish.time = cursor.getString(7)
                fish.weather = cursor.getString(8)
                fish.size = cursor.getString(9)
                fish.heal = cursor.getString(10)
                fish.sell = cursor.getString(11)
                fish.img = cursor.getInt(12)


                fishList.add(fish)
            } while (cursor.moveToNext())
        }
        return fishList
    }
}