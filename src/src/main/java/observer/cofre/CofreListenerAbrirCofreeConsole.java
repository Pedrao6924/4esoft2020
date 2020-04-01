//
package src.main.java.observer.cofre;

public class CofreListenerAbrirCofreeConsole implements CofreListenerAbrirCofre{
	

	public void cofreFoiAberto() {
		
		System.out.println("Cofre foi aberto!!!");
	}
	

	public void cofreFoiFechado() {
		
		System.out.println("Cofre foi fechado!!!");
	}
}
