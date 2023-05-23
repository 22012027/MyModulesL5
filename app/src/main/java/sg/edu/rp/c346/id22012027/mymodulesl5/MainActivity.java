package sg.edu.rp.c346.id22012027.mymodulesl5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewC346;
    TextView textViewC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewC346=findViewById(R.id.textViewC346);
        textViewC349=findViewById(R.id.textViewC349);

        textViewC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Module Credit", "4");
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });
    }
}