package rentalStore;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();
    public Customer(String name) {
        _name = name;
    }
  
    public String getMovie(Movie movie) {
    	Rental rental = new Rental(new Movie("", Movie.NEW_RELEASE),10);
    	Movie m = rental._movie;
        return movie.getTitle();
    }
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    public String getName() {
        return _name;
    }
    public String statement() {
   		Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t"
                    + String.valueOf(each.getCharge()) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
                + " frequent renter points";
        return result;
    }
    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        String result = "Result" + getName() + "</EM></H1><P>\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
             result += each.getMovie().getTitle() +
                    String.valueOf(each.getCharge()) + "<BR>\n";
        }
        result += "result2" +
                String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "result3" +
                String.valueOf(getTotalFrequentRenterPoints()) + "";
        return result;
    }
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental)rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
    }