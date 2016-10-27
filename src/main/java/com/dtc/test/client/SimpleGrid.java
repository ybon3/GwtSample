package com.dtc.test.client;

import java.util.ArrayList;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.Store.StoreFilter;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.RowNumberer;

public class SimpleGrid extends Grid<Data>{
	public static final ValueProvider<Data, String> fnvp = new GetValueProvider<Data, String>() {
		@Override
		public String getValue(Data object) {
			return object.getFirstName();
		}
	};
	public static final ValueProvider<Data, String> lnvp = new GetValueProvider<Data, String>() {
		@Override
		public String getValue(Data object) {
			return object.getFirstName();
		}
	};
	public static final ValueProvider<Data, String> pfvp = new GetValueProvider<Data, String>() {
		@Override
		public String getValue(Data object) {
			return object.getPrefixes();
		}
	};
	public static final ValueProvider<Data, String> sfvp = new GetValueProvider<Data, String>() {
		@Override
		public String getValue(Data object) {
			return object.getSuffixes();
		}
	};

	private static DateTimeFormat DTF = DateTimeFormat.getFormat("yyyy/MM/dd HH:mm:ss"); //Refactory

	public SimpleGrid() {
		super(new ListStore<>(new ModelKeyProvider<Data>() {
			@Override
			public String getKey(Data item) {
				return item.getId();
			}
		}), genColumnModel());

		getView().setForceFit(true);
	}

	public <V> void filter(final ValueProvider<Data, V> vp, final V value) {
		getStore().addFilter(new StoreFilter<Data>() {
			@Override
			public boolean select(Store<Data> store, Data parent, Data item) {
				return vp.getValue(item) == value;
			}
		});
	}

	private static ColumnModel<Data> genColumnModel() {
		ArrayList<ColumnConfig<Data, ?>> list = new ArrayList<>();
		list.add(new RowNumberer<Data>());
		list.add(new ColumnConfig<>(fnvp, 40, "fname"));
		list.add(new ColumnConfig<>(lnvp, 40, "lname"));
		list.add(new ColumnConfig<>(pfvp, 40, "prefix"));
		list.add(new ColumnConfig<>(sfvp, 40, "suffix"));
		return new ColumnModel<>(list);
	}
}


abstract class GetValueProvider<T, V> implements ValueProvider<T, V> {
	@Override public void setValue(T object, V value) {}
	@Override public String getPath() { return null; }
}