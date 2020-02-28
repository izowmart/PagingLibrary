package com.e.paginglibrary;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

public class ItemDataSource extends PageKeyedDataSource<Integer,Item> {
    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, Item> callback) {

    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

    }
}
