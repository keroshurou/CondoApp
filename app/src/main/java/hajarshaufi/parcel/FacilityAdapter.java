package hajarshaufi.parcel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;



public class FacilityAdapter extends ArrayAdapter<Facility> {
    Context context;
    List<Facility> arrayFacilityList;

    public FacilityAdapter(@NonNull Context context, List<Facility>facilityList) {
        super(context, R.layout.facility_item, facilityList);

        this.context = context;
        this.arrayFacilityList = facilityList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.facility_item,
                null, true);

        TextView tvID = view.findViewById(R.id.txt_id);
        TextView tvName = view.findViewById(R.id.txt_name);

        tvID.setText(arrayFacilityList.get(position).getFacilityID());
        tvName.setText(arrayFacilityList.get(position).getFacilityName());

        return view;
    }
}
