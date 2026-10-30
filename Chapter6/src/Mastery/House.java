package Mastery;

import java.util.Scanner;

public class House {

   
    public static void main(String[] args) {
       
        House myHouse = new House();
        
        
        myHouse.addRoof();
        myHouse.addBase();
        myHouse.addWalk();
    }

   
    public void addRoof() {
        System.out.println("   /\\ ");
        System.out.println("  /  \\ ");
        System.out.println(" /____\\");
    }

    // 3. The addBase method
    public void addBase() {
        System.out.println(" |    | ");
        System.out.println(" | {} | ");
        System.out.println(" |____| ");
    }

    // 4. The addWalk method
    public void addWalk() {
        System.out.println("   ||   ");
        System.out.println("   | ------");
        System.out.println("   ---------");
    }
}


 /*
   /\  
  /  \ 
 /____\
 |    | 
 | {} | 
 |____| 
   ||   
   | ------
   ---------
  */
