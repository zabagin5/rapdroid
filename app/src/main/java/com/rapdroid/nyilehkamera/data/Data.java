package com.rapdroid.nyilehkamera.data;

/**
 * Created by M. HILMI PRASETYA on 5/17/2017.
 */

public class Data {

    private String id, nama_barang, gambar, jenis_barang, jumlah_barang, deskripsi;

    public Data() {
    }

    public Data(String id, String nama_barang, String gambar, String jenis_barang, String jumlah_barang, String deskripsi ) {
        this.id = id;
        this.nama_barang = nama_barang;
        this.gambar = gambar;
        this.jenis_barang = jenis_barang;
        this.jumlah_barang = jumlah_barang;
        this.deskripsi = deskripsi;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) { this.id = id; }

    public String getNama_barang() { return nama_barang; }
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getGambar() { return gambar; }
    public void setGambar(String alamat) { this.gambar = gambar; }

    public String getJenis_barang() { return jenis_barang; }
    public void setJenis_barang(String jenis_barang) { this.jenis_barang = jenis_barang; }

    public String getJumlah_barang() { return jumlah_barang; }
    public void setJumlah_barang(String jumlah_barang) { this.jumlah_barang = jumlah_barang; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }
}
