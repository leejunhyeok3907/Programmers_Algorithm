package Programmers_76501;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<signs.length; i++)
        {
            int op=1;
            if(!signs[i]) op=-1;

            answer+=(absolutes[i]*op);
        }

        return answer;
    }
}