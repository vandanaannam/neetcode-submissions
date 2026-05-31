class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int md = (nums1.length + nums2.length)/2;
        int mm = (nums1.length + nums2.length)%2;
        if(mm == 0){
            float ans =0;
            ans = med(md, nums1.length, nums2.length, nums1, nums2);
            ans = ans + med(md -1, nums1.length, nums2.length, nums1, nums2);
            return ans/2;
        }
        else{
            return med(md, nums1.length, nums2.length, nums1, nums2);
        }
    }
    public float med(int m, int l1, int l2, int[] nums1, int[] nums2){
        if(m <= l1 -1){
            return nums1[m];
        }
        else{
            return nums2[m-l1];
        }
    }
}
