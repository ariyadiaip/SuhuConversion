package id.sch.bdg.smkn4.pwpb.suhuconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtCelcius, edtFarenheit, edtReamur, edtKelvin;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    private void convert() {
        String celcius = edtCelcius.getText().toString().trim();
        Double c = Double.parseDouble(celcius);
        Double f = (c * 1.8) + 32;
        Double r = c * 0.8;
        Double k =  c + 273.15;
        edtFarenheit.setText(f.toString());
        edtReamur.setText(r.toString());
        edtKelvin.setText(k.toString());
    }

    private void initialize() {
        edtCelcius = (EditText) findViewById(R.id.edtCelcius);
        edtReamur = (EditText) findViewById(R.id.edtReamur);
        edtFarenheit = (EditText) findViewById(R.id.edtFarenheit);
        edtKelvin = (EditText) findViewById(R.id.edtKelvin);
        btnConvert = (Button) findViewById(R.id.btnConvert);
    }
}
