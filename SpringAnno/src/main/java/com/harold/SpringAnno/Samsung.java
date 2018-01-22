package com.harold.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTech")
	MobileProccessor cpu; 
	
	public MobileProccessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProccessor cpu) {
		this.cpu = cpu;
	}

	public void config(){
		System.out.println("Octa Core, 4gb Ram, 12 MP camera");
		cpu.process();
	}

}
