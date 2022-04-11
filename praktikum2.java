import java.io.*;
import java.util.*;

class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi; }
    public int luasPersegi() {
        int luas = sisi*sisi;
        System.out.println(luas);
        return luas;
    }
}

class Segitiga {
    int alas, tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi; }
    public int luasSegitiga(){
        int luas = (alas*tinggi)/2;
        System.out.println(luas);
        return luas;
    }
}

class Lingkaran {
    int r;

    public Lingkaran(int r){
        this.r = r;
    }
    public int luasLingkaran1(){
        int luas = (int) (22/7*r*r);
        System.out.println((double) luas);
        return luas;
    }
    public int luasLingkaran2(){
        int luas = (int) (3.14*r*r);
        System.out.println((double) luas);
        return luas;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte pil = sc.nextByte();

        if (pil == 1) {
            Persegi persegi = new Persegi(sc.nextInt());
            persegi.luasPersegi();
        } else if (pil == 2) {
            Segitiga segitiga = new Segitiga(sc.nextInt(),sc.nextInt());
            segitiga.luasSegitiga();
        } else if (pil == 3) {
            int input = sc.nextInt();
            Lingkaran lingkaran = new Lingkaran(input);
            if (input % 7 == 0) {
                lingkaran.luasLingkaran1();
            } else {
                lingkaran.luasLingkaran2();
            }
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}


   