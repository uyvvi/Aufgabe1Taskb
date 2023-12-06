public class RoundAndRound {
    public static void main(String[] args) {
        // Circle-Objekte erstellen
        Circle circle1 = new Circle();
        circle1.radius = 5.1;
        circle1.diameter = round(2 * circle1.radius);
        circle1.circumference = round(2 * Math.PI * circle1.radius);
        circle1.area = round(Math.PI * Math.pow(circle1.radius, 2));

        Circle circle2 = new Circle();
        circle2.radius = 17.5;
        circle2.diameter = round(2 * circle2.radius);
        circle2.circumference = round(2 * Math.PI * circle2.radius);
        circle2.area = round(Math.PI * Math.pow(circle2.radius, 2));

        // Ausgabe für Circle-Objekte
        System.out.println("circle1.radius = " + round(circle1.radius));
        System.out.println("circle1.diameter = " + circle1.diameter);
        System.out.println("circle1.circumference = " + circle1.circumference);
        System.out.println("circle1.area = " + circle1.area);

        System.out.println("\ncircle2.radius = " + round(circle2.radius));
        System.out.println("circle2.diameter = " + circle2.diameter);
        System.out.println("circle2.circumference = " + circle2.circumference);
        System.out.println("circle2.area = " + circle2.area);

        // cone erstellen
        Cone cone1 = new Cone();
        cone1.base = circle1;
        // höhe eingeben
        cone1.height = 10.3;

        cone1.volume = round((1.0 / 3.0) * Math.PI * Math.pow(circle1.radius, 2) * cone1.height);
        cone1.surfaceArea = round(Math.PI * circle1.radius * (circle1.radius + Math.sqrt(Math.pow(circle1.radius, 2) + Math.pow(cone1.height, 2))));
            // cone 2 erstellen 
        Cone cone2 = new Cone();
        cone2.base = circle2;
        // höhe 
        cone2.height = 10.3;
        cone2.volume = round((1.0 / 3.0) * Math.PI * Math.pow(circle2.radius, 2) * cone2.height);
        cone2.volume = round(((circle2.area * cone2.height) / 3.0));


        // Ausgabe 
        System.out.println("\ncone1.volume = " + cone1.volume);
        System.out.println("cone1.surfaceArea = " + cone1.surfaceArea);

        System.out.println("\ncone2.volume = " + cone2.volume);
        System.out.println("cone2.surfaceArea = " + cone2.surfaceArea);
    }

    // Max 3/ 1000 = 3 Nachkommastellen
    private static double round(double value) {
        return Math.round(value * 1000.0) / 1000.0;
    }
}

class Circle {
    double radius;
    double diameter;
    double circumference;
    double area;
}

class Cone {
    Circle base;
    double height;
    double volume;
    double surfaceArea;
}
