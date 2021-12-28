//Runtime: 15 ms, faster than 7.41% of Java online submissions for Merge Intervals.
//Memory Usage: 41.5 MB, less than 72.65% of Java online submissions for Merge Intervals.
//12/28/2021 23:18	Accepted	15 ms	41.5 MB	java
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        int headPointer = intervals[0][0];
        int tailPointer = intervals[0][1];
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        for (int i = 1; i < intervals.length; i++) {
            int[] temp = intervals[i];
            //System.out.println(temp[0] + " " + temp [1]);
            if (tailPointer >= temp[0]) {
                // means there is some form of overlap
                // since we sorted we KNOW that headPointer < temp[0]
                // headPointer doesnt change while tailPointer is now temp[1]
                if (tailPointer < temp[1]) {
                    tailPointer = temp[1];
                }

            } else if (tailPointer < temp[0]) {
                // end of the line, time to save the current interval and start a new one
                List<Integer> holder = new ArrayList<>();
                holder.add(headPointer);
                holder.add(tailPointer);
                resultList.add(holder);
                System.out.println(headPointer + " " + tailPointer);
                headPointer = temp[0];
                tailPointer = temp[1];
            }
        }

        List<Integer> fina = new ArrayList<>();
        fina.add(headPointer);
        fina.add(tailPointer);
        resultList.add(fina);

        int[][] ans = new int[resultList.size()][2];
        int count = 0;
        for (List<Integer> temp : resultList) {
            int first = temp.get(0);
            int second = temp.get(1);
            ans[count][0] = first;
            ans[count][1] = second;
            count++;
        }

        return ans;

    }
}