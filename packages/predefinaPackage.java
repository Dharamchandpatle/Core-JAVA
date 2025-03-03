package packages;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
public class predefinaPackage {
    public static void main ( String aa[]){
        Frame f = new Frame();
        Button b = new Button("Button");

        f.setVisible(true);
        f.setSize(500 , 500);
        f.setLayout(new FlowLayout());
        f.add(b);
        f.setBackground(Color.red);
    }
}
