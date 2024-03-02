package com.example.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor(var adres: Adres) {//Tüketici-consumer

    fun gonder() {
        Log.e("Sonuç", "Kargo ${adres.bilgi} adresine gönderildi")
    }
}