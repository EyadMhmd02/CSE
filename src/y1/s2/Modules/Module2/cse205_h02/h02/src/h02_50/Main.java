package y1.s2.Modules.Module2.cse205_h02.h02.src.h02_50;//**************************************************************************************************
// CLASS: Quizzes.Quiz1_2.Main
//
// Quizzes.Quiz1_2.Main simply instantiates a View object so the GUI will be displayed when the program runs.
//**************************************************************************************************
import javax.swing.JFrame;

public class Main {

    public static void main(String[] pArgs) {
        new Main().run();
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        View view = new View();
    }

}
