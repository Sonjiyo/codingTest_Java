class Solution {
    public int solution(int a, int b) {
        int answer = a%2!=0 && b%2!=0 ? a*a+b*b : a%2==0 && b%2==0 ? Math.abs(a-b) : 2*(a+b) ;
        return answer;
    }
}