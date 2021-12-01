package com.mami.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<EditorState> stateList = new ArrayList<>();

    public void push(EditorState state) {

        stateList.add(state);
    }

    public EditorState pop() {
        int lastIndex = stateList.size()-1;
        EditorState lastState = stateList.get(lastIndex);
        stateList.remove(lastState);

        return lastState;
    }
}
