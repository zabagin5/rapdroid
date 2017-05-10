package com.rapdroid.nyilehkamera;

import android.app.Activity;

/**
 * Created by M. HILMI PRASETYA on 3/31/2017.
 */

public class viewimagdslr extends Activity {
    /** @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dslr_layout);

        Intent gbr = getIntent();

        int position = gbr.getExtras().getInt("l");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView)findViewById(R.id.dslrgrid);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    } **/
}
