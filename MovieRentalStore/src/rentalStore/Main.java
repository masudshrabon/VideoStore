package rentalStore;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Hindi", Movie.REGULAR);
		Movie m2 = new Movie("Bangla", Movie.NEW_RELEASE);
		Movie m3 = new Movie("Urdu", Movie.CHILDRENS);
		Movie m4 = new Movie("English", Movie.NEW_RELEASE);

        Customer c = new Customer("stokito");
        c.addRental(new Rental(m1, 3));
        c.addRental(new Rental(m2, 4));
        c.addRental(new Rental(m3, 5));
        c.addRental(new Rental(m4, 6));
        System.out.println(c.statement());
    }

}