package kz.tictactoe.game;

import kz.tictactoe.Text.Text;
import kz.tictactoe.scan.Scaner;


public class Game {

    private final int zero = 0;
    private final int one = 1;
    private final int seven = 7;
    private Boolean hod = true;
    private Boolean hod2 = true;

    public int[][] table = new int[3][3];


    public int getZero() {
        return zero;
    }

    public int getOne() {

        return one;
    }

    public int getSeven() {

        return seven;
    }

    public Boolean getHod() {
        return hod;
    }


    public void setHod(Boolean hod) {
        this.hod = hod;
    }

    public boolean getHod2() {
        return hod2;
    }

    public void setHod2(Boolean hod2) {
        this.hod2 = hod2;
    }

    public void setTableValue(int x, int y) {

    }

    public void getPicture() {
        System.out.println("______________");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("______________");
    }


    /**
     * Условие выигрыша человека
     *
     * @return
     */

    public boolean playerWin() {
        Text text = new Text();
        if (table[0][0] + table[0][1] + table[0][2] == 3 || table[0][0] + table[1][1] + table[2][2] == 3 || table[0][0] + table[1][0] + table[2][0] == 3 || table[0][1] + table[1][1] + table[2][1] == 3 || table[0][2] + table[1][1] + table[2][0] == 3 || table[0][2] + table[1][2] + table[2][2] == 3 || table[1][2] + table[1][1] + table[1][0] == 3 || table[2][0] + table[2][1] + table[2][2] == 3) {
            text.playerWinText();
            text.endGameText();
            return true;
        } else return false;
    }

    /**
     * Условие выигрыша ПК
     *
     * @return
     */
    public boolean computerWin() {
        Text text = new Text();
        if (table[0][0] + table[0][1] + table[0][2] == 21 || table[0][0] + table[1][1] + table[2][2] == 21 || table[0][0] + table[1][0] + table[2][0] == 21 || table[0][1] + table[1][1] + table[2][1] == 21 || table[0][2] + table[1][1] + table[2][0] == 21 || table[0][2] + table[1][2] + table[2][2] == 21 || table[1][2] + table[1][1] + table[1][0] == 21 || table[2][0] + table[2][1] + table[2][2] == 21) {
            text.computerrWinText();
            text.endGameText();
            return true;
        } else return false;
    }

    /**
     * Условие ничьи
     *
     * @return
     */
    public boolean draw() {
        Text lines = new Text();
        if (table[0][0] != getZero() && table[0][1] != getZero() && table[0][2] != getZero() && table[1][0] != getZero() && table[1][1] != getZero() && table[1][2] != getZero() && table[2][0] != getZero() && table[2][1] != getZero() && table[2][2] != getZero()) {
            lines.drawText();
            lines.endGameText();
            return true;
        } else return false;
    }


    /**
     * Ход человека
     *
     * @return
     */
    public void playerTurn(int x, int y) {
        while (table[x][y] != getZero()) {
            Text lines = new Text();
            lines.error();
            x = Scaner.getX();
            y = Scaner.getY();
        }
        table[x][y] = getOne();
    }

    /**
     * Ход ПК рандом
     *
     * @param game
     */

    public void computerTurnRandom(Game game) {
        if (game.getHod() == true) {
            int x = game.randomX();
            int y = game.randomY();
            while (game.table[x][y] != game.getZero()) {
                x = game.randomX();
                y = game.randomY();
            }
            game.table[x][y] = game.getSeven();
        }
    }


    /**
     * Рандом Х
     *
     * @return
     */
    public int randomX() {
        int x = (int) (Math.random() * 3);
        return x;
    }

    /**
     * Рандом Y
     *
     * @return
     */
    public int randomY() {
        int y = (int) (Math.random() * 3);
        return y;
    }

}


