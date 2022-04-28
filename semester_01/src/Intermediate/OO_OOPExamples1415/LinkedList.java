package Intermediate.OO_OOPExamples1415;

public class LinkedList {
  private LinkedListElement head;
  
  public LinkedList(LinkedListElement head) {
    this.head = head;
  }
  
  public int getHeadValue() {
    return head.getValue();
  }
  
  public void pushHead(LinkedListElement element) {
    LinkedListElement newHead = element;
    
    element.setTail(head);
    head = element;
  }
  
  public int popHead() {
    if (head.getTail() != null) {
      head = head.getTail();
      return head.getHead().getValue();
      
    } else {
      return -1;
    }
  }
  
  public int getIndexValue(int index) {
    LinkedListElement element = head;
    int currentIndex = 0;
    int returnValue = -1;
    
    while (currentIndex <= index && element != null) {
      if (currentIndex == index) {
        return element.getValue();
        
      } else {
        currentIndex++;
        element = element.getTail();
      }
    }
    
    return returnValue;
  }
  
  public int getLength() {
    LinkedListElement element = head;
    int currentIndex = 0;
    
    while (element != null) {
      currentIndex++;
      element = element.getTail();
      
    }
    
    return currentIndex;
  }
  
  
}
