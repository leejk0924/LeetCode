class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String word : strs) {
            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (charCount[i] > 0) {
                    char ch = (char) (i + 'a');
                    sb.append(ch).append(charCount[i]);
                }
            }
            String key = sb.toString();
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }
}