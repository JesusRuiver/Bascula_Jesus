package ruiz.jesus.org.bascula_jesus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Jesús Manuel Ruiz Verdejo on 28/11/2017.
 */

public class Verduras extends Activity {

    private Button bVolver;
    private Button bBerenjena;
    private Button bCalabacin;
    private Button bGuindilla;
    private Button bPimientoRojo;
    private Button bTomate;
    private Button bTomateRama;
    private Button bZanahoria;
    private EditText texto;

    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verduras);

        texto = (EditText) findViewById(R.id.editText);

        bVolver = (Button) findViewById(R.id.ButtonVolverVerduras);
        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });

        bBerenjena = (Button) findViewById(R.id.ButtonBerenjena);
        bBerenjena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("berenjena");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

        bCalabacin = (Button) findViewById(R.id.ButtonCalabacin);
        bCalabacin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("calabacin");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

        bGuindilla = (Button) findViewById(R.id.ButtonGuindilla);
        bGuindilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("guindilla");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

        bPimientoRojo = (Button) findViewById(R.id.ButtonPimientoRojo);
        bPimientoRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("pimiento rojo");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

        bTomate = (Button) findViewById(R.id.ButtonTomate);
        bTomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("tomate");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

        bTomateRama = (Button) findViewById(R.id.ButtonTomateEnRama);
        bTomateRama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("tomate en rama");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });

        bZanahoria = (Button) findViewById(R.id.ButtonZanahoria);
        bZanahoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Double.parseDouble(texto.getText().toString());


                    ArrayList<String> datos = new ArrayList<String>();
                    datos.add("zanahoria");
                    datos.add(texto.getText().toString());
                    datos.add("Verdura");
                    datos.add(String.valueOf(R.drawable.berenejena));
                    resultado(datos);
                }catch (Exception e)
                {

                }

            }
        });
    }

    private void resultado(ArrayList<String> datos)
    {
        Intent intent = new Intent();
        intent.putExtra("datos",datos);
        setResult(RESULT_OK,intent);
        finish();
    }
}
