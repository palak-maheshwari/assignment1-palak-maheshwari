/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.io.DataInputStream;
import java.io.IOException;
public class Gravity {
	// TODO 1: Create the main method
    public static void main(String[] args) throws IOException {
        DataInputStream br = new DataInputStream(System.in);
        double t, v, d;
        double g = 9.8;
        t = Double.parseDouble(br.readLine());
        v = g * t;
        d = 0.5 * 9.8 * t * t;
        System.out.println("The speed of the object at" + " " + t + " " + "seconds after its release is" + " " + v + " " + "and the distance the objec has travelled in the" + " " + t + " " + "seconds after the release is" + " " + d);

	}
}
