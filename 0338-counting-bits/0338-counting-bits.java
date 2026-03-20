class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int pow = 1;
        int x= 1;

        for (int i = 1; i <= n; i++) {
            if (i == pow) {
                pow *= 2;
                x = i;
            }
            result[i] = result[i - x] + 1;
        }
        return result;
    }
}