package com.zobaze.mealsearch.presentation.meal_search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zobaze.mealsearch.databinding.ViewHolderSearchListBinding
import com.zobaze.mealsearch.domain.model.Meal

class MealSearchAdapter : RecyclerView.Adapter<MealSearchAdapter.MyViewHolder>() {



    private var listener :((Meal)->Unit)?=null

    var list = mutableListOf<Meal>()

    fun setContentList(list: MutableList<Meal>) {
        this.list = list
        notifyDataSetChanged()
    }


    class MyViewHolder(val viewHolder: ViewHolderSearchListBinding) :
        RecyclerView.ViewHolder(viewHolder.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MealSearchAdapter.MyViewHolder {
        val binding =
            ViewHolderSearchListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    fun itemClickListener(l:(Meal)->Unit){
        listener= l
    }

    override fun onBindViewHolder(holder: MealSearchAdapter.MyViewHolder, position: Int) {
        holder.viewHolder.meal = this.list[position]

        holder.viewHolder.root.setOnClickListener {
            listener?.let {
                it(this.list[position])
            }
        }

    }

    override fun getItemCount(): Int {
        return this.list.size
    }
}