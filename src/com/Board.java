package com;

import com.Piece.*;
import javafx.scene.layout.GridPane;

public class Board extends GridPane {

    public Board() {

        // Blank board
        boolean paintedWhite = false;
        for(int x=0; x<8; x++){
            for(int y=0; y<8; y++){
                if(paintedWhite){
                    add(new Spot(x, y, Main.SPOT_COLOR_WHITE), x, y);
                    paintedWhite = !paintedWhite;
                }
                else{
                    add(new Spot(x, y, Main.SPOT_COLOR_BLACK), x, y);
                    paintedWhite = !paintedWhite;
                }
            }
            paintedWhite = !paintedWhite;
        }

        setStandardPieces();
    }

    public void setStandardPieces() {
        for(int i=0; i<8; i++){
            getSpot(i, 1).setPiece(new Pawn(false));
            getSpot(i, 6).setPiece(new Pawn(true));
        }
        getSpot(0, 0).setPiece(new Rook(false));
        getSpot(7, 0).setPiece(new Rook(false));
        getSpot(0, 7).setPiece(new Rook(true));
        getSpot(7, 7).setPiece(new Rook(true));

        getSpot(1, 0).setPiece(new Knight(false));
        getSpot(6, 0).setPiece(new Knight(false));
        getSpot(1, 7).setPiece(new Knight(true));
        getSpot(6, 7).setPiece(new Knight(true));

        getSpot(2, 0).setPiece(new Bishop(false));
        getSpot(5, 0).setPiece(new Bishop(false));
        getSpot(2, 7).setPiece(new Bishop(true));
        getSpot(5, 7).setPiece(new Bishop(true));

        getSpot(3, 0).setPiece(new Queen(false));
        getSpot(3, 7).setPiece(new Queen(true));

        getSpot(4, 0).setPiece(new King(false));
        getSpot(4, 7).setPiece(new King(true));
    }

    public Spot getSpot(int x, int y) {
        Spot temp = null;
        for(int i=0; i<getChildren().size(); i++){
            temp = (Spot) getChildren().get(i);
            if(getColumnIndex(temp) == x && getRowIndex(temp) == y){
                return temp;
            }
        }
        return temp;
    }
}
