package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.dao

import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

interface ForageableDAO {
    fun addForageable(forageable:Forageable)
    fun getForageable() : ArrayList<Forageable>
}

class ForageableDADArrayImpl: ForageableDAO {
    private var arrayListForageable = ArrayList<Forageable>()

    override fun addForageable(forageable: Forageable) {
        arrayListForageable.add(0,forageable)
    }

    override fun getForageable(): ArrayList<Forageable> {
        return arrayListForageable
    }


}