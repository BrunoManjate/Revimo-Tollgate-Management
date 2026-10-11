import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

public class Visualizacoes extends JFrame {

    // VARIÁVEIS
    private Container cont;
    private JTable tabela;
    private JScrollPane scroll;
    private  JButton btvoltat;

    private Object[] carros;
    private int totalCarros;

    private String[] colunas = {
        "Tipo","Marca","Modelo","Matricula","Cor","Data",
        "Ano","Combustivel",

        "Passageiros","Eixos","Peso Bruto",
        "Peso Extra","Tipo Reboque","Peso Reboque",

        "Carga Max","Tipo Carga","Perigosa","Carga",

        "Peso Atrelado","Comprimento",

        "Tipo Mota","Cilindrada","Sidecar",

        "Valor"
    };

    // CONSTRUTOR
    public Visualizacoes(Object[] carros, int totalCarros) {

        super("Portagem Maputo - Tabela Geral");

        this.carros = carros;
        this.totalCarros = totalCarros;

        cont = getContentPane();
        cont.setLayout(new BorderLayout());

        tabela = new JTable();
        scroll = new JScrollPane(tabela);
        
        btvoltat = new JButton("Voltar");
        btvoltat.addActionListener(new ActionListener()
        		{
        	         public void actionPerformed(ActionEvent e)
        	         {
        	        	    dispose();
        	        	    new Janela_Principal(); 
        	         }
        		});
        btvoltat.setBackground(Color.RED);
        cont.add(btvoltat,BorderLayout.SOUTH);
        
        

        cont.add(scroll, BorderLayout.NORTH);
   

        preencherTabela();
        

        setSize(1150,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // PREENCHER TABELA GERAL
    public void preencherTabela() {

        Object[][] dados = new Object[totalCarros][colunas.length];

        for (int i = 0; i < totalCarros; i++) {

            Object c = carros[i];
            Carro v = (Carro) c;

            // DADOS BASE
            dados[i][0] = "";
            dados[i][1] = v.getMarca();
            dados[i][2] = v.getModelo();
            dados[i][3] = v.getMatricula();
            dados[i][4] = v.getCor();
            dados[i][5] = v.getData();
            dados[i][6] = v.getAnoFabrico();
            dados[i][7] = v.getTipoCombustivel();

            // LIGEIROS
            if (c instanceof LigeiroSR) {

                LigeiroSR x = (LigeiroSR) c;

                dados[i][0] = "Ligeiro SR";
                dados[i][7] = x.getN_passageiro();
                dados[i][8] = x.getNumeroExio();
                dados[i][9] = x.getPesoBruto();
                dados[i][10] = x.getPesoBruto1();
            }

            else if (c instanceof LigeiroCR) {

                LigeiroCR x = (LigeiroCR) c;

                dados[i][0] = "Ligeiro CR";
                dados[i][7] = x.getN_passageiro();
                dados[i][8] = x.getNumeroExio();
                dados[i][9] = x.getPesoBruto();
                dados[i][11] = x.getTipoRoboque();
                dados[i][12] = x.getPesoRoboque();
            }

            // PESADO ST
            else if (c instanceof PesadoST) {

                PesadoST x = (PesadoST) c;

                dados[i][0] = "Pesado ST";
                dados[i][8] = x.getNumEixo();
                dados[i][9] = x.getPesoBruto2();
                dados[i][13] = x.getCargaMaxima();
                dados[i][14] = x.getTipoCarga();
                dados[i][15] = x.getCargaPerigosa();
                dados[i][16] = x.getCarga();
            }

            // PESADO CT
            else if (c instanceof PesadoCT) {

                PesadoCT x = (PesadoCT) c;

                dados[i][0] = "Pesado CT";
                dados[i][8] = x.getNumEixo();
                dados[i][9] = x.getPesoBruto2();
                dados[i][13] = x.getCargaMaxima();
                dados[i][14] = x.getTipoCarga();
                dados[i][15] = x.getCargaPerigosa();
                dados[i][17] = x.getPesoAtrelado();
                dados[i][18] = x.getComprimentoTrelado();
            }

            // MOTAS
            // =========================
            else if (c instanceof Mota) {

                Mota x = (Mota) c;

                dados[i][0] = "Mota";
                dados[i][19] = x.getTipoMota();
                dados[i][20] = x.getCilindrada();
                dados[i][21] = x.isTemSedicar();
            }

            // VALOR FINAL
           // dados[i][22] = calcularValor(c);
        }

        tabela.setModel(new DefaultTableModel(dados, colunas));
    }

    

     
}