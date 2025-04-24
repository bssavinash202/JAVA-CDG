package wrapper;

public class GenericPrinter <T> {

	T i;
	GenericPrinter(T i){
		this.i=i;
	}
	public T displayValue() {
		return i;
	}
}
