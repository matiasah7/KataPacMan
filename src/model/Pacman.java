package model;

public class Pacman {
    private static Position position;

    public Pacman() {
        this.setPosition(new Position(0,0));
    }

    public static Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        Pacman.position = position;
    }
}
