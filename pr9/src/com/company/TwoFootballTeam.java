package com.company;

//Создайте JFrame приложение у которого есть следующие компоненты GUI:
//Одна кнопка JButton labeled “AC Milan”
//Другая JButton подписана “Real Madrid”
//Надпись  JLabel содержит текст “Result: 0 X 0”
//Надпись JLabel  содержит текст “Last Scorer: N/A ”
//Надпись  Label содержит текст “Winner: DRAW”;
//Теперь всякий раз, когда вы нажимаете на кнопку AC Milan,
// результат будет увеличиваться  для Милана, чтобы стать сначала 1 X 0,
// затем  2 X 0. Last Scorer означает последнюю забившую команду.
// В этом случае: AC Milan. И победителем становится команда,
// которая имеет больше кликов кнопку на соответствующую, чем другая.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoFootballTeam extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public TwoFootballTeam() {
        super("TwoFootballTeam");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TwoFootballTeam app = new TwoFootballTeam();
                app.setVisible(true);
            }
        });
    }
}
