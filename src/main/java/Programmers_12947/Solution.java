package Programmers_12947;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum=0;
        int num=x;

        while (num>0)
        {
            sum+=(num%10);
            num/=10;
        }

        if (sum==0) answer=false;
        else answer=(x % sum == 0)? true:false;

        return answer;
    }
}