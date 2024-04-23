import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tipoCobaias;
        int n, quantidadeCobaias, somaCoelhos = 0, somaRatos = 0, somaSapos = 0, somaCobaias;
        String entrada;
        String[] separado;
        
        n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n ; i++){
            entrada  = scanner.nextLine();
            separado = entrada.split(" ");
            quantidadeCobaias = Integer.parseInt(separado[0]);
            tipoCobaias = separado[1].toUpperCase().charAt(0);

            if(quantidadeCobaias >= 1 && quantidadeCobaias <=15 && tipoCobaias == 'C'){

                somaCoelhos+= quantidadeCobaias;

            }else if(quantidadeCobaias >= 1 && quantidadeCobaias <=15 && tipoCobaias == 'R'){

                somaRatos+= quantidadeCobaias;
            }else if(quantidadeCobaias >= 1 && quantidadeCobaias <=15 && tipoCobaias == 'S'){

                somaSapos+= quantidadeCobaias;
            }
        }

        somaCobaias = somaCoelhos + somaRatos + somaSapos;
        double percentualCoelhos = ((double) somaCoelhos /  (double) somaCobaias) *100;
        double percentualRatos =  ((double) somaRatos /  (double) somaCobaias) *100;
        double percentualSapos =  ((double) somaSapos /  (double) somaCobaias) * 100;


        System.out.println("Total: "+somaCobaias+" cobaias");
        System.out.println("Total de coelhos: "+somaCoelhos);
        System.out.println("Total de ratos: "+somaRatos);
        System.out.println("Total de sapos: "+somaSapos);
        System.out.println("Percentual de coelhos: "+String.format("%.2f",percentualCoelhos).replace(',', '.')+" %");
        System.out.println("Percentual de ratos: "+String.format("%.2f",percentualRatos).replace(',', '.')+" %");
        System.out.println("Percentual de sapos: "+String.format("%.2f",percentualSapos).replace(',', '.')+" %");


        scanner.close();
    }
}
