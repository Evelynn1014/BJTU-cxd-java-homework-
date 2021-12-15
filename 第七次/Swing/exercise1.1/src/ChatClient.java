//20301107 Liu Jiayao 2021.4.21
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChatClient {
//In the constructor, initialize each of these component attributes: the text area should be 10 rows tall and 50 columns wide, the text field should be 50 columns wide,
// the send button should have the word "send" in the display, and likewise for the quit button.

    public void launchFrame(String title){
        try{

            //Create the ChatClient class with four private attributes; one for each component.
            //Create a launchFrame method which constructs the layout of the components.
            // Feel free to use nested panels and any layout managers that will help you construct the layout in the GUI design shown above.
            JFrame jf = new JFrame(title);
            JButton b1 = new JButton("Send");
            JButton b2 = new JButton("Quit");
            TextArea ta = new TextArea();
            TextField tf = new TextField();
            // Container container = jf.getContentPane();
            JPanel jp = new JPanel();
            JPanel jpn = new JPanel();
            jp.add(b1);
            b1.setAlignmentX(Box.CENTER_ALIGNMENT);
            jp.add(b2);
            b2.setAlignmentX(Box.CENTER_ALIGNMENT);
            JButton a = new JButton("—");
            TextField b = new TextField("\t\t\t\t\tChat Room");
            b.setEditable(false);
            b.setFont(new Font("",Font.BOLD,16));
            JButton c = new JButton("·");
            JButton d = new JButton("X");
            jpn.add(a);
            jpn.add(b);
            jpn.add(c);
            jpn.add(d);
            jpn.setLayout(new BoxLayout(jpn,BoxLayout.X_AXIS));
            jf.pack();
            jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
            jf.add(jpn,BorderLayout.NORTH);
            jf.add(jp,BorderLayout.EAST);
            jf.add(ta,BorderLayout.CENTER);
            jf.add(tf,BorderLayout.SOUTH);
            jf.setSize(700,400);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(3);
            ta.setColumns(50);
            ta.setRows(10);
            tf.setColumns(50);


         //  ta.setBackground(Color.getHSBColor(0,80,60));


           UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e){
            e.printStackTrace();
        }



    }



//Create the main method. This method will instantiate a new ChatClient object and then call the launchFrame method
    public static void main(String[] args){
        ChatClient client = new ChatClient();
        client.launchFrame("Chat Room");

    }
}
