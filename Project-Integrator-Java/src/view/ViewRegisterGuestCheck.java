package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewRegisterGuestCheck extends ViewMaster implements ActionListener {

	JLabel labelVoid = new JLabel(); //Label apenas para separar
	JLabel labelTitle = new JLabel("Cadastro de Comandas");
	JLabel labelCode = new JLabel("Código");
	JLabel labelDescription = new JLabel("Descrição");

	JButton buttonFirst = new JButton("|<");
	JButton buttonPrevious = new JButton("<");
	JButton buttonNext = new JButton(">");
	JButton buttonLast = new JButton(">|");
	JButton buttonInsert = new JButton("+");
	JButton buttonDelete = new JButton("-");
	JButton buttonEdit = new JButton("E");
	JButton buttonConfirm = new JButton("v");
	JButton buttonCancel = new JButton("x");
	JButton buttonRefresh = new JButton("R");
	JButton buttonSearch = new JButton("Q");
	
	JTextField fieldCode = new JTextField();
	JTextField fieldDescription = new JTextField();
	
	public ViewRegisterGuestCheck() {
		createAndShowGUI();
	}

	private void createAndShowGUI() {

		addButtonDefaultPane();
		addLabelDefaultPane();
		addFieldDefaultPane();
		
		setButtonFunction();

		pane.setBackground(colorDefaultBackground);
				
		frame.setTitle("Cadastro de Comandas");
		frame.pack();
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		
	}

	private void addLabelDefaultPane() {

		labelTitle = setDefaultLabel(labelTitle, 0, 0, 1, 15, "HORIZONTAL");
		labelVoid = setDefaultLabel(labelVoid, 2, 0, 1, 15, "HORIZONTAL"); //Solução Rápida, encontrar outro método
		labelCode = setDefaultLabel(labelCode, 3, 0, 1, 2, "HORIZONTAL");
		labelDescription = setDefaultLabel(labelDescription, 4, 0, 1, 2, "HORIZONTAL");		
	}
	
	private void addFieldDefaultPane() {

		fieldCode = setDefaultField(fieldCode, 3, 2, 1, 1, "HORIZONTAL");
		fieldDescription = setDefaultField(fieldDescription, 4, 2, 1, 3, "HORIZONTAL");
		
	}
	
	private void addButtonDefaultPane() {

		buttonFirst = setDefaultButton(buttonFirst, 1, 0, 1, 1, "ABOVE_BASELINE");
		buttonPrevious = setDefaultButton(buttonPrevious, 1, 1, 1, 1, "ABOVE_BASELINE");
		buttonNext = setDefaultButton(buttonNext, 1, 2, 1, 1, "ABOVE_BASELINE");
		buttonLast = setDefaultButton(buttonLast, 1, 3, 1, 1, "ABOVE_BASELINE");
		buttonInsert = setDefaultButton(buttonInsert, 1, 4, 1, 1, "ABOVE_BASELINE");
		buttonDelete = setDefaultButton(buttonDelete, 1, 5, 1, 1, "ABOVE_BASELINE");
		buttonEdit = setDefaultButton(buttonEdit, 1, 6, 1, 1, "ABOVE_BASELINE");
		buttonConfirm = setDefaultButton(buttonConfirm, 1, 7, 1, 1, "ABOVE_BASELINE");
		buttonCancel = setDefaultButton(buttonCancel, 1, 8, 1, 1, "ABOVE_BASELINE");
		buttonRefresh = setDefaultButton(buttonRefresh, 1, 9, 1, 1, "ABOVE_BASELINE");
		buttonSearch = setDefaultButton(buttonSearch, 3, 3, 1, 1, "ABOVE_BASELINE");

	}
	
	private void setButtonFunction() {

		buttonFirst.addActionListener(this);
		buttonPrevious.addActionListener(this);
		buttonNext.addActionListener(this);
		buttonLast.addActionListener(this);
		buttonInsert.addActionListener(this);
		buttonDelete.addActionListener(this);
		buttonEdit.addActionListener(this);
		buttonConfirm.addActionListener(this);
		buttonCancel.addActionListener(this);
		buttonRefresh.addActionListener(this);
		buttonSearch.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == buttonFirst) {
			System.out.println("Primeiro");
		} else if (e.getSource() == buttonPrevious) {
			System.out.println("Anterior");
		} else if (e.getSource() == buttonNext) {
			System.out.println("Próximo");
		} else if (e.getSource() == buttonLast) {
			System.out.println("Último");
		} else if (e.getSource() == buttonInsert) {
			System.out.println("Inserir");
		} else if (e.getSource() == buttonDelete) {
			System.out.println("Excluir");
		} else if (e.getSource() == buttonEdit) {
			System.out.println("Editar");
		} else if (e.getSource() == buttonConfirm) {
			System.out.println("Confirmar");
		} else if (e.getSource() == buttonCancel) {
			System.out.println("Cancelar");
		} else if (e.getSource() == buttonRefresh) {
			System.out.println("Atualizar");
		} else if (e.getSource() == buttonSearch) {
			System.out.println("Pesquisar");
		}
	}

}
