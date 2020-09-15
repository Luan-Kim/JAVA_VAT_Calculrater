import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class VAT_Calcurator extends JFrame {
    JTextField tf = new JTextField(20);
    JTextArea ta = new JTextArea(7, 20);

    VAT_Calcurator() {
        setTitle("부가가치세 계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("상품 가격 입력 후 <Enter> 키를 입력하세요"));
        c.add(tf);
        c.add(new JScrollPane(ta));

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s;
                Integer VAT;
                JTextField t = (JTextField)e.getSource();
                s = t.getText();
                double i = Double.parseDouble(s);
                VAT = Math.toIntExact(Math.round((i / 100) * 10));
                ta.append(VAT + "원" + "\n");
            }
        });
        setSize(300,250);
        setVisible(true);
    }
    public static void main(String [] args) {
        new VAT_Calcurator();
    }
}


