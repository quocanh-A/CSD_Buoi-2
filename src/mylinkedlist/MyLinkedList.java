package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()
    
    public int length(){
        int count = 0;
        if(head == null){
            return 0;
        }else{
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }
    
    
    public void deleteFirst(){
        if(head == null){
            return;       
        }else{
            head = head.next;
        }       
    }
     
    
    public void display() {
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + " -> ");
            temp = temp.next;
        }       
        System.out.println();
    }
    

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
//        3->2->1
        // linkedList.addFirst(1);
        // linkedList.addFirst(2);
        // linkedList.addFirst(3); 
        // linkedList.display();
          
     
          //1->2->3        
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3); 
        linkedList.display();   


        linkedList.deleteFirst();
        linkedList.display();
        
                        
        System.out.println("Length: " + linkedList.length());
        
    }
}
