package MODELO;

import java.util.Arrays;

public class Matriz {
	//ATRIBUTOS
	private int[][] datos;
	
	//CONSTRUCTOR
	public Matriz(int filas, int columnas) {
		datos= new int[filas][columnas];
	}
	
	//METODOS

	public int[][] getDatos2178 () {
		return datos;
	}

	public void setDatos2178 (int fila,int columna,int dato) {
		this.datos[fila][columna] = dato;
	}

	@Override
	public String toString() {
		return "Matriz [datos=" + Arrays.deepToString(datos) + "]";
	}
	
	//MOSTRAR MATRIZ MAS CHIDO
	public String imprimirMatriz2178 () {
		String cadena = "";
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				cadena += datos[i][j] + "\t"; 
			}
			cadena = cadena + "\n";
		}
		return cadena;
	}
	//INGRESAR DATOS A LA MATRIZ
	public void ingresarDatosMatriz2178 () {
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				datos[i][j] = (int)(Math.random()*100+1);
			}
		}
	}
	
	//SI UN NUMERO ES PRIMO 
	public boolean isPrimo2178 (int numero) {
		int contar = 0;
		boolean primo;
		for (int contador = 1; contador <= numero; contador++) {
			if(numero%contador==0) {
				contar++;
				
			}
		}
		if(contar==2) {
			primo = true;
		}else {
			primo = false;
		}
		return primo;
	}
	
	public int contarPrimos2178 () {
		int contar = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				if(isPrimo2178 (datos[i][j])) {
					contar++;
					
				}
			}
			
		}
		return contar;
	}
	public int[] mostrarPrimos2178 () {
		int primo[]= new int[contarPrimos2178 ()];
		int k=0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				if(isPrimo2178 (datos[i][j])) {
					primo[k] = datos[i][j];
					k++;
				}
			}
		}
		return primo;
	}
	public String mostrarArreglo2178 (){
		int[]aux = mostrarPrimos2178 ();
		String mostrar=" [ ";
		for (int i = 0; i < aux.length; i++) {
			mostrar += aux[i] + " , \t";
		}
		mostrar+=" ] ";
		return mostrar;
	}	//calcular transpuesta
	public int MatrizTranspuesta2178 (){
		int aux = 0;
		
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length; j++) {
				aux = datos[i][j];
				datos[i][j]= datos[j][i];
				datos[j][i]= aux;
				aux++;
		
			}
		}
		return aux;
	}
	public String ImprimirTranspuesta2178() {
		String cadena="";
		
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length; j++) {
				cadena += "[" + datos[j][i] + "]" + "\t";
			}
			cadena = cadena + "\n";
		}
		return cadena;
	}
	//multiplo
	public String calcularMultiplosDos2178() {
		int dos = 2;
		int multiplos = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length; j++) {
				if (datos[i][j]%dos==0) {
					multiplos++; 
				}
			//int multiplos2=multiplos;
				//cadena= "los multiplos de dos son: " + multiplos;
			}
			
			
		}
		return "la cantidad de multiplos de 2 es: " + multiplos;
	}
	public String calcularMultiplosTres2178() {
		int tres = 3;
		int multiplos = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length; j++) {
				if (datos[i][j]%tres==0) {
					multiplos++; 
				}
			
			}
			
			
		}
		return "la cantidad de multiplos de 3 es: " + multiplos;
	}
	public String calcularMultiplosDosPosicion2178() {
		int dos = 2;
		int multiplos = 0;
		String posicion = "";
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length; j++) {
				if (datos[i][j]%dos==0) {
					multiplos++; 
					posicion=posicion+"Dato No. " +(i+1)+ "," +(j+1) + " ["+datos[i][j]+"] \n";
				}
			
			}
			
			
		}
		return "la cantidad de multiplos de 2 es: " + multiplos + "\t\n" + posicion;
	}
	public String calcularMultiplosTresPosicion2178() {
		int tres = 3;
		int multiplos = 0;
		String posicion = "";
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length; j++) {
				if (datos[i][j]%tres==0) {
					multiplos++; 
					posicion=posicion+"Dato No. " +(i+1)+","+(j+1) + " ["+datos[i][j]+"] \n";
				}
			
			}
			
			
		}
		return "la cantidad de multiplos de 3 es: " + multiplos + "\t\n" + posicion;
	}
	//calcular suma de los datos de la matriz 
	public double sumarDatos2178() {
		double suma=0;
		for( int i = 0; i <datos.length; i ++ ) {
			for (int j = 0; j < datos[i].length; j++) {
			suma =suma+ datos[i][j];
		}
		}
		return suma;
	}
	

}




//proyecto

//menu y cada numero tiene que ejecutar un programa 
//funciones trignometricas
//cuenta bancaria
//array aleatorio metodo de ordenamiento 
//alumno notas
//matriz aleatorio
//matriz realizar las operaciones basicas de dos matrices en plataforma 
//salir

//entregar 

//codigo
//pruebas unitariass(datos)
//java doc
//diagrama de clases 

//para el 11 

//nota regla de los 4 digitos 