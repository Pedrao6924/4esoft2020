//
package src.main.java.observer.cofre;

public class CofreListenerConsole implements CofreListener {
	
	
	@Override
	public void senhaIncorreta() {
		
		System.out.println("Senha incorreta inserida!!!");
	}
	
	@Override
	public void senhaCorreta() {
		
		System.out.println("Senha correta inserida!!!");
	}
	

}
