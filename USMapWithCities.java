import java.io.File;
import java.io.FileNotFoundException;

/**
 *	File Uitilies for reading and writing
 *	
 *  @author Vibha Raghvendran
 *	@since August 23 2024
 */
 
 public class USMapWithCities {
	 /**
	  * Opens a file to read using the Scanner class
	  * @param fileName		name of the file to open
	  * @return 			the Scanner object to the file
	  */
	  
	  int[][] cities = new int[1000][2];
	  
	  public static java.util.Scanner openToRead (String fileName) {
		  java.util.Scanner input = null;
		  try {
			  input = new java.util.Scanner (new java.io.File(fileName));			 
		  }	
		  catch (java.io.FileNotFoundException e) {
			  System.err.println("ERROR: Cannot open " + fileName + " for reading.");
			  System.exit(4);
		  }
		 
		  return input;
	  }
	  
	  public void setupCanvas() {
		  StdDraw.setTitle("USMap");
		  StdDraw.setCanvasSize(900, 512);
		  StdDraw.setXscale(128.0, 65.0);
		  StdDraw.setYscale(22.0, 52.0);
	  }
	  
	  public void drawCities() {
		  StdDraw.setPenRadius(0.006);
		  StdDraw.setPenColor(128, 128, 128);
		  for (int i = 0; i < 1000; i++) {
			  StdDraw.point(cities[i][0], cities[i][1]);
		  }
	  }
	
	public static void main (String[] args) {
		openToRead(cities);
		drawCities();
	}
}
