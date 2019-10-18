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
    
    public void addAfter(String data, String key){
        Node newNode = new Node(data);
        Node current = head;
        
        while(!current.getData().equals(key)){
            current=current.next;
        }
        
        newNode.next = current.next;
        current.next.prev=newNode;
        current.next=newNode;
        newNode.prev=current;
        size++;
    }
    
    public void deleteFirst(){
        if (head==tail) {
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    
    public void deteteLast(){
        if (head==tail) {
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    
    public boolean findByKey(String key){
        Node current = head;
        while(!current.getData().equals(key)){
            if (current.next==null) {
                return false;
            }
            current=current.next;
        }
        return true;
    }
    
    public void display(){
        if (head!=null) {
            Node current = head;
            while(current!=null){
                System.out.print(current.getData()+" ");
                current=current.next;
            }
        }
        else{
            System.out.println("Doubly Linked List Kosong!");
        }
    }
    
    public String update(String data, String key){
        Node current = head;
        while(!current.getData().equals(key)){
            if (current.next==null) {
                return "Gagal Update";
            }
        }
        current.setData(data);
        return "Berhasil Update";
    }
}
