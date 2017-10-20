package com.repdep.representados.administracion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.repdep.representados.controladores.ControladorBasketbolista;
import com.repdep.representados.controladores.ControladorFutbolistas;
import com.repdep.representados.entidades.Basketbolista;
import com.repdep.representados.entidades.Futbolista;

public class AdministradorRepresentados {

	private static final int OPCION_SALIDA = 4;
	private static ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();
	private static ArrayList<Basketbolista> basketbolistas = new ArrayList<Basketbolista>();
	
	public static void main(String[] args) throws Exception {
		int opcion =0;
		do {
			mostrarMenu();
			opcion = leerOpcion();
			ejecutarAccion(opcion);
		} while (opcion != OPCION_SALIDA);

	}

	private static void ejecutarAccion(int opcion) {
		if (opcion == 1){
			futbolistas.add(ControladorFutbolistas.Crear());
		}
		if (opcion == 2) {
			basketbolistas.add(ControladorBasketbolista.Crear());
		} 
		if (opcion == 3){
			imprimirRepresentados();
		}
		else {
			System.out.println("Opcion desconocida");
		}
		
	}

	private static void imprimirRepresentados() {
		for (Futbolista unFutbolista: futbolistas){
			System.out.println(unFutbolista);
		}
		for (Basketbolista unBasketbolista: basketbolistas){
			System.out.println(unBasketbolista);
		}
	}

	private static int leerOpcion() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());
	}

	private static void mostrarMenu() {
		System.out.println("Sistema de Administracion de Representados");
		System.out.println("1. Agregar futbolista");
		System.out.println("2. Agregar Basketbolista");
		System.out.println("3. Listar Representados");
		System.out.println("4. Salir");
	}

}
