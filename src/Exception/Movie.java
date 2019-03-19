package Exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Movie {

	private String name;
	private int movieid;
	private int duration;
	private static int counter = 101;






	   @Override
	public String toString() {
		return "movie [name=" + name + ", movieid=" + movieid + ", duration=" + duration + ", toString()="
				+ super.toString() + "]";
		
		
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Movie.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	Movie(){
	    counter++;
	}

	public static void join() {

	    Movie a[] = null;

	    while (true) {
	        Scanner s = new Scanner(System.in);
	//
	        System.out.println("please Select your choices");
	        int option = s.nextInt();


	        switch (option) {


	            case 1:
	               joint(a);

	                break;
	            case 2:

	                dispalymovie(a);
	                break;


	            case 4:
	                System.exit(0);
	                break;

	            default:System.out.println("Try again");
	        }

	    }
	}

	   public static Movie[] joint (Movie[]a) {
		   
		   int i;
		  
	       Scanner s = new Scanner(System.in);
	       System.out.println("How many movie you want to create");
	       int count = s.nextInt();
	       a = new Movie[count];

	       for (i = 0; i < count; i++) {
	    	   
	    	   
	          System.out.println("Enter the  name");
	           String name = s.next();
	    
	           boolean flag = false;
			while(flag==false)
	             if(Pattern.matches("^[A-Za-z]+$",name)==true)
	             {
	            	 System.out.println("OK");
	            	 flag=true;
	             }
	             else {
	            	
			flag=false;
	            	 System.out.println("Enter valid  value");
		                 name=s.next();
		              }
	           
	         
	           
	     System.out.println("Enter the duration");
	           int duration = s.nextInt();

	           
	           System.out.println(" Movie id");
		          
	           System.out.println(Movie.getCounter());
	           
	           
	           
	           
	           
	           Movie m1 = new Movie();
	           
	           m1.setName(name);
	           m1.setDuration(duration);

	           a[i] = m1;
                                           
	       }
	       return a;
	   }
		  
	  
	      public static void dispalymovie (Movie[]a){

	    int i;
	    System.out.println("the arr is  " + a);


	    if (a!= null) {
	        for (i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	    } else {
	        System.out.println("no entry ");


	    }
	}


	}

