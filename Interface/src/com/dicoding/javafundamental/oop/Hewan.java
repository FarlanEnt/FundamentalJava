package com.dicoding.javafundamental.oop;

public interface Hewan {
    String RESPIRASI = "oksigen"; // property akan otomatis bersifat public, static, dan final

    void makan(); // method akan otomatis bersifat public

    /*
    Note :
    Dalam interface
    1. setiap property harus bersifat public, static, dan final
    2. setiap method harus bersifat public serta tidak memiliki isi atau body
     */
}
