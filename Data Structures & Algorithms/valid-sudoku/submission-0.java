class Solution {
    public boolean isValidSudoku(char[][] board) {
     Set<String> seen = new HashSet<>();

    for(int i = 0;i<9;i++){
        for(int j=0;j<9;j++){   
            char cell =board[i][j];
            int box = (i/3)*3 +(j/3);
            if(cell== '.')continue;
            if(!seen.add(cell+"row"+i)
            ||!seen.add(cell+"col"+j)||
            !seen.add(cell+"box"+box)){
return false;

            }
        
        }
        
    }
    return true;
}
}