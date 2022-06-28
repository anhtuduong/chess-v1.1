package com.Piece;

import com.Board;
import com.Spot;
import javafx.scene.image.Image;

public class Rook extends Piece {

    public Rook(boolean isWhite) {
        super(isWhite);
        if(isWhite){
            image = new Image("com/Piece/img/white_rook.png");
        }else{
            image = new Image("com/Piece/img/black_rook.png");
        }
        setImage(image);
    }

    @Override
    public boolean canMove(Board board, Spot begin, Spot end) {
        return false;
    }
}
