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

    // appears as 5 on board
    private Carrier carrier;

    // appears as 4 on board
    private BattleShip battleShip;

    // appears as 3 on board
    private Cruiser cruiser;

    // appears as 2 on board
    private Destroyer destroyer;

    // appears as 1 on board
    private Submarine submarine;


    public Player(){
        shipsBoard = new GameBoard();
        moveBoard = new GameBoard();

        battleShip = null;
        carrier = null;
        cruiser = null;
        submarine = null;
        destroyer = null;

        shipPieces = 0;
    }

    // h = horizentally
    // v = vertically
    // l = left
    // r= right
    // u = up
    // d = down
    public boolean insertCarrier(char align, char direction, int col, int row){
        if(carrier == null){
            carrier = new Carrier();
        }

        if(!carrier.isPlaced()){
            if(align == 'h' && direction == 'r' && col + 5 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col - i, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 5);
                }
                carrier.setPlaced(!carrier.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 5 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col + j, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 5);
                }
                carrier.setPlaced(!carrier.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 5 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row - j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 5);
                }
                carrier.setPlaced(!carrier.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 5 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row + j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 5);
                }
                carrier.setPlaced(!carrier.isPlaced());
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertBattleShip(char align, char direction, int col, int row){
        if(battleShip == null){
            battleShip = new BattleShip();
        }

        if(!battleShip.isPlaced()){
            if(align == 'h' && direction == 'r' && col + 4 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col - i, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 4);
                }
                battleShip.setPlaced(!battleShip.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 4 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col + i, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 4);
                }
                battleShip.setPlaced(!battleShip.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 4 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row - j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 4);
                }
                battleShip.setPlaced(!battleShip.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 4 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row + j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 4);
                }
                battleShip.setPlaced(!battleShip.isPlaced());
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertCruiser(char align, char direction, int col, int row){
        if(cruiser == null){
            cruiser = new Cruiser();
        }

        if(!cruiser.isPlaced()){
            if(align == 'h' && direction == 'r' && col + 3 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col - i, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 3);
                }
                cruiser.setPlaced(!cruiser.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 3 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col + i, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 3);
                }
                cruiser.setPlaced(!cruiser.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 3 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row - j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 3);
                }
                cruiser.setPlaced(!cruiser.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 3 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row + j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 3);
                }
                cruiser.setPlaced(!cruiser.isPlaced());
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertDestroyer(char align, char direction, int col, int row){
        if(destroyer == null){
            destroyer = new Destroyer();
        }
        if(!destroyer.isPlaced()){
            if(align == 'h' && direction == 'r' && col + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col - j, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 2);
                }
                destroyer.setAlive(!destroyer.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col + j, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 2);
                }
                destroyer.setAlive(!destroyer.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row - j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 2);
                }
                destroyer.setAlive(!destroyer.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row + j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 2);
                }
                destroyer.setAlive(!destroyer.isPlaced());
                shipPieces++;
                return true;

            }
        }
        return false;

    }

    public boolean insertSubmarine(char align, char direction, int col, int row){
        if(submarine == null){
            submarine = new Submarine();
        }
        if(!submarine.isPlaced()){
            if(align == 'h' && direction == 'r' && col + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col + i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col - j, row, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col + i, row, 1);
                }
                submarine.setPlaced(!submarine.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'h' && direction == 'l' && col - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col - i, row) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col + j, row , 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col - i, row, 1);
                }
                submarine.setPlaced(!submarine.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'u' && row + 2 < 10){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row + i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row - j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row + i, 1);
                }
                submarine.setPlaced(!submarine.isPlaced());
                shipPieces++;
                return true;

            }if(align == 'v' && direction == 'd' && row - 2 > 0){
                for(int i = 0; i < 5; i++){
                    if(shipsBoard.getTile(col, row - i) != 0){
                        for(int j = i; j >= 0; j--){
                            shipsBoard.insert(col, row + j, 1);
                        }
                        return false;
                    }
                    shipsBoard.insert(col, row - i, 1);
                }
                submarine.setPlaced(!submarine.isPlaced());
                shipPieces++;
                return true;

            }
        }
        return false;
    }

    public boolean changeShipInsert(int ship, char align, char direction, int col, int row){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(shipsBoard.getTile(i, j) == ship){
                    shipsBoard.insert(i, j, 0);
                }
            }
        }

        if(ship == 5){
            carrier.setPlaced(false);
            return this.insertCarrier(align, direction, col, row);
        }if(ship == 4){
            battleShip.setPlaced(false);
            return this.insertBattleShip(align, direction, col, row);
        }if(ship == 3){
            cruiser.setPlaced(false);
            return this.insertCruiser(align, direction, col, row);
        }if(ship == 2){
            destroyer.setPlaced(false);
            return this.insertDestroyer(align, direction, col, row);
        }if(ship == 1){
            submarine.setPlaced(false);
            return this.insertSubmarine(align, direction, col, row);
        }

        return false;
    }

    //checks if it hit any ships and if it does checks if its sunk
    // 8 means hit
    /*return values:
        h == hit but not sunk
        m == miss/already hit that ship/area prev
        b == sunk battleship
        c == sunk carrier
        k == sunk cruiser
        d == sunk destroyer
        s == sunk submarine
     */

    public char registerHit(int col, int row){
        if(shipsBoard.getTile(col, row) == 5){
            shipsBoard.insert(col, row, 8);
            carrier.decrementHealth();
            if(!carrier.isAlive()){
                shipPieces--;
                return 'c';
            }
            return 'h';
        }if(shipsBoard.getTile(col, row) == 4){
            shipsBoard.insert(col, row, 8);
            battleShip.decrementHealth();
            if(!battleShip.isAlive()){
                shipPieces--;
                return 'b';
            }
            return 'h';
        }if(shipsBoard.getTile(col, row) == 3){
            shipsBoard.insert(col, row, 8);
            cruiser.decrementHealth();
            if(!cruiser.isAlive()){
                shipPieces--;
                return 'k';
            }
            return 'h';
        }if(shipsBoard.getTile(col, row) == 2){
            shipsBoard.insert(col, row, 8);
            destroyer.decrementHealth();
            if(!destroyer.isAlive()){
                shipPieces--;
                return 'd';
            }
            return 'h';
        }if(shipsBoard.getTile(col, row) == 1){
            shipsBoard.insert(col, row, 8);
            submarine.decrementHealth();
            if(!submarine.isAlive()){
                shipPieces--;
                return 's';
            }
            return 'h';
        }

        return 'm';
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
