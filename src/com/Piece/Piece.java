package com.Piece;

import com.Board;
import com.Main;
import com.Spot;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Piece extends ImageView {

    protected Image image;
    protected boolean isWhite;
    protected Spot spot;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
        setFitWidth(Main.SPOT_SIZE - 10);
        setFitHeight(Main.SPOT_SIZE - 10);
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public Spot getSpot() {
        return spot;
    }

    public abstract boolean canMove(Board board, Spot begin, Spot end);
}
