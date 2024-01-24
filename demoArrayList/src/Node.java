package demoArrayList.src;

public class Node {
  
  private int value;

  private Node next;//stores the object reference of another Node object

  private Node prev;

  public Node(int value,Node next,Node prev){
    this.next = next;
    this.value = value;
    this.prev = prev;
  }

  public Node(int value){
    this.value = value;

  }

  public void setNext(Node node){
    if (node != null) {
      node.setPrev(this);
    }
    this.next = node;
    
  }

  public Node getNext(){
    return this.next;
  }

  public void setPrev(Node node){
    this.prev = node;
    
  }

  public Node getPrev(){
    return this.prev;
  }


  public int getValue(){
    return this.value;
  }

  @Override
  public String toString() {
    return "Node(prev="+prev
      +"value="+value
      +",next="+next+")";
  }

  public static void main(String[] args) {
    
    Node head = new Node(100);

    //node1 cannot find the ref of head object
    Node node1 = new Node(101);

    head.setNext(node1);

    node1.setNext(new Node(102));

    System.out.println(head.getNext().getNext().getValue());
    //node1 cannot find the ref of head object ,if there is no previous node(head)
    System.out.println(head.getNext().getNext().getPrev().getValue());
  }
}
