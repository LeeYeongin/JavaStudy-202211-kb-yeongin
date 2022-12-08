package No2_2;

import lombok.Getter;

public class FactorySingleton {
	private static FactorySingleton instance = null;
	
	@Getter
	private Factory factory;
	
	private FactorySingleton(){
		factory = new Factory();
	}
	
	public static FactorySingleton getInstance() {
		if(instance == null) {
			instance = new FactorySingleton();
		}
		return instance;
	}
}
