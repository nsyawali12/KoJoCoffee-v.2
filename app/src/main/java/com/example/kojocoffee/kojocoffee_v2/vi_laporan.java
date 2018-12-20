package com.example.kojocoffee.kojocoffee_v2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class vi_laporan extends AppCompatActivity {
    protected Cursor cursor;
    database_laporan dbLaporan;
    database_modal dbModal;
    database_stand dbStand;
    database_pesanan dbPesanan;
    Button confLaporan;
    EditText tglLaporan, modal, jumPemasukkan, jumPengeluaran, keuntungan, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vi_laporan);

        dbLaporan = new database_laporan(this);
        dbModal = new database_modal(this);
        dbStand = new database_stand(this);
        dbPesanan = new database_pesanan(this);
        confLaporan = (Button) findViewById(R.id.confLaporan);
        tglLaporan = (EditText) findViewById(R.id.tglLaporan);
        modal = (EditText) findViewById(R.id.modal);
        jumPemasukkan = (EditText) findViewById(R.id.jumPemasukkan);
        jumPengeluaran = (EditText) findViewById(R.id.jumPengeluaran);
        keuntungan = (EditText) findViewById(R.id.keuntungan);
        status = (EditText) findViewById(R.id.status);

        confLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase dbMod = dbModal.getReadableDatabase();
                cursor = dbMod.rawQuery("SELECT modal FROM data_modal WHERE tglModal = '" +
                        tglLaporan.getText().toString() + "'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                modal.setText(cursor.getString(0).toString());

                SQLiteDatabase dbSt = dbStand.getReadableDatabase();
                cursor = dbSt.rawQuery("SELECT hargaStand FROM data_stand WHERE tglEvent = '" +
                        tglLaporan.getText().toString() + "'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                jumPengeluaran.setText(cursor.getString(0).toString());

                SQLiteDatabase dbPes = dbPesanan.getReadableDatabase();
                cursor = dbPes.rawQuery("SELECT totalHarga FROM data_Pesanan WHERE tglPesanan = '" +
                        tglLaporan.getText().toString() + "'",null);
                cursor.moveToFirst();
                cursor.moveToPosition(0);
                jumPemasukkan.setText(cursor.getString(0).toString());

                int Modal = Integer.parseInt(modal.getText().toString());
                int Pemasukkan = Integer.parseInt(jumPemasukkan.getText().toString());
                int Pengeluaran = Integer.parseInt(jumPengeluaran.getText().toString());
                keuntungan.setText(String.valueOf(Modal - Pengeluaran + Pemasukkan));
                if (Pemasukkan > Pengeluaran){
                    status.setText("UNTUNG");
                } else {
                    status.setText("RUGI");
                }
            }
        });
    }
}
