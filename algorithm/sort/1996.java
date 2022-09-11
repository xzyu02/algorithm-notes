// 1996. The Number of Weak Characters in the Game

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        // [[7,2],[6,3],[6,1]], [6,1] < [7,2], sorting defense ascending will make this count
        int cnt = 0;
        int maxDef = properties[0][1];
        for (int i = 0; i < properties.length; i++) {
            // if less than previous any def, that means attack must small
            // since defense was ascending sorted when attacks are the same
            if (maxDef > properties[i][1]) {
                cnt += 1;
            }
            maxDef = Math.max(maxDef, properties[i][1]);
        }
        return cnt;
    }
}