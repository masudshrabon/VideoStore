package rentalStore;

class Rental {

    public Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

	public double getCharge() {
		return getCharge(_daysRented);
        //return _movie.getCharge(_daysRented);
	}

    public int getFrequentRenterPoints() {

        return  _movie.getFrequentRenterPoints(_daysRented);
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
    //changed add method
    public int getMovieTitle(){
    	//int a = _daysRented;
    	_movie.getTitle();
    	return 0;
    }
    // add method like Movie
    public double getCharge(int daysRented) {
    	Price _price = new ChildrensPrice();
        return _price.getCharge(daysRented);
    }
    
}