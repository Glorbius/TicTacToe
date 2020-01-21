package kz.tictactoe.main;

import kz.tictactoe.deepAnalysis.DeepAnalysis;
import kz.tictactoe.game.Game;
import kz.tictactoe.Text.Text;
import kz.tictactoe.scan.Scaner;
import kz.tictactoe.weakAnalysis.WeakAnalysis;

public class Main {

    public static void main(String[] args) {

            Game krestikiNoliki = new Game();

            Text lines = new Text();
            DeepAnalysis deepAnalysis = new DeepAnalysis();
            WeakAnalysis weakAnalysis = new WeakAnalysis();
            lines.startGameText();
            krestikiNoliki.getPicture();

            while (!krestikiNoliki.playerWin() && !krestikiNoliki.computerWin() && !krestikiNoliki.draw()) {
                krestikiNoliki.setHod(true);
                krestikiNoliki.playerTurn(Scaner.getX(), Scaner.getY());
                krestikiNoliki.getPicture();
                lines.computerTurnText();
                weakAnalysis.computerTryWin(krestikiNoliki);
                weakAnalysis.computerNotLose(krestikiNoliki);
                deepAnalysis.strategyWinMiddle(krestikiNoliki);
                deepAnalysis.strategyWinArround(krestikiNoliki);
                krestikiNoliki.getPicture();
            }

    }


}
