package com.battleship.player;

import com.battleship.board.GameBoard;
import com.battleship.pieces.*;

public class Player {
    // tracks where all players ships are
    private GameBoard shipsBoard;

    // tracks where player attacked his opponent so far
    private GameBoard moveBoard;

    //will start at 0 then when player sets up his board will equal to 5 and win player must set oppenent's shipPieces to zero
    private int shipPieces;

//    // appears as 1 on board
//    private Carrier carrier;
//
//    // appears as 2 on board
//    private BattleShip battleShip;
//
//    // appears as 3 on board
//    private Cruiser cruiser;
//
//    // appears as 4 on board
//    private Submarine submarine;
//
//    // appears as 5 on board
//    private Destroyer destroyer;

    // appears as 5 on board
    private boolean carrier;

    // appears as 4 on board
    private boolean battleShip;

    // appears as 3 on board
    private boolean cruiser;

    // appears as 2 on board
    private boolean submarine;

    // appears as 1 on board
    private boolean destroyer;

    public Player(){
        shipsBoard = new GameBoard();
        moveBoard = new GameBoard();

        carrier = false;
        battleShip = false;
        cruiser = false;
        submarine = false;
        destroyer = false;

        shipPieces = 0;
    }

    // h = horizentally
    // v = vertically
    // l = left
    // r= right
    // u = up
    // d = down
    public boolean insertCarrier(char align, char direction, int col, int row){
        if(!carrier){
            if(align == 'h' && direction == 'r' && col + 5 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 5);
                }
                carrier = !carrier;
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 5 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 5);
                }
                carrier = !carrier;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 5 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 5);
                }
                carrier = !carrier;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 5 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 5);
                }
                carrier = !carrier;
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertBattleShip(char align, char direction, int col, int row){
        if(!battleShip){
            if(align == 'h' && direction == 'r' && col + 4 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 4);
                }
                battleShip = !battleShip;
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 4 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 4);
                }
                battleShip = !battleShip;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 4 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 4);
                }
                battleShip = !battleShip;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 4 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 4);
                }
                battleShip = !battleShip;
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertCruiser(char align, char direction, int col, int row){
        if(!cruiser){
            if(align == 'h' && direction == 'r' && col + 3 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 3);
                }
                cruiser = !cruiser;
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 3 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 3);
                }
                cruiser = !cruiser;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 3 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 3);
                }
                cruiser = !cruiser;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 3 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 3);
                }
                cruiser = !cruiser;
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertDestroyer(char align, char direction, int col, int row){
        if(!destroyer){
            if(align == 'h' && direction == 'r' && col + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 2);
                }
                destroyer = !destroyer;
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 2);
                }
                destroyer = !destroyer;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 2);
                }
                destroyer = !destroyer;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 2);
                }
                destroyer = !destroyer;
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertSubmarine(char align, char direction, int col, int row){
        if(!submarine){
            if(align == 'h' && direction == 'r' && col + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 1);
                }
                submarine = !submarine;
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 1);
                }
                submarine = !submarine;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 1);
                }
                submarine = !submarine;
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 1);
                }
                submarine = !submarine;
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public GameBoard getShips() {
        return shipsBoard;
    }

    public GameBoard getMoveBoard() {
        return moveBoard;
    }

    public int getShipPieces() {
        return shipPieces;
    }
}
