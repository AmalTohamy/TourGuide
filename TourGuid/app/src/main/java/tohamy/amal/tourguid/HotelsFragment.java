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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_fragment, container, false);

        //Changing action bar title
        getActivity().setTitle(R.string.hotels);

        final ArrayList<Place> hotles = new ArrayList<>();
        hotles.add(new Place(getString(R.string.mena_house), R.drawable.hotel));
        hotles.add(new Place(getString(R.string.the_nile_ritz), R.drawable.nile_ritz));
        hotles.add(new Place(getString(R.string.hilton), R.drawable.hilton));
        hotles.add(new Place(getString(R.string.conrad), R.drawable.conrad));
        hotles.add(new Place(getString(R.string.four_seasons), R.drawable.four_seasons));
        hotles.add(new Place(getString(R.string.sofitel_hotel), R.drawable.sofitel_hotel));

        CustomAdapter adapter = new CustomAdapter(getActivity(), hotles);

        GridView gridView = view.findViewById(R.id.gridview);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity().getBaseContext(),
                        placeInfo.class);
                intent.putExtra("placeImage", hotles.get(position).getmImageResourceId());
                intent.putExtra("placeName", hotles.get(position).getmDefaultPlace());
                getActivity().startActivity(intent);
            }
        });
        return view;
    }

}
