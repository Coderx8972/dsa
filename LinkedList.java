class LinkedList{
    Node head;
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            newNode = head;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next=newNode;
    }
    public void insertAtstart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void removeAtEnd(){
        if(head == null){
            return;
        }
        if(head.next == null){
            return;
        }
        Node newNode = head;
        while(newNode.next.next!=null){
            newNode=newNode.next;
        }
        newNode.next=null;
    }
    public void removeAtStart(){
        if(head == null){
            return;
        }
        head = head.next;
    }
}