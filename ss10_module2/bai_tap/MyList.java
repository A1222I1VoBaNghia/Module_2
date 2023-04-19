package ss10_module2.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements =new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements =new Object[capacity];
    }
    public void add(int index, E element){
        if(index>=0&&index<elements.length){
           elements[index] = element;
        }
    }
    public E remove(int index){
        if(index>=0&&index<elements.length){
            E e = (E) elements[index];
            for (int i = index; i < elements.length-1; i++) {
                elements[i] = elements[i+1];
            }
            return e;
            } throw new IndexOutOfBoundsException("Index:"+ index+ ",Size"+index);
    }
    public int size(){
        int count=0;
        for (int i = 0; i < elements.length; i++) {
            if(elements[i]!=null){
                count++;
            }
        }
        return count;
    }
    public E clone(){
        E elements1 = (E) elements;
        return elements1;
    }
    public boolean contains(E o){
        boolean flag = false;
        for (int i = 0; i < elements.length; i++) {
            if(elements[i]==o){
                flag = true;
                break;
            }flag = false;
        }
        return flag;
    }
    public int indexOf(E o){
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals(o)){
                index = i;
                break;
            } index = -1;
        }
        return index;
    }
    public E get(int i){
        if(i < 0 || i>elements.length-1){
            throw new IndexOutOfBoundsException ("Index:"+ i+ ",Size"+i);
        }
        return (E)elements[i];
    }
    public void clear(){
        Arrays.fill(elements, null);
    }
    public void ensureCapacity(int minCapacity){
        elements = Arrays.copyOf(elements, minCapacity);
    }
    public boolean add(E o){
        boolean flag = false;
        for (int i = elements.length-1; i >= 0 ; i--) {
            if(elements[i]!=null){
                flag = false;
                break;
            }else if(elements[i-1]!=null){
                elements[i] = o;
                flag = true;
            }
            }
        return flag;
    }
}


