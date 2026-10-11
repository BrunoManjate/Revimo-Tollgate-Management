import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Janela_Principal extends JFrame {
	private Container cont;
	private JButton btEmitir, btcontdade, btVisualzar, btSprograma, btsair, lerDados;
	private JPanel painelPrincipal;
	private JLabel labelImagem;
	private Tarefas tarefa;

	public Janela_Principal() {
		super("Bem vindo ao Sistema Revimo");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		tarefa = new Tarefas();

		aparencia();

		painelPrincipal = new JPanel(new GridLayout(6, 1));

		lerDados = new JButton("Visualizar Dados");
		lerDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tarefa.lerDoFicheiro();
				JOptionPane.showMessageDialog(null, "Dados lidos com sucesso");
				tarefa.tabelaGeral();
			}
		});

		lerDados.setBackground(Color.BLACK);
		lerDados.setForeground(Color.WHITE);
		painelPrincipal.add(lerDados);

		// contabilidade de portagem revima
		btEmitir = new JButton("Emitir Dados Veiculos");
		btEmitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaEmitirDados();
				dispose();
			}
		});
		painelPrincipal.add(btEmitir);
		btEmitir.setBackground(Color.BLACK);
		btEmitir.setForeground(Color.WHITE);

		// contabilidade de portagem revima
		btcontdade = new JButton("Contabilidade");
		btcontdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new janelaLCRQunt();
			}
		});
		painelPrincipal.add(btcontdade);
		btcontdade.setBackground(Color.BLACK);
		btcontdade.setForeground(Color.WHITE);

		// Visualizar
		btVisualzar = new JButton("Visualzar");
		btVisualzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JanelaVisualizacao();
				dispose();
			}
		});
		painelPrincipal.add(btVisualzar);
		btVisualzar.setBackground(Color.BLACK);
		btVisualzar.setForeground(Color.WHITE);

		btSprograma = new JButton("Sobre Programa");
		btSprograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SobrePrograma();
				dispose();
			}
		});
		painelPrincipal.add(btSprograma);
		btSprograma.setBackground(Color.BLACK);
		btSprograma.setForeground(Color.WHITE);

		btsair = new JButton("Sair");
		btsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		painelPrincipal.add(btsair);
		btsair.setBackground(Color.RED);
		btsair.setForeground(Color.WHITE);

		// ---------- IMAGEM (só isto mudou) ----------
		URL url = getClass().getResource("/imagens/imagemJP.png");
		ImageIcon icon = (url != null) ? new ImageIcon(url) : new ImageIcon();

		// reduzir imagem
		Image img = icon.getImage();
		if (img != null) {
			Image imaRemensionada = img.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
			icon = new ImageIcon(imaRemensionada);
		}
		labelImagem = new JLabel(icon);
		// ----------------------------------------

		cont.add(painelPrincipal, BorderLayout.WEST);
		cont.add(labelImagem, BorderLayout.EAST);

		// desenho da jenela
		setSize(1200, 700);
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

	public static void main(String[] args) {

		new Janela_Principal();
	}
}