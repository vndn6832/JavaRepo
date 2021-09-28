import java.util.Scanner;

class Main2{

    static char[] ch = {'b','d','i','l','m','n','o','p','q','s','z','u','v','w','x'};

    public boolean solution(String str){
        int len = str.length();
        for(int i=0;i<len;i++){
            boolean isIn = false;
            for(int j=0;j<15;j++){
                if(str.charAt(i) == ch[j]){
                    isIn = true;
                    break;
                }
            }
            if(!isIn) return false;


            if(str.charAt(i) == 'b' && str.charAt(len-1-i) != 'd') return false;
            if(str.charAt(i) == 'd' && str.charAt(len-1-i) != 'b') return false;
            if(str.charAt(i) == 'p' && str.charAt(len-1-i) != 'q') return false;
            if(str.charAt(i) == 'q' && str.charAt(len-1-i) != 'p') return false;
            if(str.charAt(i) == 's' && str.charAt(len-1-i) != 'z') return false;
            if(str.charAt(i) == 'z' && str.charAt(len-1-i) != 's') return false;

        }





        return true;
    }
    public static void main(String[] args){
        Main2 t = new Main2();
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();

        for(int i=0;i<n;i++){
            String str = s.next();
            if(t.solution(str))
                System.out.println("Mirror");
            else
                System.out.println("Normal");
        }
        
    }
}