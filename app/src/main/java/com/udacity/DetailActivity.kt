package com.udacity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        cancelNotification(this)

        val projectName = intent.getStringExtra(EXTRA_PROJECT_NAME)
        val downloadStatus = intent.getStringExtra(EXTRA_DOWNLOAD_STATUS)

        filename_value_tv.text = projectName
        status_value_tv.text = downloadStatus

        ok_button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}
