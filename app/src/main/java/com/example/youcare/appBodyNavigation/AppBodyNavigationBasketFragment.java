package com.example.youcare.appBodyNavigation;

import androidx.annotation.Nullable;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.youcare.R;

public class AppBodyNavigationBasketFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_app_body_navigation_basket_fragment, container, false);

        return view;    }
}
