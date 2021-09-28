import java.util.*;
class Main8and1{

    static int all = 0;
    static int[] arr;
    static boolean flag = false;
    static String ans = "NO";
    public void DFS(int idx, int sum){
    
        if(flag) return;

        if(idx==arr.length){

            if(sum == all/2){
                //System.out.println(sum);
                flag = true;
                ans = "YES";
            } 

        }

        else{

            DFS(idx+1, sum+arr[idx]);
            DFS(idx+1, sum);
        }




    }

    public static void main(String[] args){


        Main8and1 t = new Main8and1();
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();
        arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        all = Arrays.stream(arr).sum();
        
        t.DFS(0,0);

        System.out.print(ans);

    }








}