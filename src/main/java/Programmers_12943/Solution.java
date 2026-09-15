package Programmers_12943;

class Solution {
    public int solution(int num) {

        if(num==1) return 0;

        long answer = num;
        int cnt=1;

        for(cnt=1; cnt<=500; cnt++)
        {
            if(answer%2==0) answer/=2;
            else answer=answer*3+1;

            if(answer==1) break;
        }

        return (cnt<500)? cnt:-1;
    }
}