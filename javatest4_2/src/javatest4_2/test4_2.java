package javatest4_2;
import java.util.*;
import java.math.*;
class ComplexNumber{
	
	double realPart, imagPart;
		
	 
	void setReal(double realPart) {this.realPart=realPart;}
	void setImag(double imagPart) {this.imagPart=imagPart;}	
	
	double magnitude() {
		return Math.sqrt((this.realPart*this.realPart)+(this.imagPart*this.imagPart));
	}
	
	ComplexNumber add(ComplexNumber n) {
		ComplexNumber n2_ =  new ComplexNumber();
		n2_.realPart = n2_.realPart + n.realPart;
		n2_.imagPart = n2_.imagPart+n.imagPart;
		return n2_;                                               
	}
	
	ComplexNumber subtrack(ComplexNumber n) {
		ComplexNumber n2_ =  new ComplexNumber();
		n2_.realPart = n2_.realPart - n.realPart;
		n2_.imagPart = n2_.imagPart -n.imagPart;
		return n2_;
	}
	void printNumber()
	{
		System.out.printf(this.realPart+ " + "+this.imagPart+ "i");
		System.out.printf("\n");
		System.out.printf("Magnitude : "+ magnitude());
		System.out.printf("\n");
	}
}

public class test4_2 {

	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		
		  ComplexNumber n1 = new ComplexNumber(); 
		  ComplexNumber n2 = new ComplexNumber();
		  
		  n1.setReal(5.0); 
		  n1.setImag(7.2); 
		  n2.setReal(-3.1); 
		  n2.setImag(5.7);
		  
		  System.out.printf("n1 is  -> "); 
		  n1.printNumber();
		  System.out.printf("n2 is  -> "); 
		  n2.printNumber();
		  System.out.printf("n1 + n2  -> "); 
		  n1.add(n2).printNumber();
		  System.out.printf("n1 - n2 -> "); 
		  n1.subtrack(n2).printNumber();
		 
		
	}

}
