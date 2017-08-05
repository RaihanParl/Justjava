package com.bidjidev.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int jumlahnya = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void tampilJumlah(int angka){
        TextView txtJumlah = (TextView)findViewById(R.id.txtJumlah);
        txtJumlah.setText(angka + "");
    }
    private void tampilHarga(String pesan,int harga){
        TextView txtHarga = (TextView)findViewById(R.id.txtHarga);
        txtHarga.setText(pesan + "Rp."+harga);
    }

    public void pesan(View v){
        String pesan = "Terimakasih telah membeli \n";
        pesan = pesan + "Total harga:";
        tampilHarga(pesan,jumlahnya * 3000);
    }
    public void Tambah(View v){
        jumlahnya = jumlahnya + 1;
        tampilJumlah(jumlahnya);
    }
    public void Kurang(View v){
        jumlahnya = jumlahnya - 1;
        tampilJumlah(jumlahnya);
    }
}
