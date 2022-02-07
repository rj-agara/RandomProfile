package com.example.randomprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val firstPart = listOf("Coola", "Snygga", "Braiga", "Smidiga", "Episka")
    val secondPart = listOf("Brevbäraren", "Samlaren", "Lyxliraren", "Gurun", "Tomten")
    lateinit var randomName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            findViewById<Button>(R.id.randomLOIDBtn).setOnClickListener{
                randomName = firstPart.random() + secondPart.random() + (1000..9999).random()
                Log.i("myDebug", randomName.toString())
                findViewById<TextView>(R.id.randomNameLOIDTV).text = randomName


            }

    }

}

/*
Programflöde, så som jag tänker just nu

if (SharedPreferences == null) Alltså, inget nman är sparat sedan tidigare i telefonen {
- kör randomName-snurran
- kolla om namnet redan finns i Firebase
- om dublett finns - kör randomName igen
- om namnet är unikt, spara det i SharedPreferences
}else{
- hämta befintligt användarnamn från SharedPreference
}

Vi kan dock hamna i ett knasigt läge om användaren byter användarnamn, till något som redan finns.
Visst, vi kan ju göra motsvarande koll av dublett även där.
Alternativt, så använder vi auto-ID eller liknande som "identifierare".

Låt oss diskutera.
/Richard

 */