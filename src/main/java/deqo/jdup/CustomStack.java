package deqo.jdup;

import java.util.EmptyStackException;
import java.util.Stack;

public class CustomStack {

    public Stack<Item> myStack;

    public CustomStack(){
        this.myStack = new Stack<Item>();
    }

    public boolean isEmpty(){
        return myStack.empty();
    }

    public int getSize(){
        return myStack.size();
    }

    public void push(Item item){
        myStack.push(item);
    }

    public Item peek() throws EmptyStackException{
        return myStack.peek();
    }

    public Item pop() throws  EmptyStackException{
        return myStack.pop();
    }

}
