package testat3neu; 
import java.util.Scanner;



/**
 *
 * @author Yuan
 */
public class Flights {

    private String flightId;
    private String flightDestination;
    private String flightOrigin;
    private String airline;
    private static Iterable<Flights> showAllFlights;

    public Flights(String flightId, String flightDestination, String flightOrigin, String airline) {

        this.flightId = flightId;
        this.flightDestination = flightDestination;
        this.flightOrigin = flightOrigin;
        this.airline = airline;

    }

   
    void createAFlight() {
        Scanner scanner = new Scanner(System.in);

        //1. Flight ID
        System.out.print("Enter a flight ID: ");
        setFlightId(scanner.nextLine());

        //2. Flight destination
        System.out.print("Enter flight destination: ");
        setFlightDestination(scanner.nextLine());

        //3. Origin
        System.out.print("Enter the origin: ");
        setFlightOrigin(scanner.nextLine());

        //4. Name of the airline
        System.out.print("Enter airline: ");
        setAirline(scanner.nextLine());

    }

    void update() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The old flightID was: ");
        System.out.print("The new flightID is: ");
        setFlightId(scanner.nextLine());
        
        System.out.println("The old flight destination was: " + getFlightDestination());
        System.out.print("The new flight destination is: ");
        setFlightDestination(scanner.nextLine());

        System.out.println("The old flight origin was: " + getFlightOrigin());
        System.out.print("The new flight origin is: ");
        setFlightOrigin(scanner.nextLine());

        System.out.println("The old airline was: " + getAirline());
        System.out.print("The new airline is: ");
        setAirline(scanner.nextLine());

    }

    void delete() {

        setFlightDestination(null);
        setFlightOrigin(null);
        setAirline(null);

    }

    static void showAllFlights () {

        {       
       for(Flights i:showAllFlights){
                      
       System.out.println(showAllFlights);
       
       } 
   }
        
    }

    static Object displayFlight(int flightOptions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Flights() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //getter and setter
    public String getFlightsId() {
        return flightId;
    }

    public void setFlightsId(String flightsId) {
        this.flightId = flightsId;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    void setFlightId(String flightId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFlightOptions(int flightOptions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFlightDepartureTime(String flightDepartureTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void deleteAFlight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.flightId() + " " + this.flightDestination() + " " + this.flightDepartureTime() + " " + this.Airline();
    }

    private String flightId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String flightDepartureTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String flightDestination() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Airline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
