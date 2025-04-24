package wrapper;

public class GenericPrinterDemo {
	public static void main(String[] args) {
		GenericPrinter<String> sPrinter = new GenericPrinter<String>("Avinash");
		System.out.println(sPrinter.displayValue());
		
		GenericPrinter<Integer> iPrinter = new GenericPrinter<Integer>(25);
		System.out.println(iPrinter.displayValue());
		
		GenericPrinter<Double> dPrinter = new GenericPrinter<Double>(9.76);
		System.out.println(dPrinter.displayValue());
	}
}
