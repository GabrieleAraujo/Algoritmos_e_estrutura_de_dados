import java.util.Scanner;
import java.util.Stack;

public class DecimalParaBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        int decimal = scanner.nextInt();
        String binario = converterParaBinario(decimal);
        System.out.println("O número binário é: " + binario);
    }

    public static String converterParaBinario(int decimal) {
        Stack<Integer> pilha = new Stack<>();
        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }
        StringBuilder binario = new StringBuilder();
        while (!pilha.isEmpty()) {
            binario.append(pilha.pop());
        }
        return binario.toString();
    }
}

