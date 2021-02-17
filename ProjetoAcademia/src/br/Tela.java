package br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import  javax.swing.JFrame ;
import  javax.swing.JLabel ;
import javax.swing.JOptionPane;
import  javax.swing.JTextField ;

public  class  Tela implements ActionListener {
	
	
	public  void  criarTela () {
		
		// *** Construir a tela
		JFrame tela =  new JFrame ();
		tela . setTitle ( " Calculos com ret�ngulo " );
		tela . setSize ( 450 , 400 );
		tela . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		tela . setLayout ( null );
		
		// *** Construir um JLabel e JTextField
		JLabel labelNome =  new  JLabel ();
		labelNome . setText ( " Nome: " );
		labelNome . setBounds ( 10 , 10 , 60 , 20 );
		JTextField textNome =  new  JTextField ();
		textNome . setBounds ( 70 , 10 , 200 , 25 );
		
		JLabel labelData =  new  JLabel ();
		labelData . setText ( " Data de Nascimento: " );
		labelData . setBounds ( 10 , 50 , 150 , 20 );
		JTextField textData =  new  JTextField ();
		textData . setBounds ( 160 , 50 , 100 , 25 );
		
		JLabel labelSexo =  new  JLabel ();
		labelSexo . setText ( " Sexo: " );
		labelSexo . setBounds ( 10 , 80 , 60 , 20 );
		JTextField textSexo =  new  JTextField ();
		textSexo . setBounds ( 70 , 80 , 70 , 25 );
		
		JLabel labelPeso =  new  JLabel ();
		labelPeso . setText ( " Peso: " );
		labelPeso . setBounds ( 10 , 110 , 60 , 20 );
		JTextField textPeso =  new  JTextField ();
		textPeso . setBounds ( 70 , 110 , 70 , 25 );
		
		JLabel labelAltura =  new  JLabel ();
		labelAltura . setText ( " Altura: " );
		labelAltura . setBounds ( 10 , 140 , 60 , 20 );
		JTextField textAltura =  new  JTextField ();
		textAltura . setBounds ( 70 , 140 , 70 , 25 );
		
		JLabel labelAtividade =  new  JLabel ();
		labelAtividade . setText ( " Atividade F�sica: " );
		labelAtividade . setBounds ( 10 , 170 , 100 , 20 );
		
		JLabel labelIMC =  new  JLabel ();
		labelIMC . setText ( " Seu IMC �: " );
		labelIMC . setBounds ( 10 , 210 , 90 , 20 );
		JTextField textIMC =  new  JTextField ();
		textIMC . setBounds ( 100 , 210 , 50 , 25 );
		
		JLabel labelNCD =  new  JLabel ();
		labelNCD . setText ( " Seu NCD �: " );
		labelNCD . setBounds ( 10 , 240 , 90 , 20 );
		JTextField textncd =  new  JTextField ();
		textncd . setBounds ( 100 , 240 , 50 , 25 );
		
		JButton Limpar = new JButton ("Limpar");
		Limpar.setLayout(null);
		Limpar.setBounds(20, 290, 90, 30);
		Limpar.addActionListener(this);
		
		
		JButton Calcular = new JButton ("Calcular");
		Calcular.setLayout(null);
		Calcular.setBounds(120, 290, 90, 30);
		
		
		
		tela . getContentPane () . add (labelSexo);
		tela . getContentPane () . add (labelData);
		tela . getContentPane () . add (labelPeso);
		tela . getContentPane () . add (labelAltura);
		tela . getContentPane () . add (labelNome);
		tela . getContentPane () . add (labelAtividade);
		tela . getContentPane () . add (labelIMC);
		tela . getContentPane () . add (labelNCD);
		tela . getContentPane () . add (textNome);
		tela . getContentPane () . add (textData);
		tela . getContentPane () . add (textSexo);
		tela . getContentPane () . add (textPeso);
		tela . getContentPane () . add (textAltura);
		tela . getContentPane () . add (textIMC);
		tela . getContentPane () . add (textncd);
		tela . getContentPane () . add (Limpar);
		tela . getContentPane () . add (Calcular);
		
		tela . setVisible ( true );
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
