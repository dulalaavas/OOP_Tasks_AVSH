public class StackFromArray {
    int[] myStack;
    int top;
    int capacity;
    public StackFromArray(int size){
        myStack= new int[size];
        capacity=size;
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("Stack Overflow");
        } else{
            // increase the top index
            top++;
            // add new value to that index
            myStack[top]=value;
            System.out.println(value+"pushed to stack");
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            // store value in variable first
            int value= myStack[top];
            // decrease the top index
            top--;
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            int value=myStack[top];
            return value;
        }
    }
}