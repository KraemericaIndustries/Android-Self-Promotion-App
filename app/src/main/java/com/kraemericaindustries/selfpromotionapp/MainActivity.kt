package com.kraemericaindustries.selfpromotionapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_preview.setOnClickListener {
            //  Toast.makeText(this, "My button click works in Kotlin!", Toast.LENGTH_LONG).show()
            onPreviewClicked()
        }
        val spinnerValues = arrayOf("Android Developer", "Android Engineer")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        spinner_job_title.adapter = spinnerAdapter
    }

    private fun onPreviewClicked() {

        val message = Message(
            edit_text_contact_name.text.toString(),
            edit_text_contact_number.text.toString(),
            edit_text_my_display_name.text.toString(),
            check_box_aspiring.isChecked,
            spinner_job_title.selectedItem?.toString(),
            check_box_immediate_start.isChecked,
            edit_text_start_date.text.toString()
        )

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Message", message)
        startActivity(previewActivityIntent)
    }
}