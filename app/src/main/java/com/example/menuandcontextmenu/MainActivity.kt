package com.example.menuandcontextmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar
import android.view.*
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val nameList : ListView = findViewById(R.id.name_list)
        registerForContextMenu(nameList)

        val toolBar: Toolbar = findViewById(R.id.appBarCustome)
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.context_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when(item!!.itemId){
            R.id.call->{
                Toast.makeText(this,"Hello Call Called",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.callMeNextTime->{
                Toast.makeText(this,"Hello Call Me Next Time Called",Toast.LENGTH_LONG).show()
                return true
            }
            else->super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        return when(item!!.itemId){
            R.id.call->{
                Toast.makeText(this,"Hello Call Called",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.callMeNextTime->{
                Toast.makeText(this,"Hello Call Me Next Time Called",Toast.LENGTH_LONG).show()
                return true
            }
            else->super.onContextItemSelected(item)
        }
    }
}
