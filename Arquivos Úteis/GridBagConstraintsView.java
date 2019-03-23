package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.text.IconView;

import controller.Controller;

public class View {

	Controller controller = new Controller();

	GridBagConstraints c = new GridBagConstraints();
	JFrame frame = new JFrame("Calculadora - JAVA");
	Container pane = frame.getContentPane();

	JLabel labelEquation = new JLabel();
	JLabel labelResult = new JLabel();

	JMenuBar menubar = new JMenuBar();
	JMenu optionMenu = new JMenu("Opções");
	JMenu preferences = new JMenu("Preferências");
	JMenu setTheme = new JMenu("Tema");
	JMenu setColor = new JMenu("Cor em Destaque");

	ButtonGroup groupTheme = new ButtonGroup();
	JRadioButtonMenuItem lighTheme = new JRadioButtonMenuItem("Claro");
	JRadioButtonMenuItem darkTheme = new JRadioButtonMenuItem("Escuro");

	ButtonGroup groupColor = new ButtonGroup();
	JRadioButtonMenuItem colorBlue = new JRadioButtonMenuItem("Azul");
	JRadioButtonMenuItem colorGreen = new JRadioButtonMenuItem("Verde");
	JRadioButtonMenuItem colorYellow = new JRadioButtonMenuItem("Amarelo");
	JRadioButtonMenuItem colorOrange = new JRadioButtonMenuItem("Laranja");
	JRadioButtonMenuItem colorRed = new JRadioButtonMenuItem("Vermelho");

	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");

	JButton buttonPoint = new JButton(".");
	JButton buttonClear = new JButton("C");
	JButton buttonEqual = new JButton("=");
	JButton buttonMore = new JButton("+");
	JButton buttonLess = new JButton("-");
	JButton buttonMult = new JButton("*");
	JButton buttonDivs = new JButton("/");

	Color color1 = Color.decode("#FFFFFF"); // Branco
	Color color2 = Color.decode("#000000"); // Preto
	Color color3 = Color.decode("#E1E1E1"); // Cinza Claro
	Color color4 = Color.decode("#FF6A00"); // Laranja

	public View() {
		createAndShowGUI();
	}

	private void createAndShowGUI() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane.setLayout(new GridBagLayout());
		pane.setSize(500, 600);
		pane.setVisible(true);

		buttonClear.setToolTipText("Limpar Campo");
		buttonEqual.setToolTipText("Resultado");

		labelEquation.setHorizontalAlignment(SwingConstants.RIGHT);
		labelResult.setHorizontalAlignment(SwingConstants.RIGHT);

		setFontComponent();
		setSizeComponent();
		setColorComponent();
		addMenubarItem();
		addComponentPane();
		setButtonFunction();
		setMenubarFunction();

