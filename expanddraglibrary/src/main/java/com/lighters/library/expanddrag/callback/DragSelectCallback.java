package com.lighters.library.expanddrag.callback;

import android.view.View;

/**
 * Created by david on 16/1/21.
 */
public interface DragSelectCallback {

    /**
     * Called when a list item is selected when drag.
     *
     * @param view           The view of the item in the list being selected
     * @param parentPosition The position of the parent item.
     */
    void onListItemSelected(View view, int parentPosition);

    /**
     * Called when a list item is unselected when drag.
     *
     * @param view           The view of the item in the list being unselected
     * @param parentPosition The position of the parent item.
     */
    void onListItemUnSelected(View view, int parentPosition);

    /**
     * Called when the drag proceudure is stopped
     *
     * @param fromTotalPosition
     * @param fromParentPosition
     * @param fromChildPositionOfParent
     * @param toParentPosition
     */
    void onListItemDrop(int fromTotalPosition, int fromParentPosition, int fromChildPositionOfParent, int
            toParentPosition);

}
