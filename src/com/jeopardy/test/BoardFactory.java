package com.jeopardy.test;

public class BoardFactory {
  private BoardFactory() {
  }

  public static Board createBoard(int session, int numberOfPlayers, int difficulty) {
    Board board = new Board(session, numberOfPlayers, difficulty);

    return board;
  }
}