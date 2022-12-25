package hajarshaufi.parcel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParcelManagementMain extends AppCompatActivity {

    Button insertParcelBtn, editParcelBtn, parcelReportBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcel_management_main);

        insertParcelBtn = findViewById(R.id.insertParcelBtn);
        editParcelBtn = findViewById(R.id.edtParcelBtn);
        parcelReportBtn = findViewById(R.id.parcelReportBtn);

        //intent to insert parcel
        insertParcelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParcel = new Intent(ParcelManagementMain.this, ParcelAdd.class);
                startActivity(intentParcel);
            }
        });

        //intent to edit parcel
        editParcelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEditParcel = new Intent(ParcelManagementMain.this, ParcelAdd.class);
                startActivity(intentEditParcel);
            }
        });

        //intent to parcel report
        parcelReportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParcelReport = new Intent(ParcelManagementMain.this, ParcelView.class);
                startActivity(intentParcelReport);
            }
        });

    }

    /**public void fnInsertParcel (View view){

        Intent intent = new Intent(ParcelManagementMain.this, InsertParcelDetails.class);
        startActivity(intent);
    }**/
}