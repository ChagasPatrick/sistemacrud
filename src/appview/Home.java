package appview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;

import javax.swing.ImageIcon;


public class Home extends JFrame {

	private JPanel contentPane;
	
	
	// TROCAR O ICONE DA BARRA DE TITULO DO JFRAME / DANDO ERRADO AINDA!
	
	//URL caminhoIcone = getClass().getResource("/imagens/computer.png");
	//Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
	//this.setIconImage(iconeTitulo);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
	
		// MUDANDO O TEMA DAS JANELAS DO PROGRAMA
		
	/*	try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		  try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		  
		  new Home().setVisible(true);
		  
		}
		
		*/
		
		
	
		// MUDANDO O TEMA DAS JANELAS DO PROGRAMA
		
		
		try {
            // select Look and Feel
            //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
           // start application
			
            //Home frame = new Home();
			//frame.setVisible(true);
            
            new Home().setVisible(false);
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBounds(100, 100, 893, 589);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		mnNewMenu.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\folder.png"));
		mnNewMenu.setFont(new Font("Consolas", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmnicio = new JMenuItem("\u00CDnicio");
		mntmnicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mntmnicio.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\house.png"));
		mntmnicio.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnNewMenu.add(mntmnicio);
		mntmSair.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmSair.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\door_out.png"));
		mnNewMenu.add(mntmSair);
		
		JMenu mnNewMenu_1 = new JMenu("Administradores");
		mnNewMenu_1.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnNewMenu_1.setIcon(new ImageIcon("E:\\Codes\\images icons\\User-Administrator-Blue-icon.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					contentPane.removeAll();
					contentPane.add(new CadastroDeAdministrador());
					contentPane.updateUI();
					
				
			}
		});
		mntmCadastrar.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmCadastrar.setIcon(new ImageIcon("E:\\Codes\\WorkSpace - Estudo\\PxGamesGerenciamento\\imagens\\icons 1\\user.png"));
		mnNewMenu_1.add(mntmCadastrar);
		
		JMenuItem mntmEditar = new JMenuItem("Listar");
		mntmEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.add(new ListaDeAdministrador(contentPane));
				contentPane.updateUI();
				
			}
		});
		mntmEditar.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmEditar.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\user_edit.png"));
		mnNewMenu_1.add(mntmEditar);
		
		JMenu mnFuncionarios = new JMenu("Funcionarios");
		mnFuncionarios.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnFuncionarios.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\user.png"));
		menuBar.add(mnFuncionarios);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mntmCadastrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();
				contentPane.add(new CadastroDeFuncionario());
				contentPane.updateUI();
				
			}
		});
		mntmCadastrar_1.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmCadastrar_1.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\user_add.png"));
		mnFuncionarios.add(mntmCadastrar_1);
		
		JMenuItem mntmEditar_1 = new JMenuItem("Listar");
		mntmEditar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.add(new ListaDeFuncionario(contentPane));
				contentPane.updateUI();
			}
		});
		mntmEditar_1.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmEditar_1.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\user_edit.png"));
		mnFuncionarios.add(mntmEditar_1);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnProdutos.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\package.png"));
		menuBar.add(mnProdutos);
		
		JMenuItem mntmCadastrar_2 = new JMenuItem("Cadastrar");
		mntmCadastrar_2.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmCadastrar_2.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\package_add.png"));
		mntmCadastrar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.add(new CadastroDeProduto());
				contentPane.updateUI();
				
			}
		});
		mnProdutos.add(mntmCadastrar_2);
		
		JMenuItem mntmEditar_2 = new JMenuItem("Listar");
		mntmEditar_2.setFont(new Font("Consolas", Font.PLAIN, 16));
		mntmEditar_2.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\package_go.png"));
		mntmEditar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();
				contentPane.add(new ListaDeProduto(contentPane));
				contentPane.updateUI();
			}
		});
		mnProdutos.add(mntmEditar_2);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\group.png"));
		mnClientes.setFont(new Font("Consolas", Font.PLAIN, 16));
		menuBar.add(mnClientes);
		
		JMenuItem mntmCadastrar_3 = new JMenuItem("Cadastrar");
		mntmCadastrar_3.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\group_add.png"));
		mntmCadastrar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.add(new CadastroDeCliente());
				contentPane.updateUI();
				
			}
		});
		mntmCadastrar_3.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnClientes.add(mntmCadastrar_3);
		
		JMenuItem mntmEditar_3 = new JMenuItem("Listar");
		mntmEditar_3.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\group_edit.png"));
		mntmEditar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.add(new ListaDeCliente(contentPane));
				contentPane.updateUI();
				
			}
		});
		mntmEditar_3.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnClientes.add(mntmEditar_3);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setFont(new Font("Consolas", Font.PLAIN, 16));
		mnAjuda.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\help.png"));
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre ");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();
				contentPane.add(new Ajuda());
				contentPane.updateUI();
			}
		});
		mntmSobre.setIcon(new ImageIcon("J:\\5\u00B0 MODULO\\PROJETO FINAL\\WorkSpace\\PxGamesGerenciamento\\imagens\\icons 1\\information.png"));
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\Codes\\projeto-logo.png"));
		lblNewLabel.setBounds(234, 162, 350, 200);
		panel.add(lblNewLabel);
	}
}
