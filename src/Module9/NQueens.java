package Module9;

//NQueens Leetcode51
    import java.util.*;
    public class NQueens {
        public static List<List<String>> solveNQueens(int n) {
            List<List<String>> res = new ArrayList<>();
            char[][] board = new char[n][n];
            for (char[] row : board) Arrays.fill(row, '.');
            backtrack(res, board, 0);
            return res;
        }

        private static void backtrack(List<List<String>> res, char[][] board, int row) {
            int n = board.length;
            if (row == n) {
                res.add(construct(board));
                return;
            }
            for (int col = 0; col < n; col++) {
                if (isSafe(board, row, col)) {
                    board[row][col] = 'Q';
                    backtrack(res, board, row + 1);
                    board[row][col] = '.';
                }
            }
        }

        private static boolean isSafe(char[][] board, int row, int col) {
            int n = board.length;
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 'Q') return false;
            }
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') return false;
            }
            for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
                if (board[i][j] == 'Q') return false;
            }
            return true;
        }

        private static List<String> construct(char[][] board) {
            List<String> res = new ArrayList<>();
            for (char[] row : board) res.add(new String(row));
            return res;
        }

        public static void main(String[] args) {
            System.out.println(solveNQueens(4));
        }
    }