		frame.pack();
		frame.setVisible(true);

	}

	public void setColorTheme() {

		// Tema Claro e Destaque Laranja
		color1 = Color.decode("#FFFFFF"); // Branco
		color2 = Color.decode("#000000"); // Preto
		color3 = Color.decode("#E1E1E1"); // Cinza Claro
		color4 = Color.decode("#FF6A00"); // Laranja

		setColorComponent();

	}

	private void setFontComponent() {

		Font fontText = new Font("Verdana", Font.LAYOUT_RIGHT_TO_LEFT, 24);
		Font fontButton = new Font("Verdana", Font.BOLD, 20);

		labelEquation.setFont(fontText);
		labelResult.setFont(fontText);

		button1.setFont(fontButton);
		button2.setFont(fontButton);
		button3.setFont(fontButton);
		button4.setFont(fontButton);
		button5.setFont(fontButton);
		button6.setFont(fontButton);
		button7.setFont(fontButton);
		button8.setFont(fontButton);
		button9.setFont(fontButton);
		button0.setFont(fontButton);
		buttonPoint.setFont(fontButton);
		buttonClear.setFont(fontButton);
		buttonEqual.setFont(fontButton);
		buttonMore.setFont(fontButton);
		buttonLess.setFont(fontButton);
		buttonMult.setFont(fontButton);
		buttonDivs.setFont(fontButton);

	}

	private void setSizeComponent() {

		Dimension sizeButton = new Dimension(110, 70);
		Dimension sizeLabel = new Dimension(330, 35);

		labelEquation.setPreferredSize(sizeLabel);
		labelResult.setPreferredSize(sizeLabel);

		button1.setPreferredSize(sizeButton);
		button2.setPreferredSize(sizeButton);
		button3.setPreferredSize(sizeButton);
		button4.setPreferredSize(sizeButton);
		button5.setPreferredSize(sizeButton);
		button6.setPreferredSize(sizeButton);
		button7.setPreferredSize(sizeButton);
		button8.setPreferredSize(sizeButton);
		button9.setPreferredSize(sizeButton);
		button0.setPreferredSize(sizeButton);
		button0.setPreferredSize(sizeButton);
		buttonPoint.setPreferredSize(sizeButton);
		buttonEqual.setPreferredSize(sizeButton);
		buttonMore.setPreferredSize(sizeButton);
		buttonLess.setPreferredSize(sizeButton);
		buttonMult.setPreferredSize(sizeButton);
		buttonDivs.setPreferredSize(sizeButton);

	}

	private void setColorComponent() {

		// color1
		pane.setBackground(color1);

		labelEquation.setBackground(color1);
		labelResult.setBackground(color1);

		button1.setBackground(color1);
		button2.setBackground(color1);
		button3.setBackground(color1);
		button4.setBackground(color1);
		button5.setBackground(color1);
		button6.setBackground(color1);
		button7.setBackground(color1);
		button8.setBackground(color1);
		button9.setBackground(color1);
		button0.setBackground(color1);
		buttonPoint.setBackground(color1);
		buttonClear.setBackground(color1);

		buttonEqual.setForeground(color1);

		// color2
		labelEquation.setForeground(color2);

		button1.setForeground(color2);
		button2.setForeground(color2);
		button3.setForeground(color2);
		button4.setForeground(color2);
		button5.setForeground(color2);
		button6.setForeground(color2);
		button7.setForeground(color2);
		button8.setForeground(color2);
		button9.setForeground(color2);
		button0.setForeground(color2);
		buttonPoint.setForeground(color2);
		buttonClear.setForeground(color2);

		// color3
		buttonMore.setBackground(color3);
		buttonLess.setBackground(color3);
		buttonMult.setBackground(color3);
		buttonDivs.setBackground(color3);

		// color4
		labelResult.setForeground(color4);

		buttonMore.setForeground(color4);
		buttonLess.setForeground(color4);
		buttonMult.setForeground(color4);
		buttonDivs.setForeground(color4);

		buttonEqual.setBackground(color4);

	}

	private void addMenubarItem() {

		pane.add(menubar, setGridBagConstraints(0, 0, 1, 3, "BOTH"));
		menubar.add(optionMenu);
		optionMenu.add(setTheme);
		optionMenu.add(setColor);

		setTheme.add(lighTheme);
		setTheme.add(darkTheme);

		setColor.add(colorBlue);
		setColor.add(colorGreen);
		setColor.add(colorYellow);
		setColor.add(colorOrange);
		setColor.add(colorRed);

		groupTheme.add(lighTheme);
		groupTheme.add(darkTheme);
		lighTheme.setSelected(true);

		groupColor.add(colorBlue);
		groupColor.add(colorGreen);
		groupColor.add(colorYellow);
		groupColor.add(colorOrange);
		groupColor.add(colorRed);
		colorOrange.setSelected(true);

	}

	private void addComponentPane() {

		c.weightx = 0.5;
		c.weighty = 0.5;

		pane.add(labelEquation, setGridBagConstraints(1, 0, 1, 3, "HORIZONTAL"));
		pane.add(labelResult, setGridBagConstraints(2, 0, 1, 3, "HORIZONTAL"));

		pane.add(button7, setGridBagConstraints(3, 0, 1, 1, "BOTH"));
		pane.add(button8, setGridBagConstraints(3, 1, 1, 1, "BOTH"));
		pane.add(button9, setGridBagConstraints(3, 2, 1, 1, "BOTH"));
		pane.add(button4, setGridBagConstraints(4, 0, 1, 1, "BOTH"));
		pane.add(button5, setGridBagConstraints(4, 1, 1, 1, "BOTH"));
		pane.add(button6, setGridBagConstraints(4, 2, 1, 1, "BOTH"));
		pane.add(button1, setGridBagConstraints(5, 0, 1, 1, "BOTH"));
		pane.add(button2, setGridBagConstraints(5, 1, 1, 1, "BOTH"));
		pane.add(button3, setGridBagConstraints(5, 2, 1, 1, "BOTH"));
		pane.add(buttonPoint, setGridBagConstraints(6, 0, 1, 1, "BOTH"));
		pane.add(button0, setGridBagConstraints(6, 1, 1, 1, "BOTH"));
		pane.add(buttonClear, setGridBagConstraints(6, 2, 1, 1, "BOTH"));
		pane.add(buttonMore, setGridBagConstraints(7, 0, 1, 1, "BOTH"));
		pane.add(buttonLess, setGridBagConstraints(7, 1, 1, 1, "BOTH"));
		pane.add(buttonMult, setGridBagConstraints(7, 2, 1, 1, "BOTH"));
		pane.add(buttonDivs, setGridBagConstraints(8, 0, 1, 1, "BOTH"));
		pane.add(buttonEqual, setGridBagConstraints(8, 1, 1, 2, "BOTH"));

	}

	private GridBagConstraints setGridBagConstraints(int gridy, int gridx, int gridheight, int gridwidth, String text) {

		c.gridy = gridy;
		c.gridx = gridx;
		c.gridheight = gridheight;
		c.gridwidth = gridwidth;

		if (text.equals("HORIZONTAL")) {
			c.fill = GridBagConstraints.HORIZONTAL;
		} else if (text.equals("BOTH")) {
			c.fill = GridBagConstraints.BOTH;
		}

		return c;

	}

	private void setButtonFunction() {

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "1");
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "2");
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "3");
			}
		});

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "4");
			}
		});

		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "5");
			}
		});

		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "6");
			}
		});

		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "7");
			}
		});

		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "8");
			}
		});

		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "9");
			}
		});

		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "0");
			}
		});

		buttonMore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "+");
			}
		});

		buttonLess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "-");
			}
		});

		buttonMult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "*");
			}
		});

		buttonDivs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + "/");
			}
		});

		buttonPoint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText(labelEquation.getText() + ".");
			}
		});

		buttonEqual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				labelResult.setText(controller.counEquation(labelEquation.getText()));

			}
		});

		buttonClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelEquation.setText("");

			}
		});

	}

	private void setMenubarFunction() {

		lighTheme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color1 = Color.decode("#FFFFFF"); // Branco
				color2 = Color.decode("#000000"); // Preto
				color3 = Color.decode("#E1E1E1"); // Cinza Claro
				setColorComponent();
			}
		});

		darkTheme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				color1 = Color.decode("#0F0F0F");
				color2 = Color.decode("#F9F9F9");
				color3 = Color.decode("#000000");
				setColorComponent();
			}
		});

		colorBlue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color4 = Color.decode("#00BBFF"); // Azul Claro
				setColorComponent();
			}
		});

		colorGreen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color4 = Color.decode("#00FF11"); // Verde
				setColorComponent();
			}
		});

		colorYellow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color4 = Color.decode("#FFFF00"); // Amarelo
				setColorComponent();
			}
		});

		colorOrange.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color4 = Color.decode("#FF6A00"); // Laranja
				setColorComponent();
			}
		});

		colorRed.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				color4 = Color.decode("#FF0000"); // Vermelho
				setColorComponent();
			}
		});
		
	}

}
