package com.rapdroid.nyilehkamera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Ratan on 7/29/2015.
 */
public class DslrFragment extends Fragment {
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dslr_layout,container,false);
        GridView gridView = (GridView) view.findViewById(R.id.dslrgrid);
        gridView.setAdapter(new ImageAdapter(view.getContext())); // uses the view to get the context instead of getActivity().
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
