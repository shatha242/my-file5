package ss;

/**
 * Created by DELL on 2/25/2021.
 */
public class Node {
    int data;
    Node next;
    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
class LinkedList
{
    Node start;
    LinkedList()
    {
        start = null;
    }


    public void push(int data)
    {
        if(this.start == null)
        {
            Node temp = new Node(data);
            this.start = temp;
        }
        else
        {
            Node temp = new Node(data);
            temp.next = this.start;
            this.start = temp;
        }
    }


    public int findSecondLastNode(Node ptr)
    {
        Node temp = ptr;


        if(temp == null || temp.next == null)
            return -1;


        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }


    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();

        ll.push(12);
        ll.push(29);
        ll.push(11);
        ll.push(23);
        ll.push(8);
        System.out.println(ll.findSecondLastNode(ll.start));
    }
}
