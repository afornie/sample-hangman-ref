package reloj;

import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dramiro
 */
public class Reloj {
  
  public int hora = 0;
  public int minutos = 0;
  public int segundos = 0;
  public String separador = ":";
  private static int numObjetos = 0;
  
  public Reloj(int hora, int minutos, int segundos){
    this.hora = hora;
    this.minutos = minutos;
    this.segundos = segundos;
	this.init();
  }
  
  public Reloj(){
	this.init();
  }

  protected void init() {
    numObjetos++;
    // blah
    // blah 2
  }

 public String convierteA2Cifras(int num) {
	final String res;
	if(num < 10){
		res = "0" + hora;
	} else {
		res = String.valueOf(num);
	}
	return res;
 }

 public void devuelveHora(){
    String stHora ="";
    String stMinutos="";
    String stSegundos="";
    stHora = convierteA2Cifras(hora);
    stMinutos = convierteA2Cifras(minutos);
    stSegundos = convierteA2Cifras(segundos);
    
    System.out.println(stHora + " " + separador  + " " +
    		stMinutos + " " + separador + " " + stSegundos);
  }
  
  public void ponHora(int hora, int minutos){
    this.hora = hora;
    this.minutos = minutos;
    segundos = 0;
  }

  protected int promptNumber(final String propmtMsg) {
    System.out.print(propmtMsg);
    return new Scanner(System.in).nextInt();
  }

  public void leeHora(){
    hora = promptNumber("Introduce Hora: ");
    minutos = promptNumber("Introduce Minutos: ");
    segundos = promptNumber("Introduce Segundos: ");
  }
  
  public void sumaTiempo(int h, int m, int s){
  
    hora +=h;
    minutos +=m;
    segundos +=s;
    
    if(segundos >= 60){
      segundos = segundos % 60;
      minutos ++;
    }
    if (minutos >= 60){
      minutos = minutos % 60;
      hora ++;
    }
    if (hora > 23) {
      hora = 0;
    }
  }
  public void esValida(){
    boolean horaValida = false;
    if (hora < 24) {
      horaValida = true;
        if (minutos < 60) {
          horaValida = true;
            if (segundos < 60) {
            horaValida =true;
          }
        }
    }
    if(horaValida == true){
      System.out.println("La hora es VALIDA");
    } else{
      System.out.println("La hora es erronea");
    }
  }
  
  public String cambiaSeparador(String nuevoSeparador){
    separador = nuevoSeparador;
    return separador;
  }
  
  public static int numRelojes(){
    return numObjetos;
  }

  public static void main(String args[]) {
	  Reloj r1 = new Reloj(1, 2, 3);
	  Reloj r2 = new Reloj(10, 11, 12);

	  r1 = r2;
	  r1.hora = 20;
	  System.out.println("Hora r1 " + r1.hora);
	  System.out.println("Hora r2 " + r2.hora);
	  Reloj r3 = r1;

	  int a = 8;
	  int b = 9;
	  a = b;
	  a++;

	  System.out.println("a es " + a + " y hora es " + r1.hora);
	  modifica(a, r1);
	  System.out.println("a es " + a + " y hora es " + r1.hora);
  }

  public static void modifica(int n, Reloj r) {
	  n = n * 2;
	  r.hora *= 2;
	  System.out.println("DENTRO n es " + n + " y hora es " + r.hora);
  }
}
