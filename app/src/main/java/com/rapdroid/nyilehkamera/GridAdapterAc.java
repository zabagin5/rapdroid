package com.rapdroid.nyilehkamera;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

                //Toast.makeText(view.getContext(),"This is " + getItemId(getItemCount()), Toast.LENGTH_SHORT).show();

                final Dialog dialog = new Dialog(view.getContext());
                dialog.setContentView(R.layout.custom_dialog_ac);
                dialog.setTitle("Nyileh Kamera");

                TextView textView1 = (TextView)dialog.findViewById(R.id.attention);
                textView1.setText("Mohon Maaf untuk ketidaknyamanan dalam system order kami, versi Aplikasi ini masih unstable. demi kenyamanan order via Whatsapp +6282333843148. Terima Kasih atas Kepercayaannya :)");

                TextView textView = (TextView)dialog.findViewById(R.id.status);
                textView.setText("Terimas Kasih");

                //ImageView imageView = (ImageView)dialog.findViewById(R.id.img_thumbnail);
                //imageView.setImageResource(R.drawable.kamera);

                Button dialogButton = (Button)dialog.findViewById(R.id.dialogButtonOk);
                dialogButton.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
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
        private Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
