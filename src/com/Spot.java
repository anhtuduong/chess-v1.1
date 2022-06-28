package com;

import com.Piece.Piece;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Spot extends StackPane {

    private Piece piece;
    private int x;
    private int y;
    private Rectangle rectangle;

    public Spot(Piece piece, int x, int y, Color color) {
        this.piece = piece;
        this.x = x;
        this.y = y;
        rectangle = new Rectangle(Main.SPOT_SIZE, Main.SPOT_SIZE, color);
        getChildren().add(rectangle);
        getChildren().add(piece);
        piece.setSpot(this);
    }

    public Spot(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        rectangle = new Rectangle(Main.SPOT_SIZE, Main.SPOT_SIZE, color);
        getChildren().add(rectangle);
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        getChildren().add(this.piece);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
