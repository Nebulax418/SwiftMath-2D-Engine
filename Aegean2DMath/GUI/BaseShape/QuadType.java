package Aegean2DMath.GUI.BaseShape;

import javax.swing.*;
import java.awt.*;

public class QuadType {

    public JFrame frame = new JFrame();

    public QuadType() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(new Color(90, 90, 67));
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
