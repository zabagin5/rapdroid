package com.rapdroid.nyilehkamera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ratan on 7/29/2015.
 */
public class DslrFragment extends Fragment {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    /* private RequestQueue requestQueue;
    private RecyclerView rView;
    ArrayList<HashMap<String, String>> list_data;
    private StringRequest stringRequest;
    private TextView txtnm, txtdeskripsi, txtjml, txthrg; */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.dslr_layout, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager  = new GridLayoutManager(getActivity(),2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapterDslr();
        mRecyclerView.setAdapter(mAdapter);

        /**
         * Tambahan untuk db
         */
/*        String url = "http://192.170.4.3/nyilehkamera/getdata.php";

        //requestQueue = Volley.newRequestQueue(getContext());

        list_data = new ArrayList<HashMap<String, String>>();
        rView = (RecyclerView)view.findViewById(R.id.recyclerView);

        stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("kamera");
                    for (int a = 0; a < jsonArray.length(); a ++){
                        JSONObject json = jsonArray.getJSONObject(a);
                        HashMap<String, String> map  = new HashMap<String, String>();
                        map.put("id_barang", json.getString("id_barang"));
                        map.put("jenis_barang", json.getString("jenis_barang"));
                        map.put("nama_barang", json.getString("nama_barang"));
                        map.put("gambar_barang", json.getString("gambar_barang"));
                        map.put("deskripsi_barang", json.getString("deskripsi_barang"));
                        map.put("jumlah_barang", json.getString("jumlah_barang"));
                        map.put("harga_sewa", json.getString("harga_sewa"));
                        list_data.add(map);
                    }

                    ListAdapter adapter = new SimpleAdapter(
                            DslrFragment.this.getContext(), list_data, R.layout.grid_view_dslr,
                            new String[]{"nama_barang","gambar_barang","harga_sewa"},
                            new int[]{R.id.status, R.id.img_thumbnail,R.id.hrg}
                    );

                    rView.setAdapter((RecyclerView.Adapter) adapter);

                    txtnm.setText(list_data.get(0).get("nama_barang"));
                    //txti.setText(list_data.get(0).get("gambar_barang"));
                    txthrg.setText(list_data.get(0).get("harga_sewa"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(stringRequest);
        /**
         * ==========
         */
        return view ;
    }

}
