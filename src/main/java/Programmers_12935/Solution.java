package Programmers_12935;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        int[] answer = {};

        int min= Arrays.stream(arr).min().getAsInt();
        answer=Arrays.stream(arr).filter(x->x!=min).toArray();

        return answer;
    }
}