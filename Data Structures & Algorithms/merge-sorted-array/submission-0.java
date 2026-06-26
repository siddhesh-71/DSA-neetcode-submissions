class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;
        int k =0;
        int[]soln =new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                soln[k]=nums1[i];
                i++;
                k++;
            }
            else{
                soln[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            soln[k]=nums1[i];
                i++;
                k++;
        }
        while(j<n){
            soln[k]=nums2[j];
                j++;
                k++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = soln[x];
        }
        return ;
    }
}