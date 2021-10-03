class bubble2{

    public int[] sort(int n, int[] arr){

        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if(!flag) break;
        }

        return arr;

    }


    public static void main(String[] args){
        bubble2 t = new bubble2();

        int[] arr = {2,3,7,5,2};
        int n = arr.length;

        for(int x:t.sort(n, arr)){
            System.out.print(x + " ");
        }

    }


}