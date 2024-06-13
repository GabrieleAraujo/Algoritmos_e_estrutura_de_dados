import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        FilaBanco filaBanco = new FilaBanco();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Adicionar cliente à fila");
            System.out.println("2. Atender cliente");
            System.out.println("3. Exibir fila");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();  //consumir nova linha
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o número da conta:");
                    int numeroConta = sc.nextInt();
                    Cliente cliente = new Cliente(nome, numeroConta);
                    filaBanco.adicionarCliente(cliente);
                    break;
                case 2:
                    filaBanco.atenderCliente();
                    break;
                case 3:
                    filaBanco.exibirFila();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

}