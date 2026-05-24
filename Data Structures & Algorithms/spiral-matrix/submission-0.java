class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0, top = 0;
        int right = matrix[0].length, bottom = matrix.length;
        while(left < right && top < bottom){
            // From left -> right
            for(int i = left;i<right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            // From top -> bottom
            for(int i = top;i<bottom;i++){
                res.add(matrix[i][right - 1]);
            }
            right--;

            if(!(left < right && top < bottom)){
                break;
            }

            // From right -> left
            for(int i = right - 1;i > left - 1;i--){
                res.add(matrix[bottom - 1][i]);
            }
            bottom--;

            // From bottom -> top
            for(int i = bottom - 1;i > top - 1;i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
