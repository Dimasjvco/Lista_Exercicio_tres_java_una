import java.util.Scanner;

class exercicio3lista3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, estadocivil, sexo, resultadoFinal = "";
        double salario;
        int idade;

        boolean repetirCadastro = true;

        do {
            while (true) {
                System.out.println("Escreva seu nome (maior que 3 caracteres):");
                nome = scanner.next();
                if (nome.length() > 3) {
                    break;
                }
                System.out.println("Nome incorreto, digite mais que 3 caracteres em seu nome");
            }

            while (true) {
                System.out.println("Escreva seu sexo('M' ou 'F'):");
                sexo = scanner.next();
                if (sexo.length() == 1 && (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'F')) {
                    break;
                }
                System.out.println("Sexo invalido, digite 'M' ou 'F' ");
            }

            while (true) {
                System.out.println("Escreva seu estado civil ('s', 'c', 'v', 'd' ):");
                estadocivil = scanner.next();
                if (estadocivil.length() == 1 && (estadocivil.charAt(0) == 's' || estadocivil.charAt(0) == 'c' || estadocivil.charAt(0) == 'v' || estadocivil.charAt(0) == 'd')) {
                    break;
                }
                System.out.println("Estado Civil invalido, Digite 's', 'c', 'v' ou 'd' ");
            }

            while (true) {
                System.out.println("Escreva seu salario:");
                salario = scanner.nextDouble();
                if (salario > 0) {
                    break;
                }
                System.out.println("Salario Invalido, digite um valor maior que 0");
            }

            while (true) {
                System.out.println("Escreva sua idade(0 a 150):");
                idade = scanner.nextInt();
                if (idade >= 0 && idade <= 150) {
                    break;
                }
                System.out.println("Idade Incorreta, digite um valor de 0 a 150");
            }

            System.out.println("Revise seus dados: Nome:" + nome + ", Sexo:" + sexo + ", Estado Civil:" + estadocivil + ", Idade:" + idade + ", Salario:" + salario + ", Digite 'Sim' Caso seus dados estejam corretos, se estiverem errados digite nao.");
            resultadoFinal = scanner.next();

            if (resultadoFinal.equalsIgnoreCase("sim")) {
                System.out.println("Cadastro finalizado!");
            } else {
                System.out.println("Opção inválida. Cadastro não finalizado.");
            }

            System.out.println("Deseja repetir o cadastro? (sim/não)");
            String respostaRepetir = scanner.next();
            if (respostaRepetir.equalsIgnoreCase("nao")) {
                repetirCadastro = false;
            }
            scanner.close();

        } while (repetirCadastro);
    }

}
