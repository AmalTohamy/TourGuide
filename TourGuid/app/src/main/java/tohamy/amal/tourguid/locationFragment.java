package tohamy.amal.tourguid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class locationFragment extends Fragment {

    public locationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_location, container, false);
        TextView address = view.findViewById(R.id.address_text_view);

        if (placeInfo.placeName.equals(getString(R.string.pyramids_of_giza))) {
            address.setText(R.string.pyramids_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.the_egyptian_museum))) {
            address.setText(R.string.the_egyptian_museum_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.al_azhar))) {
            address.setText(R.string.azhar_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.khan_el_khalili))) {
            address.setText(R.string.khan_el_khalili_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.mohamed_ali_mosque))) {
            address.setText(R.string.mohamed_ali_mosque_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.museum_of_islamic_art))) {
            address.setText(R.string.museum_of_islamic_art_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.manial_palace))) {
            address.setText(R.string.manial_palace_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.cairo_tower))) {
            address.setText(R.string.cairo_tower_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.the_qalawun_complex))) {
            address.setText(R.string.the_qalawun_complex_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.baron_palace))) {
            address.setText(R.string.baron_palace_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.koshary_abou_tarek))) {
            address.setText(R.string.koshary_abou_tarel_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.gad))) {
            address.setText(R.string.gad_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.sobhy_kaber))) {
            address.setText(R.string.sobhy_kaber_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.farahat))) {
            address.setText(R.string.farahat_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.felfela))) {
            address.setText(R.string.felfela_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.el_shabrawy))) {
            address.setText(R.string.el_shabrawy_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.kebdet_el_prince))) {
            address.setText(R.string.kebdet_el_prince_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.om_hasssan))) {
            address.setText(R.string.om_hassan_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.el_feshawy))) {
            address.setText(R.string.el_feshawy_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.groppi))) {
            address.setText(R.string.groppi_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.naguib_mahfouz_cafe))) {
            address.setText(R.string.naguib_mahfouz_cafe_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.left_bank))) {
            address.setText(R.string.left_bank_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.cake_cafe))) {
            address.setText(R.string.cake_cafe_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.kafein_cafe))) {
            address.setText(R.string.kafein_cafe_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.mena_house))) {
            address.setText(R.string.mena_house_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.the_nile_ritz))) {
            address.setText(R.string.the_nile_ritz_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.hilton))) {
            address.setText(R.string.hilton_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.conrad))) {
            address.setText(R.string.conrad_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.four_seasons))) {
            address.setText(R.string.four_seasons_address);
        }
        if (placeInfo.placeName.equals(getString(R.string.sofitel_hotel))) {
            address.setText(R.string.sofitel_hotel_address);
        }
        return view;

    }

}
