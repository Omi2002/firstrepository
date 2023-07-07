public class singlyLL 
{
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }   

    Node head=null;
    Node tail=null;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }
        else 
        {
            newNode.next=head;
            head=newNode;
            return;
        }
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
            return;
        }
    }

    public void deleteFirst()
    {
        Node temp;
        if(head==null)
        {
            System.out.println("Linkedlist is already Empty");
        }
        else if(head==tail)
        {
            head=null;
            tail=null;
            return;
        }
        else
        {
            temp=head;
            head=temp.next;
            temp.next=null;
            return;
        }
    }

    public void deleteLast()
    {
        Node temp,pre;
        if(tail==null)
        {
            System.out.println("LinkedList already empty");
        }
        else if(head==tail)
        {
            head=null;
            tail=null;
            return;
        }
        else
        {
            pre=head;
            while(pre.next.next!=null)
            {
                pre=pre.next;
            }
            temp=pre.next;
            tail=pre;
            tail.next=null;
        }
    }

    public void displayList()
    {
        if(head==null)
        {
            System.out.println("List Empty");
        }
        else
        {
            Node current=head;
            while(current!=null)
            {
                System.out.print("->"+current.data);
                current=current.next;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) 
    {
        singlyLL list=new singlyLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);  
        System.out.print("Original LinkedList : ");
        list.displayList();

        list.addLast(5);
        System.out.print("After adding to last : ");
        list.displayList();

        list.deleteFirst();
        System.out.print("After deleting first : ");
        list.displayList();

        list.deleteLast();
        System.out.print("After deleting last : ");
        list.displayList();

        list.deleteLast();
        System.out.print("After deleting last : ");
        list.displayList();
        list.deleteLast();
        System.out.print("After deleting last : ");
        list.displayList();
        list.deleteLast();
        System.out.print("After deleting last : ");
        list.displayList();
    

    }
}
