import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TestAreal implements ActionListener{
	JTextArea text;
	public static void main(String[] args) {
		TestAreal gui=new TestAreal();
		gui.go();
	}
	public void go() {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton button=new JButton("Click it");
		button.addActionListener(this);
		text=new JTextArea(10,20);
		text.setLineWrap(true);
		
		JScrollPane scrollBar=new JScrollPane(text);
		scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scrollBar);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(350, 300);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		text.append("Button clicked \n");
	}
	
}
