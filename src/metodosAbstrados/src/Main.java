import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numberShapes = sc.nextInt();

        for (int i = 0; i < numberShapes; i++) {
            sc.nextLine();

            System.out.printf("Shape #%d data: %n", i+1);

            System.out.print("Rectangle or circle (R/C)?: ");
            char shape = sc.nextLine().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();

            if (String.valueOf(shape).toUpperCase().equals("R")){
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shapeList.add(new Rectangle(Color.valueOf(color.toUpperCase()), width, height));
            }

            if(String.valueOf(shape).toUpperCase().equals("C")){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(Color.valueOf(color.toUpperCase()), radius));
            }

        }

        System.out.println("SHAPE AREAS");
        for (Shape shape : shapeList){
            System.out.println(String.format("%.2f",shape.area()));
        }

        sc.close();
    }
}