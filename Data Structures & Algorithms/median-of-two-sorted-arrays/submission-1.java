class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int md = totalLength / 2;
        int mm = totalLength % 2;
        
        if (mm == 0) {
            // Note: Changed float to double to match the return type and preserve precision
            double ans = med(md, nums1, nums2);
            ans = ans + med(md - 1, nums1, nums2);
            return ans / 2.0;
        } else {
            return med(md, nums1, nums2);
        }
    }
    
    // Modified helper to dynamically find the element at index 'm' in the sorted merged sequence
    public double med(int m, int[] nums1, int[] nums2) {
        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2
        int count = 0;
        
        while (i < nums1.length || j < nums2.length) {
            int currentVal;
            
            // Choose the smaller element between the two current pointers
            if (i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                currentVal = nums1[i];
                i++;
            } else {
                currentVal = nums2[j];
                j++;
            }
            
            if (count == m) {
                return currentVal;
            }
            
            count++;
        }
        
        return 0;
    }
}