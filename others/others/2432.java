// 2432. The Employee That Worked on the Longest Task

class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id = logs[0][0], time = logs[0][1], preEnds = time;
        for(int i = 1; i < logs.length; i++) {
            int curtime = logs[i][1] - preEnds;
            preEnds = logs[i][1];
            if (curtime > time) {
                id = logs[i][0];
                time = curtime;
            } else if (curtime == time){
                id = Math.min(id, logs[i][0]);
            }
        }
        return id;
    }
}