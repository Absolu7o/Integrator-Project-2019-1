package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class ViewMaster {

	GridBagConstraints c = new GridBagConstraints();
	JFrame frame = new JFrame();
	Container pane = frame.getContentPane();
	GridBagLayout grid = new GridBagLayout();
	
	Font fontText = new Font("Arial", Font.LAYOUT_RIGHT_TO_LEFT, 14);
	Font fontButton = new Font("Arial", Font.BOLD, 14);

	Dimension sizeDefault = new Dimension(60, 30);
	
	Color colorDefaultWhite = Color.decode("#FFFFFF"); // Branco
	Color colorDefaultBlack = Color.decode("#000000"); // Preto
	Color colorDefaultBlue = Color.decode("#0030FF"); // Azul
	Color colorDefaultBackground = Color.decode("#F4F4F4"); // Branco Cinzento //#D4D4D4
	
	public ViewMaster() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane.setLayout(grid);
		pane.setVisible(true);

		c.insets = new Insets(1,1,1,1);
		//c.weightx = 0.1;
		//c.weighty = 0.1;
		//c.ipadx = 5;
		//c.ipady = 5;
		//c.insets(insets);
		
	}
	
	public void setGridLayout(int column, int row) {
		
		grid.columnWidths =  new int[column];
		for (int i = 0; i < grid.columnWidths.length; i++)
			grid.columnWidths[i] = 60;
		
		grid.rowHeights = new int[row];
		for (int i = 0; i < grid.rowHeights.length; i++)
			grid.rowHeights[i] = 30;
		
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
	
	public JComboBox setDefaultCombobox(JComboBox combobox, int gridy, int gridx, int gridheight, int gridwidth, String text) {

		combobox.setPreferredSize(sizeDefault);
		combobox.setFont(fontText);
		combobox.setBackground(colorDefaultWhite);
		combobox.setForeground(colorDefaultBlack);
		combobox.setVisible(true);
		
		pane.add(combobox, setGridBagConstraints(gridy, gridx, gridheight, gridwidth, text));

		return combobox;
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
