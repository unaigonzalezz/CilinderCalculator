import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateCilinder extends  JFrame{
    private JPanel MainPanel;
    private JButton calculateVolumeButton;
    private JButton calculateSurfaceButton1;
    private JLabel aCylinderSVolumeLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel byUnaiGonzálezUnaiitxuuLabel;
    private JLabel insertTheValuesWithLabel;

    public CalculateCilinder() {
        calculateSurfaceButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String radioString = textField1.getText();
                String heightString = textField2.getText();
                Double radio = Double.valueOf(radioString);
                Double height = Double.valueOf(heightString);
                Double surface =  2*Math.PI*radio*height + 2*Math.PI * (radio*radio);
                JOptionPane.showMessageDialog(calculateSurfaceButton1,"The surface of the cilinder is: " + surface  + " centimeters");

            }
        });
        calculateVolumeButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                String radioString = textField1.getText();
                String heightString = textField2.getText();
                Double radio = Double.valueOf(radioString);
                Double height = Double.valueOf(heightString);
                Double volume = Math.PI*(radio*radio)*height;
                JOptionPane.showMessageDialog(calculateSurfaceButton1,"The volume of the cilinder is: " + volume + " centimeters");

            }
        });
    }

    public static void main(String[] args) {
        CalculateCilinder h=new CalculateCilinder();
        h.setContentPane(h.MainPanel);
        h.setTitle("Cilinder Calculator");
        h.setSize(800, 300);
        h.setVisible(true);




    }
}
