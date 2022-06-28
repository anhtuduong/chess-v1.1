package com.Piece;

import com.Board;
import com.Spot;
import javafx.scene.image.Image;

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
        if(isWhite){
            image = new Image("com/Piece/img/white_queen.png");
        }else{
            image = new Image("com/Piece/img/black_queen.png");
        }
        setImage(image);
    }

    @Override
    public boolean canMove(Board board, Spot begin, Spot end) {
        return false;
    }
}
