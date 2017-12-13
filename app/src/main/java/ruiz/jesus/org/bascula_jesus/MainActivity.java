package ruiz.jesus.org.bascula_jesus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


/**
 * Created by Jesús Manuel Ruiz Verdejo on 10/12/2017.
 */

public class MainActivity extends Activity {

    public static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    private Button bFrutas;
    private Button bRefrescos;
    private Button bVerduras;
    private Button bTicket;
    private Button bSalir;
    private Button bCancelar;

    public MainActivity getThis()
    {
        return this;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bTicket = (Button) findViewById(R.id.ButtonTicket);
        bSalir = (Button) findViewById(R.id.ButtonExit);
        bCancelar = (Button) findViewById(R.id.ButtonCancel);

        bTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTicket = new Intent(getThis(), Ticket.class);
                startActivity(intentTicket);
            }
        });


        bFrutas = (Button) findViewById(R.id.ButtonFrutas);
        bVerduras = (Button) findViewById(R.id.ButtonVerduras);
        bRefrescos = (Button) findViewById(R.id.ButtonRefrescos);

        final Intent intentFrutas = new Intent(this, Frutas.class);
        final Intent intentVerduras = new Intent(this, Verduras.class);
        final Intent intentRefresco = new Intent(this, Refrescos.class);

        bFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intentFrutas,1);
            }
        });
        bVerduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intentVerduras,1);
            }
        });
        bRefrescos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intentRefresco,1);
            }
        });

        bCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                articulos = new ArrayList<Articulo>();
                lanzarCancelaCompra(null);

            }
        });
        bSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Intent intentPregunta = new Intent(this, ContinuarCompra.class);

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

            Articulo articulo = new Articulo(Integer.parseInt(idFoto.trim()), nombre, Double.parseDouble(cantidad.trim()));
            articulos.add(articulo);


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
    public void lanzarCancelaCompra(View view){
        Intent i = new Intent(this, CancelaCompra.class);
        startActivity(i);
    }
}
