package VISTA;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import MODELO.Matriz;

public class Runner {
	
	private JTextArea area;
	
	private JScrollPane scroll;
	
	private Matriz matriz;
	
	//CONSTRUCTOR PARA DEFINIR LOS OBJETOS

	public Runner() {
		this.area = new JTextArea(20,60);
		this.scroll = new JScrollPane(area);
		this.matriz = new Matriz(3,4);
	}
	
	public void mostrarMatriz() {
		area.append(" MATRIZ POR DEFECTO :  \n " + matriz.toString());
		area.append(" \n\n MATRIZ USUARIO :  \n " + matriz.imprimirMatriz2178 ());
		matriz.ingresarDatosMatriz2178 ();
		area.append(" \n\n MATRIZ USUARIO2 :  \n " + matriz.imprimirMatriz2178 ());
		area.append("\n cantidad de numeros primos en la matriz :"+ matriz.contarPrimos2178 ());
	    area.append("\n Numeros primos en la matriz : " + matriz.mostrarArreglo2178 () + "\t\n" );
	    area.append(matriz.calcularMultiplosDos2178()+"\n");
	    area.append(matriz.calcularMultiplosDosPosicion2178()+"\n");
	    area.append(matriz.calcularMultiplosTres2178()+"\n");
	    area.append(matriz.calcularMultiplosTresPosicion2178 ()+"\n");
	    matriz.MatrizTranspuesta2178();
	    area.append("la matriz transpuesta es: \n" + matriz.ImprimirTranspuesta2178()+"\n");
		JOptionPane.showMessageDialog(null, scroll);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Runner runner = new Runner();
	runner.mostrarMatriz();

	}

}



//colecciones Arraylist investigar 
