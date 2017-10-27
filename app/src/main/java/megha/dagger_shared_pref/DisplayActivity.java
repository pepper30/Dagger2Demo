package megha.dagger_shared_pref;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

public class DisplayActivity extends AppCompatActivity {
     TextView textView;

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView=findViewById(R.id.textView3);
        DaggerSharedComponent.builder().sharedModule(new SharedModule(this)).build().inject(this);

        textView.setText(sharedPreferences.getString("text",""));
    }
}
