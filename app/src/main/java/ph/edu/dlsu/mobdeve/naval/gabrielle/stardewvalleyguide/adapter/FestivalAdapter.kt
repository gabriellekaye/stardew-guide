package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.FestivalActivity
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ItemFestivalBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Festival

class FestivalAdapter: RecyclerView.Adapter<FestivalAdapter.FestivalViewHolder> {
    var festivalArrayList = ArrayList<Festival>()
    private var context: Context

    constructor(context: Context, festivalArrayList:ArrayList<Festival>){
        this.context = context
        this.festivalArrayList = festivalArrayList
    }

    override fun getItemCount(): Int {
        return festivalArrayList.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FestivalAdapter.FestivalViewHolder {
        val itemBinding = ItemFestivalBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent, false)
        return FestivalViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FestivalViewHolder, position: Int) {
        holder.bindFestival(festivalArrayList[position])
    }

    inner class FestivalViewHolder(private val itemBinding: ItemFestivalBinding)
        : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {

        var festival = Festival()

        init {
            itemView.setOnClickListener(this)
        }

        fun bindFestival(festival: Festival) {
            this.festival = festival
            itemBinding.festimg.setImageResource(festival.img)
            itemBinding.festname.text = festival.name
        }

        override fun onClick(v: View?) {
            Toast.makeText(context, festival.name, Toast.LENGTH_SHORT).show()

            val goToFestival = Intent(context, FestivalActivity::class.java)
            val bundle = Bundle()

            bundle.putString("name", festival.name)
            bundle.putString("date", festival.date)
            bundle.putString("location", festival.location)
            bundle.putString("time", festival.time)
            bundle.putString("description", festival.description)
            bundle.putInt("img", festival.img)

            goToFestival.putExtras(bundle)

            goToFestival.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(goToFestival)
        }
    }
}