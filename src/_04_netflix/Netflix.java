package _04_netflix;

public class Netflix {

	public static void main(String[] args) {

		Movie fiddyShadesOfTupac = new Movie( "fiddyShadesOfTupac"	, 10);
		Movie HEhulk = new Movie( "HEhulk"	, 1);
		Movie BladeWalker = new Movie( "BladeWalker"	, 3);
		Movie TheMatrixNeoGetsKinky = new Movie( "TheMatrixNeoGetsKinky"	, 10000);
		Movie TheOnePeiceIsReal = new Movie( "TheOnePeiceIsReal"	, 2);
		
		fiddyShadesOfTupac.getTicketPrice();
		HEhulk.getTicketPrice();
		BladeWalker.getTicketPrice();
		TheMatrixNeoGetsKinky.getTicketPrice();
		TheOnePeiceIsReal.getTicketPrice();
		
		NetflixQueue que = new NetflixQueue();
		
		que.addMovie(fiddyShadesOfTupac);
		que.addMovie(HEhulk);
		que.addMovie(BladeWalker);
		que.addMovie(TheMatrixNeoGetsKinky);
		que.addMovie(TheOnePeiceIsReal);
		
		que.getBestMovie();
		que.printMovies();
		

	}

}
