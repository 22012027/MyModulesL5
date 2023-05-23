package sg.edu.rp.c346.id22012027.mymodulesl5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView textViewModuleCode;
    TextView textViewModuleName;
    TextView textViewAcademicYear;
    TextView textViewSemester;
    TextView textViewModuleCredit;
    TextView textViewVenue;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        textViewModuleCode= findViewById(R.id.textViewModuleCode);
        textViewModuleName= findViewById(R.id.textViewModuleName);
        textViewAcademicYear= findViewById(R.id.textViewAcademicYear);
        textViewSemester= findViewById(R.id.textViewSemester);
        textViewModuleCredit= findViewById(R.id.textViewModuleCredit);
        textViewVenue= findViewById(R.id.textViewVenue);

        Intent intentReceived= getIntent();
        String ModuleCode= intentReceived.getStringExtra("Module Code");
        String ModuleName= intentReceived.getStringExtra("Module Name");
        String AcademicYear= intentReceived.getStringExtra("Academic Year");
        String Semester= intentReceived.getStringExtra("Semester");
        String ModuleCredit= intentReceived.getStringExtra("Module Credit");
        String Venue= intentReceived.getStringExtra("Venue");

        textViewModuleCode.setText("Module code: " + ModuleCode);
        textViewModuleName.setText("Module name: " + ModuleName);
        textViewAcademicYear.setText("academic year: " + AcademicYear);
        textViewSemester.setText("semester: " + Semester);
        textViewModuleCredit.setText("Module credit: " + ModuleCredit);
        textViewVenue.setText("venue: " + Venue);





    }
}