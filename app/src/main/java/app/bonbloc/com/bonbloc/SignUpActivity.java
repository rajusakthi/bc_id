package app.bonbloc.com.bonbloc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SignUpActivity extends AppCompatActivity implements OnClickListener {
    Button button;
    EditText firstname;
    EditText lastname;
    EditText phone;
    EditText address;
    EditText city;
    EditText zipcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
     //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
        //Get the ids of view objects
        findAllViewsId();
        button.setOnClickListener(this);

    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.btn_signup);
        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        phone = (EditText) findViewById(R.id.phone);
        address = (EditText) findViewById(R.id.address);
        city = (EditText) findViewById(R.id.city);
        zipcode = (EditText) findViewById(R.id.zipcode);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), SignUpConfirmActivity.class);
        //Create a bundle object
        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle
        b.putString("firstname", firstname.getText().toString());
        b.putString("lastname", lastname.getText().toString());
        b.putString("phone", phone.getText().toString());
        b.putString("address", address.getText().toString());
        b.putString("city", city.getText().toString());
        b.putString("zipcode", zipcode.getText().toString());


        //Add the bundle to the intent.
        intent.putExtras(b);

        //start the DisplayActivity
        startActivity(intent);
    }
}
