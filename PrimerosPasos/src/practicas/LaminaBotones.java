/**
 * 
 */
package practicas;

import javax.swing.*;

/**
 * @author Juan Raúl Crespo Ruiz
 *
 */
public class LaminaBotones extends JPanel {

	private static final long serialVersionUID = 1L;
	private ButtonGroup grupo;

	public LaminaBotones(String titulo, String[] opciones) {
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		grupo = new ButtonGroup();

		for (int i = 0; i < opciones.length; i++) {
			JRadioButton bot = new JRadioButton(opciones[i]);
			bot.setActionCommand(opciones[i]);

			add(bot);
			grupo.add(bot);
			bot.setSelected(i == 0);
		}
	}

	public String dameSeleccion() {
		/*
		 * ButtonModel miboton = grupo.getSelection(); String s =
		 * miboton.getActionCommand(); return s;
		 */

		return grupo.getSelection().getActionCommand();
	}
}
