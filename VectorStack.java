import java.util.Vector;

public class VectorStack<T> implements UVGStack<T> {
    private Vector<T> stack;

    public VectorStack() {
        stack = new Vector<T>();
    }

    @Override
    public void push(T item){
        stack.add(item);
    }

    @Override
    public T pop(){
        if (!isEmpty()){
            return stack.remove(stack.size() -1);
        }
        return null;
    }

    @Override
    public T top(){
        if (!isEmpty()){
            return stack.get(stack.size() -1);
        }
        return null;
    }

    @Override
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
