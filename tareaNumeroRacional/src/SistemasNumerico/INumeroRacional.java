package SistemasNumerico;

public interface INumeroRacional<T> {
	
	public void sumarRacional(T racionalASumar);
	public void restarRacional(T racionalARestar);
	public void multiplicarRacional(T racionalAMultiplicar);
	public void dividirRacional(T racionalADividir);
	public void simplificarRacional();
	public void inversoRacional();
	public void elevarRacionalAlCuadrado();
}
