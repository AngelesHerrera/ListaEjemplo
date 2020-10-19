package com.example.listaejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     var productos = arrayOf("Opcion1","Opcion2","Opcion3","Opcion4","Opcion5","Opcion6", "Opcion7","Opcion8",
         "Opcion9", "Opcion10","Opcion11","Opcion12")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView= this.list_productos
        val adaptador= ArrayAdapter(this,R.layout.list_item, productos)
        listView.adapter= adaptador
        //evento
        listView.onItemClickListener= object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //cuando de un click sera igual a un list view
                val item =listView.getItemAtPosition(p2)as String
               // Log.e("ListViewApp", "Seleccionaste $item")
                Toast.makeText(this@MainActivity, "seleccionaste $item", Toast.LENGTH_SHORT).show()
            }
        }

    }
}