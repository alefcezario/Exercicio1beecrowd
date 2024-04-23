import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double codigoItem, quantidadeItem, valorTotal;
        int itentificacaoItem;
        String entrada;
        String[] separado;
        double [] precoProduto = {4.00, 4.50, 5.00, 2.00, 1.50};

        System.out.println("Informe 2 valores separados por espaço: ");
        entrada  = scanner.nextLine();

        separado = entrada.split(" ");

        codigoItem = Double.parseDouble(separado[0]);
        quantidadeItem = Double.parseDouble(separado[1]);

        itentificacaoItem = (int) codigoItem - 1;
    
        valorTotal = precoProduto[itentificacaoItem] * quantidadeItem;

        System.out.println("Total: R$ "+String.format("%.2f",valorTotal));

        scanner.close();
    }
}