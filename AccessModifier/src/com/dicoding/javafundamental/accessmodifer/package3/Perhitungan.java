package com.dicoding.javafundamental.accessmodifer.package3;

public class Perhitungan {

    // static variable => variable yang berdiri sendiri tanpa perlu instance dari suatu class
    public static int nilai = 0;

    Perhitungan() {
        nilai++;
    }

    // static methods => method yang berdiri sendiri tanpa perlu instance dari suatu class
    protected static int getNilai() {
        return nilai;
    }
}
