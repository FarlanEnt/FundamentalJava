package com.dicoding.javafundamental.accessmodifer.package4;

// final class => menjadikan class tidak bisa digunakan sebagai parent suatu class lain
final class Lingkaran {

    // contoh penggunaan static dan final sebagai konstanta
    static final double PI = 3.14;

    int jari = 7;

    // final methods => menjadikan method tidak bisa di override oleh class turunannya
    final double getLuas() {
        return PI * (jari * jari);
    }
}
