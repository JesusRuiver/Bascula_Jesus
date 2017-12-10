package ruiz.jesus.org.bascula_jesus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Vespertino on 28/11/2017.
 */

public class Refrescos extends Activity{

    private Button bVolver;
    private Button bCocaCola;
    private Button bFantaLimon;
    private Button bFantaNaranja;
    private Button bAgua;


    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refrescos);

        bVolver = (Button) findViewById(R.id.ButtonVolverRefrescos);
        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });

        bCocaCola = (Button) findViewById(R.id.ButtoncCocaCola);
        bCocaCola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("cocacola");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.coca_cola));
                resultado(datos);
            }
        });

        bFantaLimon = (Button) findViewById(R.id.ButtonGFantaLimon);
        bFantaLimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("cocacola");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.coca_cola));
                resultado(datos);
            }
        });

        bFantaNaranja = (Button) findViewById(R.id.ButtonFantaNaranja);
        bFantaNaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("cocacola");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.coca_cola));
                resultado(datos);
            }
        });

        bAgua = (Button) findViewById(R.id.ButtonAgua);
        bAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> datos = new ArrayList<String>();
                datos.add("cocacola");
                datos.add("1");
                datos.add("Refresco");
                datos.add(String.valueOf(R.drawable.coca_cola));
                resultado(datos);
            }
        });
    }
    private void resultado(ArrayList<String> datos) {
        Intent intent = new Intent();
        intent.putExtra("datos", datos);
        setResult(RESULT_OK, intent);
        finish();
    }
}
