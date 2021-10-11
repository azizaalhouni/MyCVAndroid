package com.example.mycvhw

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Toast
import com.example.mycvhw.ui.main.SectionsPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_new_skill_layout.view.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_home_freg.view.*
import java.util.*
import kotlin.collections.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFreg.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFreg : Fragment(R.layout.fragment_home_freg) {
    lateinit var list:ArrayList<Skill>
    var listItems = ArrayList<String>()
    var phrases =  ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null
    var undoOnClickListener: View.OnClickListener = View.OnClickListener { view ->
        listItems.removeAt(listItems.size - 1)
        adapter?.notifyDataSetChanged()
        Snackbar.make(view, "Item removed", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
    }
//           val fab: FloatingActionButton = binding.fab

    //        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
//    lateinit var list:ArrayList<Skill>


    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        list = ArrayList<Skill>()
//    val res = getResources()
//    phrases = Arrays.asList(res.getString(R.array.experience_skill)
//        list = ArrayList<Skill>()
//        adapter = Adapter(this,
//            android.R.layout.simple_list_item_1,
//            listItems)
//        listView.adapter = adapter
        val array: Array<String> = resources.getStringArray(R.array.skills)
//        listView.get

        val view = inflater.inflate(R.layout.fragment_home_freg, container, false)
//
        view.fab.setOnClickListener {
//            //Toast.makeText(requireContext(), "add new", Toast.LENGTH_SHORT).show()
            val mDialogView =
                LayoutInflater.from(requireContext()).inflate(R.layout.add_new_skill_layout, null)
            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView)
                .setTitle("Add Your New Skill")
            val mAlertDialog = mBuilder.show()
//
            mDialogView.btn_add_new_skill.setOnClickListener {
                mAlertDialog.dismiss()
                val new_skill_name = mDialogView.et_add_new_skill.text.toString()
                val s = Skill(new_skill_name)
//                s.name = new_skill_name
                list.add(s)
//                array.set(2,s.toString())
//            listItems.add(new_skill_name)
                Snackbar.make(view, "Item added to list ${s.toString()}", Snackbar.LENGTH_LONG)
                    .setAction("Undo", undoOnClickListener).show()
                adapter?.notifyDataSetChanged()


          }
                mDialogView.btn_cancel.setOnClickListener {
                    mAlertDialog.dismiss()
                    Toast.makeText(requireContext(), "Dismiss", Toast.LENGTH_SHORT).show()
                }
//            }
        }
                return view
//
//            }
        }

}