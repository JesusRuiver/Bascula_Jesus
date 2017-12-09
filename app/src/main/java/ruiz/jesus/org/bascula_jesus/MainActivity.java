package ruiz.jesus.org.bascula_jesus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button bFrutas;
    private Button bRefrescos;
    private Button bVerduras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bFrutas = (Button) findViewById(R.id.ButtonFrutas);
        bFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarFrutas(null);
            }
        });

        bRefrescos = (Button) findViewById(R.id.ButtonRefrescos);
        bRefrescos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarRefrescos(null);
            }
        });

        bVerduras = (Button) findViewById(R.id.ButtonVerduras);
        bVerduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarVerduras(null);
            }
        });


    }

    public void lanzarFrutas(View view) {
        Intent i = new Intent(this, Frutas.class);
        startActivity(i);
    }

    public void lanzarRefrescos(View view) {
        Intent i = new Intent(this, Refrescos.class);
        startActivity(i);
    }

    public void lanzarVerduras(View view) {
        Intent i = new Intent(this, Verduras.class);
        startActivity(i);
    }

    public void salir(View view) {
        finish();
    }

    public void cancelarCompra(View view){
        Intent i = new Intent(this, Compra.class);
        startActivity(i);
    }

}
