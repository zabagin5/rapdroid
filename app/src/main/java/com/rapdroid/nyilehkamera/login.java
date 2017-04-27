package com.rapdroid.nyilehkamera;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.rapdroid.nyilehkamera.R.id.password;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /** Button btnlogin = (Button) findViewById(R.id.logintes);
        btnlogin.setOnClickListener(new View.OnClickListener(){
            Name =
        }); **/
    }


    private class LongOperation extends AsyncTask<String, Void, Void>{
        private ProgressDialog Dialog = new ProgressDialog(login.this);
        boolean berhasil = false;
        String[]id,nama;

        protected void onPreExecute(){
            Dialog.setMessage("Loading please wait");
            Dialog.show();
        }

        @Override
        protected Void doInBackground(String... urls) {
            JSONObject json = JSONParser.getJSONfromURL("http://jti.polije.ac.id/login.php?username="+nama+"&password="+password+"");
            try {

                JSONArray data = json.getJSONArray("data");
                Log.e("Main Jumlah : ",""+data.length());

                if (data.length() >= 1){
                    JSONObject jsonobj = data.getJSONObject(0);
                    id = new String [data.length()];
                    nama = new String[data.length()];
                    //SharedPreferences.Editor editor = pref.edit();
                    for (int i=0; i<data.length();i++){
                       /** nama[i] = jsonobj.getString("nama");
                        id[i] = jsonobj.getString("password");
                        editor.putString("nama",nama[i]);
                        editor.putString("nohp",id[i]);
                        editor.commit(); **/
                        Log.e("Nama", nama[i]+" "+id);
                    }
                } else {
                    Toast.makeText(login.this,"Login Gagal",Toast.LENGTH_LONG).show();
                }

            } catch (JSONException e) {
                Log.e("log_tag","error parsing data"+ e.toString());
            }

            return null;
        }

        protected void onPostExecute(Void unused){
            Dialog.dismiss();
            startActivity(new Intent(login.this,MainActivity.class));
            finish();
        }


    }
}
