package com.herpestes.firebaseinstagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.herpestes.firebaseinstagram.databinding.RecyclerrowBinding
import com.herpestes.firebaseinstagram.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(private val PostList : ArrayList<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {

    class PostHolder(val binding : RecyclerrowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding = RecyclerrowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun getItemCount(): Int {
        return PostList.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recyclerEmailText.text = PostList.get(position).email
        holder.binding.recyclerCommentText.text = PostList.get(position).comment
        Picasso.get().load(PostList.get(position).downloadUrl).into(holder.binding.recyclerImageview)

    }

}