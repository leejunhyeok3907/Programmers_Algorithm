package Programmers_12919;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        int cnt=0;
        for(String iter:seoul)
        {
            if(iter.equals("Kim")) break;
            cnt++;
        }

        answer="김서방은 "+Integer.toString(cnt)+"에 있다";

        return answer;
    }
}