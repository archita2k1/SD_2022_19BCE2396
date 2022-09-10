package com.twentylpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<StringBuilder> player1 = new ArrayList<>();
        ArrayList<StringBuilder> player2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to CLI Chess!");
        System.out.println("Player 1, please enter your player order");

        StringBuilder p1;
        StringBuilder p2;

        for(int i=0;i<5;i++) {
            p1 = new StringBuilder("A-");
            String input = in.next();
            p1.append(input);
            player1.add(p1);
        }

        System.out.println("Player 2, please enter your player order");

        for(int i=0;i<5;i++) {
            p2 = new StringBuilder("B-");
            String input = in.next();
            p2.append(input);
            player2.add(p2);
        }

        Board board = new Board();
        board.initializeBoard(player1,player2);

    }
}
