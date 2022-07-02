package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.PostActivity
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ItemPostBinding
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model.Post

class PostAdapter: RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private var postArrayList = ArrayList<Post>()
    private lateinit var context: Context

    public constructor(context: Context, postArrayList:ArrayList<Post>) {
        this.context = context
        this.postArrayList = postArrayList
    }

    override fun getItemCount(): Int {
        return postArrayList.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PostAdapter.PostViewHolder {
        //loads per row layout during runtime
        val itemBinding = ItemPostBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,false)
        return PostViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PostAdapter.PostViewHolder, position: Int) {
        holder.bindPost(postArrayList[position])
    }

    //passes data to the xml for each item
    inner class PostViewHolder(private val itemBinding: ItemPostBinding)
        : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener{

        var post = Post()
        init{
            itemView.setOnClickListener(this)
        }

        fun bindPost(post: Post) {
            this.post = post
            itemBinding.tvName.text = post.name
            itemBinding.tvUsername.text = post.username
            itemBinding.tvText.text = post.text
            itemBinding.tvDateTime.text = post.dateTime
        }

        override fun onClick(v: View?) {
            //go to PostActivity
            var goToPost = Intent(context, PostActivity::class.java)
            var bundle = Bundle()
            bundle.putString("dateTime", post.dateTime)
            bundle.putString("username", post.username)
            bundle.putString("name", post.name)
            bundle.putString("text", post.text)
            goToPost.putExtras(bundle)

            //had an error because an calling/starting an activity (INTENT) outside of the activity
            goToPost.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            context.startActivity(goToPost)
        }
    }
}