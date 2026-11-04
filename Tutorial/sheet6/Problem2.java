package Problem2;



class Rectangle {
    private double width;
    private double length;
    
    public Rectangle() {
        width = 1;
        length = 1;
    }
    
    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }
    
    public double getW() {
        return width;
    }
    
    public double getL() {
        return length;
    }
     
    public void setW(double w) {
        width = w;
    } 
    
    public void setL(double l) {
        length = l;
    }
    
    public double getArea() {
        return width * length;
    }
    
    public double getPerimeter() {
        return width * 2.0 + length * 2.0;
    }
}

public class Problem2 {

    
    public static void main(String[] args) {
      Rectangle obj1 = new Rectangle();
      Rectangle obj2 = new Rectangle(5.0, 10.0);
      
      System.out.println("First Rectangle \nLength: " + obj1.getL() + "\nWidth: " + obj1.getW() + "\nArea: " + obj1.getArea() + " Perimeter: " + obj1.getPerimeter());
      System.out.println("Sec Rectangle \nLength: " + obj2.getL() + "\nWidth: " + obj2.getW() + "\nArea: " + obj2.getArea() + " Perimeter: " + obj2.getPerimeter());

    }
    
}
