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
    public String getNama(){
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
        System.out.print("Memasukan Nama Hero 1 : ");        
        hero1.setNama(input.nextLine());
        System.out.print("Masukan HP Hero 1 : ");
        hero1.setHP(input.nextDouble()); input.nextLine();
        System.out.print("Masukan Attack Hero 1 : ");
        hero1.setAtk(input.nextDouble()); input.nextLine();
        System.out.print("Masukan Defence Hero 1 : ");
        hero1.setDef(input.nextDouble()); input.nextLine();
        
        System.out.println("");

        Hero hero2 = new Hero();
        System.out.print("Memasukan Nama Hero 2 : ");        
        hero2.setNama(input.nextLine());
        System.out.print("Masukan HP Hero 2 : ");
        hero2.setHP(input.nextDouble()); input.nextLine();
        System.out.print("Masukan Attack Hero 2 : ");
        hero2.setAtk(input.nextDouble()); input.nextLine();
        System.out.print("Masukan Defence Hero 2 : ");
        hero2.setDef(input.nextDouble()); input.nextLine();

        System.out.println("========================================");

        int round = 1;
        boolean kondisi = false;

        do {
            if (hero1.getHP() <= 0){
                System.out.println(hero2.getNama() + " adalah pemenangnya");
                kondisi = true;
            } else if (hero2.getHP() <= 0){
                System.out.println(hero1.getNama() + " adalah pemenangnya");
                kondisi = true;
            } else { 
                System.out.println("Round " + round);
                System.out.println(hero1.getNama() + " menyerang " + hero2.getNama());
                System.out.println("");
                System.out.println(hero2.getNama() + " Memiliki nyawa " + hero2.getHP());
                fighting(hero1, hero2);
                System.out.println(hero1.getNama() + " Menyerang sebesar " + hero1.getAtk());
                System.out.println(hero2.getNama() + " Memiliki petahanan sebesar " + hero2.getDef());
                System.out.println(hero2.getNama() + " Memiliki nyawa " + hero2.getHP());
                System.out.println("");
                System.out.println(hero2.getNama() + " Menyerang " + hero1.getNama());
                System.out.println("");
                System.out.println(hero1.getNama() + " Memiliki nyawa " + hero1.getHP());
                System.out.println(hero2.getNama() + " Menyerang sebesar " + hero2.getAtk());
                System.out.println(hero1.getNama() + " Memiliki petahanan sebesar " + hero1.getDef());
                fighting(hero2, hero1);
                System.out.println(hero1.getNama() + " Memiliki nyawa " + hero1.getHP());
                System.out.println("========================================");

                round++;
            }

        } while(kondisi == false);
    }

    public static void fighting(Hero hero1, Hero hero2){
        double newHP = 0;
        if (hero2.getDef() > hero1.getAtk()){
            newHP = hero2.getHP();
            newHP (hero2, newHP);
        } else if (hero1.getAtk() > hero2.getDef()){
            newHP = hero2.getHP() - (hero1.getAtk() - hero2.getDef());
            newHP (hero2, newHP);
        }
    }

    public static void newHP(Hero hero, double newHP){
        hero.setHP(newHP);
    }
}
