import java.util.Arrays;

public class Distributor {
	private String name;
	private String address;
	private String phone;
	private Movie[] movies = new Movie[5];
	private int numberOfMovies;
	
	public Distributor(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Distributor(Movie[] movies) {
		movies = null;
		for(int i=0;i<5;i++)
		{
		    this.movies[i] = null;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Movie[] getMovies(Distributor dist) {
		return Arrays.copyOf(movies, numberOfMovies);
	}
	
	public void addMovie(Movie m) {	
		for(int i = 0; i<5; i++) { //I know the length of array so I can do this for now - not wise I know
			if (movies[i] == null) {
				movies[i] = m;
				break;
			}
			//Here just in case
			else {}
			}
		}
	
	public void addMovie(String name, String directorName, int genre, double earnings) {
		//For now we are using 5 since we know how big, 
		//change  to look for array length for future use to avoid bug
		for (int i = 0; i<5; i++) {
			if (movies[i] == null) {
				movies[i] = new Movie(name, directorName, genre, earnings);
				break;
			}
			//Here just in case
			else {}
		}
		
	}
	
	public int totalNumMovies() {
		numberOfMovies = 0;
		for (int i = 0; i<5; i++) {
			if (movies[i] == null) {
				//Checking to see if the spot is null, if so - move along
			}
			else { numberOfMovies++; }
		}
		return numberOfMovies;
	}
	//TODO Complete findTotalEarnings
	public double findTotalEarnings() {
		double totalEarnings = 0.0;
		for (int i = 0; i<5; i++) {
			if (movies[i] == null) {
				//System.out.println("IF");
				//Checking to see if the spot is null, if so - move along
			}
			else { 
				//System.out.println("ELSE");
				totalEarnings += movies[i].getEarnings();
			}
		}
		return totalEarnings;
	}
	//TODO Complete comedyEarnings
	public double comedyEarnings() {
		double totalEarnings = 0.0;
		for (int i = 0; i<5; i++) {
			if (movies[i] == null) {
				//Checking to see if the spot is null, if so - move along
			}
			else {
				if(movies[i].getGenre() == 0 ) {//Comedy
					totalEarnings += movies[i].getEarnings();
				}
			}
		}
		return totalEarnings;
	}
	
	//TODO Complete addEarnings
	public void addEarnings(Movie movie, double earnings ) {
		for (int i = 0; i<5; i++) {
			if (movies[i] == null) {
				//Checking to see if the spot is null, if so - move along
			}
			else {
				if(movies[i].getName().equals(movie.getName())) {
					movies[i].addToEarnings(earnings);
				}
			}
		}
		return;
	}
	
	public static double calculateTax(int tax, Distributor d1) {
		int percentConversion = 100;
		double taxWholeNumber =  tax;
		double payTax = taxWholeNumber / percentConversion;
		return payTax = payTax * d1.findTotalEarnings();
	}
	
	public boolean equals(Distributor dist) {
		return this.name.equals(dist.name);
	}
	
	
	//TODO Finish the toString
	public String toString() {

		return "Distributor's name " + name +
				"\nDistributor address " + address +
				"\nDistributor phone number " + phone +
				"\n\nDistributor Movie count " + movies.length +
				"\n\nHere are all the movies owned by this Distributor\n\n" + this.print();
	}
	
	public String print() {
		String movieList = "";
		for(int i=0; i< movies.length; i++){
			if (movies[i] == null) {
				//Checking to see if the spot is null, if so - move along
			}else { movieList += movies[i] + " \n\n"; }
		}
		return movieList;		
	}
}
