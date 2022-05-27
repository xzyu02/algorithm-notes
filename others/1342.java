// 1342. Number of Steps to Reduce a Number to Zero

// recursion
class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int next = num % 2 == 0 ? num / 2 : num - 1;
        return 1 + numberOfSteps(next);
    }
}

// bit
class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) return 0;
        int step = 0;
        while(num > 0) {
            // odd: substract + divide, 2 steps
            // even: divide, 2 step
            step += ((num & 1) == 1) ? 2 : 1;
            num = num >> 1;
        }
        // when we reach last 1, only substract and not have to divide
        // then minus the additional counted 1
        return step - 1;
    }
}