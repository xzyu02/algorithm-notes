// 2409. Count Days Spent Together

class Solution {
    int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(countDay(arriveAlice), countDay(arriveBob));
        int last = Math.min(countDay(leaveAlice),countDay(leaveBob));
        return Math.max(0,  last - start + 1);
    }
    
    public int countDay(String s){
        String[] temp = s.split("-");
        int md[] = {Integer.parseInt(temp[0]), Integer.parseInt(temp[1])};
        int d = md[1]; // days from current month
        for (int i = 0; i < md[0]; i++){
            d += month[i]; 
        }
        return d;
    }
}