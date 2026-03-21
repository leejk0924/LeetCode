class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int diff = xor & (-xor);

        int[] result = new int[2];
        for (int num1 : nums) {
            if ((num1 & diff) == 0) {
                result[0] ^= num1;
            } else {
                result[1] ^= num1;
            }
        }
        return result;
    }
}