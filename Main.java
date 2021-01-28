

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {


    public static class MyWindow extends JFrame {
        public MyWindow() {
            Cat[] catArray = new Cat[3];
            catArray[0] = new Cat("Шруся", 5);
            catArray[1] = new Cat("Хель", 10);
            catArray[2] = new Cat("Пират", 15);
            Plate plate1 = new Plate(100);


            setBounds(500, 500, 500, 300);
            setTitle("Кормление голодных котов");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton[] jbs = new JButton[10];
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


            jbs[0] = new JButton("Покормить всех котов");
            jbs[0].setAlignmentX(CENTER_ALIGNMENT);
            add(jbs[0]);


            jbs[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < 3; i++) {
                        catArray[i].eat(plate1);
                        System.out.println("Котик " + catArray[i].getName() + " сытый? = " +  catArray[i].getHungry());

                    }
                }
            });


            jbs[1] = new JButton("Наполнить миску");


            jbs[1].setAlignmentX(Component.CENTER_ALIGNMENT);
            add(jbs[1]);

            jbs[1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    plate1.fill();

                    }
                }
            );
            setVisible(true);




        }
    }
    public static void main(String[] args) {


        MyWindow myWindow = new MyWindow();
    }








}
