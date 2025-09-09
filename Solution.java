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