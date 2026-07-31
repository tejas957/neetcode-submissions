class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> k = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            k.putIfAbsent(sorted, new ArrayList<>());
            k.get(sorted).add(s);

        }
        return new ArrayList<>(k.values());


    }
}
