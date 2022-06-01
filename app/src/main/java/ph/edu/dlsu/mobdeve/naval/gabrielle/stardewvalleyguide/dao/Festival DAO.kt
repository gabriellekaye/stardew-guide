package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

interface FestivalDAO {
    fun addFestival(festival: Festival)
    fun getFestival(): ArrayList<Festival>
}

class FestivalDAOArrayImpl: FestivalDAO{
    private var arrayListFestival = ArrayList<Festival>()

    override fun addFestival(festival: Festival) {
        arrayListFestival.add(0, festival)
    }

    override fun getFestival(): ArrayList<Festival> {
        return arrayListFestival
    }

}