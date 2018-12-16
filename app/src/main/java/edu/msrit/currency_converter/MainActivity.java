package edu.msrit.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    EditText rupees;
    TextView converted;
    Button dollar,yen,pound,euros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollar=(Button) findViewById(R.id.dollar);
        yen=(Button) findViewById(R.id.yen);
        pound=(Button) findViewById(R.id.pound);
        euros=(Button) findViewById(R.id.euros);
        rupees=(EditText) findViewById(R.id.rupees);
        converted=(TextView)findViewById(R.id.converted);
        String input=rupees.getText().toString();
        if(TextUtils.isEmpty(input))
        {
            rupees.setError("Empty input field, please enter valid input");
        }
    }
    public void toDollars(View view)
    {

        int amt=parseInt(rupees.getText().toString());
        double dollar=amt/70;
        converted.setText(Double.toString(dollar)+"$");

    }
public void toEuros(View view)
{
    int amt;
    amt = Integer.parseInt(rupees.getText().toString());
    double euros=amt*0.012;
    converted.setText(Double.toString(euros)+"€");


}
    public void toPounds(View view)
    {
        double pound=0.0;
        int amt=0;
        amt=parseInt(rupees.getText().toString());
        pound=amt*0.011;
        converted.setText(Double.toString(pound)+"£");

    }
    public void toYen(View view)
    {
        double yen=0.0;
        int amt=0;
        amt=parseInt(rupees.getText().toString());
         yen=amt*1.56;
        converted.setText(Double.toString(yen)+"¥");



    }


}
