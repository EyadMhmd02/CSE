package y1.s2.Modules.Module3.cse205_src_week_03.gui_section_05;
//**************************************************************************************************
// CLASS: BoxLayoutDemo2 (BoxLayoutDemo2.java)
//
// DESCRIPTION
// This is the BoxLayout Demo 2 program from "GUI Programming : Section 5".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates how to create a layout using the BoxLayout layout manager. In this version we add
 * glue between each JLabel which will cause them to be spaced evenly in the horizontal layout
 * region.
 */
public class BoxLayoutDemo2 {
    public static void main(String[] args) {
        new BoxLayoutDemo2().run();
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel and set the layout manager to horizontal BoxLayout.
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Add four labels to the JPanel.
        addLabel(panel, "First label", true);
        addLabel(panel, "Second label", true);
        addLabel(panel, "Third label", true);
        addLabel(panel, "Fourth label", false);

        JFrame frame = new JFrame("Box Layout Demo 2");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Add a new JLabel containing the string pText to the panel. If pGlue is true then add
    // "horizontal glue" after the JLabel using the Box.createHorizontalGlue() static method.
    private void addLabel(JPanel pPanel, String pText, boolean pGlue) {
        JLabel label = new JLabel(pText);
        pPanel.add(label);
        if (pGlue) pPanel.add(Box.createHorizontalGlue());
    }
}
