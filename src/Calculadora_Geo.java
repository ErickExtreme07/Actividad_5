import java.util.Scanner;

public class Calculadora_Geo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA GEOMETRICA");
        // Menú
        System.out.println("---Figuras Geometricas---");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");

        System.out.print("Escriba el numero de la figura que desea calcular: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Circulo(scanner);
                break;
            case 2:
                Cuadrado(scanner);
                break;
            case 3:
                Triangulo(scanner);
                break;
            case 4:
                Rectangulo(scanner);
                break;
            case 5:
                Pentagono(scanner);
                break;
            default:
                System.out.println("Opción Invalida");
        }

        scanner.close();
    }

    // Funciones para calcular el área y el perímetro
    private static void Circulo(Scanner scanner) {
        System.out.println("Ingresar el radio del círculo:");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    private static void Cuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    private static void Triangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base * 3; // Perímetro de un triángulo equilátero

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }

    private static void Rectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    private static void Pentagono(Scanner scanner) {
        System.out.println("Ingrese la longitud del lado del pentágono:");
        double lado = scanner.nextDouble();

        double apotema = lado / (2 * Math.tan(Math.PI / 5)); // Longitud de la apotema
        double area = (5 * lado * apotema) / 2; // Fórmula del área de un pentágono regular
        double perimetro = 5 * lado;

        System.out.println("Área del pentágono: " + area);
        System.out.println("Perímetro del pentágono: " + perimetro);
    }
}