package com.malkinfo.calendardialog



import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var displayText :TextView
    private lateinit var dateBtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set Button */
         dateBtn = findViewById<Button>(R.id.datePicker)
        /**display Text*/
        displayText = findViewById<TextView>(R.id.tvData)
        /**button click*/
        dateBtn.setOnClickListener { chooseDate() }
    }



    private fun chooseDate() {
        /**set Calendar*/
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        /**set date Dialog */
        val dpd = DatePickerDialog(this,DatePickerDialog.OnDateSetListener {
                view, year, month, dayOfMonth ->

          /***display TextView*/
            displayText.text = "$dayOfMonth / ${month+1} / $year"
        },year,month,day)
        dpd.show()
    }
}