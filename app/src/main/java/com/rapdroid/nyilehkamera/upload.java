package com.rapdroid.nyilehkamera;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class upload extends AppCompatActivity {

    private EditText input_nama_barang;
    private EditText input_gambar;
    private EditText input_jenis;
    private EditText input_jumlah;
    private Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        Firebase.setAndroidContext(this);

        simpan = (Button) findViewById(R.id.simpan);
        input_nama_barang = (EditText) findViewById(R.id.input_nama_barang);
        input_gambar = (EditText) findViewById(R.id.input_gambar);
        input_jenis = (EditText) findViewById(R.id.input_jenis);
        input_jumlah = (EditText) findViewById(R.id.input_jumlah);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Firebase ref = new Firebase(config.FIREBASE_URL);

                String nama_barang = input_nama_barang.getText().toString().trim();
                String gambar_barang = input_gambar.getText().toString().trim();
                String jenis_barang = input_jenis.getText().toString().trim();
                String jumlah_barang = input_jumlah.getText().toString().trim();

                upbarang upbarang = new upbarang();

                upbarang.setName(nama_barang);
                upbarang.setImage(gambar_barang);
                upbarang.setJenis(jenis_barang);
                upbarang.setJumlah(jumlah_barang);

                ref.child("Upload Barang").setValue(upbarang);

                ref.addAuthStateListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                            upbarang upbarang = postSnapshot.getValue(upbarang.class);

                            String string = "Nama Barang :" + upbarang.getName() + "\n" +
                                    "Gambar :" + upbarang.getImage() + "\n" +
                                    "Jenis :" + upbarang.getJenis() + "\n" +
                                    "Jumlah :" + upbarang.getJumlah() + "\n\n";
                        }
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {
                        System.out.println("The read failed" + firebaseError.getMessage());
                    }
                }
        });
    }
}
