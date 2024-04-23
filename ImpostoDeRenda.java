import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, valorPago;

        salario = scanner.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");            
        }else if( salario > 2000 && salario <= 3000){
            valorPago = (salario - 2000) * 0.08;
            System.out.println("R$ "+String.format("%.2f",valorPago).replace(',', '.'));
        }else if (salario > 3000 && salario <=4500) {
            valorPago =  (1000 * 0.08) + ((salario - 3000) * 0.18);
            System.out.println("R$ " + String.format("%.2f",valorPago).replace(',', '.'));
        }else if (salario > 4500){
            valorPago = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
            System.out.println("R$ " + String.format("%.2f",valorPago).replace(',', '.'));
        }

        scanner.close();
    }
}
