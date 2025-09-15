class Solution {
    public void setZeroes(int[][] matrix) {
        settingZero(matrix);
    }

    void settingZero(int[][] mat){
        int c=0;
        for(int k=0;k<mat.length;k++){
            for(int l=0;l<mat[0].length;l++){
                if(mat[k][l]==0) c++;
            }
        }
        int[][] zeros=new int[c][2];
        int z=0;
        for(int k=0;k<mat.length;k++){
            for(int l=0;l<mat[0].length;l++){
                if(mat[k][l]==0){
                    zeros[z][0]=k;
                    zeros[z++][1]=l;
                }
            }
        }

        for(int i=0;i<zeros.length;i++){
            int row=zeros[i][0];
            int col=zeros[i][1];
            for(int j=0;j<mat.length;j++){
                mat[j][col]=0;
            }
            for(int j=0;j<mat[0].length;j++){
                mat[row][j]=0;
            }
        }
    }
}