package ruiz.jesus.org.bascula_jesus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends Activity {

    public static ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    private Button bFrutas;
    private Button bRefrescos;
    private Button bVerduras;

    public MainActivity getThis()
    {
        return this;
    }

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

    public void cancelarCompra(View view) {
        Intent i = new Intent(this, Compra.class);
        startActivity(i);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Intent intentPregunta = new Intent(this, Info.class);

        //lanzaFruta
        if (requestCode == 1111 && resultCode == RESULT_OK) {
            final Intent intentFrutas = new Intent(this, Frutas.class);
            startActivityForResult(intentFrutas, 1);
        }

        //lanzaVerdura
        if (requestCode == 2222 && resultCode == RESULT_OK) {
            final Intent intentVerdura = new Intent(this, Verduras.class);
            startActivityForResult(intentVerdura, 1);
        }

        //lanzaRefresco
        if (requestCode == 3333 && resultCode == RESULT_OK) {
            final Intent intentRefrescos = new Intent(this, Refrescos.class);
            startActivityForResult(intentRefrescos, 1);
        }

        if (requestCode == 1 && resultCode == RESULT_OK) {
            ArrayList<String> datos = data.getExtras().getStringArrayList("datos");
            String nombre = datos.get(0);
            String idFoto = datos.get(3);
            String cantidad = datos.get(1);
            String origen = datos.get(2);

            Elemento elemento = new Elemento(Integer.parseInt(idFoto.trim()), nombre, Double.parseDouble(cantidad.trim()));
            elementos.add(elemento);


            intentPregunta.putExtra("origen", origen);

            switch (origen) {
                case "Fruta":
                    intentPregunta.putExtra("nombre", nombre);
                    intentPregunta.putExtra("cantidad", cantidad);
                    startActivityForResult(intentPregunta, 1111);
                    break;
                case "Verdura":
                    intentPregunta.putExtra("nombre", nombre);
                    intentPregunta.putExtra("cantidad", cantidad);
                    startActivityForResult(intentPregunta, 2222);
                    break;
                case "Refresco":
                    intentPregunta.putExtra("nombre", nombre);
                    intentPregunta.putExtra("cantidad", cantidad);
                    startActivityForResult(intentPregunta, 3333);
                    break;
            }
        }

    }
}
