import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome: Tauã Araújo");
        System.out.println("RA: 1261938596");
        System.out.println();

        System.out.print("Digite o número: ");
        int n = ler.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int resultado = n * multiplicador;
            System.out.println(n + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

        ler.close();
    }
}