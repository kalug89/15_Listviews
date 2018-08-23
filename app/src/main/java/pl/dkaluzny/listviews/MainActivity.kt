package pl.dkaluzny.listviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ListViews = adapter and datasource
        var namesArray: Array<String> = arrayOf("Jenny", "Paul", "Santos", "Lena", "Gina","Santos", "Lee", "Riujy","Hiroki", "Jane", "Gloria", "Denise", "Chuck" +
                "Melissa", "Bonni", "Arao", "Ines")

        var namesAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, namesArray)

        listView.adapter = namesAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            var itemName: String = listView.getItemAtPosition(position).toString()
            Toast.makeText(this, " $itemName",Toast.LENGTH_LONG).show()
        }
    }
}
