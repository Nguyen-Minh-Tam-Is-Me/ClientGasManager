package gas.manager.client.app;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import gas.manager.client.app.model.CustomerModel;
import gas.manager.client.app.request.CustomerRequest;
import gas.manager.client.app.response.CustomerResponse;
import gas.manager.client.app.retrofit.CustomerApi;
import gas.manager.client.app.retrofit.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }
    private void initializeComponents(){
        TextInputEditText inputFieldName = findViewById(R.id.form_input_name);
        TextInputEditText inputFieldAddress = findViewById(R.id.form_input_address);
        TextInputEditText inputFieldPhone= findViewById(R.id.form_input_phone);
        TextInputEditText inputFieldPassword = findViewById(R.id.form_input_password);
        CheckBox inputFieldisGirl = findViewById(R.id.form_input_isGirl);
        CheckBox inputFieldisMen= findViewById(R.id.form_input_isMen);
        MaterialButton buttonSaved = findViewById(R.id.form_submit_button);
        RetrofitService retrofitService = new RetrofitService();
        CustomerApi customerApi = retrofitService.getRetrofit().create(CustomerApi.class);
        buttonSaved.setOnClickListener(view -> {
            String name = String.valueOf(inputFieldName.getText());
            String address = String.valueOf(inputFieldAddress.getText());
            String phone = String.valueOf(inputFieldPhone.getText());
            boolean men = inputFieldisMen.isChecked();
            String password = String.valueOf(inputFieldPassword.getText());
            CustomerRequest model = new CustomerRequest(name, phone, address, men, password,"fjgd");
            customerApi.addNewCustomer(model).enqueue(new Callback<CustomerResponse>() {
                @Override
                public void onResponse(Call<CustomerResponse> call, Response<CustomerResponse> response) {
                    Toast.makeText(MainActivity.this, "Đã thêm thành công", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<CustomerResponse> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Đã có lỗi trong quá trình thêm khách mới", Toast.LENGTH_SHORT).show();
                    Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE,  "Error occred", t);
                }
            });
        });
    }
}