import java.awt.*;
public class LABEXER50606 {
    public static void main(String args[]) {
        new Event3("Event Example 3");
    }
}
class Event3 extends Frame {
    Button b1,b2,b3,b4,b5,b6;
    TextField num1, num2,result;
    public Event3(String s) {
        setLayout(new GridLayout(2,1));
//Panel p
        Panel p = new Panel();
        p.setLayout(new GridLayout(3,2));
        Label l1 = new Label("First Number: ");
        Label l2 = new Label("Second Number: ");
        Label l3 = new Label("Result is: ");
        num1 = new TextField();
        num2 = new TextField();
        result = new TextField();
        p.add(l1);
        p.add(num1);
        p.add(l2);
        p.add(num2);
        p.add(l3);
        p.add(result);
//Panel q
        Panel q = new Panel();
        q.setLayout(new GridLayout(2,3));
        b1 = new Button("Addition");
        b2 = new Button("Subtraction");
        b3 = new Button("Multiplication");
        b4 = new Button("Division");
        b5 = new Button("Modulus");
        b6 = new Button("Clear");
        q.add(b1);
        q.add(b2);
        q.add(b3);
        q.add(b4);
        q.add(b5);
        q.add(b6);
//Main Frame
        add(p);
        add(q);
        layout();
        pack();
        show();
    }
    public boolean action(Event e, Object o) {
        int x = Integer.parseInt(num1.getText());
        int y = Integer.parseInt(num2.getText());
        if ("Addition".equals(e.arg)) {
            int z = x+y;
            result.setText(z+"");
        }
        else if ("Subtraction".equals(e.arg)) {
            int z = x-y;
            result.setText(z+"");
        }
        else if ("Multiplication".equals(e.arg)) {
            int z = x*y;
            result.setText(z+"");
        }
        else if ("Division".equals(e.arg)) {
            int z = x/y;
            result.setText(z+"");
        }
        else if ("Modulus".equals(e.arg)) {
            int z = x%y;
            result.setText(z+"");
        }
        else {
            num1.setText("");
            num2.setText("");
            result.setText("");
        }
        return(super.action(e,e.target));
    }
    public boolean handleEvent(Event evt) {
        if (evt.id == Event.WINDOW_DESTROY) {
            hide();
            System.exit(0);
        }
        return(super.handleEvent(evt));
    }
}