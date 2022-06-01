package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

interface FishDAO {
    fun addFish(fish: Fish)
    fun getFish(): ArrayList<Fish>
}

class FishDAOArrayImpl: FishDAO{
    private var arrayListFish = ArrayList<Fish>()

    override fun addFish(fish: Fish) {
        arrayListFish.add(0, fish)
    }

    override fun getFish(): ArrayList<Fish> {
        return arrayListFish
    }

}