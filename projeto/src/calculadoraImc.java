import java.util.Scanner;

public class calculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu imc é: %.2f%n", imc);

        scanner.close();

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        }
        else if (imc <= 24.9) {
            System.out.println("Você está com o peso adequado.");
        }
        else if (imc <= 29.9) {
            System.out.println("Você está acima do Peso.");
        }
        else {
            System.out.println("Você está com obesidade.");
        }
    }
}
