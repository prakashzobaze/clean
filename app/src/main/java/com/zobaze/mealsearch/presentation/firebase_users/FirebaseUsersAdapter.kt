package com.zobaze.mealsearch.presentation.firebase_users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.zobaze.mealsearch.R
import com.zobaze.mealsearch.databinding.ItemUserBinding
import com.zobaze.mealsearch.domain.model.User

class FirebaseUsersAdapter : RecyclerView.Adapter<FirebaseUsersAdapter.FirebaseUserViewHolder>() {

    var quotes: List<User>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = FirebaseUserViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_user,
            parent,
            false
        )
    )

    override fun getItemCount() = quotes?.size ?: 0

    override fun onBindViewHolder(holder: FirebaseUserViewHolder, position: Int) {
        holder.binding.quote = quotes!![position]
    }

    inner class FirebaseUserViewHolder(val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root)
}