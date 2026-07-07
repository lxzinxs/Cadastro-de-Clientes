import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro_Clientes {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> clientes = new ArrayList<>();

        String divisoria = ("\n*************************************\n");
        String nome = "";

        boolean rodarMenu = true;

        while (rodarMenu) {
            System.out.println(
                    "\n-----MENU DE CLIENTES-----\n[ 1 ] - Cadastrar Cliente\n[ 2 ] - Mostrar Clientes Cadastrados\n[ 3 ] - Editar Cliente\n[ 4 ] - Excluir Cliente\n[ 5 ] - Pesquisar Cliente\n[ 6 ] - Retornar\n[ 0 ] - Sair");
            int opcao = teclado.nextInt();

            boolean rodarPrograma = true;

            while (rodarPrograma) {
                switch (opcao) {
                    case 1:
                        System.out.println(divisoria);
                        System.out.println("Digite a quantidade de clientes que deseja adicionar: ");
                        int quantidade = teclado.nextInt();
                        for (int i = 0; i < quantidade; i++) {
                            System.out.print("Digite o nome da " + (i + 1) + "* pessoa: ");
                            nome = teclado.next();
                            clientes.add(nome);
                        }
                        System.out.println("\nOs clientes foram cadastrado");
                        rodarPrograma = false;
                        break;

                    case 2:
                        System.out.println(divisoria);
                        System.out.println("Clientes cadastrados: ");
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.println((i + 1) + "* - " + clientes.get(i));
                        }
                        rodarPrograma = false;
                        break;

                    case 3:
                        System.out.println(divisoria);
                        System.out.println("Digite o numero do cliente que deseja editar: ");
                        int numeroCliente = teclado.nextInt();
                        numeroCliente -= 1;
                        System.out.print("Digite um novo nome: ");
                        String nomeEditado = teclado.next();
                        clientes.set(numeroCliente, nomeEditado);

                        rodarPrograma = false;
                        break;

                    case 4:
                        System.out.println(divisoria);
                        System.out.println("Digite o numero do cliente que deseja excluir: ");
                        int numeroExcluido = teclado.nextInt();
                        numeroExcluido -= 1;
                        clientes.remove(numeroExcluido);
                        System.out.print("\nO cliente foi excluido!");

                        rodarPrograma = false;
                        break;

                    case 5:
                        System.out.println(divisoria);
                        System.out.println("Digite o numero do cliente que deseja pesquisar: ");
                        int numeroBuscar = teclado.nextInt();
                        numeroBuscar -= 1;
                        System.out.println(clientes.get(numeroBuscar));

                        rodarPrograma = false;
                        break;

                    case 6:
                        System.out.println(divisoria);
                        System.out.println("Você retornou ao programa!");
                        rodarPrograma = false;
                        break;

                    case 0:
                        System.out.println(divisoria);
                        System.out.println("Você saiu do programa!");
                        rodarMenu = false;
                        rodarPrograma = false;
                        break;

                    default:
                        System.out.println(divisoria);
                        System.out.println("Digite um número válido!");
                        rodarPrograma = false;
                        break;
                }
            }
        }
        teclado.close();
    }
}
