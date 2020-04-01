package src.main.java.observer.cofre;

public class AppCofre {

		public static void main(String[] args) {
			
			Cofre daSala = new Cofre(123456);
			
			
			daSala.addListener(new CofreListenerConsole());
			
			daSala.fechar();
			daSala.abrir(111);
			
			daSala.abrir(123456);
			
			System.out.println("Fim...");
			
		}
}
