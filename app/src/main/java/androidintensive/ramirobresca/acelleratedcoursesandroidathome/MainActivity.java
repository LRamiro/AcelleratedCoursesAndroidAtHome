package androidintensive.ramirobresca.acelleratedcoursesandroidathome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button dateButton;
    Button editTextButton;

    //--- This is a method we should override.It's invocated when the activity is initialized
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Ciclo de Vida", "La actividad ha sido creada");
        //addListenerOnButton();
        dateButton = (Button) findViewById(R.id.dateButton);
        dateButton.setOnClickListener(this);
        editTextButton = (Button) findViewById(R.id.editTextButton);
        editTextButton.setOnClickListener(this);
    }


    public void onClick(View control_pulsado) {

        if (control_pulsado == dateButton) {
            Date currentDate = new Date();
            //--- Create a text field that we're going to fill. ---//
            //TextView textFieldDate = (TextView) findViewById(R.id.dateField);
            //textFieldDate.setText(currentDate.getHours()+currentDate.getMinutes()+currentDate.getSeconds());
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(currentDate);
            dateButton = (Button) findViewById(R.id.dateButton);
            dateButton.setText(currentDate.getHours() + currentDate.getMinutes() + currentDate.getSeconds());
        }
        else {
            lanzarNuevaActividad(editTextButton);

        }
    }

    public void lanzarNuevaActividad(View v){
        Intent i = new Intent(this, TextEdit.class);
        startActivity(i);
    }

}
