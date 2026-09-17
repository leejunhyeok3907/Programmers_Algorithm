package Programmers_12910;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};

        List<Integer> temp=new ArrayList<>();

        for(int iter:arr)
        {
            if(iter%divisor==0)
            {
                temp.add(iter);
            }
        }

        if(!temp.isEmpty())
        {
            answer=temp.stream().sorted().mapToInt(i->i).toArray();
        }



        return answer;
    }
}