package teststack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<t>{
    private ArrayList<t> arr;
    private int top;
    private int intlSize;

    public Stack(int size) {
        this.arr = new ArrayList<t>(size);
        this.intlSize = size;
        this.top = -1;
    }
    //push method;
    public void push(t elements){
        arr.add(++top, elements);
    }
    //peak method
    public t peak () throws EmptyStackException{
        if (top<0){
            throw new EmptyStackException();
        }
        return arr.get(top);
    }
    //pop method
    public t pop() throws EmptyStackException{
        if(top<0){
           throw new EmptyStackException();
        }
        t tp = arr.get(top);
        arr.remove(top--);
        return tp;
    }
    public void printStack(){
        if(top<0){
            System.out.println("stack is empty");
        }
        else System.out.println(arr);
    }
}
