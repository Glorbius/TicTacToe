package kz.tictactoe.weakAnalysis;

import kz.tictactoe.game.Game;

public class WeakAnalysis {

    /**
     * Не упустить возможность
     */

    public void computerTryWin(Game game) {
        if (game.getHod() == true) {
            if (game.table[0][0] + game.table[0][1] == 14 & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] + game.table[0][2] == 14 & game.table[0][1] == game.getZero()) {
                game.table[0][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] + game.table[0][2] == 14 & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
                /**Проверка второй строчки
                 *
                 */
            } else if (game.table[1][0] + game.table[1][1] == 14 & game.table[1][2] == game.getZero()) {
                game.table[1][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][0] + game.table[1][2] == 14 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[1][2] == 14 & game.table[1][0] == game.getZero()) {
                game.table[1][0] = game.getSeven();
                game.setHod(false);

                /**Проверка третьей строчки
                 *
                 */
            } else if (game.table[2][0] + game.table[2][1] == 14 & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][0] + game.table[2][2] == 14 & game.table[2][1] == game.getZero()) {
                game.table[2][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][1] + game.table[2][2] == 14 & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);

                /**Проверка первого столбца
                 *
                 */
            } else if (game.table[0][0] + game.table[1][0] == 14 & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] + game.table[2][0] == 14 & game.table[1][0] == game.getZero()) {
                game.table[1][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][0] + game.table[2][0] == 14 & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
            }

            /**Проверка второго столбца
             *
             */
            else if (game.table[0][1] + game.table[1][1] == 14 & game.table[2][1] == game.getZero()) {
                game.table[2][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] + game.table[2][1] == 14 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[2][1] == 14 & game.table[0][1] == game.getZero()) {
                game.table[0][1] = game.getSeven();
                game.setHod(false);
            }
            /**Проверка третьего столбца
             *
             */
            else if (game.table[0][2] + game.table[1][2] == 14 & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][2] + game.table[2][2] == 14 & game.table[1][2] == game.getZero()) {
                game.table[1][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][2] + game.table[2][2] == 14 & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            }
            /**Проверка первой диагонали
             *
             */
            else if (game.table[0][0] + game.table[1][1] == 14 & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] + game.table[2][2] == 14 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[2][2] == 14 & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
            }

            /**Проверка второй диагонали
             *
             */
            else if (game.table[0][2] + game.table[1][1] == 14 & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][2] + game.table[2][0] == 14 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[2][0] == 14 & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);

            }
        }
    }

    /**
     * НЕ проиграть
     */
    public void computerNotLose(Game game) {
        if (game.getHod() == true) {
            if (game.table[0][0] + game.table[0][1] == 2 & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] + game.table[0][2] == 2 & game.table[0][1] == game.getZero()) {
                game.table[0][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] + game.table[0][2] == 2 & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
                /**Проверка второй строчки
                 *
                 */
            } else if (game.table[1][0] + game.table[1][1] == 2 & game.table[1][2] == game.getZero()) {
                game.table[1][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][0] + game.table[1][2] == 2 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[1][2] == 2 & game.table[1][0] == game.getZero()) {
                game.table[1][0] = game.getSeven();
                game.setHod(false);

                /**Проверка третьей строчки
                 *
                 */
            } else if (game.table[2][0] + game.table[2][1] == 2 & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][0] + game.table[2][2] == 2 & game.table[2][1] == game.getZero()) {
                game.table[2][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[2][1] + game.table[2][2] == 2 & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);

                /**Проверка первого столбца
                 *
                 */
            } else if (game.table[0][0] + game.table[1][0] == 2 & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] + game.table[2][0] == 2 & game.table[1][0] == game.getZero()) {
                game.table[1][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][0] + game.table[2][0] == 2 & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
            }

            /**Проверка второго столбца
             *
             */
            else if (game.table[0][1] + game.table[1][1] == 2 & game.table[2][1] == game.getZero()) {
                game.table[2][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][1] + game.table[2][1] == 2 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[2][1] == 2 & game.table[0][1] == game.getZero()) {
                game.table[0][1] = game.getSeven();
                game.setHod(false);
            }
            /**Проверка третьего столбца
             *
             */
            else if (game.table[0][2] + game.table[1][2] == 2 & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][2] + game.table[2][2] == 2 & game.table[1][2] == game.getZero()) {
                game.table[1][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][2] + game.table[2][2] == 2 & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            }
            /**Проверка первой диагонали
             *
             */
            else if (game.table[0][0] + game.table[1][1] == 2 & game.table[2][2] == game.getZero()) {
                game.table[2][2] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][0] + game.table[2][2] == 2 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[2][2] == 2 & game.table[0][0] == game.getZero()) {
                game.table[0][0] = game.getSeven();
                game.setHod(false);
            }

            /**Проверка второй диагонали
             *
             */
            else if (game.table[0][2] + game.table[1][1] == 2 & game.table[2][0] == game.getZero()) {
                game.table[2][0] = game.getSeven();
                game.setHod(false);
            } else if (game.table[0][2] + game.table[2][0] == 2 & game.table[1][1] == game.getZero()) {
                game.table[1][1] = game.getSeven();
                game.setHod(false);
            } else if (game.table[1][1] + game.table[2][0] == 2 & game.table[0][2] == game.getZero()) {
                game.table[0][2] = game.getSeven();
                game.setHod(false);
            }
        }
    }
}


