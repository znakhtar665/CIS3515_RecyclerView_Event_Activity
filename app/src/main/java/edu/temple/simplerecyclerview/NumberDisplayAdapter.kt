package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// TODO(Step 1: Implement click behavior)

// TODO (Step 1a: Accept lambda in constructor)
class NumberDisplayAdapter (private val numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {

    // TODO (Step 1b: Invoke lambda via onClickListener)
    inner class NumberViewHolder (layout: View) : RecyclerView.ViewHolder (layout) {
        // enumerate views inside layout
        val textView = layout.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            // Inflate prebuilt layout file
            LayoutInflater.from(parent.context).inflate(R.layout.textview_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
    }

}