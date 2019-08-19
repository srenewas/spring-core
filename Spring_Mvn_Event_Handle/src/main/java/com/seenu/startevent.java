package com.seenu;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class startevent implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("EVENT STARTED.................");		
	}

}
