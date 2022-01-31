package org.tyaa.demo.java.se.lib;

public class MathUtils {
    public static int[][] createTable() {
        int[][] table = new int[11][11];
        // fill the table
        // row loop
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                // the first row
                if (i == 0) {
                    // column number
                    table[i][j] = j;
                } else if (j == 0) { // the first column
                    // row number
                    table[i][j] = i;
                } else {
                    // mult. result
                    table[i][j] = i * j;
                }
            }
        }
        return table;
    }
}
