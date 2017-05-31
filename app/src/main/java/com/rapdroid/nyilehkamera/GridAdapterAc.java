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

/**
 * Created by M. HILMI PRASETYA on 5/25/2017.
 */

public class GridAdapterAc extends RecyclerView.Adapter<GridAdapterAc.ViewHolder>{
    List<ActionItem> mItems;

    public GridAdapterAc() {
        super();
        mItems = new ArrayList<ActionItem>();
        ActionItem nama = new ActionItem();

        nama.setName("Go Pro Hero 4");
        nama.setThumbnail(R.drawable.action);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 5");
        nama.setThumbnail(R.drawable.action2);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 4");
        nama.setThumbnail(R.drawable.action);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 5");
        nama.setThumbnail(R.drawable.action2);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 4");
        nama.setThumbnail(R.drawable.action);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 5");
        nama.setThumbnail(R.drawable.action2);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 4");
        nama.setThumbnail(R.drawable.action);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 5");
        nama.setThumbnail(R.drawable.action2);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 4");
        nama.setThumbnail(R.drawable.action);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 5");
        nama.setThumbnail(R.drawable.action2);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 4");
        nama.setThumbnail(R.drawable.action);
        mItems.add(nama);

        nama = new ActionItem();
        nama.setName("Go Pro Hero 5");
        nama.setThumbnail(R.drawable.action2);
        mItems.add(nama);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_view_ac, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ActionItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"This is " + getItemId(getItemCount()), Toast.LENGTH_SHORT).show();
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
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
