package com.Piece;

import com.Board;
import com.Spot;
import javafx.scene.image.Image;

public class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite);
        if(isWhite){
            image = new Image("com/Piece/img/white_bishop.png");
        }else{
            image = new Image("com/Piece/img/black_bishop.png");
        }
        setImage(image);
    }

    @Override
    public boolean canMove(Board board, Spot begin, Spot end) {
        return false;
    }
}
