package A1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final double N = 3.14159;

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = N * (raio * raio);
        String formatArea = String.format("%.4f", area);

        System.out.println("A=" + formatArea);
    }
}
