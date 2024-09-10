package com.example.lab31;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText n;
    TextView s,s1,e,r1,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.b);
        n=findViewById(R.id.n);
        s=findViewById(R.id.s);
        s1=findViewById(R.id.s1);
        e=findViewById(R.id.e);
        r1=findViewById(R.id.r1);
        r=findViewById(R.id.r);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(n.getText().toString());
                float sum = 1;
                for(int i=2;i<=num;i++) {
                    sum = sum + ((float) 1 /i);
                }
                r1.setText(Float.toString(sum));
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}