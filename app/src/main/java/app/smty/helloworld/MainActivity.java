package app.smty.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button buttonSend;
    TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        buttonSend = findViewById(R.id.buttonSend);
        textViewName = findViewById(R.id.textViewName);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editTextName.getText().toString();
                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty Name", Toast.LENGTH_SHORT);
                    return;
                }
                textViewName.setText("Hello, " + text);
            }
        });
    }
}