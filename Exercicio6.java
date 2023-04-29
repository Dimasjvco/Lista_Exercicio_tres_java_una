//* - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreeendidos por eles.*//

import java.util.Scanner;

public class ExercicioSeis {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número inteiro: ");
    int numero1 = scanner.nextInt();

    System.out.print("Digite outro número inteiro: ");
    int numero2 = scanner.nextInt();

    System.out.println("Os números que estão no intervalo entre eles são: \n");

    while (numero1 > numero2) {
      System.out.printf((numero2 + 1) + " | ");
      numero2 ++;
      if (numero2 + 1 == numero1) 
        break;}

    while (numero2 > numero1) {
      System.out.printf((numero1 + 1) + " | ");
      numero1 ++;
      if (numero1 + 1 == numero2) 
        break;}

    
    scanner.close();
  }
}