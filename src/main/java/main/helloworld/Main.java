package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*    System.out.println("Hello World!");
        System.out.println("Milica Zivanovic");
        
        int age = 5;
        
        if (age > 18) {
            System.out.println("Osoba je punoletna.");
        } else {
            System.out.println("Osoba je maloletna.");
        }
        
        System.out.println("Unesite broj godina: ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo: " + userAge);
        
        if (userAge >= 18) {
            System.out.println("Osoba je punoletna.");
        } else {
            System.out.println("Osoba je maloletna.");
        }
    

       
    
        System.out.println("Unesite broj godina: ");
        Scanner input2 = new Scanner(System.in);
        int personAge = input.nextInt();
        
        
        if (personAge <= 0 && personAge > 150) {
            System.out.println("Invalid");
        } else if (personAge > 0 && personAge <= 5) {
            System.out.println("Baby");
        } else if (personAge <= 11) {
            System.out.println("Kid");
        } else if (personAge <= 17) {
            System.out.println("Teen");
        }  else if (personAge >=18) {
            System.out.println("Adult");
        }
        
            
        
        
        
    }
    
};

         */
//        System.out.println("Unesite redni broj dana u nedelji (1-7): ");
//        Scanner input = new Scanner(System.in);
//        int day = input.nextInt();
//        String dayString;
//        
// switch (day) { 
//        case 1: 
//            dayString = "Ponedeljak"; 
//            break; 
//        case 2: 
//            dayString = "Utorak"; 
//            break; 
//        case 3: 
//            dayString = "Sreda"; 
//            break; 
//        case 4: 
//            dayString = "Četvrtak"; 
//            break; 
//        case 5: 
//            dayString = "Petak"; 
//            break; 
//        case 6: 
//            dayString = "Subota"; 
//            break; 
//        case 7: 
//            dayString = "Nedelja"; 
//            break; 
//        default: 
//            dayString = "Nepostojeći dan"; 
//            break; 
//        } 
//        System.out.println(dayString); 
//    } 
        System.out.println("While loop:");

        int x = 5;
        while (x < 10) {
            System.out.println(x);
            x = x + 1;
            //x++;
        }

        System.out.println("While loop2:");

        x = 10;

        while (x > 0) {
            System.out.println(x);
            x = x - 1;
        }

        System.out.println("Do While loop:");
        x = 20;
        do {
            System.out.println(x);
            x--;
        } while (x > 15);

        System.out.println("For loop:");
        for (int i = 30; i >= 20; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
        }

        //Zadatak 1 - kvadrat
        
        
         System.out.println("Kvadrat: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
        }
        System.out.println();
    }
        
        // Zadatak 2 - koordinate 
        
        //(1,0) (1,1)... (1,9)
        // (2,1) (2,2)...
        // ...
        // (10,1) ...
        
        System.out.println("Koordinate 1: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("(" + i + "," + j + ") ");
        }
            System.out.println();
    }
        
        
        // Zadatak 3

        System.out.println("Kruske: ");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("(" + i + "," + j + ") ");
        }
            System.out.println();
    }
        
    }
}
