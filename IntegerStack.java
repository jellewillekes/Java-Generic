// i6154549 == David Jeanjean
// i6153851 == Jelle Willekes
public class IntegerStack{
  
  private int size;          // size of the stack
  private Node first;     // top of stack
  
  // helper linked list class
  private class Node {
    private int value;
    private Node next;
  }
  
  // Constructor for an empty stack
  
  public IntegerStack() {
    this.first = null;
    this.size = 0;
  }
  
  // Returns true if this stack is empty.
  
  public boolean isEmpty() {
    return (this.first == null);
  }
  
  // returns the size of this stack
  public int size() {
    return this.size;
  }
  
  // adds number to the top of the stack
  public void push(int number) {
    Node oldfirst = this.first;
    this.first = new Node();
    this.first.value = number;
    this.first.next = oldfirst;
    this.size++;
  }
  
  // Removes and returns the integer most recently added to this stack
  
  public int pop() {
    int  number = this.first.value;        // save item to return
    this.first = this.first.next;          // delete first node
    this.size--;
    return number;                         // return the saved item
  }
  public IntegerStack copy() {
    IntegerStack copy =  new IntegerStack();
    IntegerStack aux =  new IntegerStack();
    int copyData = 0;
    while(!this.isEmpty()){
      copyData=(this.pop());
      aux.push(copyData);
      copy.push(copyData);
    } 
    while(!copy.isEmpty()){
      this.push(copy.pop());
    }
        while(!aux.isEmpty()){
      copy.push(aux.pop());
        }
    return copy;
  
}
}
