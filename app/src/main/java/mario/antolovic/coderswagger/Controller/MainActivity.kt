package mario.antolovic.coderswagger.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import mario.antolovic.coderswagger.Model.Category
import mario.antolovic.coderswagger.R
import mario.antolovic.coderswagger.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataService.categories)

        categoryListView.adapter = adapter
    }
}
