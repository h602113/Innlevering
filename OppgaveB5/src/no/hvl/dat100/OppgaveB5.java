package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;

public class OppgaveB5 {

	public static void main(String[] args) {
				
				double karakter = Double.parseDouble(showInputDialog ("Skriv inn poeng"));
				
				if (karakter <= -1)
					showMessageDialog(null, "Ugyldig karakter");
				else if (karakter <=39)
					showMessageDialog(null, "F - Ikke bestått");
				else if (karakter <= 49)
					showMessageDialog(null, "E - Tilstrekkelig");
				else if (karakter <= 59)
					showMessageDialog(null, "D - Nokså god");
				else if (karakter <= 79)
					showMessageDialog(null, "C - God");
				else if (karakter <= 89)
					showMessageDialog(null, "B - Meget god");
				else if (karakter <= 100)
					showMessageDialog(null, "A - Fremragende");
				else if (karakter >= 101)
					showMessageDialog(null, "Ugyldig karakter");
					
				
				}
				

			}
