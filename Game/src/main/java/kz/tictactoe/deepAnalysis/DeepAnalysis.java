package kz.tictactoe.deepAnalysis;

import kz.tictactoe.game.Game;

public class DeepAnalysis {

    /**
     * Стратегия если центр свободен
     */
    public void strategyWinMiddle(Game game) {
        if (game.getHod() == true) {
            if (game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
                game.setHod2(false);
            } else if (game.table[0][2] == game.getOne() & game.table[2][0] == game.getOne() & game.table[2][1] == game.getZero()) {
                game.table[2][1] = game.getSeven();
                game.setHod(false);

            } else if (game.table[0][2] == game.getOne() & game.table[2][1] == game.getOne() & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][2] == game.getOne() & game.table[2][1] == game.getOne() & game.table[0][0] == game.getOne() & game.table[1][2] == game.getOne() & game.table[1][0] == game.getZero()) {
                game.table[1][0] = game.getSeven();
                game.setHod(false);

            } else if (game.table[0][2] == game.getOne() & game.table[1][0] == game.getOne() & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][2] == game.getOne() & game.table[1][0] == game.getOne() & game.table[2][2] == game.getOne() & game.table[0][1] == game.getZero()) {
                game.table[0][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] == game.getOne() & game.table[0][2] == game.getOne() & game.table[1][0] == game.getOne() & game.table[2][2] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);

            } else if (game.table[0][0] == game.getOne() & game.table[2][2] == game.getOne() & game.table[1][2] == game.getZero()) {
                game.table[1][2] = game.getSeven();
                game.setHod(false);

            } else if (game.table[0][0] == game.getOne() & game.table[1][2] == game.getOne() & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] == game.getOne() & game.table[2][1] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] == game.getOne() & game.table[2][0] == game.getOne() & game.table[0][1] == game.getOne() & game.table[1][2] == game.getOne() & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][2] == game.getOne() & game.table[2][0] == game.getOne() & game.table[0][1] == game.getOne() & game.table[1][2] == game.getZero()) {
                game.table[1][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][2] == game.getOne() & game.table[1][0] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][2] == game.getOne() & game.table[0][1] == game.getOne() & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][2] == game.getOne() & game.table[2][0] == game.getOne() & game.table[0][1] == game.getOne() & game.table[1][2] == game.getOne() & game.table[1][0] == game.getZero()) {
                game.table[1][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][0] == game.getOne() & game.table[1][2] == game.getOne() & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][0] == game.getOne() & game.table[0][1] == game.getOne() & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] == game.getOne() & game.table[2][1] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] == game.getOne() & game.table[1][2] == game.getOne() & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] == game.getOne() & game.table[1][0] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][2] == game.getOne() & game.table[1][0] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][2] == game.getOne() & game.table[2][1] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][0] == game.getOne() & game.table[2][1] == game.getOne() & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            }


        }
    }

    /**
     * Стратегия если центр занят
     */

    public void strategyWinArround(Game game) {
        if (game.getHod() == true & game.getHod2() == true) {
            if (game.table[1][1] == game.getOne() & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] == game.getOne() & game.table[2][0] == game.getOne() & game.table[0][2] == game.getSeven() & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] == game.getOne() & game.table[2][0] == game.getOne() & game.table[0][0] == game.getOne() & game.table[1][2] == game.getOne() & game.table[0][1] == game.getZero()) {
                game.table[0][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] == game.getOne() & game.table[0][1] == game.getOne() & game.table[1][0] == game.getOne() & game.table[2][2] == game.getOne() & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            }
        }
    }
}




