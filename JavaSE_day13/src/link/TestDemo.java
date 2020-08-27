package link;

/*
 * 单链表的反转
 * */
public class TestDemo {
  public static void main(String[] args) {
    //准备链表数据
    LinkNode linkNode = new LinkNode(1);
    LinkNode addNode = new LinkNode(2);
    linkNode.next = addNode;
    for (int i = 3; i < 6; i++) {
      addNode.next = new LinkNode(i);
      addNode = addNode.next;
    }
    //遍历链表数据
    printLinkNode(linkNode);

    //链表反转
    linkNode = reverseLinkNode(linkNode);
    printLinkNode(linkNode);
  }

  public static void printLinkNode(LinkNode linkNode) {
    for (int i = 0; i < 5; i++) {
      System.out.println(linkNode.val);
      linkNode = linkNode.next;
    }
  }

  //单链表反转的方法
  public static LinkNode reverseLinkNode(LinkNode linkNode) {
    //创建头节点
    LinkNode head = new LinkNode(-1);
    //头节点指向需要逆转的链表
    head.next = linkNode;
    //开始的上一个节点为需要逆转的
    LinkNode prev = head.next;
    LinkNode curr = prev.next;
    while (curr!=null){
      //接受当前节点的后面的节点
      prev.next = curr.next;
      //当成头节点
      curr.next = head.next;
      //以当前为头节点
      head.next = curr;
      curr = prev.next;
    }
    return head.next;
  }
  //头节点插入法
  public static LinkNode reverseLinkNode1(LinkNode linkNode){
    LinkNode head = new LinkNode(-1);
    LinkNode preNode = linkNode;
    while (preNode!=null){
      //临时节点接收剩余的数组
      LinkNode pNex = preNode.next;
      //链表指针指向头部的第一个元素
      preNode.next = head.next;
      //指针指向当前的元素
      head.next = preNode;
      //接收临时指针
      preNode = pNex;
    }
    return head.next;
  }
}
