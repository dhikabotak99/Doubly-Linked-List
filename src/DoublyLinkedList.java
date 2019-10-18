/**
 *
 * @author Etem
 */
public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null && tail==null) {
            head = newNode;
            tail = head;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    
    public void addLast(String data){
        Node newNode= new Node(data);
        if (head==null && tail==null) {
            head=newNode;
            tail=head;
        }
        else{
            tail.prev=newNode;
            newNode.next=tail;
            tail=newNode;
        }
        size++;
    }
}
