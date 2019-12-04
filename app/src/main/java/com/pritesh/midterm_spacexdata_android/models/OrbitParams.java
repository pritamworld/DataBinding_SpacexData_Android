
package com.pritesh.midterm_spacexdata_android.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrbitParams implements Parcelable
{

    @SerializedName("reference_system")
    @Expose
    private String referenceSystem;
    @SerializedName("regime")
    @Expose
    private String regime;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("semi_major_axis_km")
    @Expose
    private Double semiMajorAxisKm;
    @SerializedName("eccentricity")
    @Expose
    private Double eccentricity;
    @SerializedName("periapsis_km")
    @Expose
    private Double periapsisKm;
    @SerializedName("apoapsis_km")
    @Expose
    private Double apoapsisKm;
    @SerializedName("inclination_deg")
    @Expose
    private Double inclinationDeg;
    @SerializedName("period_min")
    @Expose
    private Double periodMin;
    @SerializedName("lifespan_years")
    @Expose
    private Double lifespanYears;
    @SerializedName("epoch")
    @Expose
    private String epoch;
    @SerializedName("mean_motion")
    @Expose
    private Double meanMotion;
    @SerializedName("raan")
    @Expose
    private Double raan;
    @SerializedName("arg_of_pericenter")
    @Expose
    private Double argOfPericenter;
    @SerializedName("mean_anomaly")
    @Expose
    private Double meanAnomaly;
    public final static Creator<OrbitParams> CREATOR = new Creator<OrbitParams>() {


        @SuppressWarnings({
            "unchecked"
        })
        public OrbitParams createFromParcel(Parcel in) {
            return new OrbitParams(in);
        }

        public OrbitParams[] newArray(int size) {
            return (new OrbitParams[size]);
        }

    }
    ;

    protected OrbitParams(Parcel in) {
        this.referenceSystem = ((String) in.readValue((String.class.getClassLoader())));
        this.regime = ((String) in.readValue((String.class.getClassLoader())));
        this.longitude = ((Double) in.readValue((Integer.class.getClassLoader())));
        this.semiMajorAxisKm = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eccentricity = ((Double) in.readValue((Double.class.getClassLoader())));
        this.periapsisKm = ((Double) in.readValue((Double.class.getClassLoader())));
        this.apoapsisKm = ((Double) in.readValue((Double.class.getClassLoader())));
        this.inclinationDeg = ((Double) in.readValue((Double.class.getClassLoader())));
        this.periodMin = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lifespanYears = ((Double) in.readValue((Integer.class.getClassLoader())));
        this.epoch = ((String) in.readValue((String.class.getClassLoader())));
        this.meanMotion = ((Double) in.readValue((Double.class.getClassLoader())));
        this.raan = ((Double) in.readValue((Double.class.getClassLoader())));
        this.argOfPericenter = ((Double) in.readValue((Double.class.getClassLoader())));
        this.meanAnomaly = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    public OrbitParams() {
    }

    public String getReferenceSystem() {
        return referenceSystem;
    }

    public void setReferenceSystem(String referenceSystem) {
        this.referenceSystem = referenceSystem;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getSemiMajorAxisKm() {
        return semiMajorAxisKm;
    }

    public void setSemiMajorAxisKm(Double semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
    }

    public Double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public Double getPeriapsisKm() {
        return periapsisKm;
    }

    public void setPeriapsisKm(Double periapsisKm) {
        this.periapsisKm = periapsisKm;
    }

    public Double getApoapsisKm() {
        return apoapsisKm;
    }

    public void setApoapsisKm(Double apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
    }

    public Double getInclinationDeg() {
        return inclinationDeg;
    }

    public void setInclinationDeg(Double inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    public Double getPeriodMin() {
        return periodMin;
    }

    public void setPeriodMin(Double periodMin) {
        this.periodMin = periodMin;
    }

    public Double getLifespanYears() {
        return lifespanYears;
    }

    public void setLifespanYears(Double lifespanYears) {
        this.lifespanYears = lifespanYears;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public Double getMeanMotion() {
        return meanMotion;
    }

    public void setMeanMotion(Double meanMotion) {
        this.meanMotion = meanMotion;
    }

    public Double getRaan() {
        return raan;
    }

    public void setRaan(Double raan) {
        this.raan = raan;
    }

    public Double getArgOfPericenter() {
        return argOfPericenter;
    }

    public void setArgOfPericenter(Double argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
    }

    public Double getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setMeanAnomaly(Double meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("referenceSystem", referenceSystem).append("regime", regime).append("longitude", longitude).append("semiMajorAxisKm", semiMajorAxisKm).append("eccentricity", eccentricity).append("periapsisKm", periapsisKm).append("apoapsisKm", apoapsisKm).append("inclinationDeg", inclinationDeg).append("periodMin", periodMin).append("lifespanYears", lifespanYears).append("epoch", epoch).append("meanMotion", meanMotion).append("raan", raan).append("argOfPericenter", argOfPericenter).append("meanAnomaly", meanAnomaly).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(referenceSystem);
        dest.writeValue(regime);
        dest.writeValue(longitude);
        dest.writeValue(semiMajorAxisKm);
        dest.writeValue(eccentricity);
        dest.writeValue(periapsisKm);
        dest.writeValue(apoapsisKm);
        dest.writeValue(inclinationDeg);
        dest.writeValue(periodMin);
        dest.writeValue(lifespanYears);
        dest.writeValue(epoch);
        dest.writeValue(meanMotion);
        dest.writeValue(raan);
        dest.writeValue(argOfPericenter);
        dest.writeValue(meanAnomaly);
    }

    public int describeContents() {
        return  0;
    }

}
