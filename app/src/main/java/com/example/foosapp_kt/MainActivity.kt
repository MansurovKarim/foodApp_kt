package com.example.foosapp_kt

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val Unit.rV: Any
    get() = Unit


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


         var binding: ActivityMain2Binding? = null
         var adapter: ProductAdapter? = null
         val foods: MutableList<ProductItem> = ArrayList<ProductItem>()

        fun setContentView(unit: Unit) {
            TODO("Not yet implemented")
        }

        @SuppressLint("NotifyDataSetChanged")
         fun onCreate(savedInstanceState: Bundle?) {
            onCreate(savedInstanceState)
            this.enableEdgeToEdge()
            ActivityMain2Binding.inflate(layoutInflater).also { binding}



            val textWatcher: TextWatcher = object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                    findViewById<View>(R.id.search)
                }


                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                }

                override fun afterTextChanged(s: Editable) {
                }
            }

            adapter = ProductAdapter(foods) { }

            if (binding != null) {
                binding.rV.setAdapter(adapter!!)
            }


            foods.add(
                ProductItem(
                    "Pizza",
                    "https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png",
                    15
                )
            )
            foods.add(
                ProductItem(
                    "Burger",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRewgJ0houAG7jlGeFIVOnOYCblC0UKbPgO8Q&s",
                    10
                )
            )
            foods.add(
                ProductItem(
                    "salad",
                    "https://static.vecteezy.com/system/resources/thumbnails/018/128/193/small_2x/delicious-spinach-salad-with-fresh-png.png",
                    10
                )
            )
            foods.add(
                ProductItem(
                    "doner",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNXroNensUVtGhDCtR5tTmqHTawUfASZAUYw&s",
                    10
                )
            )
            foods.add(
                ProductItem(
                    "kola",
                    "https://png.pngtree.com/png-clipart/20231116/original/pngtree-coca-cola-bottled-drink-isolated-photo-png-image_13575918.png",
                    10
                )
            )
            foods.add(
                ProductItem(
                    "fanta",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdhehzBVduhXPwzlTBYc-_9OiMu_tJEgCGJg&s",
                    10
                )
            )
            foods.add(
                ProductItem(
                    "tako",
                    "https://the-challenger.ru/wp-content/uploads/2018/02/shutterstock_312906398-800x533.jpg",
                    10
                )
            )
            adapter!!.notifyDataSetChanged()
        }
    }
    }

private fun Any.setAdapter(adapter: ProductAdapter) {

}

private fun Unit.getRoot() {
    TODO("Not yet implemented")
}
