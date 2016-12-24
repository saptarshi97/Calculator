package saptarshi.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView result,Display;
    double num1,num2,sum,difference,product,quotient,remainder,power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText)findViewById(R.id.input_2);
        number2 = (EditText)findViewById(R.id.input_1);
        result = (TextView)findViewById(R.id.Operation_Result);
        Display = (TextView)findViewById(R.id.display);
    }
    public void sendAddition(View view)
    {
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        Display.setText(Double.toString(num1)+" + "+Double.toString(num2));
        sum = num1 + num2;
        result.setText(Double.toString(sum));
    }
    public void sendSubtraction(View view)
    {
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        Display.setText(Double.toString(num1)+" - "+Double.toString(num2));
        difference = num1 - num2;
        result.setText(Double.toString(difference));
    }
    public void sendProduct(View view)
    {
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        Display.setText(Double.toString(num1)+" * "+Double.toString(num2));
        product= num1 * num2;
        result.setText(Double.toString(product));
    }
    public void sendQuotient(View view)
    {
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        Display.setText(Double.toString(num1)+" / "+Double.toString(num2));
        if(num2==0)
            result.setText("Error ! Division by zero !");
        else{
            quotient = num1 / num2;
            result.setText(Double.toString(quotient)); }
    }
    public void sendRemainder(View view)
    {
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        Display.setText(Double.toString(num1)+" % "+Double.toString(num2));
        if(num2==0)
            result.setText("Error ! Division by zero !");
        else{
        remainder = num1 % num2;
        result.setText(Double.toString(remainder)); }
    }
    public void sendPower(View view)
    {
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        Display.setText(Double.toString(num1)+" ^ "+Double.toString(num2));
        power = Math.pow(num1,num2);
        result.setText(Double.toString(power));
    }
}
