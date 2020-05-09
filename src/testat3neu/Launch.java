package testat3neu;

import testat3neu.FlightManager;
import testat3neu.Flights;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author serapbozkurt
 */

public class Launch {

    public static void main(String[] args) {

        mainMenu();

    }

    
    public static void mainMenu() {

        Scanner scan = new Scanner(System.in);

        String input = "";

        int userInput = 0;

        System.out.println("SY Catering-Management (Version 1.0 (C) 2020 by Group 26)");
        System.out.println("");
        System.out.println("MAIN MENU\n"
                + "Please select:");
        System.out.println("");
        System.out.println("Managing flights 1\n"
                + "Managing dishes 2\n"
                + "Program exit 0");
        System.out.println("");
        System.out.print("Please enter your choice: ");
        userInput = scan.nextInt();

        // This is a if or switch construct. If user types in 1, then you would call flight manager to start his job.
        // If user types in 2, then you start the dish manager.
        // If user types in 0, you simply call system to exit.
        // If user types in something else, your program has to deal with this input to do nothing.
        
          switch (userInput) {
            case 0:
                if (userInput == 1) {
                    flightManager();
                    System.exit(0);
                }
                break;
            case 1:
                if (userInput == 2) {
                    dishManager();
                    System.exit(0);
                }
                break;
            case 2:
                if (userInput == 0) {
                    System.exit(0);
                    break; 
                    //default:
                    //System.out.println("Invalid input");
                    //break;
            }

            }

        
    }


   
    public static void flightManager() {

        Scanner scan = new Scanner(System.in);

        String input = "";
        
        int flightnumber = 0;

        System.out.println(" \n"
                + "Create new flight \t 1 \n"
                + "Update a flight   \t 2 \n"
                + "Delete a flight   \t 3 \n"
                + "Show flight list  \t 4 \n"
                + "Back to main menu \t 0 \n");
        System.out.print("Please enter your choice: ");
        input = scan.nextLine();

        // Show the respective method
        // Go back to flight manager if there are no values like 1,2,3,4 or 0 are entered
        
        try {
            flightnumber = Integer.parseInt(input);
            if (flightnumber == 1) {
                createAFlight();
                System.exit(0);
            }
            if (flightnumber == 2) {
                updateAFlight();
                System.exit(0);
            }
            if (flightnumber == 3) {
                deleteAFlight();
                System.exit(0);
            }
            if (flightnumber == 4) {
                showAllFlights();
                System.exit(0);
            }
            if (flightnumber == 0) {
                mainMenu();

            } else {
                flightManager();

            }
        } catch (NumberFormatException e) {
            flightManager();
            System.exit(0);
        }

    }
    
        public static void dishManager() {

        //Same structure like flightManager
        Scanner scan = new Scanner(System.in);

        String input = "";

        int dishnumber = 0;

        System.out.println(" \n"
                + "Create new dish \t 1 \n"
                + "Update a dish   \t 2 \n"
                + "Delete a dish   \t 3 \n"
                + "Show dish list  \t 4 \n"
                + "Back to main menu \t 0 \n");
        System.out.print("Please enter your choice: ");
        input = scan.nextLine();

        try {
            dishnumber = Integer.parseInt(input);
            if (dishnumber == 1) {
                createADish();
                System.exit(0);
            }
            if (dishnumber == 2) {
                updateADish();
                System.exit(0);
            }
            if (dishnumber == 3) {
                deleteADish();
                System.exit(0);
            }
            if (dishnumber == 4) {
                showAllDishes();
                System.exit(0);
            }
            if (dishnumber == 0) {
                mainMenu();

            } else {
                dishManager();
                System.exit(0);

            }
        } catch (NumberFormatException e) {
            dishManager();
            System.exit(0);
        }
        
    
    }

    private static void createAFlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void updateAFlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteAFlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void showAllFlights() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void createADish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void updateADish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteADish() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void showAllDishes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}