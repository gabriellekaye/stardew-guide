package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.Context
import android.database.Cursor
import android.database.SQLException
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

interface ForageableDAO {
    fun getSpringForageables() : ArrayList<Forageable>
    fun getSummerForageables() : ArrayList<Forageable>
    fun getFallForageables() : ArrayList<Forageable>
    fun getWinterForageables() : ArrayList<Forageable>
}

class ForageableDAOSQLImpl(var context: Context): ForageableDAO {

    override fun getSpringForageables(): ArrayList<Forageable> {
        val forageableList:ArrayList<Forageable> = ArrayList<Forageable>()
        val selectQuery = "SELECT * FROM ${ForageableDBHandler.TABLEFORAGE}" +
                " WHERE ${ForageableDBHandler.KEYSPRING} == 1"
        val forageableDBHandler: ForageableDBHandler = ForageableDBHandler(context)
        val db = forageableDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var forageable = Forageable()

        if(cursor.moveToFirst()) {
            do{
                forageable = Forageable()
                forageable.name = cursor.getString(1)
                forageable.description = cursor.getString(2)
                forageable.sell = cursor.getString(3)
                forageable.found = cursor.getString(4)
                forageable.img = cursor.getInt(5)
                forageable.spring = cursor.getInt(6)
                forageable.summer = cursor.getInt(6)
                forageable.fall = cursor.getInt(6)
                forageable.winter = cursor.getInt(6)

                forageableList.add(forageable)
            } while (cursor.moveToNext())
        }
        return forageableList
    }

    override fun getSummerForageables(): ArrayList<Forageable> {
        val forageableList:ArrayList<Forageable> = ArrayList<Forageable>()
        val selectQuery = "SELECT * FROM ${ForageableDBHandler.TABLEFORAGE}" +
                " WHERE ${ForageableDBHandler.KEYSUMMER} == 1"
        val forageableDBHandler: ForageableDBHandler = ForageableDBHandler(context)
        val db = forageableDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var forageable = Forageable()

        if(cursor.moveToFirst()) {
            do{
                forageable = Forageable()
                forageable.name = cursor.getString(1)
                forageable.description = cursor.getString(2)
                forageable.sell = cursor.getString(3)
                forageable.found = cursor.getString(4)
                forageable.img = cursor.getInt(5)
                forageable.spring = cursor.getInt(6)
                forageable.summer = cursor.getInt(6)
                forageable.fall = cursor.getInt(6)
                forageable.winter = cursor.getInt(6)

                forageableList.add(forageable)
            } while (cursor.moveToNext())
        }
        return forageableList
    }

    override fun getFallForageables(): ArrayList<Forageable> {
        val forageableList:ArrayList<Forageable> = ArrayList<Forageable>()
        val selectQuery = "SELECT * FROM ${ForageableDBHandler.TABLEFORAGE}" +
                " WHERE ${ForageableDBHandler.KEYFALL} == 1"
        val forageableDBHandler: ForageableDBHandler = ForageableDBHandler(context)
        val db = forageableDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var forageable = Forageable()

        if(cursor.moveToFirst()) {
            do{
                forageable = Forageable()
                forageable.name = cursor.getString(1)
                forageable.description = cursor.getString(2)
                forageable.sell = cursor.getString(3)
                forageable.found = cursor.getString(4)
                forageable.img = cursor.getInt(5)
                forageable.spring = cursor.getInt(6)
                forageable.summer = cursor.getInt(6)
                forageable.fall = cursor.getInt(6)
                forageable.winter = cursor.getInt(6)

                forageableList.add(forageable)
            } while (cursor.moveToNext())
        }
        return forageableList
    }

    override fun getWinterForageables(): ArrayList<Forageable> {
        val forageableList:ArrayList<Forageable> = ArrayList<Forageable>()
        val selectQuery = "SELECT * FROM ${ForageableDBHandler.TABLEFORAGE}" +
                " WHERE ${ForageableDBHandler.KEYWINTER} == 1"
        val forageableDBHandler: ForageableDBHandler = ForageableDBHandler(context)
        val db = forageableDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var forageable = Forageable()

        if(cursor.moveToFirst()) {
            do{
                forageable = Forageable()
                forageable.name = cursor.getString(1)
                forageable.description = cursor.getString(2)
                forageable.sell = cursor.getString(3)
                forageable.found = cursor.getString(4)
                forageable.img = cursor.getInt(5)
                forageable.spring = cursor.getInt(6)
                forageable.summer = cursor.getInt(6)
                forageable.fall = cursor.getInt(6)
                forageable.winter = cursor.getInt(6)

                forageableList.add(forageable)
            } while (cursor.moveToNext())
        }
        return forageableList
    }
}