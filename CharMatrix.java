/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
    // Fields:
    char[][] m;  // this is the grid

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public CharMatrix(int rows, int cols) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, ' ');
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill character
     */
    public CharMatrix(int rows, int cols, char fill) {
        m = new char[rows][cols];
        fillRect(0, 0, rows-1, cols-1, fill);
    }

    /*
     * Returns the number of rows in grid
     */
    public int numRows() {
        return m.length; //
    }

    /*
     * Returns the number of columns in grid
     */
    public int numCols() {
        return m[0].length; //
    }

    /*
     * Returns the character at the indexes [row, col]
     */
    public char charAt(int row, int col){
        return m[row][col];
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public void setCharAt(int row, int col, char ch) {
        m[row][col] = ch;
    }

    /*
     * Returns true if the character at row, col is a SPACE,
     * false otherwise
     */
    public boolean isEmpty(int row, int col) {
        if (m[row][col] == ' ') {
            return true;
        }
        return false;
    }

    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void fillRect(int rowo, int col0, int row1, int col1, char fill) {
        for (int r = rowo; r <= row1; r++) {
            for (int c = col0; c <= col1; c++) {
                m[r][c] = fill;
            }
        }
    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public void clearRect(int rowo, int col0, int row1, int col1) {
        for (int r = rowo; r <= row1; r++) {
            for (int c = col0; c <= col1; c++) {
                m[r][c] = ' ';
            }
        }
    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public int countInRow(int row) {
        int notspace = 0;
        for (int i = 0; i < m[0].length; i++) {
            if (m[row][i] != ' ') {
                notspace++;
            }
        }
        return notspace;
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public int countInCol(int col) {
        int notspace = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][col] != ' ') {
                notspace++;
            }
        }
        return notspace;
    }

    /*
     * Displays the contents of the matrix m
     */
    public void display () {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        CharMatrix matrix = new CharMatrix(3, 4, 'm');

        //program in your test cases here. Invoke methods from the
        //object called matrix, like this:

        matrix.display();
    }

}

