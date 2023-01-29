// Simple Guest List Program.
package simpleguestlist;

import java.util.Scanner;


public class SimpleGuestList {
    public static void main(String[] args){
        String[] guests = new String[10];
        Scanner sc = new Scanner(System.in);

        // You can also add the names individually like this.
        // guests[0] = "Abhinandan";


        do {
            System.out.println();
            System.out.println("1 - Display all Guests");
            System.out.println("2 - Add Guests");
            System.out.println("3 - Remove Guests");
            System.out.println("4 - Exit");
            System.out.println("Option: ");
            int option = sc.nextInt();
            System.out.println();

            if(option == 1){
                for (String guest : guests) {
                    System.out.println(guest);
                }
            }
            else if (option == 2){
                for(int i = 0; i<guests.length; i++){
                    if(guests[i] == null){
                        System.out.println("Name: ");
                        guests[i] = sc.next();
                        break;
                    }
                }
            }
            else if(option == 3){
                System.out.println("Name: ");
                String name = sc.next();
                for(int i = 0; i<guests.length; i++){
                    if (guests[i] != null && guests[i].equals(name)){
                        guests[i] = null;
                        break;
                    }
                }
            }
            else if(option == 4){
                break;
            }
        }
        while(true);

        System.out.println("Exiting...");
    }
}
