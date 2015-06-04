package model;

import java.awt.image.PixelGrabber;

public class State {
    private long pacmanPosition;
    private Board board;

    public State() {
        this.board = new Board();
    }

    public Board getBoard() {
        return board;
    }

    public Position getPacmanPosition() {
        return Pacman.getPosition();
    }
}
