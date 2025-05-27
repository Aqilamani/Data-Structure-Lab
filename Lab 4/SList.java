public class SList<E> {
    SNode<E> head;
    SNode<E> tail;
    int size;

    public SList() {
        head = null;
        tail = null;
        size = 0;
    }
       
    public void appendEnd(E e){
        SNode<E> newNode = new SNode<>(e);
        if(head == null) {
            head = new SNode(e);
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public E removeInitial(){
        if(head == null) return null;
        else {
            E data = head.data;
            head = head.next;
            size--;
            return data;
        }

    }

    public boolean contains(E e){
        SNode<E> current = head;
        while(current != null) {
            if(current.data.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;

    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    public void display(){
        SNode<E> current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}