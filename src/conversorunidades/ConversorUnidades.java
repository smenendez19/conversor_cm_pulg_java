package conversorunidades;

import javax.swing.JOptionPane;

public class ConversorUnidades 
{

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Hola","Mensaje",1);
        VentanaConversor ventana;
        ventana = new VentanaConversor();
        ventana.setTitle("Conversor de Unidades");
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        
    }
}

// Version 0.2(Corregido el poner decimales y solo una coma)
//De Santiago Menendez