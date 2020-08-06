package com.dicoding.javafundamental.accessmodifer.package1;

// public => dapat diakses dari manapun (modifier global)
public class KelasA {

    // private => cuma dapat diakses di dalam class KelasA
    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    // default => dapat di akses di dalam kelas manapun asalkan masih di dalam satu package
    char memberB = 'A';
    double memberC = 1.5;

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    // protected => dapat di akses di luar package, namun caranya class yang akan mengakses harus class turunannya
    protected void methodC() {
        System.out.println("Percobaan access modifier!!!");
    }

}
