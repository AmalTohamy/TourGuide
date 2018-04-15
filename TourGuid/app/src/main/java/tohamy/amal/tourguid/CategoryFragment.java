package tohamy.amal.tourguid;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_fragment, container, false);

        ImageView attractionsImageView = view.findViewById(R.id.attractions_image_view);
        attractionsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AttractionsFragment nextFrag = new AttractionsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView restaurantsImageView = view.findViewById(R.id.restaurants_image_view);
        restaurantsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RestaurantsFragment nextFrag = new RestaurantsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });


        ImageView coffeeShopsImageView = view.findViewById(R.id.tea_image_view);
        coffeeShopsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CoffeeShopsFragment nextFeag = new CoffeeShopsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFeag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        ImageView hotelsImageView = view.findViewById(R.id.hotel_image_view);
        hotelsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HotelsFragment nextFrag = new HotelsFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, nextFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
