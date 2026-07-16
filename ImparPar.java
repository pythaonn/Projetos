import java.util.Scanner;
public class ImparPar {
    public static Scanner ler = new Scanner(System.in);

    public static void parImpar() {
        int num = -1;
        while (num != 0) {
            System.out.println("Digite um numero: ");
            num = ler.nextInt();
            if (num % 2 == 0) {
                System.out.println("O numero " + num + " é par.");
            } else {
                System.out.println("O numero " + num + " é impar.");
            }
        }
    }
   public static void main(String[] args) {
        parImpar();
    }
}
