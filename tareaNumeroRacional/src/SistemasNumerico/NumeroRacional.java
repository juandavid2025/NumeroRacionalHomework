package SistemasNumerico;

public class NumeroRacional<E extends Number> implements INumeroRacional{

	private E numerador;
	private E denominador;
	
	public NumeroRacional(E numerador,E denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	//implementar-----------------------------------------------------
	public void verificarInvariantes(E numerador,E denominador) {
		//???
	}
	
	@Override
	public void sumarRacional(Object racionalASumar) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void restarRacional(Object racionalARestar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicarRacional(Object racionalAMultiplicar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividirRacional(Object racionalADividir) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simplificarRacional() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inversoRacional() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elevarRacionalAlCuadrado() {
		// TODO Auto-generated method stub
		
	}

	public E GCD(E numerador,E denominador) {
		E GCD = null;
		
		
		
		return GCD;
	}
	
	public E sumar(E primerNumero, E segundoNumero) {
		E suma =null;
		
		
		
		return suma;
	}
	
	public E restar(E primerNumero, E segundoNumero) {
		E resta=null;
		
		
		
		return resta;
	}
	
	public E multiplicar(E primerNumero, E segundoNumero) {
		E resultado =null;
		
		
		
		return resultado;
	}
	
	public E dividir(E primerNumero, E segundoNumero) {
		E resultado=null;
		
		
		
		return resultado;
	}
}
