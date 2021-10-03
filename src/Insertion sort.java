class insertion{

    public int[] sort(int n, int[] arr){

        for(int i=1;i<n;i++){
            int tmp = arr[i];
            int pre = i-1;
            while(pre>=0 && arr[pre] > tmp){
            
                arr[pre+1] = arr[pre];
                pre--;
            }

            arr[pre+1] = tmp;

            System.out.print("\n" + i + "회전: ");
            for(int j=0;j<n;j++){
                System.out.print(arr[j] + " ");
            }


        }

        return arr;

    }

    public static void main(String[] args){

        insertion t = new insertion();

        int[] arr = {2,3,7,5,2};
        int n = arr.length;

        t.sort(n, arr);


    }
    
}
