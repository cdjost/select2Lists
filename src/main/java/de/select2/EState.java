package de.select2;

import java.util.List;

public enum EState {
    STATE_1,
    STATE_2,
    STATE_3;

    public static final List<EState> LIST_1 = List.of(STATE_1, STATE_2);

    public static final List<EState> LIST_2 = List.of(STATE_1, STATE_3);

    public static final List<EState> LIST_3 = List.of(STATE_3);
}
