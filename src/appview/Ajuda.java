package appview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Ajuda extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ajuda() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sobre - PxGames");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblNewLabel.setBounds(124, 11, 236, 40);
		add(lblNewLabel);
		
		JTextArea txtrSasasaa = new JTextArea();
		txtrSasasaa.setText("SISTEMA B\u00C1SICO DESENVOLVIDO PARA AULA DE JAVA DO SENAC");
		txtrSasasaa.setBounds(26, 68, 457, 53);
		add(txtrSasasaa);
		
		JTextArea txtrCursoTcnicoEm = new JTextArea();
		txtrCursoTcnicoEm.setText("CURSO T\u00C9CNICO EM INFORM\u00C1TICA TURMA 2016.2");
		txtrCursoTcnicoEm.setBounds(77, 132, 339, 22);
		add(txtrCursoTcnicoEm);
		
		JTextArea txtrDesenvolvidoPorPatrick = new JTextArea();
		txtrDesenvolvidoPorPatrick.setText("DESENVOLVIDO POR: PATRICK CHAGAS");
		txtrDesenvolvidoPorPatrick.setBounds(39, 194, 339, 22);
		add(txtrDesenvolvidoPorPatrick);
		
		JTextArea txtrPortflioPatrickchagascom = new JTextArea();
		txtrPortflioPatrickchagascom.setText("PORTF\u00D3LIO: PATRICKCHAGAS.COM");
		txtrPortflioPatrickchagascom.setBounds(39, 227, 339, 22);
		add(txtrPortflioPatrickchagascom);

	}
}
