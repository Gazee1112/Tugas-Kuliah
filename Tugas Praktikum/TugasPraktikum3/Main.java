import java.util.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


class perhitungan {
    public static int penjumlahan (int a, int b){
        return a + b;
    }
    public static int pengurangan (int a, int b){
        return a - b;
    }
    public double perkalian (double a, double b){
        return a * b;
    }
    public double pembagian (double a, double b){
        return a / b;
    }
    public int sederhana (double a){
        return (int)Math.round(a);
    }
}

class Nama{

}



class Main{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        var hitung = new perhitungan();
        var dicky = new Nama();
    }
}