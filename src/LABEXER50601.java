import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;


class MyFrame extends Frame
    {
        MyFrame(String s)
        {
            super(s);
            setLayout(new BorderLayout());
            setFont(new Font("Arial",Font.BOLD,14));
            setBackground(Color.blue);
            setForeground(Color.white);
            setResizable(false);
            Label A = new Label("Student Information",Label.CENTER);
            add("North",A);
            Panel p = new Panel();
            p.setLayout(new GridLayout(3,1));
            p.setFont(new Font("Arial",(Font.BOLD+Font.ITALIC),11));
            p.setForeground(Color.black);
            Label B = new Label("Student Number: ");
            Label C = new Label("Student Name : ");
            Label D = new Label("Student Grade : ");
            TextField W = new TextField();
            TextField X = new TextField();
            TextField Y = new TextField();
            p.add(B);
            p.add(W);
            p.add(C);
            p.add(X);
            p.add(D);
            p.add(Y);
            add("Center",p);
            Panel q = new Panel();
            q.setLayout(new FlowLayout());
            q.setForeground(Color.black);
            q.setFont(new Font("Arial",Font.BOLD,12));
            Button b1 = new Button("Save");
            Button b2 = new Button("Cancel");
            Button b3 = new Button("Exit");
            q.add(b1);
            q.add(b2);
            q.add(b3);
            add("South",q);
            pack();
            show();

        }
    }

public class LABEXER50601 {

    public static void main(String args[])
    {
        new MyFrame("Example 1");
    }
}

