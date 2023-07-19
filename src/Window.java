import javax.swing.*;
import java.awt.*;

import static javax.swing.text.StyleConstants.setBackground;

public class Window {
    public static void main(String[] args) {
        StopwatchComponents window = new StopwatchComponents();
        window.setSize(290,250);
        window.getContentPane().setBackground(Color.ORANGE);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
    }
}
