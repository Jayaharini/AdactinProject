package com.Adactin.singleton;

import com.Adactin.modules.LoginModule;
import com.Adactin.modules.SearchHotelModule;
import com.Adactin.modules.SelectHotelModule;

public class AdactinPOM {

	private LoginModule lm;
	private SearchHotelModule sm;
	private SelectHotelModule sh;
	
	public LoginModule getLm() {
		if(lm==null) {
			lm=new LoginModule();
		}
		return lm;
	}

	public SearchHotelModule getSm() {
		if(sm==null) {
			sm=new SearchHotelModule();
		}
		return sm;
	}
	
	public SelectHotelModule getSh() {
		if(sh==null) {
			sh=new SelectHotelModule();
		}
		return sh;
	}

}
