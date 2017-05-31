package com.rapdroid.nyilehkamera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class upload extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

    /* private EditText input_nama_barang, input_gambar, input_jenis, input_jumlah;
    private Button btnsimpan;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        input_nama_barang = (EditText)findViewById(R.id.input_nama_barang);
        input_gambar = (EditText)findViewById(R.id.input_gambar);
        input_jenis = (EditText)findViewById(R.id.input_jenis);
        input_jumlah = (EditText)findViewById(R.id.input_jumlah);
        btnsimpan =(Button)findViewById(R.id.simpan);
        progressDialog = new ProgressDialog(this);

        btnsimpan.setOnClickListener(this);
    }

    private void uploadbarang(){
        final String input_nama = input_nama_barang.getText().toString().trim();
        final String input_image = input_gambar.getText().toString().trim();
        final String input_tipe = input_jenis.getText().toString().trim();
        final String input_qty = input_jumlah.getText().toString().trim();

        progressDialog.setMessage("Upload Barang...");
        progressDialog.show();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, upbarang.UPLOAD_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                try{
                    JSONPObject jsonpObject = new JSONPObject(response);
                    Toast.makeText(getApplicationContext(), jsonpObject.getString"message");
                }
            }
        })
    }

    @Override
    public void onClick(View view) {
        if(view == simpan){

        }
    }
    /* private EditText input_nama_barang;
    private EditText input_gambar;
    private EditText input_jenis;
    private EditText input_jumlah;
    private TextView textViewUpbarang;
    private Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        Firebase.setAndroidContext(this);

        simpan = (Button)findViewById(R.id.simpan);
        input_nama_barang = (EditText)findViewById(R.id.input_nama_barang);
        input_gambar = (EditText)findViewById(R.id.input_gambar);
        input_jenis = (EditText)findViewById(R.id.input_jenis);
        input_jumlah = (EditText)findViewById(R.id.input_jumlah);

        simpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Firebase ref = new Firebase(config.FIREBASE_URL);

                String input_nama = input_nama_barang.getText().toString().trim();
                String input_image = input_gambar.getText().toString().trim();
                String input_tipe = input_jenis.getText().toString().trim();
                String input_qty = input_jumlah.getText().toString().trim();

                upbarang upbrg = new upbarang();

                upbrg.setName(input_nama);
                upbrg.setImage(input_image);
                upbrg.setJenis(input_tipe);
                upbrg.setJumlah(input_qty);

                ref.child("upbarang").setValue(upbrg);

                ref.addAuthStateListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                            //Getting the data from snapshot
                            upbarang upbrg = postSnapshot.getValue(upbarang.class);

                            //Adding it to a string
                            String string = "Name: "+upbrg.getName()+"\nAddress: "+upbrg.getImage()+"\n\n";

                            textViewUpbarang.setText(string);
                        }
                    }

                    @Override
                    public void onCancelled(FirebaseError firebaseError) {
                        System.out.println("The read failed: " + firebaseError.getMessage());
                    }
                });

            }
        });*/
    }
}