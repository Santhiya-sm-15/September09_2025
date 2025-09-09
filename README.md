# September09_2025
The problem that I solved today

You are given two arrays mices[] and holes[] of the same size. The array mices[] represents the positions of the mice on a straight line, while the array holes[] represents the positions of the holes on the same line. Each hole can accommodate exactly one mouse. A mouse can either stay in its current position, move one step to the right, or move one step to the left, and each move takes one minute. The task is to assign each mouse to a distinct hole in such a way that the time taken by the last mouse to reach its hole is minimized.

Code:
class Solution {
    public int assignHole(int[] mices, int[] holes) {
        Arrays.sort(mices);
        Arrays.sort(holes);
        int n=mices.length;
        int res=0;
        for(int i=0;i<n;i++)
            res=Math.max(res,Math.abs(mices[i]-holes[i]));
        return res;
    }
};
