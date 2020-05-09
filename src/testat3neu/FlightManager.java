package testat3neu; 


import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Yuan
 */
public class FlightManager {

    private final static ArrayList<Flights> FLIGHTS = new ArrayList<Flights>();
    
    public static void main(String[] args) {

    FlightManager  myFlightManager = new FlightManager();   
    }

     // Create a flight
    public static void createAFlight() {

    Scanner scanner = new Scanner (System.in); 
    
        int flightOptions;
        String flightId;
        String flightDestination;
        String flightOrigin;
        String airline;

        Flights myFlights;

       
        myFlights = new Flights();

        flightOptions = determineNumber("Please enter flight option: ");
        if (Flights.displayFlight(flightOptions) == null) {
            myFlights.setFlightOptions(flightOptions);

            flightId = enterText("Please enter flightID: ");
            myFlights.setFlightId(scanner.nextLine()); 
            
            flightDestination = enterText("Where is the destination? ");
            myFlights.setFlightDestination(flightDestination);

            flightOrigin = enterText("From where does the flight leave? ");
            myFlights.setFlightOrigin(flightOrigin);

            airline = enterText("Which airline? ");
            myFlights.setAirline(airline);

            myFlights.create();
            System.out.println("Flight is created.");
            flightManager();
        } else {
            System.out.println("The flight ID is assigned. Please enter another flight ID!");

        }
    }

    // Update a flight, same structure like createAFlight()
    public static void updateAFlight() {
     
    

        int flightOptions;
        String flightId;
        String flightDestination;
        String flightOrigin;
        String airline;

        Flights myFlights;

        myFlights = new Flights();

        
        flightOptions = determineNumber("Please enter flight option: ");
        
        myFlights = (Flights) Flights.displayFlight(flightOptions);

        if (myFlights == null) {
            System.out.println("Flight not available.");
            updateAFlight();

        } else {
            flightId = enterText("Please enter new flightID: ");
            myFlights.setFlightId(flightId);

            flightDestination = enterText("Please enter new flight destination: ");
            myFlights.setFlightDestination(flightDestination);

            flightOrigin = enterText("Please enter new flight origin: ");
            myFlights.setFlightOrigin(flightOrigin);

            airline = enterText("Please enter new airline: ");
            myFlights.setAirline(airline);
            flightManager();
        }

    }

    // Delete a Flight
    public static void deleteAFlight() {
    
        
        int flightOptions;

        Flights myFlights;

        myFlights = new Flights();

        flightOptions = determineNumber("Which flight should be removed?\n FlightID: ");
        myFlights = (Flights) Flights.displayFlight(flightOptions);

        if (myFlights == null) {
            System.out.println("The entered flight ID does not exist.");
            flightManager();
        } else {
            myFlights.deleteAFlight();

            System.out.println("The flight was successfully deleted.");
            flightManager();
        }
    }

    // Show all flights
    public static void showAllFlights() {
        System.out.println("All flights \n");
        // Method to show the list
        Flights.showAllFlights();
        flightManager();

    }

    private static void flightManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Job of the flight manager
    public void go() { 

        Scanner scan = new Scanner(System.in); // reading keaboard input

        String input = "";
        int flightNumber = 0;
        
        
       
        System.out.println("\n SY Catering-Management (Version 1.0 (C) 2020 by Group 26)");
        System.out.println("1: Create a Flight");
        System.out.println("2: Update a Flight");
        System.out.println("3: Delete a Flight");
        System.out.println("4: Show All flights");
        System.out.println("0: Return to Main Menu");

        System.out.print("Please enter your choice: ");
        input = scan.nextLine();

        try {
            int flightManagerNumber = Integer.parseInt(input);
            if (flightManagerNumber == 1) {
                createAFlight();
                System.exit(0);
            }
            if (flightManagerNumber == 2) {
                updateAFlight();
                System.exit(0);
            }
            if (flightManagerNumber == 3) {
                deleteAFlight();
                System.exit(0);
            }
            if (flightManagerNumber == 4) {
                showAllFlights();
                System.exit(0);
            }
            if (flightManagerNumber == 0) {
                mainMenu();

            } else {
                flightManager();

            }
        } catch (NumberFormatException e) {
            flightManager();
            System.exit(0);
        }
    }

    private static void mainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String writeText(String anrede_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void updateFlight() {
        //Same structure like createAFlight()

        String flightId;
        String flightDestination;
        String flightOrigin;
        String airline;

        Flights myFlights = new Flights();

        if (myFlights == null) {
            System.out.println("Flight not available.");
            updateFlight();

        } else {
            flightId = writeText("Please enter new flight ID: ");
            myFlights.setFlightId(flightId);

            flightDestination = writeText("Please enter new destination: ");
            myFlights.setFlightDestination(flightDestination);

            flightOrigin = writeText("Please enter new flight origin: ");
            myFlights.setFlightOrigin(flightOrigin);

            airline = writeText("Please enter new airline: ");
            myFlights.setAirline(airline);

        }

    }

    // 
    static int determineNumber(String value) {

        int nr;
        Scanner scan = new Scanner(System.in);

        do {
            nr = -1;
            try {
                System.out.print(value);
                nr = Integer.parseInt(scan.nextLine());
                if (nr <= 0) {
                    System.out.println("Please enter an integer greater than 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("The specified number is not a number or a comma. Please enter an integer greater than 0!");
            }
        } while (nr < 1);
        return nr;

    }

    static String enterText(String output) {
        String input = "";
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print(output);
            input = scan.nextLine();

        } catch (NumberFormatException e) {
        }

        return input;
    }

    
    private static class Flight {

        public Flight() {
        }
            
    }
   

}
