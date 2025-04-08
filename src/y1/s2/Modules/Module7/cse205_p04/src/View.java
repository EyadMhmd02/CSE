package y1.s2.Modules.Module7.cse205_p04.src;//package y1.s2.Modules.Module7.cse205_p04.src;
//
////**************************************************************************************************************
//// CLASS: View
////
//// AUTHOR
//// Kevin R. Burger (burgerk@asu.edu)
//// Computer Science & Engineering Program
//// Fulton Schools of Engineering
//// Arizona State University, Tempe, AZ 85287-8809
//// Web: http://www.devlang.com
////**************************************************************************************************************
//
//import javax.swing.*;
//import java.awt.event.ActionListener;
//
///**
// * The View class implements the GUI.
// */
//public class View extends JFrame implements ActionListener {
//
//    public static final int FRAME_WIDTH = 500;
//    public static final int FRAME_HEIGHT = 180;
//
//    // Declare instance variables
//    private JButton mClearButton;
//    private JButton mEvalButton;
//    private JTextField mInputText;
//    private JButton mExitButton;
//    private y3.s2.ser315.week3.implementation_eghanem.Main mMain;
//    private JLabel mResultLabel;
//
//    /**
//     * View()
//     * <p>
//     * The View constructor creates the GUI interface and makes the frame visible at the end.
//     */
//    public View(y3.s2.ser315.week3.implementation_eghanem.Main pMain) {
//        // Save a reference to the y3.s2.ser315.week3.implementation_eghanem.Main object pMain in mMain.
//        ???
//
//        // PSEUDOCODE:
//        // Declare and create a JPanel named panelLabel using the default FlowLayout layout manager.
//        // Create mResultLabel as a JLabel initialized to the empty string ""
//        // Add mResultLabel to panelLabel
//        ???
//
//        // PSEUDOCODE:
//        // Declare and create a JPanel named panelInput using the default FlowLayout layout manager.
//        // Create mInputText as a JTextField initialized to 40 columns wide
//        // Add mInputText to panelInput
//        ???
//
//        // PSEUDOCODE:
//        // Create a JPanel named panelButtons using FlowLayout.
//        // Create the Clear button mClearButton.
//        // Make this View the action listener for mClearButton.
//        // Add the  Clear button to the panel.
//        // Repeat the three above statements for the Evalute button.
//        // Repeat the three above statements for the Exit button.
//        ???
//
//        // PSEUDOCODE
//        // Create a JPanel named panelMain using a vertical BoxLayout.
//        // Add some vertical glue to panelMain
//        // Add panelLabel to panelMain.
//        // Add panelInput to panelMain.
//        // Add panelButtons to panelMain.
//        ???
//
//        setTitle("Kalkutron-9001");
//        setSize(FRAME_WIDTH, FRAME_HEIGHT);
//        setResizable(false);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        add(panelMain);
//        setVisible(true);
//    }
//
//    /**
//     * actionPerformed()
//     *
//     * Called when one of the JButtons is clicked. Detects which button was clicked and handles it.
//     *
//     * PSEUDOCODE:
//     * If the source of the event was mClearbutton Then
//     *     Call clear()
//     * ElseIf the source of the event was mEvalButton Then
//     *     Call evaluate()
//     * ElseIf the source of the event was mExitButton Then
//     *     Call exit() on mMain.
//     * End If
//     */
//    ???
//
//            /**
//             * clear() is called when the Clear button is clicked. Set the text in mInputText and mResultLabel to the
//             * empty strings "".
//             */
//            ???
//
//            /**
//             * evaluate() is called when the Evaluate button is clicked.
//             *
//             * PSEUDOCODE:
//             * Retrieve the text string from mInputText
//             * Declare and create an Expression object named expr passing the text string to the ctor
//             * Call expr.evaluate() and assign the return value a Double object named result
//             * Display result in mResultLabel (call toString on result)
//             */
//            ???
//
//    /**
//     * messageBox()
//     * <p>
//     * Note that passing 'this' as the first arg causes the View to be the parent of the message
//     * dialog window, so the dialog will be centered in the middle of the View. If we pass 'null'
//     * as the argument, then the dialog does not have a parent frame and will be centered in the
//     * middle of the display.
//     */
//    public void messageBox(String pMessage) {
//        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
//    }
//
//}
