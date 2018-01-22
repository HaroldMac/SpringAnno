package com.harold.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProccessor{

	public void process() {
		System.out.println("Snap Dragon processor!");
	}

}
