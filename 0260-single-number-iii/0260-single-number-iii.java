class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> temp = new HashMap<>();
        for (int num : nums) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        Set<Integer> integers = temp.keySet();
        for (Integer integer : integers) {
            if (temp.get(integer) == 1) {
                result.add(integer);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}