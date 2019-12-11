package de.select2;

import java.util.Collection;
import java.util.List;
import org.wicketstuff.select2.ChoiceProvider;
import org.wicketstuff.select2.Response;

public class StateProvider extends ChoiceProvider<List<EState>> {


    private final List<List<EState>> selectableStates;

    public StateProvider(List<List<EState>> selectableStates) {
        this.selectableStates = selectableStates;
    }

    @Override
    public String getDisplayValue(List<EState> listOfStates) {
        if (listOfStates != null) {
            final String prefix = "EState.";
            if (listOfStates.equals(EState.LIST_1)) {
                return "LIST_1+";
            }

            if (listOfStates.equals(EState.LIST_2)) {
                return "LIST_2+";
            }

            if (listOfStates.equals(EState.LIST_3)) {
                return "LIST_3+";
            }
        }
        return "Something is wrong";
    }

    @Override
    public String getIdValue(List<EState> listOfStates) {
        return String.valueOf(selectableStates.indexOf(listOfStates));
    }

    @Override
    public void query(String term, int page, Response<List<EState>> response) {
        // Need to be implemented
        response.addAll(selectableStates);
    }

    @Override
    public Collection<List<EState>> toChoices(Collection<String> collection) {
        final String id = collection.stream().findFirst().orElseThrow();
        final int index = Integer.parseInt(id);
        return List.of(selectableStates.get(index));
    }
}
