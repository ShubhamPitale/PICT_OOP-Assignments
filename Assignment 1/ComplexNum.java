
import java.util.*;
class Complex{
	int real;
	int imag;
	//initializing complex number
	Complex(){
		real=imag=0;
	}
	//setting value of imaginary and real part
	Complex(int r,int i){
		real=r;
		imag=i;
	}
	//Adding complex numbers
	Complex add(Complex c) {
		Complex temp=new Complex();
		temp.real=this.real+c.real;
		temp.imag=this.imag+c.imag;
		return temp;
	}
	//Subtracting complex numbers
	Complex sub(Complex c) {
		Complex temp=new Complex();
		temp.real=this.real-c.real;
		temp.imag=this.imag-c.imag;
		return temp;
	}
	//Multiplying complex numbers
	Complex multiply(Complex c) {
		Complex temp=new Complex();
		temp.real=(this.real*c.real)-(this.imag*c.imag);
		temp.imag=(this.real*c.imag)+(this.imag*c.real);
		return temp;
	}
	//Dividing complex numbers
	Complex division(Complex c) {
		Complex temp=new Complex();
		temp.real=((this.real*c.real)+(this.imag*c.imag))/(c.real*c.real + c.imag*c.imag);
		temp.imag=((this.imag*c.real)-(this.real*c.imag))/(c.real*c.real+c.imag*c.imag);
		return temp;
	}
}
public class ComplexNum {

	public static void main(String[] args) {
		//Taking input from user
		Scanner s=new Scanner(System.in);
		int c1real,c1imag,c2real,c2imag;
		System.out.println("Enter first complex number\n");
		System.out.println("Real Part:");
		c1real=s.nextInt();
		System.out.println("\nImaginary Part:");
		c1imag=s.nextInt();
		System.out.println("Enter second complex number\n");
		System.out.println("Real Part:");
		c2real=s.nextInt();
		System.out.println("\nImaginary Part:");
		c2imag=s.nextInt();
		//Creating objects
		Complex c1=new Complex(c1real,c1imag);
		Complex c2=new Complex(c2real,c2imag);
		
		//Output
		while(true) {
			System.out.println("Enter 1 for addition\n"+"Enter 2 for subtraction\n"+"Enter 3 for multiplication\n"+"Enter 4 for division\n"+"Enter 5 to exit\n");
			int num;
			num=s.nextInt();
		switch(num) {
		case 1:
			Complex sum=c1.add(c2);
			System.out.println("real part:"+ sum.real + " imaginary part:"+ sum.imag +"\n");
			break;
		case 2:
			Complex diff=c1.sub(c2);
			System.out.println("real part:"+ diff.real + " imaginary part:"+ diff.imag +"\n");
			break;
		case 3:
			Complex mult=c1.multiply(c2);
			System.out.println("real part:"+ mult.real + " imaginary part:"+ mult.imag +"\n");
			break;
		case 4:
			Complex div=c1.division(c2);
			System.out.println("real part:"+ div.real + " imaginary part:"+ div.imag +"\n");
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Please enter right option.");
		}
		
		}
		

	}

}
