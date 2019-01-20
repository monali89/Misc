package pramp;

import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JFrame;

public class HTreeConstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawHTree(0, 0, 4, 3);
	}
	
	public static void drawHTree(double m, double n, double l, double d){
	    if(d>0){
	      drawLine(m, n);
	      drawHTree((m-l/2), (n+l/2), Math.sqrt(l), d-1);
	      drawHTree((m-l/2), (n-l/2), Math.sqrt(l), d-1);
	      drawHTree((m+l/2), (n+l/2), Math.sqrt(l), d-1);
	      drawHTree((m+l/2), (n-l/2), Math.sqrt(l), d-1);
	    }
	  }
	  
	  public static void drawLine(double x, double y){
	    //System.out.println("X: " + x + ", Y: " + y);
	    
	    Point p = new Point();
	    p.setLocation(x, y);
	    
	   
	   
	  }

}
