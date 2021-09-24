import java.util.*;
class Main1and12{

    public String solution(String[] arr){
        String ans = "";

        for(String st: arr){
            String bi = "";
            /*
            for(char b: st.toCharArray()){
                if(b=='#')
                    bi+='1';
                else
                    bi+='0';
                
            }
            */
            bi=st.substring(0, 7).replace('#', '1').replace('*', '0');

            //int c = Integer.valueOf(bi);

            //System.out.println(c);

            int c = Integer.parseInt(bi,2);

            //System.out.println((char)(c));

            //System.out.println(Character.toChars(c));

            ans+=(char)c;

            
        }

        return ans;

    }

    public static void main(String[] args){
        Main1and12 T = new Main1and12();
        Scanner S = new Scanner(System.in);

        int n = S.nextInt();
        String str = S.next();

        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            String tmp = str.substring( i*7 , (i+1)*7);
            //System.out.println(tmp);    
            arr[i] = tmp;
        }

        System.out.print(T.solution(arr));
    }
}