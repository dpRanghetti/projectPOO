package pooProjectSolid_S;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraDeSalario calc = new CalculadoraDeSalario();
		Funcionario func = new Funcionario("Abgobaldo",Cargo.DESENVOLVEDOR,5000.00);
		System.out.println(calc.calcular(func));
	}

}
