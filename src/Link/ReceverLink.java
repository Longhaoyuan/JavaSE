package Link;


class CreateLink{
  private Node head;

  public CreateLink(int size){
    Node head = new Node("0");
    Node cur = head;
    for (int i = 1; i < size; i++) {
      Node tmp = new Node(""+i);
      cur.setNext(tmp);
      cur = tmp;
    }
    this.head = head;
  }
  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

}
public class ReceverLink {
  public static void main(String[] args) {

  }
}
