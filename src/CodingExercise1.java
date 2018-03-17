import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
Robot k=new Robot();
k.miniaturize();
k.setSpeed(1000);
k.penDown();
    String color=JOptionPane.showInputDialog(null, "What color would you like the robot to draw? (red,green)");
    	
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(color.equals("red")) {
	k.setPenColor(255, 0, 0);
}
if(color.equals("green")) {
	k.setPenColor(0, 255, 0);
}
   	 // 2. set the pen width to 10
k.setPenWidth(10);
   	 // 1. make the Robot draw a shape
for(int i=0; i<4;i++) {
	
	k.move(50);
	k.turn(90);
	
}
		

   	 
    }

}
