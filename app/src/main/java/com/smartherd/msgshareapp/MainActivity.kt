package com.smartherd.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/* Notes
An activity represents a single screen with a user interface (layout).
In this example, MainActivity.kt is an activity with UI (layout) of activity_main.xml.
activity = kotlin file
layout = xml file
views = TextView, checkBox, Button, ListView, ImageView, etc ...
 */



class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}
