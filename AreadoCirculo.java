import java.util.Scanner;

public class AreadoCirculo1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in) ;
       double n = 3.14159;
       double raio, area;
       
       raio = scanner.nextDouble();
        area = (raio*raio)*n;
        System.out.printf("A=%.4f" ,area);
        System.out.println();
        scanner.close();
    }
}
