package com.dtc.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor.Path;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.widget.core.client.Composite;
import com.sencha.gxt.widget.core.client.form.FormPanel.Method;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.validator.EmptyValidator;

public class GytMain extends Composite {
	private static GytMainUiBinder uiBinder = GWT.create(GytMainUiBinder.class);
	interface GytMainUiBinder extends UiBinder<Widget, GytMain> {}

	private static final Template template = GWT.create(Template.class);
	private static final String qwe = "<div>{name}</div><{name}>" ;

	public interface Template extends XTemplates {
		//@XTemplate(source="event.code")

		@XTemplate(qwe)
		SafeHtml eventCode(String name);

		@XTemplate(source="handler.code")
		SafeHtml handlerCode(String name);
	}

	SafeHtml yyy = new SafeHtml() {
		private static final long serialVersionUID = 1L;

		@Override
		public String asString() {
			return getTemplate();
		}
	};

	interface Properties extends PropertyAccess<Method> {
		@Path("name")
		ModelKeyProvider<Method> key();
		@Path("name")
		LabelProvider<Method> label();
		ValueProvider<Method, String> name();
		ValueProvider<Method, String> type();
	}

	public String getTemplate() {
		return "import com.google.gwt.event.shared.GwtEvent\n" +
				"\n" +
				"public class {name}Event extends GwtEvent<{name}Handler> {}";
	}

	@UiField TextField name;
	@UiField TextArea eventResult;
	@UiField TextArea handlerResult;

	public GytMain() {
		initWidget(uiBinder.createAndBindUi(this));
		name.addValidator(new EmptyValidator<String>());
	}

	@UiHandler("name")
	void changeName(ValueChangeEvent<String> vce) {
		if (!name.validate()) { return; }

		String n = vce.getValue().trim();
		eventResult.setValue(template.eventCode(n).asString());
		handlerResult.setValue(template.handlerCode(n).asString());
	}

}
