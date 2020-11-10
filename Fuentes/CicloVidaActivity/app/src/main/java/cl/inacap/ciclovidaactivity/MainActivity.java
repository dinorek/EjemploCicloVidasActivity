package cl.inacap.ciclovidaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button segundoBtn;
    private final String TAG= "ACTIVITY PRINCIPAL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Se ejecutó onCreate");
        setContentView(R.layout.activity_main);
        segundoBtn = findViewById(R.id.segundoBtn);
        segundoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SegundoActivity.class);
                startActivity(i);
            }
        });
    }
        protected void onStart(){
        super.onStart();
            Log.d(TAG, "Se ejecutó onStart");



        }

        protected void onResume(){
        super.onResume();
        Log.d(TAG, "Se ejecutó onResume");

        }

        protected void onPause(){
        super.onPause();
        Log.d(TAG, "Se ejecutó onPause");
        }

        protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "Se ejecutó onRestart");

        }

        protected void onStop(){
        super.onStop();
        Log.d(TAG, "Se ejecutó onStop");
        }

        protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Se ejecutó onDestroy");
        }


}
