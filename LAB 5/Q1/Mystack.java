import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {
    ArrayList<E> List=new ArrayList<>();

    public int getSize() {
        return List.size();
    }

    public boolean isEmpty() {
        return List.isEmpty();
    }

    public void push(E o){
        List.add(o);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E o = List.get(getSize() - 1);
        List.remove(getSize() - 1);
        return o;
    }
    
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return List.get(getSize() - 1);
    }
@Override
    public String toString() {
        return "Stack: " + List.toString();
    }    

    public boolean  search(E o) {
       return List.contains(o);
    }

    public int Search(E o){
        if(List.contains(o)){
            return 1;
        }else{
            return 0;
        }
    }
}
