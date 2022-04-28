package Intermediate.OO_OOPExamples1415;

public class LinkedListElement {
  private int value;
  private LinkedListElement tail;
  private LinkedListElement head;
  
  LinkedListElement(int value) {
    this.value = value;
  }
  
  public int getValue() {
    return value;
  }
  
  public void setValue(int value) {
    this.value = value;
  }
  
  public LinkedListElement getTail() {
    return tail;
  }
  
  public void setTail(LinkedListElement tail) {
    this.tail = tail;
    if (tail != null)
      tail.head = this;
  }
  
  public LinkedListElement getHead() {
    return head;
  }
  
  public void setHead(LinkedListElement head) {
    this.head = head;
    if (head != null)
      head.head = this;
  }
  
  
}
