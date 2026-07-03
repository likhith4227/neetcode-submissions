class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m  = mat[0].length;
        int l=0,h=n*m-1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            int row = mid/m;
            int col = mid%m;

            if(mat[row][col]==target)
            {
                return true;
            }
            else if(mat[row][col]>target)
            h = mid-1;
            else
            l= mid+1;
        }
        return false;
        
    }
}
