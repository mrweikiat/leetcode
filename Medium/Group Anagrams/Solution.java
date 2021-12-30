//Runtime: 18 ms, faster than 21.41% of Java online submissions for Group Anagrams.
//Memory Usage: 53.6 MB, less than 8.14% of Java online submissions for Group Anagrams.
//12/30/2021 23:45	Accepted	18 ms	53.6 MB	java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            // get the char arr of the string
            // use the sorted state of the string as key
            String toCheck = strs[i];
            char[] temp = toCheck.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);

            if (hm.containsKey(key)) {
                hm.get(key).add(toCheck);
            } else {
                hm.put(key, new ArrayList<String>());
                hm.get(key).add(toCheck);
            }
        }

        for (List<String> values : hm.values()) {
            ans.add(values);
        }

        return ans;

    }
}