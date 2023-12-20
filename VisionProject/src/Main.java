
import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Quiz Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);

        // Create a panel for the image (top of the frame)
        JPanel imagePanel = new JPanel();

        ImageIcon imageIcon = new ImageIcon("test.jpg");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setPreferredSize(new Dimension(500, 500)); // Set your desired width and height
        int xCoordinate = 100;
        int yCoordinate = 100;
        imageLabel.setBounds(xCoordinate, yCoordinate, imageIcon.getIconWidth(), imageIcon.getIconHeight());


        imagePanel.add(imageLabel);






        // Create a panel for answer choices (below the image)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Create four answer choice buttons
        JButton button1 = new JButton("Choice 1");
        JButton button2 = new JButton("Choice 2");
        JButton button3 = new JButton("Choice 3");
        JButton button4 = new JButton("Choice 4");


        Dimension buttonSize = new Dimension(150, 40); // Width x Height
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);

        // Add the buttons to the buttonPanel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);

        // Add the panels to the frame
        frame.add(imagePanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
        System.out.println("Test -- Vision Project v1");







        // either the game class should act as the Main,
        // or we need to make important distinctions between the two classes






    }

    public class MyCanvas extends Canvas{

        public void paint(Graphics g) {

            Toolkit t = Toolkit.getDefaultToolkit();
            Image i=t.getImage("test.jpg");
            g.drawImage(i, 120,100,this);

        }
        public void main(String[] args) {
            MyCanvas m = new MyCanvas();
            JFrame f = new JFrame();
            f.add(m);
            f.setSize(400,400);
            f.setVisible(true);
        }

    }




}

