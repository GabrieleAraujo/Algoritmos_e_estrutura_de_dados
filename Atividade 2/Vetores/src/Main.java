import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        System.out.println("Escolha uma dessas operações:\n1 - Ler 5 elementos de um vetor" +
                "\n2 - Ler 5 elementos de Matrizes\n3 - Ler 5 elementos: Matriz B fatorial de A" +
                "\n4 - Subtrair vetores\n5 - Quadrado de Elementos\n6 - Contar Negativos" +
                "\n7 - Substituir Cinco por Um\n8 - Ordenar Elementos\n9 - Produto Escalar" +
                "\n10 - Mostrar Números Maiores que Vinte\n11 - Mostrar Números Primos");
        int op;
        do {
            System.out.print("Digite uma opção (0 para sair): ");
            op = opcao.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    ler5ElementosVetor();
                    break;
                case 2:
                    ler5ElementosMatriz();
                    break;
                case 3:
                    ler5ElementosFatorial();
                    break;
                case 4:
                    lerVetoresSubtrair();
                    break;
                case 5:
                    quadradoDeElementos();
                    break;
                case 6:
                    contarNegativos();
                    break;
                case 7:
                    substituirCincoPorUm();
                    break;
                case 8:
                    ordenarElementos();
                    break;
                case 9:
                    produtoEscalar();
                    break;
                case 10:
                    mostrarNumerosMaioresQueVinte();
                    break;
                case 11:
                    mostrarNumerosPrimos();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 0);
        opcao.close();
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
        int[] A = new int[5];
        int[] B = new int[A.length];
        int i, j;
        // Matriz A
        for (i = 0; i < A.length; i++) {
            j = i + 1;
            System.out.println("Entre com o elemento " + j + " da matriz A:");
            A[i] = as.nextInt();
            B[i] = A[i] * 3;
        }
        for (i = 0; i < A.length; i++) {
            System.out.println("Elementos da Matriz A:" + A[i]);
            System.out.println("Elementos da Matriz B:" + B[i]);
        }
    }

    // Exercício 3
    public static void ler5ElementosFatorial() {
        Scanner as = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int i, j;

        // Entrada de elementos
        for (i = 0; i < 5; i++) {
            j = i + 1;
            System.out.println("Entre com o elemento " + j + " da matriz A:");
            A[i] = as.nextInt();
            int elementoA = A[i];
            //System.out.println("Elementosss:" + elementoA);
            int fatorial = 1;
            for (int l = 1; l <= elementoA; l++) { //calculando fatorial
                fatorial *= l;
            }
            B[i] = fatorial;
        }
        // Exibindo elementos
        for (i = 0; i < 5; i++) {
            //System.out.println("Elementos da Matriz A:" + A[i]);
            j = i + 1;
            System.out.println("Elementos " + j + " da Matriz B:" + B[i]);
        }
    }

    // Exercício 4
    public static void lerVetoresSubtrair() {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

        int i, j;

        System.out.println("Digite 5 elementos para o vetor A:");
        for (i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Digite 5 elementos para o vetor B:");
        for (i = 0; i < 5; i++) {
            B[i] = scanner.nextInt();
            C[i] = A[i] - B[i];
        }
        // Exibindo elementos
        for (i = 0; i < 5; i++) {
            j = i + 1;
            System.out.println("Elementos " + j + " da Matriz C:" + C[i]);
        }
    }

    // Exercício 5
    public static void quadradoDeElementos() {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];

        int i,j;
        System.out.println("Digite 5 elementos para o vetor A:");
        for (i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
            B[i] = A[i] * A[i];
        }
        // Exibindo elementos
        for (i = 0; i < 5; i++) {
            j = i + 1;
            System.out.println("Elementos " + j + " da Matriz B:" + B[i]);
        }
    }

    // Exercício 6
    public static void contarNegativos() {
        Scanner scanner = new Scanner(System.in);
        int[] elementos = new int[6];
        int countNegativos = 0;
        int i;

        System.out.println("Digite 6 elementos para o vetor:");
        for (i = 0; i < 6; i++) {
            elementos[i] = scanner.nextInt();
            if (elementos[i] < 0) {
                countNegativos++;
            }
        }
        System.out.println("Número de elementos negativos: " + countNegativos);
    }

    // Exercício 7
    public static void substituirCincoPorUm() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int i;
        System.out.println("Digite 10 números para o vetor:");
        for (i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Vetor original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            if (numeros[i] == 5) {
                numeros[i] = 1;
            }
        }
        System.out.println("Vetor modificado (5 substituídos por 1):");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Exercício 8
    public static void ordenarElementos() {
        Scanner scanner = new Scanner(System.in);
        int[] elementos = new int[5];
        int i;

        System.out.println("Digite 5 elementos para o vetor:");
        for (i = 0; i < 5; i++) {
            elementos[i] = scanner.nextInt();
        }
        Arrays.sort(elementos);
        System.out.println("Elementos ordenados: ");
        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        scanner.close();
    }

    // Exercício 9
    public static void produtoEscalar() {
        Scanner scanner = new Scanner(System.in);
        int[] u = new int[10];
        int[] v = new int[10];
        int produto = 0;
        int i;
        System.out.println("Digite 10 elementos para o vetor u:");
        for (i = 0; i < 10; i++) {
            u[i] = scanner.nextInt();
        }
        System.out.println("Digite 10 elementos para o vetor v:");
        for (i = 0; i < 10; i++) {
            v[i] = scanner.nextInt();
            produto += u[i] * v[i];
        }
        System.out.println("Produto escalar de u e v: " + produto);
    }

    // Exercício 10
    public static void mostrarNumerosMaioresQueVinte() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean temSuperior = false;

        System.out.println("Digite 10 elementos do tipo inteiro:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 20) {
                System.out.println("Número superior a vinte: " + numeros[i] + " na posição " + i);
                temSuperior = true;
            }
        }
        if (!temSuperior) {
            System.out.println("Não existem números superiores a vinte.");
        }
    }

    // Exercício 11
    public static void mostrarNumerosPrimos() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 elementos para o vetor:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (isPrime(numeros[i])) {
                System.out.println("Número primo: " + numeros[i] + " na posição " + i);
            }
        }
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
