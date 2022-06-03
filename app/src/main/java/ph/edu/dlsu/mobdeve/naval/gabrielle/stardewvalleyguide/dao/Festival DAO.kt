package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.Context
import android.content.ContentValues
import android.database.Cursor
import android.database.SQLException
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

interface FestivalDAO {
    fun getSpringFestival(): ArrayList<Festival>
    fun getSummerFestival(): ArrayList<Festival>
    fun getFallFestival(): ArrayList<Festival>
    fun getWinterFestival(): ArrayList<Festival>
}

class FestivalDAOSQLImpl(var context: Context): FestivalDAO{
    override fun getSpringFestival(): ArrayList<Festival> {
        val festivalList:ArrayList<Festival> = ArrayList<Festival>()
        val selectQuery = "SELECT * FROM ${FestivalDBHandler.TABLEFESTIVAL}" +
                " WHERE ${FestivalDBHandler.KEYSPRING} == 1"
        var festivalDBHandler: FestivalDBHandler = FestivalDBHandler(context)
        val db = festivalDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var festival = Festival()

        if(cursor.moveToFirst()) {
            do{
                festival = Festival()
                festival.name = cursor.getString(1)
                festival.spring = cursor.getInt(2)
                festival.summer = cursor.getInt(3)
                festival.fall = cursor.getInt(4)
                festival.winter = cursor.getInt(5)
                festival.date = cursor.getString(6)
                festival.location = cursor.getString(7)
                festival.time = cursor.getString(8)
                festival.description = cursor.getString(9)
                festival.img = cursor.getInt(10)


                festivalList.add(festival)
            } while (cursor.moveToNext())
        }
        return festivalList
    }

    override fun getSummerFestival(): ArrayList<Festival> {
        val festivalList:ArrayList<Festival> = ArrayList<Festival>()
        val selectQuery = "SELECT * FROM ${FestivalDBHandler.TABLEFESTIVAL}" +
                " WHERE ${FestivalDBHandler.KEYSUMMER} == 1"
        var festivalDBHandler: FestivalDBHandler = FestivalDBHandler(context)
        val db = festivalDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var festival = Festival()

        if(cursor.moveToFirst()) {
            do{
                festival = Festival()
                festival.name = cursor.getString(1)
                festival.spring = cursor.getInt(2)
                festival.summer = cursor.getInt(3)
                festival.fall = cursor.getInt(4)
                festival.winter = cursor.getInt(5)
                festival.date = cursor.getString(6)
                festival.location = cursor.getString(7)
                festival.time = cursor.getString(8)
                festival.description = cursor.getString(9)
                festival.img = cursor.getInt(10)


                festivalList.add(festival)
            } while (cursor.moveToNext())
        }
        return festivalList
    }

    override fun getFallFestival(): ArrayList<Festival> {
        val festivalList:ArrayList<Festival> = ArrayList<Festival>()
        val selectQuery = "SELECT * FROM ${FestivalDBHandler.TABLEFESTIVAL}" +
                " WHERE ${FestivalDBHandler.KEYFALL} == 1"
        var festivalDBHandler: FestivalDBHandler = FestivalDBHandler(context)
        val db = festivalDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var festival = Festival()

        if(cursor.moveToFirst()) {
            do{
                festival = Festival()
                festival.name = cursor.getString(1)
                festival.spring = cursor.getInt(2)
                festival.summer = cursor.getInt(3)
                festival.fall = cursor.getInt(4)
                festival.winter = cursor.getInt(5)
                festival.date = cursor.getString(6)
                festival.location = cursor.getString(7)
                festival.time = cursor.getString(8)
                festival.description = cursor.getString(9)
                festival.img = cursor.getInt(10)


                festivalList.add(festival)
            } while (cursor.moveToNext())
        }
        return festivalList
    }

    override fun getWinterFestival(): ArrayList<Festival> {
        val festivalList:ArrayList<Festival> = ArrayList<Festival>()
        val selectQuery = "SELECT * FROM ${FestivalDBHandler.TABLEFESTIVAL}" +
                " WHERE ${FestivalDBHandler.KEYWINTER} == 1"
        var festivalDBHandler: FestivalDBHandler = FestivalDBHandler(context)
        val db = festivalDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var festival = Festival()

        if(cursor.moveToFirst()) {
            do{
                festival = Festival()
                festival.name = cursor.getString(1)
                festival.spring = cursor.getInt(2)
                festival.summer = cursor.getInt(3)
                festival.fall = cursor.getInt(4)
                festival.winter = cursor.getInt(5)
                festival.date = cursor.getString(6)
                festival.location = cursor.getString(7)
                festival.time = cursor.getString(8)
                festival.description = cursor.getString(9)
                festival.img = cursor.getInt(10)


                festivalList.add(festival)
            } while (cursor.moveToNext())
        }
        return festivalList
    }
}