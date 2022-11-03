package model;

//TODO 01: Fertigstellen das Klasse Schlange gemäß der Dokumentation vom Land.
public class Queue <ContentType> {

    private class Node{
        private Node next;
        private ContentType content;

        public Node(ContentType content){
            this.content = content;
            this.next = null;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
        public ContentType getContent(){
            return content;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        }
        return false;
    }

    public void enqueue(ContentType pContent){
        tail.setNext(new Node(pContent));
    }
    public void dequeue(){
        if(head != null && head.getNext() == null){
            head = null;
        }
        if(head != null && head.getNext() != null){
            head = head.getNext();
        }
    }
    public ContentType front(){
        if(head == null && tail == null){
            return  null;
        }
        return head.getContent();
    }
}
