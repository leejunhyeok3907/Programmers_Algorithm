package Programmers_12932;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public long[] solution(long n) {
        long[] answer = {};

        List<Long> l=new ArrayList<>();

        while(n>0)
        {
            long temp=n%10;
            n=n/10;
            l.add(temp);
        }

        answer=new long[l.size()];

        int idx=0;
        for(Long el:l)
        {
            answer[idx++]=el;
        }

        return answer;
    }
}