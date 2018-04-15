package tohamy.amal.tourguid;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoffeeShopsFragment extends Fragment {


    public CoffeeShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_fragment, container, false);

        //Changing action bar title
        getActivity().setTitle(R.string.coffee_shops);

        final ArrayList<Place> coffeeShops = new ArrayList<>();
        coffeeShops.add(new Place(getString(R.string.el_feshawy), R.drawable.el_fishawy));
        coffeeShops.add(new Place(getString(R.string.groppi), R.drawable.groppi));
        coffeeShops.add(new Place(getString(R.string.naguib_mahfouz_cafe), R.drawable.naguib_mahfouz_cafe));
        coffeeShops.add(new Place(getString(R.string.left_bank), R.drawable.left_bank));
        coffeeShops.add(new Place(getString(R.string.cake_cafe), R.drawable.cake_cafe));
        coffeeShops.add(new Place(getString(R.string.kafein_cafe), R.drawable.kafein_cafe));

        CustomAdapter adapter = new CustomAdapter(getActivity(), coffeeShops);

        GridView gridView = view.findViewById(R.id.gridview);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity().getBaseContext(),
                        placeInfo.class);
                intent.putExtra("placeImage", coffeeShops.get(position).getmImageResourceId());
                intent.putExtra("placeName", coffeeShops.get(position).getmDefaultPlace());
                getActivity().startActivity(intent);
            }
        });

        return view;
    }

}
