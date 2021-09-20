class Solution {
    public String tictactoe(int[][] moves) {
        boolean a = checkRowAndCol(moves, true) || checkDiagonal(moves, true);
        boolean b = checkRowAndCol(moves, false) || checkDiagonal(moves, false);
        if (a && !b) return "A";
        else if (b && !a) return "B";
        else if (moves.length == 9) return "Draw";
        return "Pending";
    }

    public boolean checkDiagonal(int[][] moves, boolean first) {
        int[][] valid1 = new int[][]{new int[]{0, 0}, new int[]{1, 1}, new int[]{2, 2}};
        int[][] valid2 = new int[][]{new int[]{1, 1}, new int[]{2, 0}, new int[]{0, 2}};
        int diag1 = 0, diag2 = 0;
        for (int i = first ? 0 : 1; i < moves.length; i += 2) {
            for (int j = 0; j < valid1.length; j++) {
                if (moves[i][0] == valid1[j][0] && moves[i][1] == valid1[j][1]) diag1++;
            }
            for (int j = 0; j < valid2.length; j++) {
                if (moves[i][0] == valid2[j][0] && moves[i][1] == valid2[j][1]) diag2++;
            }
            if (diag1 == 3 || diag2 == 3) return true;
        }
        return false;
    }

    public boolean checkRowAndCol(int[][] moves, boolean first) {
        for (int j = 0; j < 3; j++) {
            int col = 0, row = 0;
            for (int i = first ? 0 : 1; i < moves.length; i += 2) {
                if (moves[i][0] == j) col++;
                if (moves[i][1] == j) row++;
            }
            if (col == 3 || row == 3) return true;
        }
        return false;
    }
}