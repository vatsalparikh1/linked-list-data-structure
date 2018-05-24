/**
 * COMP 410 See inline comment descriptions for methods not described in
 * interface.
 *
 */
package LinkedList_A1;

public class LinkedListImpl implements LIST_Interface {
  Node root; // this will be the entry point to your linked list (the head)

  public LinkedListImpl() {// this constructor is needed for testing purposes.
                           // Please don't modify!
    root = new Node(0); // Note that the root's data is not a true part of your
                        // data set!
  }

  // implement all methods in interface, and include the getRoot method we made
  // for testing purposes. Feel free to implement private helper methods!

  public Node getRoot() { // leave this method as is, used by the grader to grab
                          // your linkedList easily.
    return root;
  }

  @Override
  public boolean insert(Node n, int index) {
	  
    if (index < 0 || index > size()) {
      return false;
    } else if (index == size()){// inserting at end of the list

        Node current = root;
        for (int i = -1; i < size(); i++) {

          if (current.next != null) {
            current = current.next;
          } else {
            n.prev = current;
            current.next = n;
          }

        }
        
        
      } else {// inserting between nodes

        Node copy = new Node(0.0);
        copy.prev = n;
        
        Node current1 = root;
        for (int i = -1; i < index + 1; i++) {

          if (i == index) {
        	copy.data = current1.data;
            copy.next = current1.next;
            
          }
          current1 = current1.next;

        }
        Node current2 = root;
        for (int i = -1; i < index; i++) {
          if (i == index - 1) {
        	current2.next = n;
        	n.prev = current2;
        	n.next = copy;
        	    
          }
          current2 = current2.next;
        }
        
      }

      
    return true;

  }

  @Override
  public boolean remove(int index) {

    if (index < 0 || index >= size()) {
      return false;
    } else if (index == size() - 1) { // deleting from end of list

      Node current = root.next;
      
      for (int i = 0; i < size(); i++) {

    	if (root.next.next == null){
    		root.next = null;
    	}else if (current.next.next == null) {
          current.next = null;
          
        }else {
          current = current.next;
        }
      }

      return true;

    } else {// deleting from middle of list

      Node temp = new Node(0.0);

      Node current1 = root;
      for (int i = -1; i < size(); i++) {
        if (i == index + 1) {
          temp.next = current1.next;
          temp.data = current1.data;
        }
        current1 = current1.next;
      }

      Node current2 = root;
      for (int i = -1; i < size(); i++) {
        if (i == index - 1) {
          current2.next = temp;
        }
        current2 = current2.next;
      }

      return true;
    }

  }

  @Override
  
  public Node get(int index) {
    if (index < size() && index >= 0) {//don't allow public access to root node
      Node current = root;
      Node target = null;
      for (int i = -1; i < size(); i++) {
        if (i == index) {
        	target = current;
        }     
        current = current.next;
      }  
      return target;
    } else {
      return null;  
    }
  }

  @Override
  public int size() {
    int indexNodes = -1; // start at -1 due to root node
    Node current = root;
    while (current.next != null) {
      current = current.next;
      indexNodes = indexNodes + 1;
    }
    int size = indexNodes + 1;
    return size;
  }

  @Override
  public boolean isEmpty() {
    if (root.next == null) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void clear() {

    root.next = null;
    root.prev = null;

  }
}