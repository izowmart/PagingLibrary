package com.e.paginglibrary;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class ItemDataSourceFactory extends DataSource.Factory {
  private MutableLiveData<PageKeyedDataSource<Integer,Item>> itemLiveData = new MutableLiveData<>();


    @NonNull
    @Override
    public DataSource create() {
        ItemDataSource itemDataSource = new ItemDataSource();
        itemLiveData.postValue(itemDataSource);
        return itemDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, Item>> getItemLiveData() {
        return itemLiveData;
    }
}
