class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {        
            for (int j = k; j < n; j++) {
                nums1[i] += nums2[j];
                break;
            }
            k++;
        }
    }
}