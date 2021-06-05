/*
 *Class Name: CST8284_21S
 *Author Name: Jie Ke
 *Professor Name: Samira Ouaaz
 *Date: June 4, 2021 
 *Description: This program Solution the Lab3 task. 
 */
package cst8284.calculator;
/*This class represents the calculator of two complex numbers.
 *It includes add, subtract, multiply and division methods.
 */
public class ComplexCalculator {

	private java.util.Scanner op = new java.util.Scanner(System.in);
	private Complex c;  // stores result of current calculation 

	public ComplexCalculator(Complex c1, Complex c2){

		System.out.println("Which math operation do you wish to perform?  Enter +, -, *, /");

		switch (op.nextLine().charAt(0)){
		case '+':
			setComplexResult(add(c1, c2));  
			break;
		case '-':
			setComplexResult(subtract(c1, c2));
			break;

		case '*':
			setComplexResult(multiply(c1, c2));
			break;

		case '/':
			setComplexResult(divide(c1, c2));
			break;

		default:
			System.out.println("Unknown operation requested");
		}		
	}

	public ComplexCalculator() {}  // Needed for Lab 4; do not change


	public Complex add(Complex c1, Complex c2){
		double real = c1.getReal() + c2.getReal();  // As per the Lab Appendix
		double imag = c1.getImag() + c2.getImag();
		return(new Complex(real, imag));
	}



	public Complex subtract(Complex c1, Complex c2){
		double real = c1.getReal() - c2.getReal();
		double imag = c1.getImag() - c2.getImag();
		return(new Complex(real, imag));

	}

	public Complex multiply(Complex c1, Complex c2){
		double real = c1.getReal()*c2.getReal() - c1.getImag()*c2.getImag();
		double imag = c1.getReal()*c2.getImag() + c2.getReal()*c1.getImag();
		return(new Complex(real, imag));

	}
	//This Complex divide() employs the complex conjugate in the Complex class and 
	//the multiply().
	public Complex divide(Complex c1, Complex c2){	

		setComplexResult(multiply(c2, c2.conjugate()));
		Complex c3 = new Complex(1/(c.getReal()), 0);
		setComplexResult(multiply((multiply(c1, c2.conjugate())), c3));

		if(c2.isZero()) {
			System.out.println("Divide-by-zero error detected");
			c = new Complex(0, 0);
		}
		return c;
	}   

	public void setComplexResult(Complex c) {
		this.c = c;

	}

	public Complex getComplexResult(){
		return getComplexResult();

	}

	public String toString(){
		return c.toString();

	}

}
