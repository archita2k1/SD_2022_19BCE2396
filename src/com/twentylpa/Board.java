package com.twentylpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Board {

    Scanner in = new Scanner(System.in);
    String[][] board = new String[5][5];


    public void initializeBoard(ArrayList<StringBuilder> p1,ArrayList<StringBuilder> p2 ) {

        Arrays.stream(board).forEach(a -> Arrays.fill(a, "_"));

        for(int i=0;i<5;i++) {
            board[0][i] = p2.get(i).toString();
        }

        for(int i=0;i<5;i++) {
            board[4][i] = p1.get(i).toString();
        }

        //printBoard();

        boolean chance = true;
        while (!p1.isEmpty() && !p2.isEmpty()) {

            String playerMove = in.next();


        }

    }

    public void printBoard() {
        System.out.println(Arrays.deepToString(board));
    }

}
