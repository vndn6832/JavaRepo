import java.util.*;
class Solution3{
    public int[] solution(int[] answers) {
         ArrayList<Integer> answer = new ArrayList<>();
        int[] cnt={0,0,0};
        int max_cnt=0;
        //패턴3개
        int[] supo1={1,2,3,4,5};
        int[] supo2={2,1,2,3,2,4,2,5};
        int[] supo3={3,3,1,1,2,2,4,4,5,5};
        //답 검사
        for(int i=0;i<answers.length;i++){
            if(answers[i]==supo1[i%5]){
                cnt[0]++;
            }
            if(answers[i]==supo2[i%8]){
                cnt[1]++;
            }
            if(answers[i]==supo3[i%10]){
                cnt[2]++;
            }
        }
        max_cnt = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
        for(int i=0;i<3;i++){
            if(max_cnt==cnt[i]){
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i->i.intValue()).toArray(); 
    }

    public static void main (String[] args){
        Solution3 s = new Solution3();
        int arr[] = {1,3,2,4,2};
        for(int x: s.solution(arr))
            System.out.print(x + " ");
    }
}