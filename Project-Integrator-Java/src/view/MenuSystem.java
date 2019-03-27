package view;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuSystem extends ViewMaster {

	JFrame frame = new JFrame("JAVA");
	Container pane = frame.getContentPane();

	JButton buttonProgram1 = new JButton("Programa 1");
	JButton buttonProgram2 = new JButton("Programa 2");
	JButton buttonProgram3 = new JButton("Programa 3");

	public MenuSystem() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane.setLayout(new GridBagLayout());
		pane.setSize(500, 600);
		pane.setVisible(true);

		pane.add(buttonProgram1, setGridBagConstraints(1, 0, 1, 1, "BOTH"));
		pane.add(buttonProgram2, setGridBagConstraints(2, 0, 1, 1, "BOTH"));
		pane.add(buttonProgram3, setGridBagConstraints(3, 0, 1, 1, "BOTH"));

		setButtonFunction();

		frame.pack();
		frame.setVisible(true);

	}

	private void setButtonFunction() {

		// Aqui s�o definidas fun��es de Clicks, cada bot�o deve chamar um program 
		// na'ControllerMaster'
		buttonProgram1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		buttonProgram2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		buttonProgram3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

}
