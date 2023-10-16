package com.selcukileri.kotlininstagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.selcukileri.kotlininstagram.databinding.RecyclerRowBinding
import com.selcukileri.kotlininstagram.view.Post
import com.squareup.picasso.Picasso

class FeedAdapter(private val postList: ArrayList<Post>): RecyclerView.Adapter<FeedAdapter.PostHolder>() {
    class PostHolder(val binding : RecyclerRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recyclerEmailText.text = postList[position].email
        holder.binding.recyclerCommentText.text = postList[position].comment
        Picasso.get().load(postList[position].downloadUrl).into(holder.binding.recyclerImageView)

    }
}