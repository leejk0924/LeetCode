import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        
        ++digits[digits.length-1];
        for(int i = digits.length-1; i>0; i--){
            if(digits[i] > 9){
                digits[i] = 0;
                digits[i-1] = (digits[i-1] + 1);
            }
        }
        String collect = Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining());
        return Arrays.stream(collect.split("")).mapToInt(Integer::valueOf).toArray();
    }
}