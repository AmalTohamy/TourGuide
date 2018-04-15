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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_fragment, container, false);

        //Changing action bar title
        getActivity().setTitle(R.string.restaurants);

        final ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place(getString(R.string.koshary_abou_tarek), R.drawable.koshary_abou_tarek));
        restaurants.add(new Place(getString(R.string.gad), R.drawable.gad));
        restaurants.add(new Place(getString(R.string.sobhy_kaber), R.drawable.sobhy_kaber));
        restaurants.add(new Place(getString(R.string.farahat), R.drawable.farahat));
        restaurants.add(new Place(getString(R.string.felfela), R.drawable.felfela));
        restaurants.add(new Place(getString(R.string.el_shabrawy), R.drawable.el_shabrawy));
        restaurants.add(new Place(getString(R.string.kebdet_el_prince), R.drawable.kebdet_elprince));
        restaurants.add(new Place(getString(R.string.om_hasssan), R.drawable.om_hassan));

        CustomAdapter adapter = new CustomAdapter(getActivity(), restaurants);

        GridView gridView = view.findViewById(R.id.gridview);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity().getBaseContext(),
                        placeInfo.class);
                intent.putExtra("placeImage", restaurants.get(position).getmImageResourceId());
                intent.putExtra("placeName", restaurants.get(position).getmDefaultPlace());
                getActivity().startActivity(intent);
            }
        });

        return view;
    }

}
