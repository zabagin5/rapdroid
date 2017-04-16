package com.rapdroid.nyilehkamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by Ratan on 7/29/2015.
 */
public class DslrFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dslr_layout,null);

        GridView gridView = (GridView) onCreateView(R.layout.dslr_layout).findViewById(R.id.dslrgrid);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent gbr = new Intent(getActivity().getApplicationContext(), viewimagdslr.class);
                gbr.putExtra("l",i);
                startActivity(gbr);
            }
        });
    }
}
