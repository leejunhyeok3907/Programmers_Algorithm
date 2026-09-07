package Programmers_12931;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum=n;

        while(sum>0)
        {
            answer+=sum%10;
            sum=sum/10;
        }

        return answer;
    }
}