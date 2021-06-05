/*
 *Class Name: CST8284_21S
 *Author Name: Jie Ke
 *Professor Name: Samira Ouaaz
 *Date: June 4, 2021 
 *Description: This program Solution the Lab3 task.
 */
package cst8284.calculator;

import java.awt.print.Printable;
/*This class represents the complex constructors,
 *and includes toString(), isZero() and conjugate() methods. 
 */

public class Complex {
	private double real = 0;
	private double imag = 0;


	// Complex constructor that takes in a single string, e.g. "2-4i"
	public Complex(String cStr){
		this(cStr.split("(?=\\+)|(?=\\-)"));  // splits cStr at + or - into an 
		// array of strings having two elements.  The first element of the 
		// resultant array will be the real portion, while the second is the 
		// imaginary portion.  This array is passed to the next constructor.
	}	
	// Complex constructor that takes in an array of two strings from the above 
	// constructor e.g. cStr[0]="2", cStr[1]="-4i"
	public Complex(String[] cStr){
		this(cStr[0], cStr[1]);

	}	
	// Complex constructor that takes two separate strings as parameters, e.g. "2" and "-4i"
	public Complex(String r, String i){
		this(Integer.valueOf(r), Integer.valueOf(i.split("i")[0]));
		
	}	
	// Complex constructor that takes in two ints as parameters, e.g. 2 and -4
	public Complex(int r, int i){
		this(Double.valueOf(r), Double.valueOf(i));

	}

	// Complex constructor that takes in two ints and stores them as floats, e.g. as 2.0 and -4.0
	public Complex(double r, double i){
		setReal(r);
		setImag(i);
	}

	//default Complex constructor; it will chain automatically to the (int, int) constructor
	public Complex(){
		this(0,0);	
	}
	public double getReal() {
		return real;
	}	

	public double getImag() {
		return imag;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public Complex getComplex() {
		return getComplex();
	}

	public String toString() {
		String str = "";
		if(imag < 0)
			str = real + "-" + Math.abs(imag) + "i";
		else
			str = real + "+" + imag + "i";
		return str;
	}

	public boolean isZero() {
		return(real == 0 && imag == 0);
	}	


	public Complex conjugate() {
		return new Complex(getReal(), -getImag());
	}
	// Bonus B : Write the method to return the complex 
	// conjugate of this Complex number.  Then use the public conjugate() method with 
	// the complex multiplication to perform the division as explained in the Bonus
	// section, rather than using the equation for division given in the Lab 3 Appendix.


}
