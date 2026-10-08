public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Black");
        System.out.println("--- Testing Shape ---");
        shape.printInfo();
        System.out.println();

        Shape square = new Square(5.0, "Red");
        System.out.println("--- Testing Square ---");
        square.printInfo();
        System.out.println();

        Shape circle = new Circle(7.0, "Blue");
        System.out.println("--- Testing Circle ---");
        circle.printInfo();
        System.out.println();

        Shape cylinder = new Cylinder(10.0, 7.0, "Green");
        System.out.println("--- Testing Cylinder ---");
        System.out.println("Radius: " + ((Cylinder) cylinder).getRadius());
        cylinder.printInfo();
        System.out.println();
    }
}
