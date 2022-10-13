class Node {
  String value;
  Node next;
  //This next line makes a doubly linked list
  Node prev;

  public Node(String value, Node prev, Node next) {
    this.value = value;
    this.next = next;
    this.prev = prev; 
  }
}

class Doubly_ll {
  Node head;
  Node tail;

  Node cursor; 
  
  public Doubly_ll(Node head, Node tail) {
    this.head = head;
    this.tail = tail;
  }

  public void to_head() {
    cursor = head;
  }
  public void next() {
    //cursor is at the end, we could wrap around but we decide to stay at end thus doing nothing
    if (cursor.next != null) {
      cursor = cursor.next;
    }
  }
  public void to_tail() {
    cursor = tail;
  }
  public void prev() {
    //cursor is at the start, we could wrap around but we decide to stay at end thus doing nothing
    if (cursor.prev != null) {
      cursor = cursor.prev;
    }
  }

  public void printList() {
    Node storedCursor = cursor; 
    to_head();
    while (cursor.next != null) {
      System.out.println(cursor.value);
      cursor = cursor.next; 
    }
    System.out.println(cursor.value);
    cursor = storedCursor;     
  }
  
}


class Main {
  public static void main(String[] args) {

    Node n1 = new Node("start", null, null);
    Node n2 = new Node("n2", n1, null);
    n1.next = n2; 
    Node n3 = new Node("n3", n2, null);
    n2.next = n3; 
    Node n4 = new Node("end", n3, null);
    n3.next = n4;

    Doubly_ll dll = new Doubly_ll(n1, n4);

    dll.printList();
    
    
  }
}