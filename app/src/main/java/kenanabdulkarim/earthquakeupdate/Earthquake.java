package kenanabdulkarim.earthquakeupdate;

/**
 * Created by kenanabdulkarim on 2017-02-16.
 */
// This class holds all the earthquake info
// that's displayed in each list item
public class Earthquake {
    private String mMagnitude;
    private String mCityLocation;
    private String mDate;

    public Earthquake(String magnitude, String cityLocation, String date) {
        this.mMagnitude = magnitude;
        this.mCityLocation = cityLocation;
        this.mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getCityLocation() {
        return mCityLocation;
    }

    public String getDate() {
        return mDate;
    }
}

