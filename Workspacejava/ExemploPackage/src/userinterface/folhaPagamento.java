package userinterface;

import core.funcionario;

public class folhaPagamento {
	public static void main (String arg[]) {
		
		funcionario F1,F2;
		
		F1 = new funcionario(987287582, "maria", "analista junior", 30.0, 120);
		F2 = new funcionario(987287357, "jose","analista senior", 45.0 , 120);
		
		System.out.println(F1.getNumFuncional()+"/"+F1.getNome()+"/"+F1.getCargo()+"/"+F1.getValorHora()+"/"+F1.getNumHoras());
		System.out.println(F2.getNumFuncional()+"/"+F2.getNome()+"/"+F2.getCargo()+"/"+F2.getValorHora()+"/"+F2.getNumHoras());
		
		
	}
	
}
