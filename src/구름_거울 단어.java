import java.util.*;
import java.io.*;
class Main1 {
    static HashMap<Character, Character> map;
	public boolean chkMirror(String str, HashMap<Character, Character> map){
		for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i)))
                return false;
        }

        int len = str.length();

        if(len%2 == 0){
            int mid = len/2;
            for(int i=0;i<mid;i++){
                if(map.get(str.charAt(i))!= str.charAt(len-(i+1))){
                    return false;
                }
            }
        } else {
            int mid = len / 2 + 1;
            for (int i = 0; i < mid; i++) {
                if(map.get(str.charAt(i)) != str.charAt(len - (i + 1))){
                    return false;
                }
            }
        }

        return true;
		
	}
	public static void main(String[] args) throws Exception{
        Main1 t = new Main1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
		int n = Integer.parseInt(input);

        map = new HashMap();

        map.put('b','d'); map.put('i','i'); map.put('l','l');
        map.put('m','m'); map.put('o','o'); map.put('p','q');
        map.put('s','z'); map.put('u','u'); map.put('v','v');
        map.put('w','w'); map.put('x','x'); map.put('n','n');
        map.put('d','b'); map.put('q','p'); map.put('z','s');

        for(int i=0;i<n;i++){
            String str = br.readLine();

            if(!t.chkMirror(str, map))
                System.out.println("Normal");
            else
                System.out.println("Mirror");
        }
		
	}
}