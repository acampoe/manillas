package edu.manillas.manillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PrincipalActivity extends AppCompatActivity {
Spinner material;
Spinner dije;
Spinner tipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        material = (Spinner) findViewById(R.id.Material);
        dije = (Spinner) findViewById(R.id.cmbDijes);
        tipo = (Spinner) findViewById(R.id.cmbTipo);

        Resources recursos = getResources();

        ArrayAdapter<String> adapterMaterial = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,recursos.getStringArray(R.array.material));
        material.setAdapter(adapterMaterial);
        ArrayAdapter<String> adapterTipo = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,recursos.getStringArray(R.array.tipo));
        tipo.setAdapter(adapterTipo);
        ArrayAdapter<String> adapterDije = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,recursos.getStringArray(R.array.dije));
        dije.setAdapter(adapterDije);
    }
}
