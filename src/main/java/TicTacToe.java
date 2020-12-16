class TicTacToe {

    public static void main(String[] args) {
        //Create a board for tictactoe
        createBoard();
    }

    public static void createBoard() {
        char[][] gameBoard = {{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };

        for(char[] row : gameBoard){
            for(char c:row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
