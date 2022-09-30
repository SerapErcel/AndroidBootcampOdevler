package com.serapercel.androidbootcampodevler.odev2

fun main() {
    val f = Fonksiyonlar()
    // 1
    val sonuc1 = f.fahrenhiet(45.0)
    println("Fahrehiet : $sonuc1")

    // 2
    f.cevreDiktortgen(20, 25)

    // 3
    val sonuc3 = f.faktoriyel(5)
    println("Faktoriyel Degeri : $sonuc3")

    // 4
    f.harfSayisi("Kelime", 'e')

    // 5
    val sonuc5 = f.icAcilari(3)
    println("Ic Acilari : $sonuc5")

    // 6
    val sonuc6 = f.maas(30)
    println("Maas Miktari : $sonuc6")

    // 7
    val sonuc7 = f.ucret(60)
    println("Kotaya Gore Ucret Miktari : $sonuc7")

}