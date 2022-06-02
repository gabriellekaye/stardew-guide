package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.ForageableActivity
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ItemCropBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Forageable

class ForageableAdapter: RecyclerView.Adapter<ForageableAdapter.ForageableViewHolder> {
    var forageableArrayList = ArrayList<Forageable>()
    private var context: Context

    constructor(context: Context, forageableArrayList: ArrayList<Forageable>) {
        this.context = context
        this.forageableArrayList = forageableArrayList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ForageableAdapter.ForageableViewHolder {
        val itemBinding = ItemCropBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ForageableViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ForageableAdapter.ForageableViewHolder, position: Int) {
        holder.bindForageable(forageableArrayList[position])
    }

    override fun getItemCount(): Int {
        return forageableArrayList.size
    }

    inner class ForageableViewHolder (private val itemBinding: ItemCropBinding): RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {
        var forageable = Forageable()

        init {
            itemView.setOnClickListener(this)
        }

        fun bindForageable(forageable: Forageable){
            this.forageable = forageable
            itemBinding.cropImg.setImageResource(forageable.img)
            itemBinding.cropName.text = forageable.name
        }

        override fun onClick(v: View?) {
            val goToClicked = Intent(context, ForageableActivity::class.java)
            val bundle = Bundle()

            bundle.putString("name", forageable.name)
            bundle.putString("description", forageable.description)
            bundle.putString("found", forageable.found)
            bundle.putString("sell", forageable.sell)
            bundle.putInt("img", forageable.img)

            goToClicked.putExtras(bundle)

            goToClicked.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(goToClicked)
        }
    }
}