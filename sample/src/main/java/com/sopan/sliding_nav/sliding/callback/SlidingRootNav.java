package com.sopan.sliding_nav.sliding.callback;

import com.sopan.sliding_nav.sliding.helper.SlidingRootNavLayout;

/**
 * Created by Sopan on 25.03.2017.
 */

public interface SlidingRootNav {

    boolean isMenuClosed();

    boolean isMenuOpened();

    boolean isMenuLocked();

    void closeMenu();

    void closeMenu(boolean animated);

    void openMenu();

    void openMenu(boolean animated);

    void setMenuLocked(boolean locked);

    SlidingRootNavLayout getLayout();

}
