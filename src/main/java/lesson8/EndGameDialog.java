package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class EndGameDialog extends JFrame {

    public EndGameDialog() throws HeadlessException {
        setTitle("Test Window");
        String z = GameXO.getSimb();
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        String tag = ("Победа - " + GameXO.getSimb() + "!");
        // Создание панели с табличным расположением
        JPanel grid = new JPanel(new GridLayout(70, 1, 0, 40) );
        JLabel l;
        l = new JLabel(tag.toString());
        grid.add(l);
        // Добавление кнопок в панель
        JButton NewPlay = new JButton("Новая игра");
        grid.add(NewPlay);
        NewPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new GameXO();
            }
        });
        JButton Cancel = new JButton("Отмена");
        grid.add(Cancel);
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Создание панели с последовательным расположением
        // компонентов и выравниванием по CENTER
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flow.add(grid);
        // Получение панели содержимого
        Container container = getContentPane();
        // Размещение панели с кнопками CENTER
        container.add(flow, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EndGameDialog();
    }

}