package LinkedList_A1;

public class LinkedListPlayground {

  public static void main(String[] args) {

//     test1();
//    test2();
    test3();
    test4(); 

  }

  public static void test1() {
    LinkedListImpl L = new LinkedListImpl();
    System.out.println(L.isEmpty());
    printList(L);
    L.clear();
    System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.root.toString());
    L.insert(new Node(3.3), 0);
    System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.root.next.toString());
    L.insert(new Node(3.4), 0);
    L.insert(new Node(3.5), 0);
    L.insert(new Node(3.67), 1);
    L.insert(new Node(3.357), 0);
    L.insert(new Node(3.333), 4);
    System.out.println(L.size());
    printList(L);
    L.remove(3);
    System.out.println(L.size());
    printList(L);
    L.clear();
    L.insert(new Node(3.4), 0);
    L.insert(new Node(3.5), 0);
    L.insert(new Node(3.67), 1);
    L.insert(new Node(3.357), 0);
    L.insert(new Node(3.333), 3);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }

  public static void test2() {
    LinkedListImpl L = new LinkedListImpl();
    L.insert(new Node(3.4), 0);
    L.insert(new Node(3.5), 1);
    L.insert(new Node(3.67), 2);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }
  
  public static void test3(){
	  LinkedListImpl L = new LinkedListImpl();
	  L.insert(new Node(3), 0);
	  L.insert(new Node(5), 1);
	  L.insert(new Node(6), 2);
	  L.remove(2);
	  L.insert(new Node(4), 1);
	  System.out.println(L.size());
	  printList(L);
	  
  }
  
  public static void test4(){
	  LinkedListImpl L = new LinkedListImpl();
	  L.insert(new Node(3), 0);
	  L.insert(new Node(5), 0);
	  L.insert(new Node(6), 0);
	  L.insert(new Node(4), 3);
	  System.out.println(L.size());
	  printList(L);
	  
  }
  

  public static void printList(LinkedListImpl L) { 
    Node curr = L.root;
    for (int i = -1; i < L.size(); i++) { 
      System.out.print(curr.data + " --> ");
      curr = curr.next;
    }
    System.out.println();
  }
}
