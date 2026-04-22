package Tictactoe;

public class Tictactoe {
    int n ;
    char board[][] ;
    int row[];
    int col[];
    int diag ;
    int antidiag ;
    player player1 ;
    player player2 ;
    player currentPlayer ;
    int move  = 0 ;


    public Tictactoe(int n, player player1, player player2) {
        this.n = n;
        this.board = new char[n][n];
        this.row = new int[n];
        this.col = new int[n];
         this.move = 0 ;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player2 ;
    }

  public  String play(int r , int c){
        if(r<0 || r>=n || c<0 || c>=n) return "Invalid";

        if(board[r][c]!= '\0') return "Occupied" ;

        board[r][c] = currentPlayer.symbol;

        int  val =  currentPlayer == player1 ? 1 :-1;
        row[r] = row[r] + val ;
        col[c] = col[c] + val ;
move++ ;
        if(r==c)
           diag = diag +val ;
        if(r+c == n-1) antidiag= antidiag + val ;

        if(Math.abs(row[r]) == n || Math.abs(col[c]) == n || Math.abs(diag) == n || Math.abs(antidiag) == n)
            return currentPlayer.name + " wins"; ;

        if(move == n*n) return "Draw" ;
        switchPlayer();
        return "Continue";
    }
  public  void switchPlayer(){
currentPlayer = currentPlayer == player1 ?  player2:  player1 ;
    }

  public  void printBoard(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((board[i][j] == '\0' ? '-' : board[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
