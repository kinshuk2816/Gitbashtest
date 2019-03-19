package Test;


import java.util.ArrayList;
import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
	
		String[] n= {"Vamsi","Akshay","Kinshuk","Manya"};
		   int size= n.length;
		   

		      for(int i = 0; i<size-1; i++) {
		         for (int j = i+1; j<n.length; j++) {
		            if(n[i].compareTo(n[j])<0) {
		                          String temp = n[i];
		               n[i] = n[j];
		               n[j] = temp;
		            }
		         }
		      }
		     for(int i = 0; i < size; i++) {
		            System.out.println(n[i]);
		   }
	}}