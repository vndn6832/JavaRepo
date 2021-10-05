import java.util.EmptyStackException;
class Stack {
    int top;
    int size;
    int[] stack;

    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }


    public void push(int item){
        if(top==size-1){
            throw new StackOverflowError("스택 공간 부족으로 push할 수 없습니다.");
        }
        stack[++top] = item;
        System.out.println("Push! " + stack[top]);
    }

    public int pop(){
        /*
        if(top==-1){
            throw new ArrayIndexOutOfBoundsException();
        }*/
        if(empty()){
            //System.out.println("Index Out Of Bound");
            //return -1;
            throw new EmptyStackException();
        }
        System.out.println("Pop! " + stack[top]);

        return stack[top--];
    }

    public int peek(){
        /*
        if(top==-1){
            throw new ArrayIndexOutOfBoundsException();
        }*/
    
        if(empty()){
           // System.out.println("Index Out Of Bound");
            //return -1;
            throw new EmptyStackException();
        }
            
        return stack[top];

    }

    public void printStack(){
		System.out.println("-- STACK LIST --");
		for (int i = top; i >= 0; i--)
			System.out.println(stack[i]);
		System.out.println("-- END OF LIST --");
    }

    public int size(){
        return top+1;
    }

    public boolean empty(){
        if(top==-1)
            return true;
        
        return false;
    }

    public boolean contains(int item){
        for(int i=top; i>=0; i--){
            if(stack[i] == item)
                return true;
        }

        return false;
    }
    

    public void clear(){
        top = -1;
    }
}

class ArrayStack{
    public static void main(String[] args){
        Stack st = new Stack(100);
        st.push(5);
		st.push(2);
        System.out.println("size! " + st.size());


		st.printStack();

		st.pop();

		st.pop();

		st.push(15);

		st.printStack();

		
		st.pop();
	
		
		st.push(30);
		
		System.out.println("peek! " + st.peek());

        System.out.println("size! " + st.size());

        st.pop();
		System.out.println("peek! " + st.peek());
    }
}
