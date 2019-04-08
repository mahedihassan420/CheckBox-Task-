package com.example.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selection =  new ArrayList<String>();

   ;
    TextView final_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final_text = findViewById(R.id.finalresult);
        final_text.setEnabled(false);

    }

    public void selectItem(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case  R.id.male:
                if (checked)
                    selection.add("Male");
                else {
                    selection.remove("Male");
                } break;
            case  R.id.female:
                if (checked)
                    selection.add("Female");
                else {
                    selection.remove("Female");
                } break;
            case  R.id.hijra:
                if (checked)
                    selection.add("Hijra");
                else {
                    selection.remove("Hijra");
                } break;
        }
    }

    public void finalselection(View view) {

        String final_selection ="";
        for (String Selection : selection){
            final_selection = final_selection+Selection+ "\n";
            final_text.setText(final_selection);
            final_text.setEnabled(true);

        }
    }
}
