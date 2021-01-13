public class DoubleLinkList<E> {

    private static class Node<E>
    {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node (E e, Node<E> p,Node<E> n)
        {
            element=e;
            prev=p;
            next=n;
        }

        public E getElement(){return element;}
        public Node<E> getPrev(){return prev;}
        public Node<E> getNext(){return next;}
        public void setPrev(Node <E> p){prev=p;}
        public void setNext(Node<E> n){next=n;}
    }

    private Node<E> head;
    private Node<E> tail;
    private int size=0;

    public DoubleLinkList()
    {
        head=null;
        tail=null;
        size=0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public E getFirst()
    {
        if(isEmpty())
            return null;
        return head.getElement();
    }

    public E getLast()
    {
        if(isEmpty())
        return null;
        return tail.getElement();
    }

    public void addFirst(E element)
    {
        Node <E> newNode=new Node<E> (element,null,head);
        if(isEmpty())
        {
            head=newNode;
            tail=head;
        }
        else
        {
            head.setPrev(newNode);
            head=newNode;
        }
        size++;
    }

    public void addLast(E element)
    {
        Node<E> newNode=new Node<E> (element,tail,null);

        if(isEmpty())
        {
            tail=newNode;
            head=tail;
        }
        else
        {
            tail.setNext(newNode);
            tail=newNode;
        }
        size++;
    }

    public Node<E> removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }

        Node<E> temp=head;
        if(head.getNext()==null)
            tail=null;
        else
            head.getNext().setPrev(null);
        head=head.getNext();
        size--;
        return temp;

    }

    public Node<E> removeLast()
    {
        if(isEmpty())
        return null;

        Node<E> temp=tail;
        if(head.getNext()==null)
        {
            head=null;
        }
        else    tail.getPrev().setNext(null);
    }


    public int remove(Node<E> p)
    {
        Node<E>current=head;
        int smallest=0;
        while(current!=null)
        {
            if (smallest > (int)(current.getElement()))
            {
                smallest=(int)current.getElement();
            }
        }

        Node<E> current2=head;
        while(current2!=null && (int)(current2.getElement())!=smallest)
        {
            current2=current2.getNext();
        }

        if(current2!=null)
        {
            current2.getPrev().setNext(current2.getNext());
            current2.getNext().setPrev((current2.getPrev()));
            size--;
        }
        return smallest;
    }
    
}
