package com.Piece;

import com.Board;
import com.Spot;
import javafx.scene.image.Image;

public class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(isWhite);
        if(isWhite){
            image = new Image("com/Piece/img/white_pawn.png");
        }else{
            image = new Image("com/Piece/img/black_pawn.png");
        }
        setImage(image);
    }

    @Override
    public boolean canMove(Board board, Spot begin, Spot end) {
        return false;
    }
}
