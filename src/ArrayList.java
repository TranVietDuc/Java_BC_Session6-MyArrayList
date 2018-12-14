import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public ArrayList (E[] patternArray) {
        clear();
        elements = patternArray;
        size = patternArray.length;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Out of bounds");
        }
    }
 // Method Add
    public void add(int index, E value) {
        if (size == elements.length) {
            ensureCapa();
        }
        size++;
        for (int i = elements.length-1; i > index; i--) {
            elements[i] = elements [i-1];
        }
        elements[index] = value;
    }

    public void remove(int index) {
        checkIndex(index);
       E temp = (E) elements[index] ;
       size --;
        for (int i = index; i <= size ; i++) {
            elements[i] = elements[i + 1];
        }
    }

    public int size() {
        return size;
    }


    public boolean contain(E patternWannaFind) {
        for (int i = 0; i < size ; i++) {
            if (patternWannaFind == (E) elements[i]) return true;
        }
        return false;
    }

    public E get(int i) {
       return (E) elements[i];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(E patternWannaFind) {
        for (int i = 0; i < elements.length; i++) {
            if (patternWannaFind == (E) elements[i]) return i;
        }
        return  -1;
    }

    public void printOut(){
        System.out.println("\n");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+"\t");
        }
    }

}
