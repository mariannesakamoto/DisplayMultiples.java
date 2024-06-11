import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        // Crie um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite que o usuário insira um número
        System.out.println("Escolha um número:");

        // Obtenha o número inserido pelo usuário
        int numero = scanner.nextInt();

        // Use um loop for para exibir os múltiplos do número de 1 a 12
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + " = " + resultado);
        }
        
        // Feche o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}