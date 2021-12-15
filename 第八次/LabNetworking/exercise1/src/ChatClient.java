//20301107 Liu Jiayao 2021.4.21

import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClient extends JFrame{
    Socket connection;
    PrintStream serverOut;
    BufferedReader serverIn;

    String name = "Tom";
    JComboBox phaseChoices = null;

    TextArea ta = new TextArea();
    TextField tf = new TextField();
    JFrame dia = new JFrame();

    public ChatClient(){}


    public void launchFrame(String title) {

        JFrame jf = new JFrame(title);
        JButton b1 = new JButton("Send");
        JButton b2 = new JButton("Quit");
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
                    ta.setText(ta.getText() + name +": "+ data + '\n');
                } else if (str.equals("Quit")) {
                    //Create an ActionListener which will quit the program when the quit button is pressed. [HINT: use System.exit(0)]
                    System.exit(0);
                }else if (str.equals("about")) {
                    JOptionPane.showMessageDialog(dia,"here is a chat room\nyou can choose your name in right choice box\nenter message and click 'Send' or use <enter> to send message\nclick 'Quit' to quit","model dialog",JOptionPane.INFORMATION_MESSAGE);
                }else if (str.equals("File")) {

                }else if (str.equals("quit")) {
                    System.exit(0);
                }
                    //Create an ActionListener which will quit the program when the quit button is pressed. [HINT: use System.exit(0)]
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
                System.out.println("");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("");
            }
        }
//Create an ActionListener which will copy the text from the input textfield into the output textarea when the <Enter> key is pressed in the input textfield.
        tf.addActionListener(new Listen() {
            public void actionPerformed(ActionEvent e) {
                String data;
                data = tf.getText();
                tf.setText("");
                ta.setText(ta.getText() + name +": "+ data + '\n');
            }
        });
        JPanel jp = new JPanel();
        JPanel jpn = new JPanel();

        jp.add(b1);
        b1.addActionListener(new SendListener());
        b2.addActionListener(new Listen());
        b1.setAlignmentX(Box.CENTER_ALIGNMENT);
        jp.add(b2);
        b2.setAlignmentX(Box.CENTER_ALIGNMENT);
        //Create a menubar. Add a File menu and a Help menu.
        JMenuBar menu = new JMenuBar();
        JMenu m1 = new JMenu("File");
        menu.add(m1);
        JMenu m2 = new JMenu("Help");
        menu.add(m2);
        JMenuItem mt1 = new JMenuItem("quit");
        JMenuItem mt2= new JMenuItem("about");
        //Add a menu item called "quit" to the File menu. When that menu item is selected the program should be terminated.
        m1.add(mt1);
        m2.add(mt2);
        mt1.addActionListener(new Listen());
        mt2.addActionListener(new Listen());
        JButton a = new JButton("-");
        TextField b = new TextField("\t\t\t\t\tChat Room");
        b.setEditable(false);
        b.setFont(new Font("Monospaced", Font.BOLD, 16));
        b.setForeground(Color.pink);
        JButton c = new JButton("·");
        JButton d = new JButton("X");
        //Create a choice box which lies below the send/quit buttons. Have it include a number of option to allow the user to choose a username to be used when chatting. Then modify the ActionListener for the send button.
        //Have it prepend the the selected user name to the message prior to adding it to the output textarea.
        String[] phases = { "Tom", "Forest", "Ice",
                "AHappyPotato", "Evelyn", "Tree",
                "HeartStone"};
        phaseChoices = new JComboBox(phases);
        jf.setJMenuBar(menu);
        jpn.add(a);
        jpn.add(b);
        jpn.add(c);
        jpn.add(d);

        jpn.setLayout(new BoxLayout(jpn, BoxLayout.X_AXIS));
        jf.pack();

        jp.add(phaseChoices);
        class ListenChoice implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                name = phases[phaseChoices.getSelectedIndex()];
            }
        }
        phaseChoices.addActionListener(new ListenChoice() {

        });
        jp.setBorder(BorderFactory.createEmptyBorder(5,0 ,5000,5));
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jf.add(jpn, BorderLayout.NORTH);
        jf.add(jp, BorderLayout.EAST);
        jf.add(ta, BorderLayout.CENTER);
        jf.add(tf, BorderLayout.SOUTH);

        jf.setSize(800, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        ta.setColumns(50);
        ta.setRows(10);
        tf.setColumns(50);

        //Create a WindowListener which will quit the program when the close widget is pressed on the frame.
        jf.addWindowListener(new Listen());

        //Experiment with changing the color/font of the various components within the chat room frame.
        ta.setBackground(Color.getColor("yellow",0xFFFFf0));
        tf.setBackground(Color.getColor("ss",0xfff8dc));
        jp.setBackground(Color.getColor("",0xfffff0));
        b1.setBackground(Color.getColor("coral",0xfffffa));
        b1.setFont(new Font("Monospaced",Font.ITALIC,15));
        b1.setForeground(Color.BLUE);
        b2.setBackground(Color.getColor("coral",0xfffffa));
        b2.setFont(new Font("Monospaced",Font.ITALIC,15));
        b2.setForeground(Color.red);
        ta.setForeground(Color.BLUE);
        tf.setForeground(Color.BLUE);
        phaseChoices.setBackground(Color.getColor("coral",0xfffffa));
        phaseChoices.setFont(new Font("Monospaced",Font.BOLD,15));
        phaseChoices.setForeground(Color.black);
        a.setBackground(Color.getColor("yellow",0xFFFFf0));
        b.setBackground(Color.getColor("yellow",0xFFFFf0));
        c.setBackground(Color.getColor("yellow",0xFFFFf0));
        d.setBackground(Color.getColor("yellow",0xFFFFf0));

        jf.setBackground(Color.getColor("yellow",0xFFFFf0));
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }


        //In the launchFrame method, you need to make the connection to the server (make a socket connection).

      //  b1.addActionListener(new SendListener());

     try {
        connection = new Socket("127.0.0.1",2000);
         serverIn = new BufferedReader(new InputStreamReader(connection.getInputStream()));
         serverOut = new PrintStream(connection.getOutputStream());

         RemoteReader r = new RemoteReader();

// This blocks until there is something to read
         Thread t = new Thread(r);
         t.start();
     }catch (Exception e) {
        e.printStackTrace();
    }



    }

    private class SendListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // get info from text field
            String str = tf.getText();
            // send it to the server using the printstream object
            serverOut.println(str);
            tf.setText("");

            // clear the text field

        }
    }

    // an inner class to listen to server
    private class RemoteReader implements Runnable {
        public void run() {
            try {
                while (true) {

                    String aLine = serverIn.readLine();
                    if(!aLine.equals("")) {
                        ta.setText(ta.getText() +name +": " +aLine+"\n");
                    }
                    // do stuff here to continuously read from the server using the
                    // input stream you made

                    // put the received text into the text area

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.launchFrame("Chat Room");

    }
}
