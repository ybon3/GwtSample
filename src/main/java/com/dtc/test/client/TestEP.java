package com.dtc.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.container.Viewport;

public class TestEP implements EntryPoint {
	@Override
	public void onModuleLoad() {
		Viewport vp = new Viewport();
		vp.add(new GytMain());
		RootPanel.get().add(vp);
	}
}
