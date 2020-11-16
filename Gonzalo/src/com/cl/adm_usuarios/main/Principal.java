package com.cl.adm_usuarios.main;

import com.cl.adm_usuarios.implement.Contenedor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Contenedor contenedor = new Contenedor();
		boolean exit = false;
		Scanner input = new Scanner(System.in);
		int opcion = 0;
		
		while(!exit) {
			try {
				System.out.println("##########################");
				System.out.println("####ADMINISTRCION RRHH####");
				System.out.println("##########################");
				System.out.println("\n");
				System.out.println("Ingrese una opcion");
				System.out.println("1: Almacenar Cliente");
				System.out.println("2: Almacenar Profesional");
				System.out.println("3: Almacenar Administrativo");
				System.out.println("4: Almacenar Capacitacion");
				System.out.println("5: Eliminar Ususario");
				System.out.println("6: Lista Usuario");
				System.out.println("6: Lista Usuario");
				System.out.println("7: Lista Usuario segun tipo de perfil");
				System.out.println("8: Lista Capacitaciones");
				System.out.println("9: Salir");
				
				switch (opcion) {
					case 1: {
						
						int	rut;
						String nombres;
						String apellidos;
						int telefono;
						String afp;
						String direccion;
						String comuna;
						int edad;
						int isapre;
						
						System.out.println("#### Registro de Clientes ####");
						System.out.println("\n");
						
						System.out.println("Ingrese rut: ");
						rut = input.nextInt();
						while(rut > 99999999) {
							System.out.println("Rut fuera de rango, favor ingresar rut nuevamente");
							rut = input.nextInt();
						}
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese sus nombres: ");
						nombres = input.nextLine();
						
						while (nombres == null) {
							System.out.println("Sus nombres no pueden ir en blanco, favor ingresar nuevamente!");
							nombres = input.nextLine();
							
							if (nombres!=null) {
								while (nombres.length() < 5) {
									System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
									nombres = input.nextLine();
									while (nombres.length() > 30) {
										System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
										nombres = input.nextLine();
									}
								}
							}else {
								System.out.println("Sus nombres no pueden ir en blanco, favor ingresar nuevamente!");
								nombres = input.nextLine();
							}

						}
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese sus apellidos: ");
						apellidos = input.nextLine();
						
						while (apellidos == null) {
							System.out.println("Sus apellidos no pueden ir en blanco, favor ingresar nuevamente!");
							apellidos = input.nextLine();
							
							if (apellidos!=null) {
								while (apellidos.length() < 5) {
									System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio!");
									apellidos = input.nextLine();
									while (apellidos.length() > 30) {
										System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio!");
										apellidos = input.nextLine();
									}
								}
							}else {
								System.out.println("Sus apellidos no pueden ir en blanco, favor ingresar nuevamente!");
								apellidos = input.nextLine();
							}	
						}
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese su edad: ");
						edad = input.nextInt();
						
						while (edad > 150) {
							System.out.println("Su edad no puede superar los 150 anhios");
							edad = input.nextInt();
						}
						
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese su telefono: ");
						telefono = input.nextInt();
						
						while (telefono < 1111111111 || telefono > 999999999) {
							System.out.println("Telefono invalido, favor ingresar nuevamente!");
							edad = input.nextInt();
						}
						
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese su AFP: ");
						afp = input.nextLine();
						
						while (afp == null) {
							System.out.println("Su afp no pueden ir en blanco, favor ingresar nuevamente!");
							afp = input.nextLine();
							
							if (afp!=null) {
								while (afp.length() < 4) {
									System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
									afp = input.nextLine();
									while (afp.length() > 30) {
										System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
										afp = input.nextLine();
									}
								}
							}else {
								System.out.println("Su afp no pueden ir en blanco, favor ingresar nuevamente!");
								afp = input.nextLine();
							}

						}
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese su ISAPRE, 1 (Fonasa) o 2 (Isapre): ");
						isapre = input.nextInt();
						
						while (isapre < 1 || isapre > 2) {
							System.out.println("Opcion de isapre invalida, favor ingresar nuevamente!");
							isapre = input.nextInt();
						}
						
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese su direccion: ");
						direccion = input.nextLine();
						
						while (direccion == null) {
							System.out.println("Su direccion no pueden ir en blanco, favor ingresar nuevamente!");
							direccion = input.nextLine();
							
							if (direccion!=null) {
								while (direccion.length() > 70) {
									System.out.println("Direccion no puede exceder los 70 caracteres, campo obligatorio*");
									direccion = input.nextLine();
								}
							}else {
								System.out.println("Su direccion no pueden ir en blanco, favor ingresar nuevamente!");
								direccion = input.nextLine();
							}

						}
						
						/***********************************************/
						System.out.println("\n");
						System.out.println("Ingrese su comuna: ");
						
						comuna = input.nextLine();
						
						while (comuna == null) {
							System.out.println("Su comuna no pueden ir en blanco, favor ingresar nuevamente!");
							comuna = input.nextLine();
							
							if (comuna!=null) {
								while (comuna.length() > 50) {
									System.out.println("Comuna no puede exceder los 50 caracteres, campo obligatorio*");
									comuna = input.nextLine();
								}
							}else {
								System.out.println("Su comuna no pueden ir en blanco, favor ingresar nuevamente!");
								comuna = input.nextLine();
							}

						}
						contenedor.addCliente(rut, nombres, apellidos, telefono, afp, direccion, comuna, edad,	isapre);
					}
					case 2: {
						
						yield type;
					}
					case 3: {
						
						yield type;
					}
					case 4: {
						
						yield type;
					}
					case 5: {
						
						yield type;
					}
					case 6: {
						
						yield type;
					}
					case 7: {
						
						yield type;
						
					}
					case 8: {
						
						yield type;
					}
					case 9: {
						System.out.println("Gracias por Visitarnos");
						exit = true;
						break;
					}
					default:
						throw new IllegalArgumentException("Por favor ingresa una opcion valida");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.exit(0);
		
	}
}
