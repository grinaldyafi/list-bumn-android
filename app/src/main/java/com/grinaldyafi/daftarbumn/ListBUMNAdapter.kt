package com.grinaldyafi.daftarbumn


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBUMNAdapter(val listBUMN: ArrayList<BUMN>) : RecyclerView.Adapter<ListBUMNAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_bumn, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBUMN.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, est, photo, tentang) = listBUMN[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvEst.text = est

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailBUMN::class.java)
            moveDetail.putExtra(DetailBUMN.EXTRA_EST, est)
            moveDetail.putExtra(DetailBUMN.EXTRA_NAME, name)
            moveDetail.putExtra(DetailBUMN.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailBUMN.EXTRA_OVERVIEW, tentang)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvEst: TextView = itemView.findViewById(R.id.tv_item_est)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }


}