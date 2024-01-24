package demoArrayList.src;

public class LinkedList {
  
  private Node head;

  public LinkedList(){
    
  }

  public void add(int value){
    if (head == null) {
      head = new Node(value);
    }
    
    //while loop until tail,then setNext
    while (this.head.getNext() != null) {
      this.head = this.head.getNext();
    }
    this.head.setNext(new Node(value));
  }

  //remove(int value)
  public void remove(int value){
    if (this.head == null) {
      return;
    }
    if (this.head.getValue() == value) {
      this.head = this.head.getNext();
    }

    Node current = this.head;
    Node prev = null;
    while (current != null&&current.getValue() != value) {
      prev = current;
      current = current.getNext();
    }

    if (current != null && prev.getNext() == null) {
      prev.setNext(current.getNext());
    }
  }

  public void remove2(int value){
      if (this.head == null)
        return;
      if (this.head.getValue() == value) {
        this.head = this.head.getNext();
      }
      Node curNode = this.head;
      while (curNode != null) {
      if (curNode.getValue() == value) {
        curNode.getPrev().setNext(curNode.getNext());
      }
      curNode = curNode.getNext();
      }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LinkedList[");
    Node node = this.head;
    while (node != null) {
      sb.append(node.getValue()).append(",");
      node = node.getNext();
    }
    return sb.deleteCharAt(sb.length()-1).append("]").toString();
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(100);
    linkedList.add(100);
    linkedList.add(100);
    linkedList.add(0);
    System.out.println(linkedList);
    linkedList.remove(1);
    System.out.println(linkedList);
    
  }
}
