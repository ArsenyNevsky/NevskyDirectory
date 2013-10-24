package Model;


public class Table {


    public Table() {
        initTable();
    }


    public void setValueTable(int numberButton, int val) {
        if (isAllCell()) {
            return;
        }
        switch (numberButton) {
            case 1:
                setVal(0, 0, val);
                break;
            case 2:
                setVal(0, 1, val);
                break;
            case 3:
                setVal(0, 2, val);
                break;
            case 4:
                setVal(1, 0, val);
                break;
            case 5:
                setVal(1, 1, val);
                break;
            case 6:
                setVal(1, 2, val);
                break;
            case 7:
                setVal(2, 0, val);
                break;
            case 8:
                setVal(2, 1, val);
                break;
            case 9:
                setVal(2, 2, val);
                break;
        }
    }


    public boolean isWin() {
        return (isLineWin() || isColumnWin() || isDiagWin() || isAllCell()) ? true : false;
    }


    public int[][] getTable() {
        return table;
    }


    public int getElemenet(int i, int j) {
        return table[i][j];
    }


    private void initTable() {
        table = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                table[i][j] = 0;
            }
        }
    }


    private void setVal(int i, int j, int val) {
        table[i][j] = val;
    }


    private boolean isAllCell() {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (table[i][j] != 0) {
                    count++;
                }
            }
        }
        return (count == 9) ? true : false;
    }

    private boolean isLineWin() {
        return isLineX() || isLineO();
    }

    private boolean isLineX() {
        return (((table[0][1] == X) && (table[0][2] == X) && (table[0][2]) == X) ||
               ((table[1][0] == X) && (table[1][1] == X) && (table[1][2]) == X) ||
               ((table[2][0] == X) && (table[2][1] == X) && (table[2][2]) == X));
    }

    private boolean isLineO() {
        return (((table[0][0] == O) && (table[0][1] == O) && (table[0][2]) == O) ||
               ((table[1][0] == O) && (table[1][1] == O) && (table[1][2]) == O) ||
               ((table[2][0] == O) && (table[2][1] == O) && (table[2][2]) == O));
    }


    private boolean isColumnWin() {
        return isColumnX() || isColumnO();
    }

    private boolean isColumnX() {
        return (((table[0][0] == X) && (table[1][0] == X) && (table[2][0]) == X) ||
               ((table[0][1] == X) && (table[1][1] == X) && (table[2][1] == X)) ||
               ((table[0][2] == X) && (table[1][2] == X) && (table[2][2] == X)));
    }

    private boolean isColumnO() {
        return (((table[0][0] == 2) && (table[1][0] == 2) && (table[2][0]) == 2) ||
               ((table[0][1] == 2) && (table[1][1] == 2) && (table[2][1] == 2)) ||
               ((table[0][2] == 2) && (table[1][2] == 2) && (table[2][2] == 2)));
    }


    private boolean isDiagWin() {
        return isMainDiagX() ||
               isSecondDiagX() ||
               isMainDiagO() ||
               isSecondDiagO();
    }

    private boolean isMainDiagX() {
        return (table[0][0] == X) && (table[1][1] == X) && (table[2][2] == X);
    }

    private boolean isMainDiagO() {
        return (table[2][0] == O) && (table[1][1] == O) && (table[0][2] == O);
    }

    private boolean isSecondDiagX() {
        return (table[2][0] == 1) && (table[1][1] == 1) && (table[0][2] == 1);
    }

    private boolean isSecondDiagO() {
        return (table[0][0] == O) && (table[1][1] == O) && (table[2][2] == O);
    }


    private final int SIZE = 3;
    private final int X = 1;
    private final int O = 2;
    private int table[][];
}