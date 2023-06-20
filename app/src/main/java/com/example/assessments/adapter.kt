package com.example.assessments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bill.databinding.ItemBillBinding

class BillsAdapter(private val bills: List<Bill>) : RecyclerView.Adapter<BillsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBillBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bill = bills[position]
        holder.bind(bill)
    }

    override fun getItemCount(): Int {
        return bills.size
    }

    inner class ViewHolder(private val binding: Bill) : RecyclerView.ViewHolder(binding.root) {

        fun bind(bill: Bill) {
            // Bind the bill data to the views
            binding.tvBillName.text = bill.name
            binding.tvBillAmount.text = bill.amount.toString()
            // ... bind other views as needed
        }
    }
}


