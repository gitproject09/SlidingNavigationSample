package com.sopan.sliding_nav.sliding.callback;

/**
 * Created by Sopan on 25.03.2017.
 */

public interface DragStateListener {

    void onDragStart();

    void onDragEnd(boolean isMenuOpened);
}
