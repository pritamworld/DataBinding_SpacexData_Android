
package com.pritesh.midterm_spacexdata_android.models;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Launches implements Parcelable
{

    @SerializedName("flight_number")
    @Expose
    private Integer flightNumber;
    @SerializedName("mission_name")
    @Expose
    private String missionName;
    @SerializedName("mission_id")
    @Expose
    private List<String> missionId = new ArrayList<>();
    @SerializedName("launch_year")
    @Expose
    private String launchYear;
    @SerializedName("launch_date_unix")
    @Expose
    private Integer launchDateUnix;
    @SerializedName("launch_date_utc")
    @Expose
    private String launchDateUtc;
    @SerializedName("launch_date_local")
    @Expose
    private String launchDateLocal;
    @SerializedName("is_tentative")
    @Expose
    private Boolean isTentative;
    @SerializedName("tentative_max_precision")
    @Expose
    private String tentativeMaxPrecision;
    @SerializedName("tbd")
    @Expose
    private Boolean tbd;
    @SerializedName("launch_window")
    @Expose
    private Integer launchWindow;
    @SerializedName("rocket")
    @Expose
    private Rocket rocket;
    @SerializedName("ships")
    @Expose
    private List<String> ships = new ArrayList<>();
    @SerializedName("telemetry")
    @Expose
    private Telemetry telemetry;
    @SerializedName("launch_site")
    @Expose
    private LaunchSite launchSite;
    @SerializedName("launch_success")
    @Expose
    private Boolean launchSuccess;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("upcoming")
    @Expose
    private Boolean upcoming;
    @SerializedName("static_fire_date_utc")
    @Expose
    private String staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    @Expose
    private Integer staticFireDateUnix;
    @SerializedName("timeline")
    @Expose
    private Timeline timeline;
    public final static Creator<Launches> CREATOR = new Creator<Launches>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Launches createFromParcel(Parcel in) {
            return new Launches(in);
        }

        public Launches[] newArray(int size) {
            return (new Launches[size]);
        }

    }
    ;

    protected Launches(Parcel in) {
        this.flightNumber = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.missionName = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.missionId, (String.class.getClassLoader()));
        this.launchYear = ((String) in.readValue((String.class.getClassLoader())));
        this.launchDateUnix = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.launchDateUtc = ((String) in.readValue((String.class.getClassLoader())));
        this.launchDateLocal = ((String) in.readValue((String.class.getClassLoader())));
        this.isTentative = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.tentativeMaxPrecision = ((String) in.readValue((String.class.getClassLoader())));
        this.tbd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.launchWindow = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rocket = ((Rocket) in.readValue((Rocket.class.getClassLoader())));
        in.readList(this.ships, (String.class.getClassLoader()));
        this.telemetry = ((Telemetry) in.readValue((Telemetry.class.getClassLoader())));
        this.launchSite = ((LaunchSite) in.readValue((LaunchSite.class.getClassLoader())));
        this.launchSuccess = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
        this.details = ((String) in.readValue((String.class.getClassLoader())));
        this.upcoming = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.staticFireDateUtc = ((String) in.readValue((String.class.getClassLoader())));
        this.staticFireDateUnix = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.timeline = ((Timeline) in.readValue((Timeline.class.getClassLoader())));
    }

    public Launches() {
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public List<String> getMissionId() {
        return missionId;
    }

    public void setMissionId(List<String> missionId) {
        this.missionId = missionId;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public Integer getLaunchDateUnix() {
        return launchDateUnix;
    }

    public void setLaunchDateUnix(Integer launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    public Boolean getIsTentative() {
        return isTentative;
    }

    public void setIsTentative(Boolean isTentative) {
        this.isTentative = isTentative;
    }

    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }

    public Boolean getTbd() {
        return tbd;
    }

    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    public Integer getLaunchWindow() {
        return launchWindow;
    }

    public void setLaunchWindow(Integer launchWindow) {
        this.launchWindow = launchWindow;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    public Boolean getLaunchSuccess() {
        return launchSuccess;
    }

    public void setLaunchSuccess(Boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public Integer getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    public void setStaticFireDateUnix(Integer staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flightNumber", flightNumber).append("missionName", missionName).append("missionId", missionId).append("launchYear", launchYear).append("launchDateUnix", launchDateUnix).append("launchDateUtc", launchDateUtc).append("launchDateLocal", launchDateLocal).append("isTentative", isTentative).append("tentativeMaxPrecision", tentativeMaxPrecision).append("tbd", tbd).append("launchWindow", launchWindow).append("rocket", rocket).append("ships", ships).append("telemetry", telemetry).append("launchSite", launchSite).append("launchSuccess", launchSuccess).append("links", links).append("details", details).append("upcoming", upcoming).append("staticFireDateUtc", staticFireDateUtc).append("staticFireDateUnix", staticFireDateUnix).append("timeline", timeline).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(flightNumber);
        dest.writeValue(missionName);
        dest.writeList(missionId);
        dest.writeValue(launchYear);
        dest.writeValue(launchDateUnix);
        dest.writeValue(launchDateUtc);
        dest.writeValue(launchDateLocal);
        dest.writeValue(isTentative);
        dest.writeValue(tentativeMaxPrecision);
        dest.writeValue(tbd);
        dest.writeValue(launchWindow);
        dest.writeValue(rocket);
        dest.writeList(ships);
        dest.writeValue(telemetry);
        dest.writeValue(launchSite);
        dest.writeValue(launchSuccess);
        dest.writeValue(links);
        dest.writeValue(details);
        dest.writeValue(upcoming);
        dest.writeValue(staticFireDateUtc);
        dest.writeValue(staticFireDateUnix);
        dest.writeValue(timeline);
    }

    public int describeContents() {
        return  0;
    }

}
