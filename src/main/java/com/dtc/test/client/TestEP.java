package com.dtc.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class TestEP implements EntryPoint {
	// 用來表現一般情況的
	public static String getValueNormal(FooBar object) {
		if(object.getFoo() == null) return "";
		if(object.getFoo().getBar() == null) return "boom!!";
		return object.getFoo().getBar().getValue();
	}

	// 用來測試 try-catch style
	public static String getValueTryCatch(FooBar object) {
		try {return object.getFoo().getBar().getValue();}
		catch (Exception e) {return "boom!";}
	}

	private static TextButton btnNormal = new TextButton("Normal");
	private static TextButton btnTryCat = new TextButton("TryCatch");

	static {
		btnNormal.addSelectHandler(new SelectHandler(){
			@Override
			public void onSelect(SelectEvent event) {
				long cnt = System.currentTimeMillis();
				for (int i = 0; i < 50; i++) {
					for (FooBar data : TestData.DATA) {
						getValueNormal(data);
						getValueNormal(data);
						getValueNormal(data);
						getValueNormal(data);
						getValueNormal(data);
					}
				}
				GWT.log("[NORMAL] used time millis: " + (System.currentTimeMillis() - cnt));
			}
		});

		btnTryCat.addSelectHandler(new SelectHandler(){
			@Override
			public void onSelect(SelectEvent event) {
				long cnt = System.currentTimeMillis();
				for (int i = 0; i < 50; i++) {
					for (FooBar data : TestData.DATA) {
						getValueTryCatch(data);
						getValueTryCatch(data);
						getValueTryCatch(data);
						getValueTryCatch(data);
						getValueTryCatch(data);
					}
				}
				GWT.log("[TRY CATCH] used time millis: " + (System.currentTimeMillis() - cnt));
			}
		});
	}

	@Override
	public void onModuleLoad() {
		Viewport vp = new Viewport();
		HorizontalLayoutContainer hlc = new HorizontalLayoutContainer();
		HorizontalLayoutData hld = new HorizontalLayoutData(0.5, 1);
		hlc.add(btnNormal, hld);
		hlc.add(btnTryCat, hld);
		vp.add(hlc);
		RootPanel.get().add(vp);
	}
}

class FooBar {
	private String id;
	private Foo foo;
	public FooBar(String id, String value) {
		this.id = id;
		this.foo = new Foo(value);
	}
	public Foo getFoo() { return null; } //foo; }
	public String getId() { return id; }

	class Foo {
		private Bar bar;
		public Foo(String value) { this.bar = new Bar(value); }
		public Bar getBar() { return null; }// bar; }

		class Bar {
			private String value;
			public Bar(String value) { this.value = value; }
			public String getValue() { return value; }
		}
	}
}