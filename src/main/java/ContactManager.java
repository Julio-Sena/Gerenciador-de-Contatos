import java.util.LinkedList;
import java.util.List;

public class ContactManager {
    private List<Contact> contactList;

    public ContactManager() {
        this.contactList = new LinkedList<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        contactList.add(newContact);
        System.out.println("Contato adicionado: " + newContact);
    }

    public boolean updateContact(String name, String newPhoneNumber, String newEmail) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
                System.out.println("Contato atualizado: " + contact);
                return true;
            }
        }
        System.out.println("Contato não encontrado para atualização.");
        return false;
    }

    public boolean removeContact(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contactList.remove(contact);
                System.out.println("Contato removido: " + contact);
                return true;
            }
        }
        System.out.println("Contato não encontrado para remoção.");
        return false;
    }

    public Contact viewContact(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Detalhes do contato: " + contact);
                return contact;
            }
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

    public Contact searchContact(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contato encontrado: " + contact);
                return contact;
            }
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

    public void listAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Nenhum contato armazenado.");
        } else {
            System.out.println("Lista de Contatos:");
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }
}
