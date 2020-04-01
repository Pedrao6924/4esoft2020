//
package src.main.java.observer.cofre;

import java.util.List;

import javax.management.RuntimeErrorException;

public class Cofre {
	
	private int senha;
	private boolean aberto;
	private boolean cheio;
	private List<CofreListener> listeners = new arrayList<>();
	
	public Cofre(int senha) {
		
		this.senha = senha;
		this.aberto = true;
		this.cheio = false;
	}
	
	public boolean isCheio() {
		return this.cheio;
	}
	
	public void retirarDoCofre() {
		this.cheio = false;
	}
	
	public void depositarNoCofre() {
		this.cheio = true;
	}
	
	public boolean isAberto() {
	
		return this.aberto;
	}
	
	public void fechar() {
		
		this.aberto = false;
	}
	
	public void abrir(int senhaInformada) {
		
		if(senhaInformada == this.senha) {
			this.aberto = true;
			this.listener.forEach(l -> l.cofreFoiAberto)
		}else
		{
			throw new SenhaIncorretaException("Senha digitada esta incorreta!");
		}
	}
	
	public void addListener(CofreListenerConsole listener) {
		
		this.listeners.add(listener);
	}
	
	
	

}