package com.myweb.ass6menufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null) {
            supportFragmentManager.beginTransaction().add(
                R.id.frameLayout,
                MyFragment()
            ).commit()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Get the support fragment manager instance
        val manager = supportFragmentManager
        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()
        when (item?.itemId) {
            R.id.menu1 -> {
                transaction.replace(R.id.frameLayout,Friend1Fragment())
                transaction.addToBackStack(null)
                transaction.commit()
                return true}
            R.id.menu2 -> {transaction.replace(R.id.frameLayout,Friend2Fragment())
                transaction.addToBackStack(null)
                transaction.commit()
                return true}

            else ->  return super.onOptionsItemSelected(item)
        }
    }

}