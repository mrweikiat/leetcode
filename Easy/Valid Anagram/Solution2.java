class Solution2 {
    public boolean isAnagram(String s, String t) {

        // 12/26/2021 14:50	Accepted	3 ms	39 MB	java

        // create array to store all occurrence of 26 small letters
        // add the counter for the s
        // minus the counter for t
        // everything has to add up to zero for anagram

        int[] counterArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counterArr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            counterArr[t.charAt(i) - 'a']--;
        }

        for (int element : counterArr) {
            if (element != 0) {
                return false;
            }
        }

        return true;
    }

}