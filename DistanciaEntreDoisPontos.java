import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2;
        String entrada1, entrada2;
        String[] separado1, separado2;
    
        entrada1 = scanner.nextLine();
        separado1 = entrada1.split(" ");

        x1 = Double.parseDouble(separado1[0]);
        y1 = Double.parseDouble(separado1[1]);

        entrada2 = scanner.nextLine();
        separado2 = entrada2.split(" ");

        x2 = Double.parseDouble(separado2[0]);
        y2 = Double.parseDouble(separado2[1]);
      
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.println(String.format("%.4f",distancia).replace(',', '.'));

        scanner.close();
    }

}
