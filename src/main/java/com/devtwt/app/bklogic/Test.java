package com.devtwt.app.bklogic;

import java.util.Properties;

import com.devtwt.app.util.PropLoader;
import com.devtwt.app.constants.ResourceNameConstants;

public class Test {
	
	public void testout() throws Exception {
		
		PropLoader pl = new PropLoader(ResourceNameConstants.TEST);
		Properties prop = pl.fileLoader();
		System.out.println(prop.get("itm1"));
		
	}
}
