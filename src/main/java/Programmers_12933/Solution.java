package Programmers_12933;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;

        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr); // 오름차순
        StringBuilder Sb=new StringBuilder(new String(arr));
        Sb.reverse();

        return Long.parseLong(Sb.toString());
    }
}