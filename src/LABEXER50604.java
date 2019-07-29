import java.awt.*;
public class LABEXER50604 {
    public static void main(String args[]) {
        new Event1("Event Example 1");
    }
}

class Event1 extends Frame {
    Label label1;
    Button button;

    public Event1(String s) {
        super(s);
        button = new Button("Click Me!");
        label1 = new Label("This is where we will show if button was clicked.");
        setLayout(new FlowLayout());
        add(button);
        add(label1);
        layout();
        pack();
        show();
    }
    public boolean action(Event e, Object o) {
        if ("Click Me!".equals(e.arg))
            label1.setText("Button was clicked!");
        return(super.action(e,e.target));
    }

}
