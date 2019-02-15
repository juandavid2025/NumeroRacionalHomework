package SistemasNumerico;

public class NumeroRacional<E extends Number> implements INumeroRacional<NumeroRacional<Number>>{

	private E numerador;
	private E denominador;
	
	public NumeroRacional(E numerador,E denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	//implementar-----------------------------------------------------
	
	public void verificarInvariantes() {
		
		
		
	}
	
	@Override
	public void simplificarRacional() {
		
		Integer divisor= (Integer) GCD(this.numerador,this.denominador);
		
		Integer valorNumerador=(Integer)numerador;
		valorNumerador/=divisor;
		numerador=(E)valorNumerador;
		
	}

	@Override
	public void sumarRacional(NumeroRacional<Number> racionalASumar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restarRacional(NumeroRacional<Number> racionalARestar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicarRacional(NumeroRacional<Number> racionalAMultiplicar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividirRacional(NumeroRacional<Number> racionalADividir) {
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
		Integer GCD = null;
		
		GCD= (Integer) maximoComunDivisor((int)numerador,(int)denominador);
		
		return (E) GCD;
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

	public Number getNumerador() {
		return numerador;
	}
	
	public Number getDenominador() {
		return denominador;
	}
	
	public void setNumerador(E numerador) {
		this.numerador=numerador;
	}
	
	public void setDenominador(E denominador) {
		this.denominador=denominador;
	
  }
	
	public int maximoComunDivisor(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return maximoComunDivisor(b,a%b);
		}
	}

	
}
