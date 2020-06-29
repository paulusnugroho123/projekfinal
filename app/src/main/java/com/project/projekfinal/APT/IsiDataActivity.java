package com.project.projekfinal.APT;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.project.projekfinal.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class IsiDataActivity extends AppCompatActivity {

    DatePickerDialog picker;
    EditText eText;
    Locale locale = new Locale("ID");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_data);
        getSupportActionBar().setTitle("Isi Data Tamu");

        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getApplicationContext().getResources().updateConfiguration(config, null);
        eText=(EditText) findViewById(R.id.date);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(IsiDataActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                cldr.set(Calendar.YEAR,year);
                                cldr.set(Calendar.MONTH,monthOfYear);
                                cldr.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                                String tes = DateFormat.getDateInstance(DateFormat.FULL).format(cldr.getTime());
                                eText.setText(tes);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

    }
}
