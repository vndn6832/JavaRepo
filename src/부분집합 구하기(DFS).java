import java.io.*;
class Main7and6{
    static int n;
    static int[] arr;
    static boolean[] check;
    public void DFS(int idx){

        if(idx==n){
            String st ="";
            for(int i=0;i<n;i++){
                if(check[i] == true)
                    st+= arr[i] +" ";
            }
            if(st.length()>0) System.out.println(st);


        }else{
            check[idx] = true;
            DFS(idx+1);
            check[idx] = false;
            DFS(idx+1);
        }
    }

    public static void main(String[] args) throws Exception{
        Main7and6 T = new Main7and6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        n = Integer.parseInt(input);
        //n = br.read();
        arr = new int[n];
        check = new boolean[n];

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        T.DFS(0);

        

    }
}