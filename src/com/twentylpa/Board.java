package com.twentylpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Board {

    Scanner in = new Scanner(System.in);
    String[][] board = new String[5][5];


    public void initializeBoard(ArrayList<StringBuilder> p1, ArrayList<StringBuilder> p2) {

        Arrays.stream(board).forEach(a -> Arrays.fill(a, "_"));

        for (int i = 0; i < 5; i++) {
            board[0][i] = p2.get(i).toString();
        }

        for (int i = 0; i < 5; i++) {
            board[4][i] = p1.get(i).toString();
        }

        //printBoard();

        boolean chance = true;
        while (true) {

            if (p1.isEmpty()) {
                System.out.println("Player 2 wins!");
                break;
            }
            if (p2.isEmpty()) {
                System.out.println("Player 1 wins!");
                break;
            }

            //player 1
            String playerMove = in.next();

            if(chance) {
                String move = "A-" + playerMove.substring(0,2);
                int index = p1.indexOf(move);
                if(playerMove.endsWith("F")) {
                    String temp = board[4-1][index];
                    board[4-1][index] = board[4][index];
                    board[4][index] = temp;
                    chance = false;
                }
                else if(playerMove.endsWith("B")) {
                    String temp = board[4+1][index];
                    board[4+1][index] = board[4][index];
                    board[4][index] = temp;
                    chance = false;

                }else if(playerMove.endsWith("L")) {
                    String temp = board[4][index-1];
                    board[4][index-1] = board[4][index];
                    board[4][index] = temp;
                    chance = false;

                }else if(playerMove.endsWith("R")) {
                    String temp = board[4][index+1];
                    board[4][index+1] = board[4][index];
                    board[4][index] = temp;
                    chance = false;
                }
                else {
                    System.out.println("Invalid Input please enter again!");
                }
                printBoard();
            }

            //player 2
            if(!chance) {
                String move = "B-" + playerMove.substring(0,2);
                int index = p1.indexOf(move);
                if(playerMove.endsWith("F")) {
                    String temp = board[0+1][index];
                    board[0+1][index] = board[0][index];
                    board[0][index] = temp;
                    chance = true;
                }
                else if(playerMove.endsWith("B")) {
                    String temp = board[0-1][index];
                    board[0-1][index] = board[0][index];
                    board[0][index] = temp;
                    chance = true;

                }else if(playerMove.endsWith("L")) {
                    String temp = board[0][index-1];
                    board[0][index-1] = board[0][index];
                    board[0][index] = temp;
                    chance = true;

                }else if(playerMove.endsWith("R")) {
                    String temp = board[0][index+1];
                    board[0][index+1] = board[0][index];
                    board[0][index] = temp;
                    chance = true;
                }
                else {
                    System.out.println("Invalid Input please enter again!");
                }
                printBoard();
            }

        }

    }

    public void printBoard() {
        System.out.println(Arrays.deepToString(board));
    }

}
