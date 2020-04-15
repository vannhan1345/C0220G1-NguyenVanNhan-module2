package bai_3_lop_va_doi_tuong_trong_java.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    private QuadraticEquation() {

    }

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {

        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoo1() {

        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoo2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public void Experimental() {
        if (getDiscriminant() > 0) {
            System.out.print("Phương trình có nghiệm r1 và r2 là: " + getRoo1() + " và " + getRoo2());
        } else if (getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm kép r1=r2 là: " + getRoo1());
        } else {
            System.out.print("Phương trình vô nghiệm ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.Experimental();
    }

}
