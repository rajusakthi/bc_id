package app.bonbloc.com.bonbloc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpConfirmActivity extends AppCompatActivity implements OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupconfirm);
        Intent intent = getIntent();
        Bundle b=intent.getExtras();
        TextView firstname = (TextView) findViewById(R.id.firstname);
        TextView lastname = (TextView) findViewById(R.id.lastname);
        TextView address = (TextView) findViewById(R.id.address);
        TextView phone = (TextView) findViewById(R.id.phone);
        TextView city = (TextView) findViewById(R.id.city);
        TextView zipcode = (TextView) findViewById(R.id.zipcode);
        firstname.setText(b.getCharSequence("firstname"));
        lastname.setText(b.getCharSequence("lastname"));
        address.setText(b.getCharSequence("address"));
        phone.setText(b.getCharSequence("phone"));
        city.setText(b.getCharSequence("city"));
        zipcode.setText(b.getCharSequence("zipcode"));
        button = (Button) findViewById(R.id.btn_signupconfirm);
        button.setOnClickListener(this);
   }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ConfirmActivity.class);
        startActivity(intent);
    }
}
