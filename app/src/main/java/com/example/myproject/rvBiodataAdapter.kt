package com.example.myproject

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject.databinding.LayoutBiodataBinding

class rvBiodataAdapter(private var dataBiodata: List<Biodata>) :
    RecyclerView.Adapter<rvBiodataAdapter.BiodataViewHolder>() {

    class BiodataViewHolder(val binding: LayoutBiodataBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BiodataViewHolder {
        val binding = LayoutBiodataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BiodataViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataBiodata.size
    }


    override fun onBindViewHolder(holder: BiodataViewHolder, position: Int) {
        val data = dataBiodata[position]
        holder.binding.ivBiodata.setImageResource(data.gambar)
        holder.binding.tvnama.text = data.nama
        holder.binding.tvnim.text = data.nim.toString()
        holder.binding.tvttl.text = data.ttl
        holder.binding.tvalamat.text = data.alamat


        holder.binding.cardView.setOnClickListener {
            Toast.makeText(holder.itemView.context, data.nama, Toast.LENGTH_SHORT).show()
        }

        // Set initial visibility state and button text
       // updateVisibility(holder.binding, View.GONE)
       // holder.binding.button.text = "Show"

        // Set button click listener
        holder.binding.button.setOnClickListener {
            if (holder.binding.tvnim.visibility == View.GONE) {
                updateVisibility(holder.binding, View.VISIBLE)
                holder.binding.button.text = "Hide"
            } else {
                updateVisibility(holder.binding, View.GONE)
                holder.binding.button.text = "Show"
            }
        }

        holder.binding.wa.setOnClickListener {
            val waIntent = Intent(Intent.ACTION_VIEW, Uri.parse( data.wa))
            holder.itemView.context.startActivity(waIntent)
        }
        holder.binding.ig.setOnClickListener {
            val igIntent = Intent(Intent.ACTION_VIEW, Uri.parse(data.ig))
            holder.itemView.context.startActivity(igIntent)
        }
    }

    private fun updateVisibility(binding: LayoutBiodataBinding, visibility: Int) {
        binding.tvttl.visibility = visibility
        binding.tvalamat.visibility = visibility
        binding.tvnim.visibility = visibility
        binding.btnLink.visibility = visibility
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setFilteredList(filterdata: List<Biodata>) {
        this.dataBiodata = filterdata
        notifyDataSetChanged()
    }


}
