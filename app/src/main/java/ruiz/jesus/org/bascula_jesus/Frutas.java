package ruiz.jesus.org.bascula_jesus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Vespertino on 28/11/2017.
 */

public class Frutas extends Activity {

    private Button bVolver;
    private Button bFresas;
    private Button bGranada;
    private Button bLima;
    private Button bLimon;
    private Button bManzana;
    private Button bPlatano;
    private EditText texto;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frutas);

        bVolver = (Button) findViewById(R.id.ButtonVolverFrutas);
        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });

        bFresas = (Button) findViewById(R.id.ButtonFresas);
        bFresas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Double.parseDouble(texto.getText().toString());

                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Fresa");
                    datos.add(texto.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.fresas));

                    resultado(datos);
                } catch (Exception e) {

                }

            }
        });
        bGranada = (Button) findViewById(R.id.ButtonGranada);
        bGranada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{

                    Double.parseDouble(texto.getText().toString());

                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Granada");
                    datos.add(texto.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.granada));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });
        bLima = (Button) findViewById(R.id.ButtonLima);
        bLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());

                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Lima");
                    datos.add(texto.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.lima));
                    resultado(datos);
                }catch (Exception e)
                {

                }


            }
        });
        bLimon = (Button) findViewById(R.id.ButtonLimon);
        bLimon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Limon");
                    datos.add(texto.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.limon));
                    resultado(datos);
                }catch (Exception e)
                {

                }



            }
        });
        bManzana = (Button) findViewById(R.id.ButtonManzana);
        bManzana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Manzana");
                    datos.add(texto.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.manzana));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });
        bPlatano = (Button) findViewById(R.id.ButtonPlatano);
        bPlatano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("Platano");
                    datos.add(texto.getText().toString());
                    datos.add("Fruta");
                    datos.add(String.valueOf(R.drawable.platano));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

    }

    public void resultado(ArrayList<String> datos)
    {
        Intent intent = new Intent();
        intent.putExtra("datos",datos);
        setResult(RESULT_OK,intent);
        finish();
    }
}
