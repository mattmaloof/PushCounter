import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanelq3 extends JPanel{
    private int count;
    private JButton increment, decrement;
    private JLabel label;

    public PushCounterPanelq3() {
        count = 50;
        increment = new JButton("Increment");
        label = new JLabel("" + count);
        decrement = new JButton("Decrement");
        increment.addActionListener(new ButtonListener());
        decrement.addActionListener(new ButtonListener());
        add(increment);
        add(decrement);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300,40));
    }
    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            String s = event.getActionCommand();
            if (s.equals("Increment")) {
                count = Integer.parseInt(label.getText());
                count++;
                label.setText("" + count);
            } else {
                count = Integer.parseInt(label.getText());
                count--;
                label.setText("" + count);
            }
        }
    }
}
