import java.awt.*;
class Menus extends Frame {
    Menus (String s) {
        super(s);
        setSize(200,200);
        MenuBar menu1 = new MenuBar();
        setMenuBar(menu1);
//Main Menu
        Menu file_menu = new Menu("File");
        Menu edit_menu = new Menu("Edit");
        Menu help_menu = new Menu("Help");
        menu1.add(file_menu);
        menu1.add(edit_menu);
        menu1.add(help_menu);
//File Sub-Menu
        Menu file1 = new Menu("New");
        Menu file2 = new Menu("Open");
        Menu file3 = new Menu("Save");
        Menu file4 = new Menu("Close");
        Menu file5 = new Menu("Exit");
        file_menu.add(file1);
        file_menu.add(file2);
        file_menu.add(file3);
        file_menu.add(file4);
        file_menu.addSeparator();
        file_menu.add(file5);
//Edit Sub-Menu
        Menu edit1 = new Menu("Copy");
        Menu edit2 = new Menu("Cut");
        Menu edit3 = new Menu("Paste");
        Menu edit4 = new Menu("Undo");
        Menu edit5 = new Menu("Redo");
        Menu edit6 = new Menu("Clear");
        edit_menu.add(edit1);
        edit_menu.add(edit2);
        edit_menu.add(edit3);
        edit_menu.add(edit4);
        edit_menu.add(edit5);
        edit_menu.add(edit6);
//Clear Sub-Menu
        Menu clear1 = new Menu("Contents");
        Menu clear2 = new Menu("Formats");
        edit6.add(clear1);
        edit6.add(clear2);
//Help Sub-Menu
        Menu help1 = new Menu("Contents");
        Menu help2 = new Menu("Index");
        Menu help3 = new Menu("About");
        help_menu.add(help1);
        help_menu.add(help2);
        help_menu.addSeparator();
        help_menu.add(help3);
        show();
    }
}
public class LABEXER50603 {
    public static void main(String args[]) {
        new Menus("Sample Menu 1");
    }
}
