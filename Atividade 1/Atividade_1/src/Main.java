import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        System.out.println("Escolha uma dessas operações:\n1 - Calcular Média ponderada\n2 - Desconto no Preço de Produto" +
                "\n3 - Calcular Salário Final\n4 - Calcular Novo Peso\n5 - Calcular Área do Trapézio" +
                "\n6 - Calcular Área do Losango\n7 - Calcular Idade\n8 - Calcular Esfera\n9 - Calcular Diagonais do Polígono" +
                "\n10 - Converter Moedas\n11 - Calcular Produto de Dois Números\n12 - Calcular Média de Três Números" +
                "\n13 - Calcular Raízes de Equação do 2º Grau\n14 - Calcular Diferença entre Dois Números" +
                "\n15 - Determinar Maior e Menor Número\n16 - Calcular distância entre Pontos P(X1,Y1) e Q(X2,Y2)\n17 - Calcular IMC" +
                "\n18 - Idade para Votar e tirar CNH\n19 - Calcular pagamento de produto\n20 - Mostrar Tabuada");

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
            case 11:
                calcularProduto();
                break;
            case 12:
                calcularMediaTresNumeros();
                break;
            case 13:
                calcularEquacaoSegundoGrau();
                break;
            case 14:
                calcularDiferenca();
                break;
            case 15:
                determinarMaiorMenor();
                break;
            case 16:
                calcularDistanciaEntrePontos();
                break;
            case 17:
                calcularIMC();
                break;
            case 18:
                verificarIdadeParaVotarECNH();
                break;
            case 19:
                calcularValorAPagar();
                break;
            case 20:
                mostrarTabuada();
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

    // Exercício 11
    public static void calcularProduto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        double produto = num1 * num2;
        System.out.println("O produto dos números é: " + produto);
    }

    // Exercício 12
    public static void calcularMediaTresNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = sc.nextDouble();
        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média dos números é: " + media);
    }

    // Exercício 13
    public static void calcularEquacaoSegundoGrau() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
        } else {
            System.out.println("Não é possível calcular as raízes reais para esta equação.");
        }
    }

    // Exercício 14
    public static void calcularDiferenca() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        double diferenca;
        if (num1 > num2) {
            diferenca = num1 - num2;
        } else {
            diferenca = num2 - num1;
        }
        System.out.println("A diferença entre os números é: " + diferenca);
    }

    // Exercício 15
    public static void determinarMaiorMenor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();
        int maior = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }


    // Exercício 16 - Fórmula= dAB=raiz((x_2-x_1)^2+(y_2-y_1)^2)
    public static void calcularDistanciaEntrePontos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as coordenadas do ponto P (X1,Y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Digite as coordenadas do ponto Q (X2,Y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os pontos P e Q é: " + distancia);
    }

    // Exercício 17
    public static void calcularIMC() {
        Scanner sc = new Scanner(System.in);
        // letra a - IMC
        System.out.println("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        // letra b - Classificação do IMC
        if (imc < 19.99) {
            System.out.println("Classificação: Magreza");
        } else if (imc >= 20 && imc <= 24.99) {
            System.out.println("Classificação: Normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Classificação: Excesso de Peso");
        } else if (imc >= 30 && imc <= 35) {
            System.out.println("Classificação: Obesidade");
        } else {
            System.out.println("Classificação: Grande Obesidade");
        }
    }

    // Exercício 18
    public static void verificarIdadeParaVotarECNH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        // Calculando a idade
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade + " anos.");

        // Verificando se a pessoa tem idade para votar e obter CNH
        if (idade >= 16) {
            System.out.println("Você tem idade para votar.");
        } else {
            System.out.println("Você ainda não tem idade para votar.");
        }

        if (idade >= 18) {
            System.out.println("Você tem idade para obter a Carteira de Habilitação (CNH).");
        } else {
            System.out.println("Você ainda não tem idade para obter a Carteira de Habilitação (CNH).");
        }}


    // Exercício 19
    public static void calcularValorAPagar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço normal de etiqueta do produto: ");
        double precoEtiqueta = sc.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - À vista em dinheiro ou cheque (recebe 20% de desconto)");
        System.out.println("2 - À vista no cartão de crédito (recebe 10% de desconto)");
        System.out.println("3 - Em duas vezes (preço normal da etiqueta sem juros)");
        System.out.println("4 - Em três vezes (preço normal de etiqueta mais juros de 5%)");
        int escolha = sc.nextInt();

        double valorAPagar;

        switch (escolha) {
            case 1:
                valorAPagar = precoEtiqueta * 0.8; // Desconto de 20%
                break;
            case 2:
                valorAPagar = precoEtiqueta * 0.9; // Desconto de 10%
                break;
            case 3:
                valorAPagar = precoEtiqueta / 2; // Preço normal em duas vezes sem juros
                System.out.println("O valor parcelado é: 2x de R$" + valorAPagar);
                break;
            case 4:
                valorAPagar = (precoEtiqueta / 3 ) * 1.05; // Preço normal mais juros de 5%
                System.out.println("O valor parcelado é: 3x de R$" + valorAPagar + " incluindo 5% de juros");
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O valor a ser pago é: R$" + valorAPagar);
    }

    // Exercício 20
    public static void mostrarTabuada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("De qual número você quer a Tabuada? ");
        int num = sc.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

}

