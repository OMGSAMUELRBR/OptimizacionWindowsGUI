package OpcionesOptimizacion.General;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;
import javax.swing.*;

public class DesactivarEfectosVisuales {
	
	public static void DesactivarEfectosVisuales(JFrame frame) {
		JButton botonDesactivarEfectosVisuales = new JButton("Desactivar Efectos Visuales");
		botonDesactivarEfectosVisuales.setBounds(250, 160, 300, 30);
		frame.add(botonDesactivarEfectosVisuales);
		
		botonDesactivarEfectosVisuales.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

		        int valorActivado = 3; // Esta activado los efectos visuales
				int valorDesactivado = 2; // Estan desactivado los efectos visuales

			}
		});
	}
}