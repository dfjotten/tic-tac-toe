package nl.novi.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welkom bij Tik Tak Toe");
//        Bord maken
        String[] board = new String[9];

        for (int i = 0; i < 9; i++){
            board[i] = Integer.toString(i);
//            System.out.println(board[i]);
        }

//        printBoard(board);
//
//        for (int i = 0; i < board.length; i++){
//            System.out.print(board[i]);
//
//            boolean isEndOfRow = (i + 1 ) % 3 == 0;
//            boolean isLastField = i == 8;
//
//            if (isEndOfRow == false){
//                System.out.print(" | ");
//            }
//            if (isEndOfRow && !isLastField){
//                System.out.println("\n ___________");
//            }
//        }
        for (int i = 0; i < board.length; i++){
            System.out.print(board[i]);

            boolean isEndOfRow = (i + 1 ) % 3 == 0;
            boolean isLastField = i == 8;

            if (isEndOfRow == false){
                System.out.print(" | ");
            }
            if (isEndOfRow && !isLastField){
                System.out.println("\n ___________");
            }
        }

        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Rondje", "O");

        Player currentPlayer = playerA;

        boolean hasWon = false;

        while (hasWon == false) {
//        Mogelijkheid om een X of O in te zetten
            System.out.println("\n Voer een cijfer van 0 t/m 8 in om op het bord een " + currentPlayer.getName() + " te zetten");

            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            board[selectedField] = currentPlayer.getToken();

            printBoard(board);

            hasWon = hasPlayerWon(board, currentPlayer.getToken());
            if (hasWon == true) {
                System.out.println("\n Gefeliciteerd, speler " + currentPlayer.getName() + " heeft gewonnen");
            }
//        Speler wisselen
            currentPlayer = switchPlayer(currentPlayer, playerA, playerB);
        }

////        String firstSymbol = userInput.nextLine();
//        board[0] = firstSymbol;

//      Board Speler A

////        Speler B
//        System.out.printf("\n Speler 2: Voer een cijfer van 0 t/m 8 in om op het bord een O in te zetten.");
//
////        Scanner userInput = new Scanner(System.in);
//        int selectedFieldPlayerB = userInput.nextInt();
//
//        board[selectedFieldPlayerB] = "O";
//
//        printBoard(board);

//      Board Speler B
//        for (int i = 0; i < board.length; i++){
//            System.out.print(board[i]);
//
//            boolean isEndOfRow = (i + 1 ) % 3 == 0;
//            boolean isLastField = i == 8;
//
//            if (isEndOfRow == false){
//                System.out.print(" | ");
//            }
//            if (isEndOfRow && !isLastField){
//                System.out.println("\n ___________");
//            }
//        }

//        Win conditie

//        Mogelijkheid om een o te zetten

//        Tweede win conditie

//        Loop tot win conditie behaald is
    }

    public static void printBoard(String[] board) {

        for (int i = 0; i < board.length; i++){
        System.out.print(board[i]);

        boolean isEndOfRow = (i + 1 ) % 3 == 0;
        boolean isLastField = i == 8;

        if (isEndOfRow == false){
            System.out.print(" | ");
        }
        if (isEndOfRow && !isLastField){
            System.out.println("\n ___________");
        }
    }

    }

    public static Player switchPlayer(Player currentPlayer, Player playerA, Player playerB){
        if (currentPlayer.getToken() == "X"){
            return playerB;
        }
        else {
            return playerA;
        }
    }

    public static boolean hasPlayerWon (String[] board, String currentPlayer) {
//        Horizontal win condition
        if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer){
            return true;
        }
        if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer){
            return true;
        }
        if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer){
            return true;
        }
//        Vertical win condition
        if (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer){
            return true;
        }
        if (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer){
            return true;
        }
        if (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer){
            return true;
        }
//        Diagonal win condition
        if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer){
            return true;
        }
        if (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer){
            return true;
        }
        return false;
    }
}
