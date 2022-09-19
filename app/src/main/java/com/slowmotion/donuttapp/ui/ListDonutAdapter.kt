package com.slowmotion.donuttapp.ui

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.slowmotion.donuttapp.Data.DonutData
import com.slowmotion.donuttapp.R
import com.squareup.picasso.Picasso

class ListDonutAdapter(private val listDonut: ArrayList<DonutData>)
    : RecyclerView.Adapter<ListDonutAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallBack

    fun setOnItemClickCallBack(onItemClickCallback: OnItemClickCallBack){
           this.onItemClickCallback = onItemClickCallback}

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvFlavor: TextView = itemView.findViewById(R.id.tv_flavor)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_donut, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val donut = listDonut[position]
            donut.photo?.let {
                Picasso.with(holder.itemView.context)
                    .load(it)
                    .resize(50, 50)
                    .into(holder.imgPhoto)
            }

        holder.tvName.text = donut.name
        holder.tvFlavor.text = donut.flavor
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClickedData(listDonut[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listDonut.size
    }

    interface OnItemClickCallBack {
        fun onItemClickedData(data: DonutData)
    }
}


