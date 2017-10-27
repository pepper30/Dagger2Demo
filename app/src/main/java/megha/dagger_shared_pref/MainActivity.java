package megha.dagger_shared_pref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText editText;
    @Inject
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        editText=findViewById(R.id.editText);

        DaggerSharedComponent.builder().sharedModule(new SharedModule(this)).build().inject(this);

        String str=editText.getText().toString();
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("text",str).apply();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
                startActivity(intent);
            }
        });


    }
}
