//20301107 Liu Jiayao 2021.4.21

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient {


    public void launchFrame(String title) {


        JFrame jf = new JFrame(title);
        JButton b1 = new JButton("Send");
        JButton b2 = new JButton("Quit");
        TextArea ta = new TextArea();
        TextField tf = new TextField();
        ta.setEditable(false);
        // Container container = jf.getContentPane();
//Create an ActionListener which will copy the text from the input textfield into the output textarea when the send button is pressed.
// Use an inner class to implement this because you will need access to the ChatClient's private attributes.
        class Listen implements ActionListener, WindowListener {
            public void actionPerformed(ActionEvent e) {
                String data;
                String str = e.getActionCommand();
                if (str.equals("Send")) {
                    data = tf.getText();
                    tf.setText("");
                    ta.setText(ta.getText() + data + '\n');
                } else if (str.equals("Quit")) {
                    //Create an ActionListener which will quit the program when the quit button is pressed. [HINT: use System.exit(0)]
                    System.exit(0);
                }
            }

            public void windowOpened(WindowEvent e) {
                System.out.println("窗体打开");
            }

            public void windowClosing(WindowEvent e) {


                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("窗体最小化");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("窗体最小化恢复正常");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("窗体激活");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("窗体非激活");
            }
        }
//Create an ActionListener which will copy the text from the input textfield into the output textarea when the <Enter> key is pressed in the input textfield.
        tf.addActionListener(new Listen() {
            public void actionPerformed(ActionEvent e) {
                String data;
                data = tf.getText();
                tf.setText("");
                ta.setText(ta.getText() + data + '\n');
            }
        });
        JPanel jp = new JPanel();
        JPanel jpn = new JPanel();

        jp.add(b1);
        b1.addActionListener(new Listen());
        b2.addActionListener(new Listen());
        b1.setAlignmentX(Box.CENTER_ALIGNMENT);
        jp.add(b2);
        b2.setAlignmentX(Box.CENTER_ALIGNMENT);

        JButton a = new JButton("—");
        TextField b = new TextField("\t\t\t\t\tChat Room");
        b.setEditable(false);
        b.setFont(new Font("", Font.BOLD, 16));
        JButton c = new JButton("·");
        JButton d = new JButton("X");

        jpn.add(a);
        jpn.add(b);
        jpn.add(c);
        jpn.add(d);
        jpn.setLayout(new BoxLayout(jpn, BoxLayout.X_AXIS));
        jf.pack();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jf.add(jpn, BorderLayout.NORTH);
        jf.add(jp, BorderLayout.EAST);
        jf.add(ta, BorderLayout.CENTER);
        jf.add(tf, BorderLayout.SOUTH);
        jf.setSize(700, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        ta.setColumns(50);
        ta.setRows(10);
        tf.setColumns(50);
        //Create a WindowListener which will quit the program when the close widget is pressed on the frame.
        jf.addWindowListener(new Listen());
        //  ta.setBackground(Color.getHSBColor(0,80,60));

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.launchFrame("Chat Room");

    }
}
