class TicTacToe implements BoardGameInterface {

  private char[][] ttt;
  private char currPlayer;
  public static final int NUM_ROWS = 3;
  public static final int NUM_COLS = 3;

  public TicTacToe() {
    ttt = new char[NUM_ROWS][NUM_COLS];
    // currPlayer = PLAYER_X;
    populateBoard();
  }

  public void populateBoard() {
    for (int i = 0; i < ttt.length; i++) {
      for (int j = 0; j < ttt[i].length; j++) {
        ttt[i][j] = EMPTY_CELL;
      }
    }
  }

  public void displayBoard() {
    System.out.println("  0 1 2");
    for (int i = 0; i < ttt.length; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < ttt[i].length; j++) {
        System.out.print(ttt[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void clearBoard() {
    populateBoard();
  }

  public void placeMarker(int rowIndex, int colIndex) {
    if (ttt[rowIndex][colIndex] == EMPTY_CELL) {
      ttt[rowIndex][colIndex] = currPlayer;
      changeTurn();
    }
  }

  public boolean isWinner() {
    // Check rows
    for (int i = 0; i < ttt.length; i++) {
      if (ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[i][2] && ttt[i][0] != EMPTY_CELL) {
        return true;
      }
    }

    // Check columns
    for (int i = 0; i < ttt.length; i++) {
      if (ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i] && ttt[0][i] != EMPTY_CELL) {
        return true;
      }
    }

    // Check diagonals
    if (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && ttt[0][0] != EMPTY_CELL) {
      return true;
    }
    if (ttt[0][2] == ttt[1][1] && ttt[1][1] == ttt[2][0] && ttt[0][2] != EMPTY_CELL) {
      return true;
    }

    return false;
  }

  public boolean isDraw() {
    return !isWinner() && isFull();
  }

  public boolean isEmpty() {
    for (int i = 0; i < ttt.length; i++) {
      for (int j = 0; j < ttt[i].length; j++) {
        if (ttt[i][j] != EMPTY_CELL) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isFull() {
    for (int i = 0; i < ttt.length; i++) {
      for (int j = 0; j < ttt[i].length; j++) {
        if (ttt[i][j] == EMPTY_CELL) {
          return false;
        }
      }
    }
    return true;
  }

  public void changeTurn() {
    if (currPlayer == PLAYER_X) {
      currPlayer = PLAYER_O;
    } else {
      currPlayer = PLAYER_X;
    }
  }
}
