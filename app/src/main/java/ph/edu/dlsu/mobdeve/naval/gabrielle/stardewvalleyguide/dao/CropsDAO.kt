package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import android.content.Context
import android.content.ContentValues
import android.database.Cursor
import android.database.SQLException
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop

interface CropsDAO {
//    fun addCrop(crop:Crop)
//    fun getCrops() : ArrayList<Crop>
    fun getSpringCrops() : ArrayList<Crop>
    fun getSummerCrops() : ArrayList<Crop>
    fun getFallCrops() : ArrayList<Crop>
}

class CropsDAOSQLImpl(var context: Context): CropsDAO {
//    override fun addCrop(crop: Crop) {
//        var cropDBHandler: CropDBHandler = CropDBHandler(context)
//        val db = cropDBHandler.writableDatabase
//        val contextValues = ContentValues()
//
//        contextValues.put(CropDBHandler.KEYNAME, crop.name)
//        contextValues.put(CropDBHandler.KEYIMG, crop.img)
//        contextValues.put(CropDBHandler.KEYGROWTH, crop.growth)
//        contextValues.put(CropDBHandler.KEYREGROWTH, crop.regrowth)
//        contextValues.put(CropDBHandler.KEYSELL, crop.sell)
//        contextValues.put(CropDBHandler.KEYPIERRE, crop.pierre)
//        contextValues.put(CropDBHandler.KEYJOJA, crop.joja)
//        contextValues.put(CropDBHandler.KEYSPRING, crop.spring)
//        contextValues.put(CropDBHandler.KEYSUMMER, crop.summer)
//        contextValues.put(CropDBHandler.KEYFALL, crop.fall)
//
//        val success = db.insert(CropDBHandler.TABLECROPS, null, contextValues)
//        db.close()
//    }
//
//    // get all crops
//    override fun getCrops(): ArrayList<Crop> {
//        val cropList:ArrayList<Crop> = ArrayList<Crop>()
//        val selectQuery = "SELECT * FROM ${CropDBHandler.TABLECROPS}"
//        var cropDBHandler: CropDBHandler = CropDBHandler(context)
//        val db = cropDBHandler.readableDatabase
//        var cursor: Cursor? = null
//
//        try{
//            cursor = db.rawQuery(selectQuery, null)
//        } catch (e: SQLException) {
//            db.execSQL(selectQuery)
//            return ArrayList()
//        }
////
//        var crop = Crop()
//
//        if(cursor.moveToFirst()) {
//            do{
//                crop = Crop()
//                crop.name = cursor.getString(1)
//                crop.growth = cursor.getString(2)
//                crop.regrowth = cursor.getString(3)
//                crop.sell = cursor.getString(4)
//                crop.pierre = cursor.getString(5)
//                crop.joja = cursor.getString(6)
//                crop.img = cursor.getInt(7)
//                crop.spring = cursor.getInt(8)
//                crop.summer = cursor.getInt(9)
//                crop.fall = cursor.getInt(10)
//
//                cropList.add(crop)
//            } while (cursor.moveToNext())
//        }
//        return cropList
//    }

    // SPRING CROPS
    override fun getSpringCrops(): ArrayList<Crop> {
        val cropList:ArrayList<Crop> = ArrayList<Crop>()
        val selectQuery = "SELECT * FROM ${CropDBHandler.TABLECROPS}" +
                " WHERE ${CropDBHandler.KEYSPRING} == 1"
        var cropDBHandler: CropDBHandler = CropDBHandler(context)
        val db = cropDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var crop = Crop()

        if(cursor.moveToFirst()) {
            do{
                crop = Crop()
                crop.name = cursor.getString(1)
                crop.growth = cursor.getString(2)
                crop.regrowth = cursor.getString(3)
                crop.sell = cursor.getString(4)
                crop.pierre = cursor.getString(5)
                crop.joja = cursor.getString(6)
                crop.img = cursor.getInt(7)
                crop.spring = cursor.getInt(8)
                crop.summer = cursor.getInt(9)
                crop.fall = cursor.getInt(10)

                cropList.add(crop)
            } while (cursor.moveToNext())
        }
        return cropList
    }

    // SUMMER CROPS
    override fun getSummerCrops(): ArrayList<Crop> {
        val cropList:ArrayList<Crop> = ArrayList<Crop>()
        val selectQuery = "SELECT * FROM ${CropDBHandler.TABLECROPS}" +
                " WHERE ${CropDBHandler.KEYSUMMER} == 1"
        var cropDBHandler: CropDBHandler = CropDBHandler(context)
        val db = cropDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var crop = Crop()

        if(cursor.moveToFirst()) {
            do{
                crop = Crop()
                crop.name = cursor.getString(1)
                crop.growth = cursor.getString(2)
                crop.regrowth = cursor.getString(3)
                crop.sell = cursor.getString(4)
                crop.pierre = cursor.getString(5)
                crop.joja = cursor.getString(6)
                crop.img = cursor.getInt(7)
                crop.spring = cursor.getInt(8)
                crop.summer = cursor.getInt(9)
                crop.fall = cursor.getInt(10)

                cropList.add(crop)
            } while (cursor.moveToNext())
        }
        return cropList
    }

    // FALL CROPS
    override fun getFallCrops(): ArrayList<Crop> {
        val cropList:ArrayList<Crop> = ArrayList<Crop>()
        val selectQuery = "SELECT * FROM ${CropDBHandler.TABLECROPS}" +
                " WHERE ${CropDBHandler.KEYFALL} == 1"
        var cropDBHandler: CropDBHandler = CropDBHandler(context)
        val db = cropDBHandler.readableDatabase
        var cursor: Cursor? = null

        try{
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var crop = Crop()

        if(cursor.moveToFirst()) {
            do{
                crop = Crop()
                crop.name = cursor.getString(1)
                crop.growth = cursor.getString(2)
                crop.regrowth = cursor.getString(3)
                crop.sell = cursor.getString(4)
                crop.pierre = cursor.getString(5)
                crop.joja = cursor.getString(6)
                crop.img = cursor.getInt(7)
                crop.spring = cursor.getInt(8)
                crop.summer = cursor.getInt(9)
                crop.fall = cursor.getInt(10)

                cropList.add(crop)
            } while (cursor.moveToNext())
        }
        return cropList
    }
}