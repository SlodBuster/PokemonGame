/* Dev Assignment Program 
    - Build Pokemon => level, hp, pp 
    - eat
        berry
    - attack
    - sleep
    - faint
    - run(retreat)
  Program Type
    - Pokemon.java
    - PokemonGame.java 
  git used (Optional)
    - github
    - gitlab
    - bitbucket */

//import java.io.*;
import java.io.*;
public class Pokemon{

        public Pokemon(String name){
                String pokemonName = name;
                String inventory[] = {"MegaPotion"};
                int healthPoint = 150;
                int powerPoints = 12;
                int Level = 12;
                System.out.println("Name: " + pokemonName);
                System.out.println("HP: " + healthPoint);
                System.out.println("PP: " + powerPoints);
                System.out.println("Lv: " + Level);
                System.out.println("Inv: " + inventory[0]);
        }
}