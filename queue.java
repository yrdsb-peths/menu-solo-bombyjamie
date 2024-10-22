public class Queue<Avatar> 
{
    private Node first, last;


    private class Node 
    {
        Avatar item;
        Node next;
    }


    public boolean isEmpty() 
    { 
        return (first == null); 
    }


    public void enqueue(Avatar item) 
    {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
    }


    public Avatar dequeue() 
    {
        Avatar item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        return item;
    }

    public Avatar peek() 
    {
        if (isEmpty()) return null; 
        return first.item;
    }
}
