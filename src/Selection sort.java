class selection{

    public int[] sort(int n, int[] arr){

        for(int i=0;i<n-1;i++){
            int minVal = i;
            for(int j=i+1;j<n;j++){
                if(arr[minVal] > arr[j]){ //비교 대상이 arr[i]가 아니라 arr[minVal]
                    minVal = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[minVal];
            arr[minVal] = tmp;

        }

        return arr;

    }

    public static void main(String[] args){
        selection t = new selection();

        int[] arr = {2,3,7,5,2};
        int n = arr.length;

        for(int x:t.sort(n, arr)){
            System.out.print(x + " ");
        }

    }
    
}
