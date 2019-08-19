package com.seenu;

import java.beans.ConstructorProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class bank {
	public bank() {
      System.out.println("BANK OBJECT CREATE SUCCESSFULLY........");
	}

}
