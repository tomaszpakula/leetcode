class Solution {
    public static int count(int[][] board, int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i ++) {
            for (int j = col - 1; j <= col + 1; j ++) {
                if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 1 && !(i==row && j==col)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        int count;
        int[][] newBoard = new int[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                count = count(board, row, col);

                if (board[row][col] == 1 && count != 2 && count != 3) {
                    newBoard[row][col] = 0;
                }
                else if (board[row][col] == 0 && count == 3) newBoard[row][col] = 1;
                else{
                    newBoard[row][col]=board[row][col];
                }
            }
        }
        

        for(int row=0; row< board.length; row++){
            System.arraycopy(newBoard[row], 0, board[row], 0, board[0].length);
        }
    }
}