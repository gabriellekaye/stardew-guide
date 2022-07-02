package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ItemReplyBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Reply

class ReplyAdapter: RecyclerView.Adapter<ReplyAdapter.ReplyViewHolder> {
    private var replyArrayList = ArrayList<Reply>()
    private lateinit var context: Context

    public constructor(context: Context, replyArrayList:ArrayList<Reply>) {
        this.context = context
        this.replyArrayList = replyArrayList
    }

    fun addAccount(reply: Reply) {
        replyArrayList.add(0, reply)
        notifyItemInserted(0)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return replyArrayList.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReplyAdapter.ReplyViewHolder {
        //loads per row layout during runtime
        val itemBinding = ItemReplyBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,false)
        return ReplyViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ReplyAdapter.ReplyViewHolder, position: Int) {
        holder.bindReply(replyArrayList[position])
    }

    //passes data to the xml for each item
    inner class ReplyViewHolder(private val itemBinding: ItemReplyBinding)
        : RecyclerView.ViewHolder(itemBinding.root){

        var reply = Reply()

        fun bindReply(reply: Reply) {
            this.reply = reply
            itemBinding.tvName.text = reply.name
            itemBinding.tvUsername.text = reply.username
            itemBinding.tvText.text = reply.text
            itemBinding.tvDateTime.text = reply.dateTime
        }

    }
}