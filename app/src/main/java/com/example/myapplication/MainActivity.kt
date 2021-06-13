package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    //private var counter = 0
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editTextNumber1)
        editText1.setText("0")

        //viewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application))

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
                .get(MainActivityViewModel::class.java)


        // Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show()
    }

    fun onClick(view: View) {
        //counter++
        viewModel.incCounter()
        editText1.setText(viewModel.getCounter().value.toString())
    }
}