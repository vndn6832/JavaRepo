import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		
		while(true){
			int num = Integer.valueOf(br.readLine());
			
			if(num == -1 ) break;
			
			sum += num;
			
			
		}
		
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
		
		
	}
}