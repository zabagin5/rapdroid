package com.rapdroid.nyilehkamera;

/**
 * Created by M. HILMI PRASETYA on 3/31/2017.
 */
public class ImageAdapter  {
    /** private DslrFragment mContext;

    public  ImageAdapter(DslrFragment c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView)convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    public Integer[] mThumbIds = {
            R.drawable.kamera, R.drawable.kamera,
            R.drawable.kamera, R.drawable.kamera,
            R.drawable.kamera, R.drawable.kamera
    }; **/
}
