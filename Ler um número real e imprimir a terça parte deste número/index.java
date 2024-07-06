import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int tercaParte = num / 3;

        System.out.println("A terça parte de " + num + " é: " + tercaParte);
    }
}