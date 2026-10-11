import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class LoginRevimo extends JFrame {

	private Container cont;
	private JLabel labelUsuario, labelSenha, labelImagem;
	private JTextField tusuario;
	private JPasswordField fsenha;
	private JButton botoesEntar, botoesSair;
	private JPanel painelogin, panelBotoes;

	public LoginRevimo() {
		super("Login Revimo");
		cont = getContentPane();
		setLayout(new BorderLayout());
		cont.setBackground(Color.white);

		aparencia();

		painelogin = new JPanel(new GridLayout(2, 2));
		painelogin.setBackground(Color.white);

		labelUsuario = new JLabel("     Usuario");
		painelogin.add(labelUsuario);
		tusuario = new JTextField();
		painelogin.add(tusuario);

		labelSenha = new JLabel("     Senha");
		painelogin.add(labelSenha);
		fsenha = new JPasswordField();
		painelogin.add(fsenha);

		panelBotoes = new JPanel(new GridLayout(1, 2));

		botoesSair = new JButton("Sair");
		botoesSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelBotoes.add(botoesSair);
		botoesSair.setBackground(Color.RED);
		botoesSair.setForeground(Color.black);

		botoesEntar = new JButton("Logar");
		botoesEntar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = tusuario.getText();
				String senha = new String(fsenha.getPassword());

				if (usuario.equals("Rosina") && senha.equals("Rosina")) {
					JOptionPane.showMessageDialog(null, "Bem Vindo a portagem Revimo");
					new Janela_Principal();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Senha incoreecta!Tente novamento");
				}
			}
		});

		panelBotoes.add(botoesEntar);
		botoesEntar.setBackground(Color.GREEN);
		botoesEntar.setForeground(Color.black);

		// ---------- IMAGEM (corrigido) ----------
		URL url = getClass().getResource("/imagens/logo.jpg");
		ImageIcon icon = (url != null) ? new ImageIcon(url) : new ImageIcon();
		labelImagem = new JLabel(icon);
		// ----------------------------------------

		cont.add(labelImagem, BorderLayout.NORTH);
		cont.add(painelogin, BorderLayout.CENTER);
		cont.add(panelBotoes, BorderLayout.SOUTH);

		setSize(750, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void aparencia() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] portagemRevima) {
		new LoginRevimo();
	}
}