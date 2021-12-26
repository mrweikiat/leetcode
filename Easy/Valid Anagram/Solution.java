class Solution {
    public boolean isAnagram(String s, String t) {

        List<String> l1 = new ArrayList<>();

        if (s.length() != t.length()) {
            return false;
        } else {
            boolean isAnagram = true;

            for (int i = 0; i < t.length(); i++) {
                String temp = String.valueOf(t.charAt(i));
                l1.add(temp);
            }

            for (int i = 0; i < s.length(); i++) {
                String unit = String.valueOf(s.charAt(i));
                if (l1.contains(unit)) {
                    l1.remove(unit);
                } else {
                    isAnagram = false;
                    break;
                }
            }
            return isAnagram;
        }
    }
}