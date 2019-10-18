/**
 *
 * @author Etem
 */
public class Node {
    public Node next;
    public Node prev;
    private String data;
    
    public Node(String data){
        this.data=data;
    }
    
    public void setData(String data){
        this.data=data;
    }
    
    public String getData(){
        return this.data;
    }
}
