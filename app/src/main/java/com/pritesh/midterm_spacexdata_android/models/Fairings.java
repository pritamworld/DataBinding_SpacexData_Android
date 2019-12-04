
package com.pritesh.midterm_spacexdata_android.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Fairings implements Parcelable
{

    @SerializedName("reused")
    @Expose
    private Boolean reused;
    @SerializedName("recovery_attempt")
    @Expose
    private Boolean recoveryAttempt;
    @SerializedName("recovered")
    @Expose
    private Boolean recovered;
    @SerializedName("ship")
    @Expose
    private Object ship;
    public final static Creator<Fairings> CREATOR = new Creator<Fairings>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Fairings createFromParcel(Parcel in) {
            return new Fairings(in);
        }

        public Fairings[] newArray(int size) {
            return (new Fairings[size]);
        }

    }
    ;

    protected Fairings(Parcel in) {
        this.reused = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.recoveryAttempt = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.recovered = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.ship = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Fairings() {
    }

    public Boolean getReused() {
        return reused;
    }

    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    public Boolean getRecovered() {
        return recovered;
    }

    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    public Object getShip() {
        return ship;
    }

    public void setShip(Object ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("reused", reused).append("recoveryAttempt", recoveryAttempt).append("recovered", recovered).append("ship", ship).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(reused);
        dest.writeValue(recoveryAttempt);
        dest.writeValue(recovered);
        dest.writeValue(ship);
    }

    public int describeContents() {
        return  0;
    }

}
