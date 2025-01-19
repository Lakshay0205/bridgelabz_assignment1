// 5. Volume of a Cylinder Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula: Volume = π * radius^2 * height.//
import java.util.Scanner;
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is: " + volume);
        sc.close();
    }
}
