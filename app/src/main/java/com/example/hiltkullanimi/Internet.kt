package com.example.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres) {//Tüketici- Consumer

    fun basvur() {
        Log.e("Sonuç", "Internet başvurusu ${adres.bilgi} adresine yapıldı")
    }
}