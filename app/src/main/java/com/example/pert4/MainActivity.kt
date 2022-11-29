package com.example.pert4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombolAksi: Button = findViewById(R.id.buttonGanti)
        tombolAksi.setOnClickListener {
            ubahAngka()
        }

    }
    private fun ubahTeks(){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val txtHello: TextView = findViewById(R.id.txtdadu1)
        val txtDadu2: TextView = findViewById(R.id.txtdadu2)
        val txtDadu3: TextView = findViewById(R.id.txtdadu3)

        val  randomInt=(1..6).random()
        val tes= (1 until 6).random()
        val tes2= (1 until 6).random()
        val tes3= (1 until 6).random()

        txtHello.text = tes.toString()
        txtDadu2.text = tes2.toString()
        txtDadu3.text = tes3.toString()
    }
    //fungsi ketika tombol di klik akan di panggil fungsi ini
    private fun ubahAngka(){

        //mengubah isi textbox
        val txtHello: TextView = findViewById(R.id.txtdadu1)
        val image1: ImageView = findViewById(R.id.imageView1)
        //isiGambar(txtHello,image1)
        Gambar().isiGambar(this, txtHello,image1)

        val txtDadu2: TextView = findViewById(R.id.txtdadu2)
        val image2: ImageView = findViewById(R.id.imageView2)
        //isiGambar(txtDadu2,image2)
        Gambar().isiGambar(this, txtDadu2,image2)

        val txtDadu3: TextView = findViewById(R.id.txtdadu3)
        val image3: ImageView = findViewById(R.id.imageView3)
        //isiGambar(txtDadu3,image3)
        Gambar().isiGambar(this, txtDadu3,image3)
    }
    /*private fun isiGambar( txtHello: TextView, image1: ImageView){
        val tes = (1 until 6).random()
        txtHello.text = tes.toString()

        when (tes) {
            1 -> image1.setImageDrawable(getDrawable(R.drawable.gambar1))
            2 -> image1.setImageDrawable(getDrawable(R.drawable.gambar2))
            3 -> image1.setImageDrawable(getDrawable(R.drawable.gambar3))
            4 -> image1.setImageDrawable(getDrawable(R.drawable.gambar4))
            5 -> image1.setImageDrawable(getDrawable(R.drawable.gambar5))
            else -> { // Note the block
                image1.setImageDrawable(getDrawable(R.drawable.gambar6))
            }
        }
    }*/
}