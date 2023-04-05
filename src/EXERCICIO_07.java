import java.util.Scanner;

public class EXERCICIO_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        int anoNascimento;
        int anoAdmissao;
        int codigo;
        int tempoEmpresa;
        int anoAtual = 2023;

        System.out.println("Informe seu código:");
        codigo = entrada.nextInt();
        System.out.println("Informe seu ano de nascimento:");
        anoNascimento = entrada.nextInt();
        System.out.println("Informe o ano de entrada na empresa:");
        anoAdmissao = entrada.nextInt();
        idade = anoAtual - anoNascimento;
        tempoEmpresa = anoAtual - anoAdmissao;
        if (idade>=65){
            System.out.println("Pode requer a aposentadoria");
        }
        else if (tempoEmpresa>=30) {
            System.out.println("Pode requer a aposentadoria");
        }
        else if (idade>=60 && tempoEmpresa>=25) {
            System.out.println("Pode requer a aposentadoria");
        }
        else {
            System.out.println("Não pode requer a aposentadoria");
        }

    }
}
