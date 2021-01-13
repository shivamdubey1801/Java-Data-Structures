public class SinglyLinkedList<E>
{
    private static class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E e,Node<E> n)
        {
            element=e;
            next=n;
        }

        public E getElement()
        {
            return element;
        }
        public Node<E> getNext()
        {
            return next;
        }

        public void setNext(Node<E> n)
        {
            next=n;
        }
    }

    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public SinglyLinkedList()
    {

    }

    public int size(){return size;}
    public boolean isEmpty(){return size==0;}

    public E first()
    {
        if(isEmpty())
            return null;
        return head.getElement();
    }

    public E last()
    {
        if(isEmpty())
            return null;
        return tail.getElement();
    }


   

    public void add(E data)
    {
        Node<E> newest=new Node<>(e,null);
        if(isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }

   

    public void remove(E data)
    {
       
        Node temp;
        temp=head;
        while(temp.getNext().getElement()!=data)
        {
            temp=temp.getNext();
        }
        temp=temp.getNext().getNext();
        size--;

    }

    public int size()
    {
        
    }

    public void printBackward()
    {
        int j=0;
        Node current;
        current=head;
        while (current != null) { 
              
            // For each node, print proper number  
            // of spaces before printing it  
            for (int i = 0; i < 2 * (n - j); i++) 
                 System.out.print(" "); 
 
            // use of carriage return to move back  
            // and print. 
            System.out.print("\r" + current.getElement()); 
 
            current = current.getNext(); 
            j++;  
         } 
    }

    

}