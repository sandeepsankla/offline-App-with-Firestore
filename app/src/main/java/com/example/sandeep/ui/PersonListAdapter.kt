package com.example.sandeep.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sandeep.Person
import com.example.sandeep.R
import kotlinx.android.synthetic.main.item_user_layout.view.*

/**
 * Created by Sandeep Sankla
 */
class PersonListAdapter(val mList:ArrayList<Person>): RecyclerView.Adapter<RecyclerView.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
     val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent, false)
      return PersonListViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PersonListViewHolder) {
            val viewHolder = holder as PersonListViewHolder
            viewHolder.bind(mList[position])
        }
    }

    override fun getItemCount(): Int =  mList.size

    inner class PersonListViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {
        fun bind(person: Person) {
             view.tvUserName.text = person.name
             view.tvCity.text = person.city
        }

    }
}