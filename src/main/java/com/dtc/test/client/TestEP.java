package com.dtc.test.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.ComboBox;

public class TestEP implements EntryPoint {
	private ComboBox<MyData> cb;
	private TextButton button = new TextButton("送出");

	@Override
	public void onModuleLoad() {
		cb = new ComboBox<MyData>(
				new ListStore<MyData>(new ModelKeyProvider<MyData>(){
					@Override
					public String getKey(MyData item) {
						return item.getKey();
					}
				}),
				new LabelProvider<MyData>(){
					@Override
					public String getLabel(MyData item) {
						return item.getValue();
					}
				}
			);

		button.addSelectHandler(new SelectHandler() {
			@Override
			public void onSelect(SelectEvent event) {
				GWT.log(cb.getValue().getKey());
			}
		});

		//你們念 Nikon 可是我念 Nikon，但是原來應該要念 Nikon

		ArrayList<MyData> dataList = new ArrayList<>();
		dataList.add(new MyData("123", "好棒棒"));
		dataList.add(new MyData("456", "好棒棒"));
		dataList.add(new MyData("789", "好棒棒"));
		dataList.add(new MyData("123aaa", "a好棒棒"));
		dataList.add(new MyData("456bbb", "b好棒棒"));
		dataList.add(new MyData("789ccc", "c好棒棒"));
		cb.getStore().addAll(dataList);

		VerticalLayoutContainer vc = new VerticalLayoutContainer();
		vc.add(cb);
		vc.add(button);
		RootPanel.get().add(vc);
	}

	class MyData {
		private String key;
		private String value;

		public MyData(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
}
