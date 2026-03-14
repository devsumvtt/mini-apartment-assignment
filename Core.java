import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Core {

    Core() {
        JFrame window = new JFrame("Core");
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        new Core();
    }
}