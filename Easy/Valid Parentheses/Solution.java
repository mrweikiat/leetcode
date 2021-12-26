class Solution {
    public boolean isValid(String s) {

        // 12/26/2021 21:04	Accepted	1 ms	36.8 MB	java

        // opener : ( , { , [
        // to close : ) , } , ]

        // as long as it is a opener you store it in a stack
        // once u hit a 'to close' you peek at the stack
        // to see if it can be closed by the same type of bracket

        Stack<Character> stk = new Stack<>();
        boolean ans = true;

        if (s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {

                char curr = s.charAt(i);
                if (ans != true) {
                    break;
                }

                if (curr == '{' || curr == '[' || curr == '(' ) {
                    stk.push(curr);
                } else if (curr == ')' && !stk.empty()) {
                    if (stk.peek() != '(') {
                        ans = false;
                    } else {
                        stk.pop();
                    }
                } else if (curr == ']' && !stk.empty()) {
                    if (stk.peek() != '[') {
                        ans = false;
                    } else {
                        stk.pop();
                    }
                } else if (curr == '}' && !stk.empty() ) {
                    if (stk.peek() != '{') {
                        ans = false;
                    } else {
                        stk.pop();
                    }
                } else {
                    // if we never hit all the other use cases
                    // the only use case left is that there are no opener
                    // so return false
                    ans = false;
                }
            }

            if (!stk.empty()) {
                ans = false;
            }
        }

        return ans;

    }
}