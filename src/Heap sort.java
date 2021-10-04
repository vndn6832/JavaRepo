class heap{

    public void heapify(int array[], int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
 
        if (l < n && array[p] < array[l]) {
            p = l;
        }
 
        if (r < n && array[p] < array[r]) {
            p = r;
        }
 
        if (i != p) {
            swap(array, p, i);
            heapify(array, n, p);
        }
    }
 
    public void heapSort(int[] array) {
        int n = array.length;
 
        // init, max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
 
        // for extract max element from heap
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }
    }
 
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static void main(String[] args){

        heap t = new heap();

        int[] array = { 230, 10, 60, 550, 40, 220, 20 };
 
        t.heapSort(array);
 
        for (int v : array) {
            System.out.println(v);
        }
    }
 
}