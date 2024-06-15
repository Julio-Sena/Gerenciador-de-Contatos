import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nGerenciador de Contatos");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Atualizar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Visualizar Contato");
            System.out.println("5. Pesquisar Contato");
            System.out.println("6. Listar Todos os Contatos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();  

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    manager.addContact(name, phoneNumber, email);
                    break;
                case 2:
                    System.out.print("Nome do contato a atualizar: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Novo Telefone: ");
                    String newPhone = scanner.nextLine();
                    System.out.print("Novo Email: ");
                    String newEmail = scanner.nextLine();
                    manager.updateContact(updateName, newPhone, newEmail);
                    break;
                case 3:
                    System.out.print("Nome do contato a remover: ");
                    String removeName = scanner.nextLine();
                    manager.removeContact(removeName);
                    break;
                case 4:
                    System.out.print("Nome do contato a visualizar: ");
                    String viewName = scanner.nextLine();
                    manager.viewContact(viewName);
                    break;
                case 5:
                    System.out.print("Nome do contato a pesquisar: ");
                    String searchName = scanner.nextLine();
                    manager.searchContact(searchName);
                    break;
                case 6:
                    manager.listAllContacts();
                    break;
                case 7:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
