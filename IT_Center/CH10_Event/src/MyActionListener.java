import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("¾×¼Ç");
		else
			b.setText("Action");
		InnerClassListener.this.setTitle(b.getText());
		
	}
}
