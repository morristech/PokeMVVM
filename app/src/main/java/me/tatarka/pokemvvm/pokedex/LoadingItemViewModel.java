package me.tatarka.pokemvvm.pokedex;

import me.tatarka.bindingcollectionadapter.ItemView;
import me.tatarka.bindingcollectionadapter.itemviews.ItemViewModel;
import me.tatarka.pokemvvm.R;

/**
 * Represents an item that just shows a loading indicator.
 */
public class LoadingItemViewModel implements ItemViewModel {
    @Override
    public void itemView(ItemView itemView) {
        itemView.set(ItemView.BINDING_VARIABLE_NONE, R.layout.pokedex_item_loading);
    }
}
