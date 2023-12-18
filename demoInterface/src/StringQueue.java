package demoInterface.src;

import java.util.Arrays;

public class StringQueue implements Add, Pollabele{//Class Signature
  
  private String[] queque;

  public StringQueue(){
    this.queque = new String[0];
  }

  @Override
  public void add(String s){
    addTail(s);
  }

  @Override
  public String poll() {
    return pollHead();
  }

  private String pollHead(){
    if (this.queque.length == 0) {
      return null;
    }
    String head = this.queque[0];
    String[] strArr = new String[this.queque.length - 1];
    int idx = 0;
    for(int i = 1; i < this.queque.length;i++){
      strArr[idx++] = queque[i];
    }
    this.queque = strArr;
    return head;
  }

  public void addTail(String s){
    String[] strArr = Arrays.copyOf(this.queque, this.queque.length + 1);
    strArr[strArr.length - 1] = s;
    this.queque = strArr;
  }

  public String peak(){//read the head, not poll
    return this.queque[0];
  }

  public boolean isEmpty(){
    return this.queque.length == 0;
  }

  public void clear(){
    this.queque = new String[0];
  }

  public static void main(String[] args) {
    StringQueue queue = new StringQueue();
    queue.add("hello");
    queue.add("ABC");
    System.out.println(queue.isEmpty());
    System.out.println(queue.peak());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.isEmpty());


    int i = 0;
    int j = i++; //j = i = 0, i = i + 1 = 1;
    System.out.println("j = " + j);
    System.out.println("i = " + i);
  }
}
