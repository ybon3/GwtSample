package com.dtc.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.TextField;

public class TestEP implements EntryPoint {
	private TextButton button = new TextButton("送出");
	private TextField tf1 = new TextField();
	private VerticalLayoutData btnVld = new VerticalLayoutData(75, -1, new Margins(10));
	private VerticalLayoutData vld = new VerticalLayoutData(200, -1, new Margins(10));

	@Override
	public void onModuleLoad() {
		button.addSelectHandler(new SelectHandler() {
			@Override
			public void onSelect(SelectEvent event) {
				start();
			}
		});

		SimpleGrid sg = new SimpleGrid();
		sg.getStore().addAll(Generator.DATA);

		VerticalLayoutContainer vc = new VerticalLayoutContainer();
		vc.add(button, btnVld);
		vc.add(tf1, vld);
		vc.add(sg, new VerticalLayoutData(500, 500));
		RootPanel.get().add(vc);
	}

	private void start() {
	}
}
