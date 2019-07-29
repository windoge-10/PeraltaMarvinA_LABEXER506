import java.awt.*;
public class LABEXER50605 {
    public static void main(String[] args) {
        new Event2("Event Example 2");
    }
}
class Event2 extends Frame {
    Button b1, b2, b3, b4, b5;
    Label label1;
    TextField text1;
    public Event2(String s) {
        super(s);
        setLayout(new FlowLayout());
//Panel p
        Panel p = new Panel();
        p.setLayout(new GridLayout(2,2));
        b1 = new Button("New"); b2 = new Button("Edit");
        b3 = new Button("Delete"); b4 = new Button("Exit");
        p.add(b1); p.add(b2); p.add(b3); p.add(b4);
//Panel q
        Panel q = new Panel();
        q.setLayout(new GridLayout(1,2));
        label1 = new Label("Output here: ");
        text1 = new TextField();
        q.add(label1);
        q.add(text1);
//Main Frame
        add(p); add(q); layout(); pack(); show();
    }
    public boolean action(Event e, Object o) {
        if ("New".equals(e.arg))
            text1.setText("New");
        else if ("Edit".equals(e.arg))
            text1.setText("Edit");
        else if ("Delete".equals(e.arg))
            text1.setText("Delete");
        else
            System.exit(0);
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