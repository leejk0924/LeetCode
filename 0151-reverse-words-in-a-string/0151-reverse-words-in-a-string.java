class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> list = Arrays.stream(words).filter(Predicate.not(String::isEmpty)).toList();
        Deque<String> stack = new ArrayDeque<>();
        for (String word : list) {
            stack.push(word);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stack.pop());
        while (stack.iterator().hasNext()) {
            sb.append(" ").append(stack.pop());
        }
        return sb.toString().trim();
    }
}