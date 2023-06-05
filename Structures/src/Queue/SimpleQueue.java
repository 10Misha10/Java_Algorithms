package Queue;

import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {
    private ArrayList<T> list = new ArrayList<>();
    @Override
    public void add(T item){
        list.add(item);
    }
    @Override
    public T remove(){
        return list.remove(0);
    }
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    //то есть по факту мы не переписали все одинаково, а выделили только то чно нужно нам для FIFO, то есть убрали все лишнее
}
