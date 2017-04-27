package com.rapdroid.nyilehkamera;

import android.support.v4.app.Fragment;

/**
 * Created by Ratan on 7/29/2015.
 */
public class DslrFragment extends Fragment {

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
