/*
q.offer(1); //값넣기
q.poll(); //빼기
q.peek(); //가장 앞에 있는 값
q.contains(1);//1 있으면 true, 없으면 false
q.size();//값 개수
q.isEmpty(); //비어있는지
*/

import java.util.EmptyStackException;
import java.util.Stack;
class StackToQueue {
    Stack<Integer> inqueue;
    Stack<Integer> outqueue;

    public StackToQueue(){
        inqueue = new Stack<>();
        outqueue = new Stack<>();
    }


    public void check(){
        if(outqueue.empty()){
            while(!inqueue.empty()){
                outqueue.add(inqueue.pop());
            }
        }
    }

    public void offer(int item){
        inqueue.push(item);
    }

    public int poll(){
        check();
        if(outqueue.empty())
            throw new EmptyStackException();
        
        return outqueue.pop();
    }

    public int peek(){
        check();
        if(outqueue.empty())
            throw new EmptyStackException();

        return outqueue.peek();

    }

    public int size(){
        return inqueue.size() + outqueue.size();
    }

    public boolean contains(int val){
        if(!inqueue.contains(val) && !outqueue.contains(val))
            return false;
        
        return true;
    }

    public boolean isEmpty(){
        if(inqueue.isEmpty() && outqueue.isEmpty())
            return true;
        
        return false;
    }
}

class queue{


    public static void main(String[] args){
        StackToQueue q = new StackToQueue();

        q.offer(1);
        q.offer(2);
        System.out.println("4 contains? " + q.contains(4));
        System.out.println("size! " + q.size());
        System.out.println("poll! " + q.poll());

        q.offer(3);
        System.out.println("poll! " + q.peek());
        q.offer(4);
        System.out.println("empty? " + q.isEmpty());
        System.out.println("poll! " + q.poll());
        System.out.println("poll! " + q.poll());
        System.out.println("size! " + q.size());
        System.out.println("4 contains? " + q.contains(4));
        System.out.println("poll! " + q.poll());
        System.out.println("empty? " + q.isEmpty());
        System.out.println("4 contains? " + q.contains(4));

    }
}