package com.Piece;

import com.Board;
import com.Spot;
import javafx.scene.image.Image;

public class King extends Piece {

    public King(boolean isWhite) {
        super(isWhite);
        if(isWhite){
            image = new Image("com/Piece/img/white_king.png");
        }else{
            image = new Image("com/Piece/img/black_king.png");
        }
        setImage(image);
    }

    @Override
    public boolean canMove(Board board, Spot begin, Spot end) {
        return false;
    }
}
