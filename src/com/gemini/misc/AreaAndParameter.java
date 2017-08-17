package com.gemini.misc;


public class AreaAndParameter
{
  public static void main(String[] args) {
    double PI = 3.1414D;
    java.util.Scanner scan = new java.util.Scanner(System.in);
    

    System.out.println("Enter radius for Circle : ");
    double radius = scan.nextDouble();
    

    double areaCircle = PI * radius * radius;
    System.out.println("Area of Circle : " + areaCircle);
    

    double paremeterCircle = 2 * PI * radius;
    System.out.println("Paremeter of Circle : " + paremeterCircle);
    

    System.out.println("Enter side for Square : \n");
    double side = scan.nextDouble();
    

    double areaSquare = side * side;
    System.out.println("Area of Square : " + areaSquare);
    

    double paremeterSquare = 4.0D * side;
    System.out.println("Perimeter of Square : " + paremeterSquare);
    
    System.out.println("Enter length of rectangle : ");
    double length = scan.nextDouble();
    
    System.out.println("Enter breadth of rectangle : ");
    double breadth = scan.nextDouble();
    

    double areaRectangle = length * breadth;
    System.out.println("Area of rectangle : " + areaRectangle);
    

    double paremeterRectangle = 2.0D * (length + breadth);
    System.out.println("Paremeter of Rectangle  : " + paremeterRectangle);
    
    scan.close();
  }
}


