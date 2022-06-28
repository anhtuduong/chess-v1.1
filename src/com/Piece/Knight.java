package com.Piece;

import com.Board;
import com.Spot;
import javafx.scene.image.Image;

public class Knight extends Piece {

    public Knight(boolean isWhite) {
        super(isWhite);
        if(isWhite){
            image = new Image("com/Piece/img/white_knight.png");
        }else{
            image = new Image("com/Piece/img/black_knight.png");
        }
        setImage(image);
    }

    @Override
    public boolean canMove(Board board, Spot begin, Spot end) {
        return false;
    }
}
