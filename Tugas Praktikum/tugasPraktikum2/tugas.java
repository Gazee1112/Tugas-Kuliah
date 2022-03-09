package tugasPraktikum2;
import java.util.*;

class Hero{
    private String nama;
    private double HP;
    private double Atk;
    private double Def;

    public Hero(){   
    }
    public Hero(String nama, double HP, double Atk, double Def){
        this.nama = nama;
        this.HP = HP;
        this.Atk = Atk;
        this.Def = Def;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public Sring getNama(){
        return this.nama;
    }
    public void setHP(double HP){
        this.HP = HP;
    }
    public double getHP(){
        return this.HP;
    }
    public void setAtk(double Atk){
        this.Atk = Atk;
    }
    public double getAtk(){
        return this.Atk;
    }
    public void setDef(double Def){
        this.Def = Def;
    }
    public double getDef(){
        return this.Def;
    }
}

public class tugas {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        System.out.print("Memasukan Nama Hero : ");        
        hero1.setNama(input.nextLine());
        System.out.print("Masukan HP Hero : ");
        hero1.setHP(input.nextDouble()); input.nextLine();
        System.out.print("Masukan Attack Hero : ");
        hero1.setAtk(input.nextDouble()); input.nextLine();
        System.out.print("Masukan Defence Hero : ");
        hero1.setDef(input.nextDouble()); input.nextLine();


    }
}
