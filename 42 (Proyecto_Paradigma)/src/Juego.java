
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class Juego extends JFrame {

	private JLabel label;
	JFrame frame = this;
	private JToggleButton Buton1;
	private JToggleButton Buton2;
	private JToggleButton Buton4;
	private JToggleButton Buton8;
	private JToggleButton Buton16;
	//private JToggleButton Buton32;

	JButton ButonSalir;
	
	private ImageIcon b1;
	private ImageIcon b2;
	private ImageIcon b4;
	private ImageIcon b8;
	private ImageIcon b16;
	//private ImageIcon b32;
	private ImageIcon cara;
	int i =0;
	
	
	

	public Juego(){
		//panel = new JPanel();
		label = new JLabel(""+i);
		label.setFont(new Font("Verdana",0,100));
		super.setSize(680, 680);
		setBackground(Color.white);
		
		super.setLayout(null);
		b1= new ImageIcon("src/juegoimagenes/carta1.png");
		b2 = new ImageIcon("src/juegoimagenes/carta2.png");
		b4 = new ImageIcon("src/juegoimagenes/carta4.png");
		b8 = new ImageIcon("src/juegoimagenes/carta8.png");
		b16 = new ImageIcon("src/juegoimagenes/carta16.png");
		//b32 = new ImageIcon ("src/juego/imagenes/carta32.jpg");
		cara = new ImageIcon("src/juegoimagenes/cartaCara.png");
		
		 Buton1= new JToggleButton(b1);
		 Buton1.setBorderPainted(false);
		 Buton1.addActionListener(listener);// se agrega el escucha a este boton
		 
		 
		 Buton2 = new JToggleButton(b2);
		 Buton2.setBorderPainted(false);
		 Buton2.addActionListener(listener2);// se agrega el escucha a este boton
		 
		 Buton4 = new JToggleButton(b4);
		 Buton4.setBorderPainted(false);
		 Buton4.addActionListener(listener4);// se agrega el escucha a este boton
		 
		 Buton8 = new JToggleButton(b8);
		 Buton8.setBorderPainted(false);
		 Buton8.addActionListener(listener8);// se agrega el escucha a este boton
		 
		 Buton16 = new JToggleButton(b16);
		 Buton16.setBorderPainted(false);
		 Buton16.addActionListener(listener16);// se agrega el escucha a este boton
		 /*
		 Buton32 = new JToggleButton(b32);
		 Buton32.setBorderPainted(false);
		 Buton32.addActionListener(listener32);
		 */
		 
		 ButonSalir = new JButton ("Volver");
		 ButonSalir.setBounds(500, 550, 160, 60);
		 ButonSalir.addActionListener(listenerBoton);
		
		
		super.add(Buton1);
		super.add(Buton2);
		super.add(Buton4);
		super.add(Buton8);
		super.add(Buton16);
		//super.add(Buton32);
		super.add(label);
		super.add(ButonSalir);

		label.setBounds(300, 250, 150, 100);
		Buton1.setBounds(50, 50, 100, 150);
		Buton2.setBounds(155, 50, 100, 150);
		Buton4.setBounds(260, 50, 100, 150);
		Buton8.setBounds(365, 50, 100, 150);
		Buton16.setBounds(470, 50, 100, 150);
		//Buton32.setBounds(575, 50, 100, 150);
		
		
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
		super.setResizable(false);	
		
		
	}
	
	//Escucha eventos para el boton1
    ActionListener listener = new ActionListener (){
    	@Override 
        public void actionPerformed(ActionEvent e) {
    		 // valor al que cada carta sumará
    		
    		//-----------------------Boton1
    		if(Buton1.isSelected())
    		{
    			
    			Buton1.setIcon(cara);
    			i=i+1;
    			label.setText(""+i);
    		}
    		else 
    			{
    			Buton1.setIcon(b1);
    			i=i-1;
    			label.setText(""+i);
    		}
    		
    	}
    };
    		
//-----------------------Boton2
//Escucha eventos para el boton2
 ActionListener listener2 = new ActionListener (){
@Override 
public void actionPerformed(ActionEvent e) {				
    		if(Buton2.isSelected())
    		{
    			//label.setText("Activado");
    			Buton2.setIcon(cara);
    			i=i+2;
    			label.setText(""+i);
    		}
    		else 
    		 {
    			Buton2.setIcon(b2);
    			i=i-2;
    			label.setText(""+i);
    		}
 }
 };
	//Escucha eventos para el boton4
 ActionListener listener4 = new ActionListener (){
 	@Override 
     public void actionPerformed(ActionEvent e) {
 		 // valor al que cada carta sumará
 		
 		//-----------------------Boton1
 		if(Buton4.isSelected())
 		{
 			
 			Buton4.setIcon(cara);
 			i=i+4;
 			label.setText(""+i);
 		}
 		else 
 			{
 			Buton4.setIcon(b4);
 			i=i-4;
 			label.setText(""+i);
 		}
 		
 	}
 };
 		
//-----------------------Boton8
//Escucha eventos para el boton8
ActionListener listener8 = new ActionListener (){
@Override 
public void actionPerformed(ActionEvent e) {				
 		if(Buton8.isSelected())
 		{
 			//label.setText("Activado");
 			Buton8.setIcon(cara);
 			i=i+8;
 			label.setText(""+i);
 		}
 		else 
 		 {
 			Buton8.setIcon(b8);
 			i=i-8;
 			label.setText(""+i);
 		}
}
};

//-----------------------Boton16
//Escucha eventos para el boton16
ActionListener listener16 = new ActionListener (){
@Override 
public void actionPerformed(ActionEvent e) {				
		if(Buton16.isSelected())
		{
			//label.setText("Activado");
			Buton16.setIcon(cara);
			i=i+16;
			label.setText(""+i);
		}
		else 
		 {
			Buton16.setIcon(b16);
			i=i-16;
			label.setText(""+i);
		}
}
};


//-----------------------ButonSALIR

ActionListener listenerBoton = new ActionListener (){
@Override 
public void actionPerformed(ActionEvent j) {				
		/*if(j.getSource().equals(ButonSalir)){
////////////////////////////// Ok!
                    frame.dispose();			
		}*/
		if(j.getSource()==ButonSalir){
			setVisible(false);
			new Menu().setVisible(true);
		}
}
};
/*
ActionListener listener32 = new ActionListener (){
@Override
public void actionPerformed(ActionEvent t){
	if(Buton32.isSelected()){
		//label.setText("Activado");
		Buton32.setIcon(cara);
		i=i+32;
		label.setText(""+i);
	}
	else 
	 {
		Buton32.setIcon(b32);
		i=i-32;
		label.setText(""+i);
	}
		
	
		
		
}
 
};*/

}

	

