package wrapper;

public class PrinterDemo {
	public static void main(String[] args) {
		Printer sPrinter = new Printer("Avinash");//upcast
		String s = (String)sPrinter.displayValue();//downcast
		System.out.println(s);
		
		Printer iPrinter = new Printer(23);
		Integer i = (Integer)iPrinter.displayValue();
		System.out.println(i);
		
		Printer dPrinter = new Printer(9.76);
		Double d = (Double)dPrinter.displayValue();
		System.out.println(d);
	}
}
