//* Faça um programa que leia 5 números e informe a soma e a média dos números. *//

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

    double numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, soma, media;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o primeiro número:");
    numeroUm = scanner.nextDouble();

    System.out.println("Informe o segundo número:");
    numeroDois = scanner.nextDouble();

    System.out.println("Informe o terceiro número:");
    numeroTres = scanner.nextDouble();

    System.out.println("Informe o quarto número:");
    numeroQuatro = scanner.nextDouble();

    System.out.println("Informe o quinto número:");
    numeroCinco = scanner.nextDouble();

    soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco;
    media = (numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco) / 5;

    scanner.close();

    System.out.println("A soma dos números é igual a: " + soma);
    System.out.println("A média dos números é igual a: " + media);






        
    }
}
