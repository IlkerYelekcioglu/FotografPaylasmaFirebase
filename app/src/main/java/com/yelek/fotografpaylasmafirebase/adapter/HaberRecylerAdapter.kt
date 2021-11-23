package com.yelek.fotografpaylasmafirebase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yelek.fotografpaylasmafirebase.R
import com.yelek.fotografpaylasmafirebase.model.Post
import kotlinx.android.synthetic.main.recyler_row.view.*

class HaberRecylerAdapter(val postList : ArrayList<Post>) : RecyclerView.Adapter<HaberRecylerAdapter.PostHolder>(){
    class PostHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
     val inflater = LayoutInflater.from(parent.context)
     val view = inflater.inflate(R.layout.recyler_row,parent,false)
     return PostHolder(view)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
         holder.itemView.recyler_row_kullanici_email.text = postList[position].kullaniciEmail
         holder.itemView.recyler_row_yorum_text.text = postList[position].kullaniciYorum
         Picasso.get().load(postList[position].gorselUrl).into(holder.itemView.recyler_row_imageview)
    }

    override fun getItemCount(): Int {
      return postList.size
    }
}