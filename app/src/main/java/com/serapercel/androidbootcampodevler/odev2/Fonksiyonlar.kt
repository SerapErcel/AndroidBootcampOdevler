package com.serapercel.androidbootcampodevler.odev2

class Fonksiyonlar {

    //  1. Fahrenhiet Donusumu Yapan Fonksiyon
    fun fahrenhiet(derece: Double): Double {
        return derece * 1.8 + 32
    }

    //  2. Dikdortgen Cevresini Hesaplayan Fonksiyon
    fun cevreDiktortgen(kisaKenar: Int, uzunKenar: Int) {
        println("Dikdortgen Cevresi : ${2 * (kisaKenar + uzunKenar)}")
    }

    //  3. Faktoriyel Hesaplayan Fonksiyon
    fun faktoriyel(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    //  4. Kelime Icinde Gecen Harfin Miktarini Hesaplayan Fonksiyon
    fun harfSayisi(kelime: String, harf: Char) {
        var sayi = 0
        for (element in kelime) {
            if (element == harf) {
                sayi++
            }
        }
        println("Kelime Icindeki Harf Sayisi : $sayi")
    }

    //  5. Kenar Sayisina Gore Iç Acilari Toplami Bulan Fonksiyon
    fun icAcilari(kenarSayisi: Int): Int {
        return 180 * (kenarSayisi - 2)
    }

    //  6. Gun Sayisina Gore Maas Hesabi
    fun maas(gunSayisi: Int): Int {
        val normalUcret = 10
        val mesaiUcreti = 20
        val sure = 8 * gunSayisi
        return if (sure > 160) {
            ((sure - 160) * mesaiUcreti) + (160 * normalUcret)
        } else {
            sure * normalUcret
        }
    }

    //  7. Kotaya Gore Ucret Hesaplayan Fonksiyon
    fun ucret(kota: Int): Int {
        return if (kota > 50) {
            100 + (kota - 50) * 4
        } else {
            100
        }
    }
}