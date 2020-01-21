package kz.tictactoe.Text;

public class Text {

    public Text() {

    }

    public void playerWinText() {
        System.out.println("---------------------");
        System.out.println("-------Победа!-------");
        System.out.println("---------------------");
    }

    public void computerrWinText() {
        System.out.println("-----------------------");
        System.out.println("-------Поражение!------");
        System.out.println("-----------------------");
    }

    public void drawText() {
        System.out.println("-----------------------");
        System.out.println("---------Ничья!--------");
        System.out.println("-----------------------");
    }

    public void startGameText() {
        System.out.println("----------------------------");
        System.out.println("-------Игра началась!-------");
        System.out.println("----------------------------");
    }

    public void endGameText() {
        System.out.println("-----------------------");
        System.out.println("-------Game Over-------");
        System.out.println("-----------------------");

    }

    public void computerTurnText() {
        System.out.println("---------------------------------");
        System.out.println("--------Очередь компьютера-------");
        System.out.println("---------------------------------");

    }

    public void error() {

        System.out.println("--------------------------------------------");
        System.out.println("---------Введите верные координаты!---------");
        System.out.println("--------------------------------------------");
    }

}
