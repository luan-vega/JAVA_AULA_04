import java.util.Scanner;

public class EXERCICIO_08 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            int numero, op, resultado;
            System.out.println("Informe um número qualquer:");
            numero = entrada.nextInt();

            for (op = 1; op <= 10; op++){
                resultado = numero * op;
                System.out.println(numero + " X " +
                        op + " = " +resultado);
            }
        }

}
