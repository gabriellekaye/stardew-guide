package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.CropActivity
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ItemCropBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Crop

class CropAdapter: RecyclerView.Adapter<CropAdapter.CropViewHolder> {
    var cropArrayList = ArrayList<Crop>()
    private var context: Context

    constructor(context: Context, cropArrayList: ArrayList<Crop>){
        this.context = context
        this.cropArrayList = cropArrayList
    }

    fun addCrop(crop: Crop) {
        cropArrayList.add(0, crop)
        notifyItemInserted(0)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return cropArrayList.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CropAdapter.CropViewHolder {
        val itemBinding = ItemCropBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return CropViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CropAdapter.CropViewHolder, position: Int) {
        holder.bindCrop(cropArrayList[position])
    }

    inner class CropViewHolder (private val itemBinding: ItemCropBinding): RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {
        var crop = Crop()

        init {
            itemView.setOnClickListener(this)
        }

        fun bindCrop(crop: Crop){
            this.crop = crop
            itemBinding.cropImg.setImageResource(crop.img)
            itemBinding.cropName.text = crop.name
        }

        override fun onClick(v: View?) {
            Toast.makeText(context, "Opening crop ${crop.name}", Toast.LENGTH_SHORT).show()

            val goToCrop = Intent(context, CropActivity::class.java)
            val bundle = Bundle()

            bundle.putString("name", crop.name)
            bundle.putString("season", crop.season)
            bundle.putString("growth", crop.growth)
            bundle.putString("regrowth", crop.regrowth)
            bundle.putString("sell", crop.sell)
            bundle.putString("pierre", crop.pierre)
            bundle.putString("joja", crop.joja)
            bundle.putInt("img", crop.img)

            goToCrop.putExtras(bundle)

            goToCrop.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(goToCrop)
        }
    }

}