package com.google.firebase.and.mymarket;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class OrderLoader extends AsyncTaskLoader<List<com.google.firebase.and.mymarket.Order>> {

    private String mJsonData;

    public OrderLoader(@NonNull Context context, String jsonData) {
        super(context);
        mJsonData = jsonData;
    }

    @Nullable
    @Override
    public List<com.google.firebase.and.mymarket.Order> loadInBackground() {
        if (mJsonData == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<com.google.firebase.and.mymarket.Order> orders = QueryUtils.extractOrderJson(mJsonData);
        return orders;
    }
}
