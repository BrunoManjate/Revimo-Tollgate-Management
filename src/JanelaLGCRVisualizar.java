import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

public class JanelaLGCRVisualizar extends JFrame {

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

    };

    // CONSTRUTOR
    public JanelaLGCRVisualizar(Object[] carros, int totalCarros) {

        super("Portagem Maputo - Tabela Ligeiro sem Roboque");

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
   

       preencherTabelaLigierioSR();
        

        setSize(1150,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public  void preencherTabelaLigierioSR()
    {
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
            
            if (c instanceof LigeiroCR) {

                LigeiroCR x = (LigeiroCR) c;

                dados[i][0] = "Ligeiro CR";
                dados[i][7] = x.getN_passageiro();
                dados[i][8] = x.getNumeroExio();
                dados[i][9] = x.getPesoBruto();
                dados[i][11] = x.getTipoRoboque();
                dados[i][12] = x.getPesoRoboque();
            }
            tabela.setModel(new DefaultTableModel(dados, colunas));

        }
        
    }
    
    
}