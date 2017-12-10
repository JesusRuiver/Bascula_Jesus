package ruiz.jesus.org.bascula_jesus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by JesúsRuiver on 10/12/2017.
 */

public class Info extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String cantidad = extras.getString("cantidad");
        String origen = extras.getString("origen");


        final TextView texto = (TextView) findViewById(R.id.texto);
        texto.setText("Añadidos " + cantidad + " de " + nombre);


        final Button seguir = (Button) findViewById(R.id.seguir);
        final Button menu = (Button) findViewById(R.id.Menu);


        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });
    }
}
