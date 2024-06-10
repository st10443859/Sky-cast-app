package com.kayise.skycastapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.kayise.skycastapp.R.id.minimumtemp

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


       val datetv = findViewById<TextView>(R.id.datetv)
        val minimumtemp = findViewById<TextView>(R.id.minimumtemp)
        val maximamtemp = findViewById<TextView>(R.id.maximamtemp)
        val temperaturenote = findViewById<TextView>(R.id.temperaturenote)


        //initialize them
        var i:Int = 0  //Stores number of entries in array
        var display:String="" //Display blank first
        val maxEntries = 7 // Only allow 7 array entries


        var averagemax:Int=0
        var averagemin:Int=0
        var AverageTotal:Int=0
        var displayAverage:String= ""

        //Create arrays
        var day= Array (maxEntries) {""}
        var maximumTemp = Array (maxEntries){0}
        var minimumTemp = Array (maxEntries){0}

        val insertbutton:Button= findViewById(R.id.insertbutton)
        val clearbutton:Button= findViewById(R.id.clearbutton)
        val detailsbutton:Button= findViewById(R.id.detailsbutton)

        insertbutton.setOnClickListener {
            // Check if theres enough entries
            if (i<maxEntries){
                // Convert to display types
                datetv[i]= datetv.text.toString()
                maximamtemp[i]=

                    maximamtemp.text.toString().toIntOrNull()?:0 // 0 if for error checking
                minimumTemp[i]=

                    minimumtemp.text.toString().toIntOrNull()?:0 // 0 if for error checking

                temperaturenote.text.toString()
                i++ // increment entry number

                Toast.makeText(this,"Entry added", Toast.LENGTH_SHORT).show()



            }
            else{
                Toast.makeText(this,"Maximum entries added",Toast.LENGTH_SHORT).show()


            }
        }


        // Clear the textviews
        clearbutton.setOnClickListener {
            datetv.text= ""
            maximamtemp.text=""
            minimumtemp.text=""
            temperaturenote.text=""

        }
       // The button to navigate to details
        detailsbutton.setOnClickListener {
            display=""
            for (Counter in 0 until 1 ) {
                display+= "Date: ${day[Counter]}" +
                        "\nmaximumtemp:${maximamtemp[Counter]}" +
                        "\nminimumtemp:${minimumtemp[Counter]}" +
                        "\ntemperaturenotes:${temperaturenote[Counter]}"
                averagemax+=
                    maximamtemp[Counter]
                AverageTotal+=
                minimumtemp[Counter]
                AverageTotal+=
                    minimumtemp[Counter]
                maximamtemp[Counter]


        }
            AverageTotal/=i
            averagemax/=i
            averagemin/=i

            displayAverage="averageMAX:$ {averageMAX}\naverageMIN:${averageMIN}"}
                    \nAverageTotal:${AverageTotal}
                display+=displayAverage
            
        




            
            
            // Pass the data to detailed view 
            val intent = Intent (this,MainActivity3::class.java)
            intent.putExtra("DISPLAY_DATA",display)
            startActivity(intent)
            



    }
}