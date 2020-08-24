package com.example.banktag

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.banktag.ui.main.FragmentAdapter
import kotlinx.android.synthetic.main.app_bar.*
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.nav_header_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.app_bar)

        drawer_layout.addDrawerListener(object: DrawerLayout.DrawerListener {
            override fun onDrawerStateChanged(newState: Int) {
                Log.d("Activity","onDrawerStateChanged")

            }

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                Log.d("Activity","onDrawerSlide")
            }

            override fun onDrawerClosed(drawerView: View) {
                Log.d("Activity","onDrawerClosed")
            }

            override fun onDrawerOpened(drawerView: View) {
                Log.d("Activity","onDrawerOpened")
                invalidateNavigationDrawer()
            }

        })


        val navController = findNavController(R.id.main_nav_host)
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
        actionBar?.displayOptions

        adapter = FragmentAdapter(this)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            invalidateOptionsMenu()
            amar_sagoo_two_text_view.text = destination.label
            // ツールバーとその下のレイアウトの間の影を消す
            supportActionBar?.elevation = 0F
            // TODO: 隠すところで呼ぶ
//            supportActionBar?.hide()
        }
    }

    override fun onSupportNavigateUp()
            = findNavController(R.id.main_nav_host).navigateUp()

    fun invalidateNavigationDrawer() {
        Log.d("Activity","invalidateNavigationDrawer")

            fullname.text = "Christine  Bates"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        when (findNavController(R.id.main_nav_host).currentDestination?.id) {
            R.id.mainFragment -> menuInflater.inflate(R.menu.edit, menu)
            R.id.transferTabFragment, R.id.transferTabHelpPopupFragment -> {
                menuInflater.inflate(R.menu.help, menu)
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
            }
            R.id.historyTabFragment -> {
                menuInflater.inflate(R.menu.refresh, menu)
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
            }
            R.id.historyDetailsFragment -> {
                menuInflater.inflate(R.menu.delete, menu)
            }
            R.id.settingEditFragment, R.id.settingAddBankAccountFragment, R.id.settingsEditBankAccountFragment -> {
                menuInflater.inflate(R.menu.check, menu)
                supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close_filter_state)
            }
            R.id.chooseContactSelectFragment, R.id.changeContactReasonFragment -> {
                menuInflater.inflate(R.menu.forward, menu)
                supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close_filter_state)
            }
            else -> {
                supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close_filter_state)
            }
        }
        return true
    }

}