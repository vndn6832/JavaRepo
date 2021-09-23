import java.util.*;

class info implements Comparable<info>{

    int idx;
    int data;

    info(int a, int b){
        idx = a;
        data = b;
    }
    @Override
    public int compareTo(info i){
        return this.idx - i.idx;
    }
}

class info2{

    int idx;
    int data;

    info2(int a, int b){
        idx = a;
        data = b;
    }
}



class Sort{



    public static void main(String[] arg){

        info i1 = new info(1,2);
        info i2 = new info(2,3);

        /* Comparable - 배열 */
        info[] arr = new info[2];

        arr[0] = i1;
        arr[1] = i2;

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[0].idx);
        System.out.println(arr[1].idx);

        /* Comparable - ArrayList */
        ArrayList<info> li = new ArrayList<>();
        li.add(i1);
        li.add(i2);

        Collections.sort(li);

        System.out.println(li.get(0).idx);
        System.out.println(li.get(1).idx);



        info2 i3 = new info2(0,10);
        info2 i4 = new info2(-1,13);

        /* Comparator - 배열 */
        info2[] arr2 = new info2[2];

        arr2[0] = i3;
        arr2[1] = i4;

        Arrays.sort(arr2, new Comparator<info2>() {

            @Override
          public int compare(info2 o1, info2 o2) {
              // TODO Auto-generated method stub
            //return Integer.compare(o1.idx, o2.idx);
            return o2.idx - o1.idx;
            }
        });

        System.out.println(arr2[0].idx);
        System.out.println(arr2[1].idx);

        /* Comparator - ArrayList */
        ArrayList<info2> li2 = new ArrayList<>();
        li2.add(i3);
        li2.add(i4);

        
        Collections.sort(li2, new Comparator<info2>(){
            @Override
            public int compare(info2 x, info2 y){
                return Integer.compare(x.data, y.data);
            }
        });

        System.out.println(li2.get(0).idx);
        System.out.println(li2.get(1).idx);
        
    }
}