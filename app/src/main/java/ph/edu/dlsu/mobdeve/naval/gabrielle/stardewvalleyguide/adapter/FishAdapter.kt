package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.FishActivity
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ItemFishBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Fish

class FishAdapter: RecyclerView.Adapter<FishAdapter.FishViewHolder> {
    var fishArrayList = ArrayList<Fish>()
    private var context: Context

    constructor(context: Context, fishArrayList:ArrayList<Fish>){
        this.context = context
        this.fishArrayList = fishArrayList
    }

    override fun getItemCount(): Int {
        return fishArrayList.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FishAdapter.FishViewHolder {
        val itemBinding = ItemFishBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent, false)
        return FishViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FishViewHolder, position: Int) {
        holder.bindFish(fishArrayList[position])
    }

    inner class FishViewHolder(private val itemBinding: ItemFishBinding)
        : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {

        var fish = Fish()

        init {
            itemView.setOnClickListener(this)
        }

        fun bindFish(fish: Fish) {
            this.fish = fish
            itemBinding.fishImg.setImageResource(fish.img)
            itemBinding.fishName.text = fish.name
        }

        override fun onClick(v: View?) {
            Toast.makeText(context, fish.name, Toast.LENGTH_SHORT).show()

            val goToFish = Intent(context, FishActivity::class.java)
            val bundle = Bundle()

            bundle.putString("name", fish.name)
            bundle.putString("foundin", fish.foundin)
            bundle.putString("time", fish.time)
            bundle.putString("weather", fish.weather)
            bundle.putString("size", fish.size)
            bundle.putString("heal", fish.heal)
            bundle.putString("sell", fish.sell)
            bundle.putInt("img", fish.img)

            goToFish.putExtras(bundle)

            goToFish.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(goToFish)
        }
    }
}