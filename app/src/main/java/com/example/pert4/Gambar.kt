package com.example.pert4

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources

class Gambar() {

    public fun isiGambar(context: Context, txtHello: TextView, image1: ImageView) {
        val tes = (1 until 6).random()
        txtHello.text = tes.toString()

        when (tes) {
            1 -> image1.setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.gambar1
                )
            )
            2 -> image1.setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.gambar2
                )
            )
            3 -> image1.setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.gambar3
                )
            )
            4 -> image1.setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.gambar4
                )
            )
            5 -> image1.setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.gambar5
                )
            )
            else -> { // Note the block
                image1.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.gambar6))
            }
        }
    }
}