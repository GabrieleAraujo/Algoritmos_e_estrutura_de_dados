import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        System.out.println("Escolha uma dessas operações:\n1 - Ler 5 elementos de um vetor" +
                "\n2 - Ler Ler 5 elementos de Matrizes\n3 - Ler 5 elementos: Matriz B fatorial de A");

        System.out.println("Digite uma opção: ");

        int op = opcao.nextInt();
        switch (op) {
            case 1:
                ler5ElementosVetor();
                break;
            case 2:
                ler5ElementosMatriz();
                break;
            case 3:
                ler5ElementosFatorial();
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    // Exercício 1
    public static void ler5ElementosVetor() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int i, j;
        for (i = 0; i < vetor.length; i++) {
            j = i + 1;
            System.out.println("Entre com o elemento " + j + " do vetor:");
            vetor[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
            ;
        }
    }

    // Exercício 2
    public static void ler5ElementosMatriz() {
        Scanner as = new Scanner(System.in);
        int[] matrizA = new int[5];
        int[] matrizB = new int[matrizA.length];
        int i, j;
        // Matriz A
        for (i = 0; i < matrizA.length; i++) {
            j = i + 1;
            System.out.println("Entre com o elemento " + j + " da matriz A:");
            matrizA[i] = as.nextInt();
            matrizB[i] = matrizA[i] * 3;
        }
        for (i = 0; i < matrizA.length; i++) {
            System.out.println("Elementos da Matriz A:" + matrizA[i]);
            System.out.println("Elementos da Matriz B:" + matrizB[i]);
        }
    }

    // Exercício 3
    public static void ler5ElementosFatorial() {
        Scanner as = new Scanner(System.in);
        int[] matrizA = new int[5];
        int[] matrizB = new int[5];
        int i, j;

        // Entrada de elementos
        for (i = 0; i < 5; i++) {
            j = i + 1;
            System.out.println("Entre com o elemento " + j + " da matriz A:");
            matrizA[i] = as.nextInt();
            int elementoA = matrizA[i];
            //System.out.println("Elementosss:" + elementoA);
            int fatorial = 1;
            for (int l = 1; l <= elementoA; l++) { //calculando fatorial
                fatorial *= l;
            }
            matrizB[i] = fatorial;
        }
        // Exibindo elementos
        for (i = 0; i < 5; i++) {
            //System.out.println("Elementos da Matriz A:" + matrizA[i]);
            j = i + 1;
            System.out.println("Elementos " + j + " da Matriz B:" + matrizB[i]);
        }
    }
}
