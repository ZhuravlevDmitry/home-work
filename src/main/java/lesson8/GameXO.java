package lesson8;

import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameXO extends JFrame {

    private static final ImageIcon DEFAULT = new ImageIcon("def.png");
    private static final ImageIcon ICON_X = new ImageIcon("x.png");
    private static final ImageIcon ICON_O = new ImageIcon("o.png");

    private JButton[][] map;
    private int stepCounter;
    int SIZE = 3;
    boolean win = false;

    public boolean isExit() {
        return exit;
    }

    boolean exit = false;

    public static String getSimb() {
        return simb;
    }

    public static String simb = "Non";

    public GameXO() throws HeadlessException {
        setSize(350, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dispose(); //Завершить игру и вывести класс с результатом игры (и для выхода или новой игры)
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3,3));
        map = new JButton[3][3];
        stepCounter = 0;
        win = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = new JButton();
                map[i][j].setIcon(DEFAULT);
                JButton cur = map[i][j];
                panel.add(cur);
                //Здесь происходит ход
                cur.addActionListener(a -> {//???
                    cur.setDisabledIcon(ICON_X);// нижняя строка нужна чтобы работало???
                    cur.setIcon(ICON_X);//???
                    cur.setEnabled(false);// блокировка нажатия
                    stepCounter++;
                    add(panel);
                    // TODO: 05.04.2021 check victory
                    if (stepCounter >=5)
                    {
                        win = checkWinnerX();
                        if (win == true){
                            simb = "Крестиков";
                            new EndGameDialog();
                        }
                    }
                    if (stepCounter== 9 && win==false){
                        simb = "Ничья";
                        new EndGameDialog();}

                    // TODO: 05.04.2021 check victory
                    if (stepCounter<9 && win==false) {
                        movePC();
                        stepCounter++;
                        add(panel);
                        if (stepCounter >= 5) {
                            win = checkWinnerO();
                            if (win == true) {
                                simb = "Ноликов";
                                new EndGameDialog();
                            }

                        }
                    }
                });

            }
        }
        add(panel);
        setVisible(true);
    }

    private void movePC() {
        // TODO: 05.04.2021 smart move
        int i = (int) (Math.random() * SIZE);
        int j = (int) (Math.random() * SIZE);
        while (map[i][j].getIcon().equals(ICON_O) || map[i][j].getIcon().equals(ICON_X)) {
            i = (int) (Math.random() * SIZE);
            j = (int) (Math.random() * SIZE);
        }
        map[i][j].setDisabledIcon(ICON_O);
        map[i][j].setIcon(ICON_O);
        map[i][j].setEnabled(false);
    }
    private boolean checkWinnerVerticalO() {
        for (int i = 0; i < SIZE; i++) {
            boolean res = true;
            for (int j = 1; j < SIZE && res; j++)
                res = (map[j][i].getIcon().equals(ICON_O) && map[0][i].getIcon().equals(ICON_O));
            if (res)
                return true;
        }
        return false;
    }
    private boolean checkWinnerVerticalX() {
        for (int i = 0; i < SIZE; i++) {
            boolean res = true;
            for (int j = 1; j < SIZE && res; j++)
                res = (map[j][i].getIcon().equals(ICON_X) && map[0][i].getIcon().equals(ICON_X));
            if (res)
                return true;
        }
        return false;
    }

    private boolean checkWinnerHorizontalX() {
        for (int i = 0; i < SIZE; i++) {
            boolean res = true;
            for (int j = 1; j < SIZE && res; j++)
                res = (map[i][j].getIcon().equals(ICON_X) && map[i][0].getIcon().equals(ICON_X));
            if (res)
                return true;
        }
        return false;
    }

    private boolean checkWinnerHorizontalO() {
        for (int i = 0; i < SIZE; i++) {
            boolean res = true;
            for (int j = 1; j < SIZE && res; j++)
                res = (map[i][j].getIcon().equals(ICON_O) && map[i][0].getIcon().equals(ICON_O));
            if (res)
                return true;
        }
        return false;
    }

    private boolean checkWinnerDiagonalsO() {
        boolean res = true;
        for (int i = 1; i < SIZE && res; i++)
            res = (map[i][i].getIcon().equals(ICON_O) && map[0][0].getIcon().equals(ICON_O));
        if (res)
            return true;
        res = true;
        for (int i= 1; i < SIZE && res; i++)
            res = (map[SIZE - i - 1][i].getIcon().equals(ICON_O) && map[SIZE - 1][0].getIcon().equals(ICON_O));
        return res;
    }
    private boolean checkWinnerDiagonalsX() {
        boolean res = true;
        for (int i = 1; i < SIZE && res; i++)
            res = (map[i][i].getIcon().equals(ICON_X) && map[0][0].getIcon().equals(ICON_X));
        if (res)
            return true;
        res = true;
        for (int i= 1; i < SIZE && res; i++)
            res = (map[SIZE - i - 1][i].getIcon().equals(ICON_X) && map[SIZE - 1][0].getIcon().equals(ICON_X));
        return res;
    }

    private boolean checkWinnerX() {
        return checkWinnerHorizontalX() ||
                checkWinnerVerticalX() ||
                checkWinnerDiagonalsX();
    }
    private boolean checkWinnerO() {
        return  checkWinnerHorizontalO() ||
                checkWinnerVerticalO() ||
                checkWinnerDiagonalsO();
    }

    public static void main(String[] args) {
        new GameXO();
    }
}