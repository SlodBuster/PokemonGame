import java.io.*;
import java.util.Scanner;

public class PokemonGame{
    public static void main(String args[]){
        Pokemon generated = new Pokemon("Dipto");
        System.out.println("Oh!! How will your pokemon do ??"\n);
        System.out.println("Choice => Attack, Item, Sleep, Run");

        Scanner scan = new Scanner(System.in);
        String choose = scan.next();
        scan.close();

        if(choose.equals("Attack")){
            attack(choose);
        }else if(choose.equals("Item")){
            item(choose);
        }else if(choose.equals("Sleep")){
            sleep(choose);
        }else if(choose.equals("Run")){
            run(choose);
        }else if(choose.equals()){

        }
    }

    
    static void attack(String choose) {
        System.out.println("Dipto attack !");
    }
    static void item(String choose) {
        System.out.println("Dipto use a MegaPotion.");
    }
    static void sleep(String choose) {
        System.out.println("Dipto is sleep now.");
    }
    static void run(String choose) {
        System.out.println("Dipto ran away...");
    }
}