package de.select2;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LambdaModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.select2.Select2Choice;

import java.util.LinkedList;
import java.util.List;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		final List<List<EState>> states = new LinkedList<>();
		states.add(EState.LIST_1);
		states.add(EState.LIST_2);
		states.add(EState.LIST_3);

		List<EState> selectedStates = new LinkedList<>();
		selectedStates = EState.LIST_1;
		IModel<List<EState>> selectedStatesModel = Model.ofList(selectedStates);
		Select2Choice<List<EState>> stateSelect = new Select2Choice<>("selectState", selectedStatesModel, new StateProvider(states));
		queue(stateSelect);
	}


}
