package com.example.assignment6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycvhw.model.Experience
import com.example.mycvhw.R


class Experience_Adapter: RecyclerView.Adapter<Experience_Adapter.MyViewHolder>() {

    private val jobs = listOf(
        Experience(
            "Software Developer",
            "GOOGLE",
            "Apr 2020 - Present",
            "LA, USA",
            "Developing flutter apps",
            R.drawable.google
        ),
        Experience(
            "Database developer",
            "ORACLE",
            "Jul 2018 - Apr 2020",
            "SF, USA",
            "Building database tables",
            R.drawable.oracle
        ),
        Experience(
            "Database admin",
            "Microsoft",
            "Oct 2017 - Jul 2018",
            "SF, USA",
            "Managing SQLserver database",
            R.drawable.microsoft
        ),
        Experience(
            "Database admin",
            "IBM",
            "Apr 2015 - Apr 2017 ",
            "NY, USA",
            "Managing AS400 database",
            R.drawable.ibm
        )


    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.work_row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return jobs.size
    }

    override fun onBindViewHolder(holder: Experience_Adapter.MyViewHolder, position: Int) {
        holder.populate(jobs[position])
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView = view.findViewById<ImageView>(R.id.imageView)
        private val jobTitleTextView = view.findViewById<TextView>(R.id.jobTitleTextView)
        private val companyNameTextView = view.findViewById<TextView>(R.id.companyNameTextView)
        private val workDurationTextView = view.findViewById<TextView>(R.id.workDurationTextView)
        private val companyLocationTextView =
            view.findViewById<TextView>(R.id.companyLocationTextView)
        private val mainResponsibilityTextView =
            view.findViewById<TextView>(R.id.mainResponsibilityTextView)

        fun populate(job: Experience) {
            with(job) {
                imageView.setImageResource(logo)
                jobTitleTextView.text = title
                companyNameTextView.text = companyName
                workDurationTextView.text = duration
                companyLocationTextView.text = location
                mainResponsibilityTextView.text = mainResponsibility
            }
        }
    }
}




