/*
class Queue {
    Stack stack1 = new Stack<Integer>();
    Stack stack2 = new Stack<Integer>();
 
    enqueue() {
       // 구현해주세요.
    }
  
    dequeue() {
       // 구현해주세요.
    }  
 }

 main {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
  
    print queue.dequeue(); // 1
    print queue.dequeue(); // 2
  }

  */
 
import java.util.Stack;
class Queue{

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val){

        stack1.push(val);
    }

    public int dequeue(){

        if(stack2.empty() && stack1.empty())
            return -1;

     
            
        if(stack2.empty()){
            if(stack1.size()!=0){

                while(true){
                    stack2.push(stack1.pop());
                    if(stack1.empty()) break;
                }
            }
        }

        return stack2.pop();

    }

}

class cloud{


    public static void main(String[] args){

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}


