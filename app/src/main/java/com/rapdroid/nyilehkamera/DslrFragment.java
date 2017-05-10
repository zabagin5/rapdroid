package com.rapdroid.nyilehkamera;

import android.support.v4.app.Fragment;

/**
 * Created by Ratan on 7/29/2015.
 */
public class DslrFragment extends Fragment {

    /** public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dslr_layout, container, false);

        GridView gridView = (GridView) view.findViewById(R.id.dslrgrid);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
} **/

/**
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dslr_layout,container,false);
        GridView gridView = (GridView)getActivity().findViewById(R.id.dslrgrid);
        gridView.setAdapter(new ImageAdapter(getActivity()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Toast.makeText(getActivity(),"" + position,Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridView gridView = (GridView)this.getActivity().findViewById(R.id.dslrgrid);
        gridView.setAdapter(new ImageAdapter(this));
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

   /** @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dslr_layout,null);

        GridView gridView = (GridView) onCreateView(inflater, container, savedInstanceState).findViewById(R.id.dslrgrid);
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridView gridView = (GridView)this.getActivity().findViewById(R.id.dslrgrid);
        gridView.setAdapter(new viewimagdslr(this.getActivity()));
    }

    @Override
    public void onActivityCreated(Bundle saveInstanceState) {
        super.onActivityCreated(saveInstanceState);
    } **/
}
