package com.dtc.test.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;

import us.dontcareabout.gxt.client.model.GetValueProvider;

public class TestEP implements EntryPoint {
	// 用來表現一般情況的
	private static final ValueProvider<FooBar, String> normalVP = new GetValueProvider<FooBar, String>() {
		@Override
		public String getValue(FooBar object) {
			if(object.getFoo() == null) return "";
			if(object.getFoo().getBar() == null) return "";
			return object.getFoo().getBar().getValue();
		}
	};

	// 用來測試 try-catch style
	private static final ValueProvider<FooBar, String> trycatVP = new GetValueProvider<FooBar, String>() {
		@Override
		public String getValue(FooBar object) {
			try {return object.getFoo().getBar().getValue();}
			catch (Exception e) {return "";}
		}
	};

	private static MyGrid normalGrid = new MyGrid(genColumnModel(normalVP));
	private static MyGrid tryCatGrid = new MyGrid(genColumnModel(trycatVP));
	private static TextButton btnNormal = new TextButton("Normal");
	private static TextButton btnTryCat = new TextButton("TryCatch");

	static {
		btnNormal.addSelectHandler(new SelectHandler(){
			@Override
			public void onSelect(SelectEvent event) {
				long cnt = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					normalGrid.getStore().clear();
					normalGrid.getStore().addAll(TestData.DATA);
				}
				GWT.log("[NORMAL] used time millis: " + (System.currentTimeMillis() - cnt));
			}
		});

		btnTryCat.addSelectHandler(new SelectHandler(){
			@Override
			public void onSelect(SelectEvent event) {
				long cnt = System.currentTimeMillis();
				for (int i = 0; i < 500; i++) {
					tryCatGrid.getStore().clear();
					tryCatGrid.getStore().addAll(TestData.DATA);
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
		VerticalLayoutContainer leftVLC = new VerticalLayoutContainer();
		VerticalLayoutContainer rightVLC = new VerticalLayoutContainer();
		VerticalLayoutData buttonVLD = new VerticalLayoutData(1, 50, new Margins(10));
		VerticalLayoutData GridVLD = new VerticalLayoutData(1, 1, new Margins(10));
		leftVLC.add(btnNormal, buttonVLD);
		leftVLC.add(normalGrid, GridVLD);
		rightVLC.add(btnTryCat, buttonVLD);
		rightVLC.add(tryCatGrid, GridVLD);
		hlc.add(leftVLC, hld);
		hlc.add(rightVLC, hld);
		vp.add(hlc);
		RootPanel.get().add(vp);
	}

	private static ColumnModel<FooBar> genColumnModel(ValueProvider<FooBar, String> vp) {
		ArrayList<ColumnConfig<FooBar, ?>> list = new ArrayList<>();
		list.add(new ColumnConfig<FooBar, String>(vp, 20, "DATA LIST"));
		list.add(new ColumnConfig<FooBar, String>(vp, 20, "DATA LIST"));
		list.add(new ColumnConfig<FooBar, String>(vp, 20, "DATA LIST"));
		list.add(new ColumnConfig<FooBar, String>(vp, 20, "DATA LIST"));
		list.add(new ColumnConfig<FooBar, String>(vp, 20, "DATA LIST"));
		return new ColumnModel<>(list);
	}
}

class MyGrid extends Grid<FooBar> {
	public MyGrid(ColumnModel<FooBar> cm) {
		super(new ListStore<FooBar>(new ModelKeyProvider<FooBar>() {
			@Override
			public String getKey(FooBar item) {
				return item.getId();
			}
		}), cm);
		getView().setForceFit(true);
	}
}

class FooBar {
	private String id;
	private Foo foo;
	public FooBar(String id, String value) {
		this.id = id;
		this.foo = new Foo(value);
	}
	public Foo getFoo() { return foo; }
	public String getId() { return id; }

	class Foo {
		private Bar bar;
		public Foo(String value) { this.bar = new Bar(value); }
		public Bar getBar() { return bar; }

		class Bar {
			private String value;
			public Bar(String value) { this.value = value; }
			public String getValue() { return value; }
		}
	}
}