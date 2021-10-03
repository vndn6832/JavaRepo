class merge{
    static int[] sorted;
    public void merge(int[] arrs,int m, int middle, int n){
        int i = m;
        int j= middle+1;
        int k=m;

        //작은 순서대로 배열에 삽입
        while(i<=middle && j<=n){
            if(arrs[i] <= arrs[j]){
                sorted[k] = arrs[i];
                i++;
            }else{
                sorted[k] = arrs[j];
                j++;
            }
            k++;
        }

        //남은 데이터도 삽입
        /*
        if(i>middle){
            for(int t=j;t<=n;t++){
                sorted[k] = arrs[t];
                k++;
            }
        }else{
            for(int t=i;t<=middle;t++){
                sorted[k] = arrs[t];
                k++;
            }
        }*/
        while(i<=middle)
            sorted[k++] = arrs[i++];

        while(j<=n)
            sorted[k++] = arrs[j++];

        //정렬된 배열을 삽입
        for(int t=m;t<=n;t++){
            arrs[t] = sorted[t];
        }      

    }

    public void mergeSort(int[] arrs, int m, int n){



        //크기가 1보다 큰 경우
        if(m<n){
            int middle = (m+n) /2;
            mergeSort(arrs, m, middle);
            mergeSort(arrs, middle+1, n);
            merge(arrs,m,middle,n);
        }

   
    

    }



    public static void main(String[] args){
        merge t = new merge();

	    int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };
        sorted = new int[arrs.length];

	    t.mergeSort(arrs, 0, arrs.length - 1);
	    System.out.println("결과");

	    for (int i : arrs) {
		    System.out.print(i + " ");
	    }
        

    }
}