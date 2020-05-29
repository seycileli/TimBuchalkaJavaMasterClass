package entities;

public class ComplexNumber {

    /*
    A complex number is a number that can be expressed in the form a + bi,
    where a and b are real numbers, and i is a solution of the equation x2 = −1.
    Because no real number satisfies this equation, i is called an imaginary number.
    For the complex number a + bi, a is called the real part, and b is called the imaginary part.
    To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.
    For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
     */

    /*
    Write a class with the name ComplexNumber. The class needs two fields (instance variables)
    with name real and imaginary of type double. It represents the Complex Number.
     */
    private double real, imaginary;

    /*
    Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields.
    In other words, it needs to do a complex number add operation as described above.
     */
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    /*
    Method named add with one parameter of type ComplexNumber.
    It needs to add the ComplexNumber parameter to the corresponding instance variables.
    Corresponding instance variables =/ means; this.real & this.imaginary,
    the class fields/ the instance variables which were private double real, imaginary;
     */
    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    /*
    Method named subtract with two parameters real and imaginary of type double,
    it needs to subtract parameters from fields,
    in other words,
    it needs to do a complex number subtract operation as described above.
     */
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    /*
    Method named subtract with one parameter other of type ComplexNumber.
    It needs to subtract the other parameter from this complex number.
     */
    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

    /*
    The class needs to have one constructor.
    The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //Create Getters for both instance variables (class fields)
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
