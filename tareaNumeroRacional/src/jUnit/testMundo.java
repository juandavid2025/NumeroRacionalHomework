package jUnit;

import java.util.ArrayList;

// Junit Tad Numero racional Camilo Barrios

import SistemasNumerico.*;
import junit.framework.TestCase;

public class testMundo extends TestCase {
	NumeroRacional<Number> a;
	NumeroRacional<Number> b;
	NumeroRacional<Number> c;
	NumeroRacional<Number> d;
	NumeroRacional<Number> e;
	ArrayList<Integer> arra = new ArrayList<>();
	String cc;

	public void setUpEscenario1() {
		a = new NumeroRacional<Number>(1, 2);
		b = new NumeroRacional<Number>(6, 4);
		c = new NumeroRacional<Number>(-13, 23);
		d = new NumeroRacional<Number>(-100, 28);
		e = new NumeroRacional<Number>(0, 1);
	}

	public void testDividirRacional() {
		setUpEscenario1();
		a.dividirRacional(b);
		b.dividirRacional(new NumeroRacional<Number>(0, 1));
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == 1 && a.getDenominador().intValue() == 3);
		prueba = prueba && (c.getNumerador().intValue() == -13 && c.getDenominador().intValue() == 23);
		assertTrue(prueba);
	}

	public void testElevarNumeroAlCuadrado() {
		setUpEscenario1();
		a.elevarRacionalAlCuadrado();
		b.elevarRacionalAlCuadrado();
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == 1 && a.getDenominador().intValue() == 4);
		prueba = prueba && (b.getNumerador().intValue() == 9 && b.getDenominador().intValue() == 4);
		assertTrue(prueba);
	}

	public void testInversoRacional(){
		setUpEscenario1();
		a.inversoRacional();
		b.inversoRacional();
		c.inversoRacional();
		d.inversoRacional();
		e.inversoRacional();
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == 2 && a.getDenominador().intValue() == 1);
		prueba = prueba && (b.getNumerador().intValue() == 2 && b.getDenominador().intValue() == 3);
		prueba = prueba && (c.getNumerador().intValue() == 23 && c.getDenominador().intValue() == -13);
		prueba = prueba && (d.getNumerador().intValue() == 7 && d.getDenominador().intValue() == -25);
		prueba = prueba && (e.getNumerador().intValue() == 0 && e.getDenominador().intValue() == 1);
		assertTrue(prueba);
	}
	
	public void testMultiplicarRacional() {
		setUpEscenario1();
		a.multiplicarRacional(b);
		b.multiplicarRacional(new NumeroRacional<Number>(0, 1));
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == 3 && a.getDenominador().intValue() == 4);
		prueba = prueba && (b.getNumerador().intValue() == 0);
		assertTrue(prueba);
	}

	public void testSimplificar() {
		setUpEscenario1();
		a.simplificarRacional();
		b.simplificarRacional();
		c.simplificarRacional();
		d.simplificarRacional();
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == 1 && a.getDenominador().intValue() == 2);
		prueba = prueba && (b.getNumerador().intValue() == 3 && b.getDenominador().intValue() == 2);
		prueba = prueba && (c.getNumerador().intValue() == -13 && c.getDenominador().intValue() == 23);
		prueba = prueba && (d.getNumerador().intValue() == -25 && d.getDenominador().intValue() == 7);
		assertTrue(prueba);
	}

	public void testSumar() {
		setUpEscenario1();
		a.sumarRacional(b);
		b.sumarRacional(c);
		c.sumarRacional(new NumeroRacional<Number>(10, 23));
		d.sumarRacional(new NumeroRacional<Number>(-40, 28));
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == 2 && a.getDenominador().intValue() == 1);
		prueba = prueba && (b.getNumerador().intValue() == 43 && b.getDenominador().intValue() == 46);
		prueba = prueba && (c.getNumerador().intValue() == -3 && c.getDenominador().intValue() == 23);
		prueba = prueba && (d.getNumerador().intValue() == -5 && d.getDenominador().intValue() == 1);
		assertTrue(prueba);
	}
	
	public void testRestar(){
		setUpEscenario1();
		a.restarRacional(b);
		b.restarRacional(c);
		c.restarRacional(new NumeroRacional<Number>(10, 23));
		d.restarRacional(new NumeroRacional<Number>(-40, 28));
		boolean prueba = true;
		prueba = prueba && (a.getNumerador().intValue() == -1 && a.getDenominador().intValue() == 1);
		prueba = prueba && (b.getNumerador().intValue() == 95 && b.getDenominador().intValue() == 46);
		prueba = prueba && (c.getNumerador().intValue() == -1 && c.getDenominador().intValue() == 1);
		prueba = prueba && (d.getNumerador().intValue() == -15 && d.getDenominador().intValue() == 7);
		assertTrue(prueba);
	}
}
