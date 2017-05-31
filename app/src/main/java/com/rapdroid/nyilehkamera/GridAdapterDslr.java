package com.rapdroid.nyilehkamera;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.rapdroid.nyilehkamera.R.id.img_thumbnail;

/**
 * Created by M. HILMI PRASETYA on 3/31/2017.
 */

public class GridAdapterDslr extends RecyclerView.Adapter<GridAdapterDslr.ViewHolder> {
    List<DslrItem> mItems;

    public GridAdapterDslr() {
        super();
        mItems = new ArrayList<DslrItem>();
        DslrItem nama = new DslrItem();

        nama.setName("Canon EOS 500D");
        nama.setThumbnail(R.drawable.kamera1);
        mItems.add(nama);

        nama = new DslrItem();
        nama.setName("Canon EOS 550D");
        nama.setThumbnail(R.drawable.kamera);
        mItems.add(nama);

        nama = new DslrItem();
        nama.setName("Canon EOS 550D");
        nama.setThumbnail(R.drawable.kamera);
        mItems.add(nama);

        nama.setName("Canon EOS 500D");
        nama.setThumbnail(R.drawable.kamera1);
        mItems.add(nama);

        nama = new DslrItem();
        nama.setName("Canon EOS 550D");
        nama.setThumbnail(R.drawable.kamera);
        mItems.add(nama);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_view_dslr, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        DslrItem nature = mItems.get(position);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"This is " + getItemId(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);
        }
    }
}
        /**
         * Tambahan untuk db
         */

        /* private ImageView imgcmr;
            private TextView txtnm, txtdeskripsi, txtjml, txthrg;

            private RequestQueue requestQueue;
            private StringRequest stringRequest;

            private RecyclerView rView;
            ArrayList<HashMap<String, String>> list_data;
        */

        /* String url = "http://192.168.1.1/nyilehkamera/getdata.php";

        imgcmr = (ImageView) imgcmr.findViewById(img_thumbnail);
        txtnm = (TextView)txtnm.findViewById(R.id.status);
        txthrg = (TextView) txthrg.findViewById(R.id.price);

        requestQueue = Volley.newRequestQueue(viewGroup.getContext());

        list_data = new ArrayList<HashMap<String, String>>();
        rView = (RecyclerView)viewGroup.findViewById(R.id.recyclerView);

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
                            rView.this.getContext(), recyclerView, R.layout.grid_view_dslr,
                            new String[]{"id_barang","jenis_barang","nama_barang","gambar_barang","deskripsi_barang","jumlah_barang","harga_sewa"},
                            new int[]{R.id.status, R.id.img_thumbnail,R.id.hrg}
                    );

                    listProses.setAdapter(adapter);

                    /* Glide.with(getContext())
                            .load("http://192.168.95.91/app_blogvolley/img/" + list_data.get(0).get("gambar_barang"))
                            .crossFade()
                            .placeholder(R.mipmap.ic_launcher)
                            .into(img_thumbnail); */

                   /* txtmerk.setText(list_data.get(0).get("merk"));
                    txttipe.setText(list_data.get(0).get("tipe"));
                    txtketerangan.setText(list_data.get(0).get("keterangan"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(viewGroup.getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                }
        });
        requestQueue.add(stringRequest);
        /**
         * ==========
         */
/*
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_view_dslr, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    } */


