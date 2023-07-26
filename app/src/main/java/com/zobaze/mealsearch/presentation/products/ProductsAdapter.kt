package com.zobaze.mealsearch.presentation.products

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.zobaze.mealsearch.R
import com.zobaze.mealsearch.databinding.ItemProductBinding
import com.zobaze.mealsearch.domain.model.Product

class ProductsAdapter : RecyclerView.Adapter<ProductsAdapter.QuoteViewHolder>() {

    var products: List<Product>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = QuoteViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_product,
            parent,
            false
        )
    )

    override fun getItemCount() = products?.size ?: 0

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        holder.binding.quote = products!![position]
    }

    inner class QuoteViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root)
}