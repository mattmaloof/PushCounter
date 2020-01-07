import javax.swing.JFrame;
public class PushCounterq3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PushCounterPanelq3 panel = new PushCounterPanelq3();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
