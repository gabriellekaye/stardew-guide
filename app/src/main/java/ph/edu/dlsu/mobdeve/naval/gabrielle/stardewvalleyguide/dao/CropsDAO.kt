package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop


interface CropsDAO {
    fun addCrop(crop:Crop)
    fun getCrop() : ArrayList<Crop>
}

class CropsDADArrayImpl: CropsDAO {
    private var arrayListCrop = ArrayList<Crop>()

    override fun addCrop(crop: Crop) {
        arrayListCrop.add(0, crop)
    }

    override fun getCrop(): ArrayList<Crop> {
        return arrayListCrop
    }

}