import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	
String color = JOptionPane.showInputDialog("What is your favorite color?");	
	
JOptionPane.showMessageDialog(null, color+" is my favorite color too!");	
	
Robot SpinningRobo	= new Robot();

SpinningRobo.hide();

SpinningRobo.penDown();

for (int i = 0; i < 4; i++) {
	

SpinningRobo.move(100);

SpinningRobo.turn(120);
}

}
}
