/**
 *
 * @author Etem
 */
public class Main {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst("Strukdat");
        dll.addFirst("Praktikum");
        dll.addFirst("Ini");
        dll.addLast("Modul");
        dll.addLast("Doubly Linked List");
        
        dll.display();
        
        dll.deleteFirst();
        dll.deleteFirst();
        
        System.out.println("\nSetelah Di Delete : ");
        dll.display();
    }
}
