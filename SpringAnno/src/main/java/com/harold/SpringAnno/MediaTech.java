package com.harold.SpringAnno;

import org.springframework.stereotype.Component;

@Component

public class MediaTech implements MobileProccessor {

	public void process() {
		System.out.println("MediaTech processor!");
	}

}
