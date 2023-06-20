package com.example.assessments
//
//
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import com.example.assessments.MainActivity2
//import com.example.assessments.bIllsData
//import com.example.assessments.databinding.ActivityBillsDataBinding
//import com.example.contacts.databinding.ContactListItemBinding
//import com.squareup.picasso.Picasso
//import jp.wasabeef.picasso.transformations.CropCircleTransformation
//
//class adapter(var ContactList:List<bIllsData>) : RecyclerView.Adapter<ContactViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
//        val binding = ActivityBillsDataBinding.inflate(LayoutInflater.from(parent.context),parent ,false)
//        return ContactViewHolder(binding)
//    }
//    override fun getItemCount(): Int {
//        return ContactList.size
//    }
//    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
//        var currentContact =ContactList.get(position)
//        var  binding=holder.binding
////        binding.ivAvatar.tag=currentContact.image
//        binding.tvName.text=currentContact.names
//        binding.tvphoneNumber.text=currentContact.phoneNumber
//        binding.tvEmail.text =currentContact.email
//        binding.tvPassword.text = currentContact.password
//
//        binding.tvbtn.setOnClickListener {
//            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
//            holder.itemView.context.startActivity(intent)
//        }
//        Picasso
//            .get()
////            .load(currentContact.image)
//            .resize(80,80)
//            .centerCrop()
//            .transform(CropCircleTransformation())
////            .into(binding.ivAvatar)
//    }
//}
//class ContactViewHolder( var binding:ActivityBillsDataBinding):ViewHolder(binding.root)


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

    inner class ViewHolder(private val binding: ItemBillBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(bill: Bill) {
            // Bind the bill data to the views
            binding.tvBillName.text = bill.name
            binding.tvBillAmount.text = bill.amount.toString()
            // ... bind other views as needed
        }
    }
}


