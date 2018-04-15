package tohamy.amal.tourguid;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_fragment, container, false);

        //Changing action bar title
        getActivity().setTitle(R.string.attraction);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.pyramids_of_giza), R.drawable.attractions));
        places.add(new Place(getString(R.string.the_egyptian_museum), R.drawable.the_egyptian_museum));
        places.add(new Place(getString(R.string.al_azhar), R.drawable.al_azhar));
        places.add(new Place(getString(R.string.khan_el_khalili), R.drawable.khan_el_khalili));
        places.add(new Place(getString(R.string.mohamed_ali_mosque), R.drawable.mohamed_ali_citadel));
        places.add(new Place(getString(R.string.museum_of_islamic_art), R.drawable.museum_of_islamic_art));
        places.add(new Place(getString(R.string.manial_palace), R.drawable.manial_palace_and_museum));
        places.add(new Place(getString(R.string.cairo_tower), R.drawable.cairo_tower));
        places.add(new Place(getString(R.string.the_qalawun_complex), R.drawable.the_qalawun_complex));
        places.add(new Place(getString(R.string.baron_palace), R.drawable.baron_palace));

        CustomAdapter adapter = new CustomAdapter(getActivity(), places);

        GridView gridView = view.findViewById(R.id.gridview);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity().getBaseContext(),
                        placeInfo.class);
                intent.putExtra("placeImage", places.get(position).getmImageResourceId());
                intent.putExtra("placeName", places.get(position).getmDefaultPlace());
                getActivity().startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}


