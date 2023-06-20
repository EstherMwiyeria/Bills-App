package com.example.assessments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assessments.databinding.ActivityBillsDataBinding
import com.example.bill.databinding.ItemBillBinding

class BillsAdapter(private val bills: List<Bill>) : RecyclerView.Adapter<BillsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ActivityBillsDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

            binding.tilName.text = bill.name
            binding.tvBillAmount.text = bill.amount.toString()

        }
    }
}


