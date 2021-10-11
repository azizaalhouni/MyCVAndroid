package com.example.mycvhw

import android.annotation.SuppressLint
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
import android.webkit.JavascriptInterface
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.view.menu.MenuBuilder
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.mycvhw.ui.main.SectionsPagerAdapter
import com.example.mycvhw.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home_freg.*
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("JavascriptInterface")
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


        topAppBar.setNavigationOnClickListener {
            // Handle navigation icon press
        }

        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.telegram ->{
                    // Handle favorite icon press
                    openUrl("https://t.me/muntinova")
                  true}
                R.id.linkedin -> {
                    // Handle search icon press
                    openUrl("https://www.linkedin.com/in/muntinova")
                    true
                }
                R.id.whatsapp -> {
                    // Handle search icon press
                    openUrl("http://wa.me//16418191366")
                    true
                }
                R.id.gmail -> {
                    // Handle more item (inside overflow menu) press

                    true
                }
                else -> false
            }
        }

    }


    private fun openUrl(url: String?) {
        if (url != null) {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(browserIntent)
        }
    }
    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        // Code to get the title and icon on the option overflow
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item:MenuItem):Boolean {
        Toast.makeText(
            applicationContext,
            item.title.toString(),
            Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }

    fun addNewSkill(view: View) {
//        Toast.makeText(requireContext(), "add new", Toast.LENGTH_SHORT).show()
//        val mDialogView = LayoutInflater.from(requireContext()).inflate(R.layout.add_new_skill_layout, null)
//            val mBuilder = AlertDialog.Builder(requireContext()).setView(mDialogView).setTitle("Add Your New Skill")
//            val mAlertDialog = mBuilder.show()

    }



}