package com.example.mycvhw

import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.mycvhw.ui.main.SectionsPagerAdapter
import com.example.mycvhw.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_home_freg.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
//        val adapter = ViewPagerAdapter(supportFragmentManager)


        
    }

    fun addNewSkill(view: View) {
//        Toast.makeText(requireContext(), "add new", Toast.LENGTH_SHORT).show()
//        val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.add_new_skill_layout, null)
//            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("Add Your New Skill")
//            val mAlertDialog = mBuilder.show()

    }
}