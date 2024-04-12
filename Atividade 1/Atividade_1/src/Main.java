import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        System.out.println("Escolha uma dessas operações:\n1 - Calcular Média ponderada\n2 - Desconto no Preço de Produto" +
                "\n3 - Calcular Salário Final\n4 - Calcular Novo Peso\n5 - Calcular Área do Trapézio" +
                "\n6 - Calcular Área do Losango\n7 - Calcular Idade\n8 - Calcular Esfera\n9 - Calcular Diagonais do Polígono" +
                "\n10 - Converter Moedas");

        System.out.println("Digite uma opção: ");

        int op = opcao.nextInt();
        switch (op) {
            case 1:
                calcularMediaPonderada();
                break;
            case 2:
                calcularPrecoProduto();
                break;
            case 3:
                calcularSalarioFinal();
                break;
            case 4:
                calcularNovoPeso();
                break;
            case 5:
                calcularAreaTrapezio();
                break;
            case 6:
                calcularAreaLosango();
                break;
            case 7:
                calcularIdade();
                break;
            case 8:
                calcularEsfera();
                break;
            case 9:
                calcularDiagonaisPoligono();
                break;
            case 10:
                converterMoedas();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // Exercício 1
    public static void calcularMediaPonderada() {
        float nota1, nota2, mediaponderada;
        Scanner notas = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        nota1 = notas.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2 = notas.nextFloat();
        mediaponderada = (nota1 * 2 + nota2 * 3) / 10;
        System.out.println("Média ponderada: " + mediaponderada);
    }

    // Exercício 2
    public static void calcularPrecoProduto() {
        float price, new_price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        price = sc.nextFloat();
        new_price = (float) (price - (price * 0.25));
        System.out.println("O novo preço é: " + new_price);
    }

    // Exercício 3
    public static void calcularSalarioFinal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor das vendas: ");
        double vendas = sc.nextDouble();
        double comissao = vendas * 0.04;
        double salarioFinal = salarioFixo + comissao;
        System.out.println("Comissão: R$" + comissao);
        System.out.println("Salário Final: R$" + salarioFinal);
    }

    // Exercício 4
    public static void calcularNovoPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();
        double novoPesoEngordar = peso * 1.15;
        double novoPesoEmagrecer = peso * 0.80;
        System.out.println("Novo peso se engordar: " + novoPesoEngordar + " kg");
        System.out.println("Novo peso se emagrecer: " + novoPesoEmagrecer + " kg");
    }

    // Exercício 5
    public static void calcularAreaTrapezio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base maior: ");
        double baseMaior = sc.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        double baseMenor = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do trapézio: " + area);
    }

    // Exercício 6
    public static void calcularAreaLosango() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal maior: ");
        double diagonalMaior = sc.nextDouble();
        System.out.println("Digite o valor da diagonal menor: ");
        double diagonalMenor = sc.nextDouble();
        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("Área do losango: " + area);
    }

    // Exercício 7
    public static void calcularIdade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeSemanas = idadeDias / 7;
        System.out.println("Idade em anos: " + idadeAnos);
        System.out.println("Idade em meses: " + idadeMeses);
        System.out.println("Idade em dias: " + idadeDias);
        System.out.println("Idade em semanas: " + idadeSemanas);
    }

    // Exercício 8
    public static void calcularEsfera() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        double comprimento = 2 * Math.PI * raio;
        double area = 4 * Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Área da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
    }

    // Exercício 9
    public static void calcularDiagonaisPoligono() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de lados do polígono convexo: ");
        int numLados = sc.nextInt();
        int diagonais = (numLados * (numLados - 3)) / 2;
        System.out.println("Número de diagonais do polígono: " + diagonais);
    }

    // Exercício 10
    public static void converterMoedas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em reais que deseja converter: ");
        double valorEmReais = sc.nextDouble();
        double dolares = valorEmReais / 5.0;
        double marcoAlemao = valorEmReais / 7.0;
        double euros = valorEmReais / 6.0;
        double libras = valorEmReais / 7.5;
        System.out.println("Valor em dólares: $" + dolares);
        System.out.println("Valor em marcos alemães: " + marcoAlemao + " DM");
        System.out.println("Valor em euros: " + euros + " €");
        System.out.println("Valor em libras esterlinas: £" + libras);
    }
}