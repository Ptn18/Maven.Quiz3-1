package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board.length];
     for(int i = 0; i < board.length; i++){
         column[i] = board[i][value];
     }

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        for(int i = 0; i < row.length-1; i++) {
            if (row[i].equals(row[i+1])){
                return true;
            }
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column= getColumn(columnIndex);
        for(int i = 0; i < column.length-1; i++) {
            if (!column[i].equals(column[i+1])){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        for(int i = 0; i < board.length;i++){
            if(isRowHomogenous(i).equals("O") || isColumnHomogeneous(i).equals("O")){
                return "O";
            }
        }
        return "X";
    }

    public String[][] getBoard() {
        return board;
    }
}
