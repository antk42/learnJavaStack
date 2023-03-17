package org.example.example;

public class MyLibMatrixProcessingException extends MyLibException{
    private int row;
    private int column;
    private int value;

    public MyLibMatrixProcessingException(int row, int column, int[][] array) {
        super("Invalid data in [" + column + " ; " + row + "]: " + array[column][row]);
        this.row = row;
        this.column = column;
        this.value = array[column] [row];

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }
}
