import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma dessas operações:\n1 - Calcular Média ponderada\n2 - Desconto no Preço de Produto" +
                "\n3 - Calcular Salário Final com Comissão\n4 - Calcular Novo Peso\n5 - Calcular Área do Trapézio" +
                "\n6 - Calcular Área do Losango\n7 - Calcular Idade\n8 - Calcular Esfera\n9 - Calcular Diagonais do Polígono" +
                "\n10 - Converter Moedas\n11 - Calcular Produto de Dois Números\n12 - Calcular Média de Três Números" +
                "\n13 - Calcular Raízes de Equação do 2º Grau\n14 - Calcular Diferença entre Dois Números" +
                "\n15 - Determinar Maior e Menor Número\n16 - Calcular distância entre Pontos P(X1,Y1) e Q(X2,Y2)\n17 - Calcular IMC" +
                "\n18 - Idade para Votar e tirar CNH\n19 - Calcular pagamento de produto\n20 - Mostrar Tabuada" +
                "\n21 - Mostrar números ímpares entre um intervalo\n22 - Atendimento Hospitalar Universitário do Brasil Saúde S.A" +
                "\n23 - Responder questionário Cinema\n24 - Folha de Pagamento\n25 - Calcular volume da esfera (por meio do raio)\n26 - Converter F para °C" +
                "\n27 - Método Fibonacci\n28 - Mostrar todos os números divisíveis por 4" +
                "\n29 - Média aritmética dos números pares entre 13 e 73\n31 - Levantamento de candidatos para preenchimento de vagas" +
                "\n0 - Sair");

        int op;
        do {
            System.out.print("Digite uma opção (0 para sair): ");
            op = scanner.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    calcularMediaPonderada();
                    break;
                case 2:
                    calcularPrecoProduto();
                    break;
                case 3:
                    calcularComissao();
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
                case 21:
                    mostarNumerosImpares();
                    break;
                case 22:
                    atendimentoHospitalar();
                    break;
                case 23:
                    feedbackCinema();
                    break;
                case 24:
                    salarioEmpresa();
                    break;
                case 25:
                    calcularVolumeEsfera();
                    break;
                case 26:
                    converterFahrenheitParaCelsius();
                    break;
                case 27:
                    calcularFibonacci();
                    break;
                case 28:
                    mostrarDivisiveisPorQuatro();
                    break;
                case 29:
                    calcularMediaPares13e73();
                    break;
                case 31:
                    preenchimentoVagas();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 0);

        scanner.close();
    }


    // Exercício 1
    public static void calcularMediaPonderada() {
        float nota1, nota2, mediaponderada;
        Scanner notas = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        nota1 = notas.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2 = notas.nextFloat();
        mediaponderada = ((nota1 * 2) + (nota2 * 3)) / 5;
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
    public static void calcularComissao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor das vendas: ");
        double vendas = sc.nextDouble();
        double comissao = vendas * 0.04;
        System.out.println("Comissão: R$" + comissao);
        double salarioFinal = salarioFixo + comissao;
        System.out.println("Salário Final: R$" + salarioFinal);
    }

    // Exercício 4
    public static void calcularNovoPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();
        double novoPesoEngordar = peso * 1.15;
        System.out.println("Novo peso se engordar 15%: " + novoPesoEngordar + " kg");
        double novoPesoEmagrecer = peso * 0.80;
        System.out.println("Novo peso se emagrecer 20%: " + novoPesoEmagrecer + " kg");
    }

    // Exercício 5 - Fórmula: A = ((B+b)*h)/2
    public static void calcularAreaTrapezio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base maior (B): ");
        double baseMaior = sc.nextDouble();
        System.out.println("Digite o valor da base menor (b): ");
        double baseMenor = sc.nextDouble();
        System.out.println("Digite o valor da altura (h): ");
        double altura = sc.nextDouble();
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("Área do trapézio: " + area);
    }

    // Exercício 6 - Fórmula: A = (D*d)/2
    public static void calcularAreaLosango() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal maior (D): ");
        double diagonalMaior = sc.nextDouble();
        System.out.println("Digite o valor da diagonal menor (d): ");
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
        System.out.println("Idade em anos: " + idadeAnos);
        int idadeMeses = idadeAnos * 12; //meses
        System.out.println("Idade em meses: " + idadeMeses);
        int idadeDias = idadeAnos * 365; //dias
        System.out.println("Idade em dias: " + idadeDias);
        int idadeSemanas = idadeAnos * 52; //idade de dias/semanas
        System.out.println("Idade em semanas: " + idadeSemanas);
    }

    // Exercício 8
    public static void calcularEsfera() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        double comprimento = 2 * Math.PI * raio; //Comprimento da esfera = 2*pi*raio
        System.out.println("Comprimento da esfera: " + comprimento);
        double area = 4 * Math.PI * Math.pow(raio, 2); //área da esfera = 4*pi*(raio^2)
        System.out.println("Área da esfera: " + area);
        double volume = (4.0 / 3) * Math.PI * Math.pow(raio, 3); //volume = 4*pi*(r^3/3)
        System.out.println("Volume da esfera: " + volume);
    }

    // Exercício 9 - Fórmula: d = (n(n-3))/2
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
        double dolares = valorEmReais * 0.1893;
        System.out.println("Valor em dólares: $" + dolares);
        double marcoAlemao = valorEmReais * 2.79195;
        System.out.println("Valor em marcos alemães: " + marcoAlemao + " DEM");
        double euros = valorEmReais * 0.178;
        System.out.println("Valor em euros: " + euros + " EUR");
        double libras = valorEmReais * 0.1521;
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

    // Exercício 13 - Fórmula: a*x^2 + b*x + c = 0 / delta = b^2 -4*a*c
    public static void calcularEquacaoSegundoGrau() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta >= 0) { // raizes: x = (-b +- raiz(delta))/(2*a)
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
        }
        else {
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
        System.out.println("O maior número é: " + maior);
        int menor = Math.min(num1, Math.min(num2, num3));
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
        System.out.println("De qual número você quer ver a Tabuada? ");
        int num = sc.nextInt();
        System.out.println("Tabuada do " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Exercício 21
    public static void mostarNumerosImpares() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número do intervalo:");
        int Num1 = scanner.nextInt();
        System.out.println("Digite o segundo número do intervalo:");
        int Num2 = scanner.nextInt();

        // Garantindo que o 1° número seja menor que o 2°
        if (Num1 > Num2) {
            int temp = Num1;
            Num1 = Num2;
            Num2 = temp;
        }
        System.out.println("Números ímpares no intervalo de " + Num1 + " a " + Num2 + ":");
        for (int i = Num1; i <= Num2; i++) {
            if ((i & 1) == 1) { // Se o número for ímpar (compara cada bit individualmente e
                // tem um bit definido apenas se ambos os números tiverem o bit iguais)
                System.out.print(i + ", ");
            }
        }
    }

    // Exercício 22
    public static void atendimentoHospitalar() {
        //ARMAZENAR VALORES DO LOOP
        // Contagem - Quantidades crianças, adolescentes e adultas que foram atendidas
        int criancas = 0;
        int adolescentes = 0;
        int adultos = 0;

        // Soma -  idade das crianças ; adultos ; sexo
        int somaIdadeCriancas = 0;
        int somaIdadeAdultos = 0;
        int somaSexoFeminino = 0;
        int somaSexoMasculino = 0;

        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        // Loop principal para atendimento dos pacientes
        do {
            // Nome do paciente
            System.out.print("Informe o nome do paciente (ou 0 para finalizar): ");
            String nome = entrada.nextLine();
            // Código de fim de programa
            if (nome.equals("0")) {
                break;
            }
            // Idade do paciente
            System.out.print("Informe a idade do paciente: ");
            int idade = entrada.nextInt();
            entrada.nextLine();
            // Sexo do paciente
            System.out.print("Informe o sexo do paciente (M ou F): ");
            String sexoPaciente = entrada.nextLine();

            // Contagem por sexo
            if (sexoPaciente.equals("M")) {
                somaSexoMasculino++;
            } else if (sexoPaciente.equals("F")) {
                somaSexoFeminino++;
            }

            // Classificação por idade e sexo
            if (idade <= 12) {
                criancas++;
                somaIdadeCriancas += idade;
            } else if (idade <= 18) {
                adolescentes++;
            } else {
                adultos++;
                somaIdadeAdultos += idade;
            }
            System.out.println("Atendimento de " + nome + " concluído!");
        } while (true);
        System.out.println("\n\n---- Resultado de pacientes atendidos ----");
        System.out.println("Crianças: " + criancas);
        System.out.println("Adolescentes: " + adolescentes);
        System.out.println("Adultos: " + adultos);

        // médias de idade
        float mediaIdadeCriancas = (float) somaIdadeCriancas / criancas;
        System.out.println("Média de idade das crianças: " + String.format("%.2f", mediaIdadeCriancas));
        float mediaIdadeAdultos = (float) somaIdadeAdultos / adultos;
        System.out.println("Média de idade dos adultos: " + String.format("%.2f", mediaIdadeAdultos));

        System.out.println("Total de pacientes do sexo feminino: " +  somaSexoFeminino);
        System.out.println("Total de pacientes do sexo masculino: " + somaSexoMasculino);
    }

    // Exercício 23
    public static void feedbackCinema(){
        // Armazenar
        int quantidadeOtimo = 0, quantidadeBom = 0, quantidadeRegular = 0, quantidadeRuim = 0, quantidadePessimo = 0;
        int maiorIdadePessimo = 0, maiorIdadeOtimo = 0, maiorIdadeRuim = 0;
        Scanner scanner = new Scanner(System.in);
        int totalEspectadores = 5;  // Total de espectadores

        for (int i = 0; i < totalEspectadores; i++) {
            System.out.print("Informe a idade do espectador " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            System.out.print("Informe a opinião do espectador " + (i + 1) + " (A, B, C, D ou E): ");
            char opiniao = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();

            switch (opiniao) {
                case 'a':
                    quantidadeOtimo++;
                    if (idade > maiorIdadeOtimo) maiorIdadeOtimo = idade;
                    break;
                case 'b':
                    quantidadeBom++;
                    break;
                case 'c':
                    quantidadeRegular++;
                    break;
                case 'd':
                    quantidadeRuim++;
                    if (idade > maiorIdadeRuim) maiorIdadeRuim = idade;
                    break;
                case 'e':
                    quantidadePessimo++;
                    if (idade > maiorIdadePessimo) maiorIdadePessimo = idade;
                    break;
                default:
                    System.out.println("Opinião inválida. Por favor, responda com A, B, C, D ou E.");
                    i--;
                    break;
            }
        }

        System.out.println("\n---- Resultado do Questionário ----");
        System.out.println("Quantidade de respostas Ótima: " + quantidadeOtimo);

        if (quantidadeBom != 0) {
            float diferencaPercentualBomRegular = ((float) (quantidadeBom - quantidadeRegular) / quantidadeBom) * 100;
            System.out.println("Diferença percentual entre respostas Bom e Regular: " + String.format("%.2f", diferencaPercentualBomRegular) + "%");
        }

        float porcentagemPessimo = ((float) quantidadePessimo / totalEspectadores) * 100;
        System.out.println("Porcentagem de respostas Péssimo: " + String.format("%.2f", porcentagemPessimo) + "%");

        int diferencaMaiorIdade = Math.abs(maiorIdadeOtimo - maiorIdadeRuim);
        System.out.println("Diferença entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim: " + diferencaMaiorIdade);
    }

    // Exercício 24
    public static void salarioEmpresa() {
        final double SALARIO_MINIMO = 622.00;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe os dados do funcionário " + i + ":");

            System.out.print("Código do funcionário: ");
            int codigo = scanner.nextInt();

            System.out.print("Número de horas trabalhadas no mês: ");
            int horasTrabalhadas = scanner.nextInt();

            scanner.nextLine();

            char turno;
            do {
                System.out.print("Turno de trabalho (M - Matutino, V - Vespertino, N - Noturno): ");
                turno = scanner.nextLine().toUpperCase().charAt(0);
                if (turno != 'M' && turno != 'V' && turno != 'N') {
                    System.out.println("Turno inválido. Por favor, digite M, V ou N.");
                }
            } while (turno != 'M' && turno != 'V' && turno != 'N');

            char categoria;
            do {
                System.out.print("Categoria (O - Operário, G - Gerente): ");
                categoria = scanner.nextLine().toUpperCase().charAt(0);
                if (categoria != 'O' && categoria != 'G') {
                    System.out.println("Categoria inválida. Por favor, digite O ou G.");
                }
            } while (categoria != 'O' && categoria != 'G');

            // hora trabalhada
            double valorHora;
            if (categoria == 'G') {
                valorHora = (turno == 'N') ? 0.20 * SALARIO_MINIMO : 0.15 * SALARIO_MINIMO;
            } else {  // Operário
                valorHora = (turno == 'N') ? 0.13 * SALARIO_MINIMO : 0.10 * SALARIO_MINIMO;
            }
            double salarioInicial = horasTrabalhadas * valorHora;

            // auxílio-alimentação
            double auxilioAlimentacao;
            if (salarioInicial <= 400) {
                auxilioAlimentacao = 0.20 * SALARIO_MINIMO;
            } else if (salarioInicial <= 622) {
                auxilioAlimentacao = 0.15 * SALARIO_MINIMO;
            } else {
                auxilioAlimentacao = 0.05 * salarioInicial;
            }
            double salarioLiquido = salarioInicial + auxilioAlimentacao;

            System.out.println("\nDados do Funcionário " + i + ":");
            System.out.println("Código: " + codigo);
            System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
            System.out.println("Valor da Hora Trabalhada: R$" + String.format("%.2f", valorHora));
            System.out.println("Salário Inicial: R$" + String.format("%.2f", salarioInicial));
            System.out.println("Auxílio Alimentação: R$" + String.format("%.2f", auxilioAlimentacao));
            System.out.println("Salário Líquido: R$" + String.format("%.2f", salarioLiquido));
        }

        scanner.close();
    }

    // Exercício 25 - Fórmula: V = 4/3 π r³
    public static void calcularVolumeEsfera() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio (r) da esfera: ");
        double raio = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.println("Volume da esfera: " + volume);
    }

    // Exercício 26 - Fórmula: (F - 32) * (5/9) = C
    public static void converterFahrenheitParaCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit (F): ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.println("Temperatura em °C: " + celsius);
    }

    // Exercício 27
    public static void calcularFibonacci() {
        int num1 = 0, num2 = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número (termo) para imprimir a série de FIBONACCI:");
        int n = sc.nextInt();
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 2; i < n; i++) { // a sequencia soma os dois anteriores e será próx num
            int temp = num1 + num2;
            System.out.print(temp + " ");
            num1 = num2;
            num2 = temp;
        }
    }

    // Exercício 28
    public static void mostrarDivisiveisPorQuatro() {
        System.out.println("Números divisíveis por 4 menores que 200:");
        for (int i = 1; i < 200; i++) {
            if ((i & 3) == 0) { // o mesmo do exercício 21 (verifica se i é divisível por 4), outro método: (i % 4 == 0)
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Exercício 29
    public static void calcularMediaPares13e73() {
       //Armazenar
        int soma = 0, count = 0;
        //numeros entre pares  de 13 a 73 - soma números pares e divide pela quantidade
        for (int i = 13; i <= 73; i++) {
            if ((i & 1) == 0) {
                soma += i;
                count++;
            }
        }
        // Calcular
        double media = (double) soma / count;
        System.out.println("Média aritmética dos números pares entre 13 e 73: " + media);
    }

    // Exercício 31
    public static void preenchimentoVagas() {
        Scanner scanner = new Scanner(System.in);

        int idade, totalHomens = 0, totalMulheres = 0;
        int homensExperiencia = 0, homensMais45 = 0, mulheresMenos21Experiencia = 0;
        int menorIdadeMulheresExperiencia = Integer.MAX_VALUE;
        double somaIdadeHomensExperiencia = 0;
        int contagemHomensExperiencia = 0;

        while (true) {
            System.out.print("Digite a idade do candidato (0 para encerrar): ");
            idade = scanner.nextInt();
            if (idade == 0) break;
            scanner.nextLine();
            System.out.print("Sexo do candidato (M ou F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            System.out.print("Possui experiência no serviço? (S ou N): ");
            char experiencia = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                totalHomens++;
                if (idade > 45) {
                    homensMais45++;
                }
                if (experiencia == 'S') {
                    homensExperiencia++;
                    somaIdadeHomensExperiencia += idade;
                    contagemHomensExperiencia++;
                }
            } else if (sexo == 'F') {
                totalMulheres++;
                if (experiencia == 'S') {
                    if (idade < 21) {
                        mulheresMenos21Experiencia++;
                    }
                    if (idade < menorIdadeMulheresExperiencia) {
                        menorIdadeMulheresExperiencia = idade;
                    }
                }
            }
        }
        System.out.println("------ Resultados ------ ");
        System.out.println("Número de candidatos do sexo feminino: " + totalMulheres);
        System.out.println("Número de candidatos do sexo masculino: " + totalHomens);

        double idadeMediaHomensExperiencia = (contagemHomensExperiencia > 0) ? somaIdadeHomensExperiencia / contagemHomensExperiencia : 0;
        System.out.println("Idade média dos homens com experiência no serviço: " + idadeMediaHomensExperiencia);
        double percentagemHomensMais45 = (totalHomens > 0) ? 100.0 * homensMais45 / totalHomens : 0;
        System.out.println("Percentagem dos homens com mais de 45 anos entre o total dos homens: " + percentagemHomensMais45 + "%");
        System.out.println("Número de mulheres com idade inferior a 21 anos e com experiência no serviço: " + mulheresMenos21Experiencia);
        System.out.println("Menor idade entre as mulheres que já têm experiência no serviço: " + (menorIdadeMulheresExperiencia == Integer.MAX_VALUE ? "N/A" : menorIdadeMulheresExperiencia));

        scanner.close();
    }

}

