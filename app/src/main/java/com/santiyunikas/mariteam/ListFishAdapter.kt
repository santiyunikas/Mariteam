package com.santiyunikas.mariteam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListFishAdapter(private val listFish: ArrayList<Fish>): RecyclerView.Adapter<ListFishAdapter.ListViewHolder>() {
    private  var onItemClickCallback: OnItemClickCallBack? = null
    private  var onItemClickCallback2: OnItemClickCallBack? = null
    private  var onItemClickCallback3: OnItemClickCallBack? = null

    interface OnItemClickCallBack {
        fun onItemClicked(data: Fish)
    }

    fun setOnItemClickCallback(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallback = onItemClickCallBack
    }

    class ListViewHolder (view: View): RecyclerView.ViewHolder(view){
        var tvtitle: TextView = view.findViewById(R.id.tv_title)
        var tvPrice: TextView = view.findViewById(R.id.tv_price)
        var tvStore: TextView = view.findViewById(R.id.tv_store)
        var tvSendFrom: TextView = view.findViewById(R.id.tv_sendFrom)
        var imgProduct: ImageView = view.findViewById(R.id.img_product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_fish, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFish.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val fish = listFish[position]
        holder.imgProduct.setImageResource(fish.imgProduct)
        holder.tvtitle.text = fish.title
        holder.tvPrice.text = fish.price
        holder.tvStore.text = fish.sellerName
        holder.tvSendFrom.text = fish.sendFrom

        holder.itemView.setOnClickListener{
                    onItemClickCallback?.onItemClicked(listFish[holder.adapterPosition])
        }
    }
}