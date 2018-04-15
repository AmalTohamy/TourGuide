package tohamy.amal.tourguid;

public class Place {
    private String mDefaultPlace;
    private int mImageResourceId;

    public Place(String mDefaultPlace, int mImageResourceId) {
        this.mDefaultPlace = mDefaultPlace;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDefaultPlace() {
        return mDefaultPlace;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
