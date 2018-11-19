package c.x.kladionica;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = (EditText)findViewById(R.id.Name);
        Password =(EditText)findViewById(R.id.Password);
        Login = (Button)findViewById(R.id.Login);
        Reg = (Button)findViewById(R.id.buttonReg);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }

    private void validate(String userName, String userPassowrd){
        if((userName.equals(Name.getText().toString())) && (userPassowrd.equals(Password.getText().toString()))){

            Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
            startActivity(intent);
        }
    }
}
