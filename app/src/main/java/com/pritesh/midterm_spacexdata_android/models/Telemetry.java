
package com.pritesh.midterm_spacexdata_android.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Telemetry implements Parcelable
{

    @SerializedName("flight_club")
    @Expose
    private String flightClub;
    public final static Creator<Telemetry> CREATOR = new Creator<Telemetry>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Telemetry createFromParcel(Parcel in) {
            return new Telemetry(in);
        }

        public Telemetry[] newArray(int size) {
            return (new Telemetry[size]);
        }

    }
    ;

    protected Telemetry(Parcel in) {
        this.flightClub = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Telemetry() {
    }

    public String getFlightClub() {
        return flightClub;
    }

    public void setFlightClub(String flightClub) {
        this.flightClub = flightClub;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flightClub", flightClub).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(flightClub);
    }

    public int describeContents() {
        return  0;
    }

}
