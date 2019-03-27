package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class ViewMaster {

	GridBagConstraints c = new GridBagConstraints();
	JFrame frame = new JFrame();
	Container pane = frame.getContentPane();
	
	Insets insets = new Insets(5,5,5,5); //???

	Font fontText = new Font("Arial", Font.LAYOUT_RIGHT_TO_LEFT, 14);
	Font fontButton = new Font("Arial", Font.BOLD, 14);

	Dimension sizeDefault = new Dimension(45, 30);
	
	Color colorDefaultWhite = Color.decode("#FFFFFF"); // Branco
	Color colorDefaultBlack = Color.decode("#000000"); // Preto
	Color colorDefaultBlue = Color.decode("#0030FF"); // Azul
	Color colorDefaultBackground = Color.decode("#F4F4F4"); // Branco Cinzento
	
	public ViewMaster() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane.setLayout(new GridBagLayout());
		pane.setVisible(true);

		//c.weightx = 0.1;
		//c.weighty = 0.1;
		//c.ipadx = 5;
		//c.ipady = 5;
		//c.insets(insets);
		
	}

	public JButton setDefaultButton(JButton button, int gridy, int gridx, int gridheight, int gridwidth, String text) {

		button.setFont(fontButton);
		button.setPreferredSize(sizeDefault);
		button.setBackground(colorDefaultBlue);
		button.setForeground(colorDefaultWhite);
		button.setFocusable(false);

		pane.add(button, setGridBagConstraints(gridy, gridx, gridheight, gridwidth, text));

		return button;
	}

	public JLabel setDefaultLabel(JLabel label, int gridy, int gridx, int gridheight, int gridwidth, String text) {

		label.setPreferredSize(sizeDefault);
		label.setFont(fontText);
		label.setBackground(colorDefaultWhite);
		label.setForeground(colorDefaultBlack);
		
		pane.add(label, setGridBagConstraints(gridy, gridx, gridheight, gridwidth, text));

		return label;
	}

	public JTextField setDefaultField(JTextField field, int gridy, int gridx, int gridheight, int gridwidth, String text) {

		field.setPreferredSize(sizeDefault);
		field.setFont(fontText);
		field.setBackground(colorDefaultWhite);
		field.setForeground(colorDefaultBlack);
		
		pane.add(field, setGridBagConstraints(gridy, gridx, gridheight, gridwidth, text));

		return field;
	}

	public GridBagConstraints setGridBagConstraints(int gridy, int gridx, int gridheight, int gridwidth, String text) {

		c.gridy = gridy;
		c.gridx = gridx;
		c.gridheight = gridheight;
		c.gridwidth = gridwidth;

		if (text.equals("HORIZONTAL")) {
			c.fill = GridBagConstraints.HORIZONTAL;
		} else if (text.equals("BOTH")) {
			c.fill = GridBagConstraints.BOTH;
		} else if (text.equals("ABOVE_BASELINE")) {
			c.fill = GridBagConstraints.ABOVE_BASELINE;
		}

		return c;

	}
}
