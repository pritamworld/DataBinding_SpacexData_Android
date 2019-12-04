
package com.pritesh.midterm_spacexdata_android.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Timeline implements Parcelable
{

    @SerializedName("webcast_liftoff")
    @Expose
    private Integer webcastLiftoff;
    @SerializedName("go_for_prop_loading")
    @Expose
    private Integer goForPropLoading;
    @SerializedName("rp1_loading")
    @Expose
    private Integer rp1Loading;
    @SerializedName("stage1_lox_loading")
    @Expose
    private Integer stage1LoxLoading;
    @SerializedName("stage2_lox_loading")
    @Expose
    private Integer stage2LoxLoading;
    @SerializedName("engine_chill")
    @Expose
    private Integer engineChill;
    @SerializedName("prelaunch_checks")
    @Expose
    private Integer prelaunchChecks;
    @SerializedName("propellant_pressurization")
    @Expose
    private Integer propellantPressurization;
    @SerializedName("go_for_launch")
    @Expose
    private Integer goForLaunch;
    @SerializedName("ignition")
    @Expose
    private Integer ignition;
    @SerializedName("liftoff")
    @Expose
    private Integer liftoff;
    @SerializedName("maxq")
    @Expose
    private Integer maxq;
    @SerializedName("meco")
    @Expose
    private Integer meco;
    @SerializedName("stage_sep")
    @Expose
    private Integer stageSep;
    @SerializedName("second_stage_ignition")
    @Expose
    private Integer secondStageIgnition;
    @SerializedName("fairing_deploy")
    @Expose
    private Integer fairingDeploy;
    @SerializedName("first_stage_entry_burn")
    @Expose
    private Integer firstStageEntryBurn;
    @SerializedName("seco-1")
    @Expose
    private Integer seco1;
    @SerializedName("first_stage_landing")
    @Expose
    private Integer firstStageLanding;
    @SerializedName("second_stage_restart")
    @Expose
    private Integer secondStageRestart;
    @SerializedName("seco-2")
    @Expose
    private Integer seco2;
    @SerializedName("payload_deploy")
    @Expose
    private Integer payloadDeploy;
    public final static Creator<Timeline> CREATOR = new Creator<Timeline>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Timeline createFromParcel(Parcel in) {
            return new Timeline(in);
        }

        public Timeline[] newArray(int size) {
            return (new Timeline[size]);
        }

    }
    ;

    protected Timeline(Parcel in) {
        this.webcastLiftoff = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.goForPropLoading = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rp1Loading = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stage1LoxLoading = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stage2LoxLoading = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.engineChill = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.prelaunchChecks = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.propellantPressurization = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.goForLaunch = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.ignition = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.liftoff = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.maxq = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.meco = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stageSep = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.secondStageIgnition = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fairingDeploy = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.firstStageEntryBurn = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.seco1 = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.firstStageLanding = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.secondStageRestart = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.seco2 = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.payloadDeploy = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Timeline() {
    }

    public Integer getWebcastLiftoff() {
        return webcastLiftoff;
    }

    public void setWebcastLiftoff(Integer webcastLiftoff) {
        this.webcastLiftoff = webcastLiftoff;
    }

    public Integer getGoForPropLoading() {
        return goForPropLoading;
    }

    public void setGoForPropLoading(Integer goForPropLoading) {
        this.goForPropLoading = goForPropLoading;
    }

    public Integer getRp1Loading() {
        return rp1Loading;
    }

    public void setRp1Loading(Integer rp1Loading) {
        this.rp1Loading = rp1Loading;
    }

    public Integer getStage1LoxLoading() {
        return stage1LoxLoading;
    }

    public void setStage1LoxLoading(Integer stage1LoxLoading) {
        this.stage1LoxLoading = stage1LoxLoading;
    }

    public Integer getStage2LoxLoading() {
        return stage2LoxLoading;
    }

    public void setStage2LoxLoading(Integer stage2LoxLoading) {
        this.stage2LoxLoading = stage2LoxLoading;
    }

    public Integer getEngineChill() {
        return engineChill;
    }

    public void setEngineChill(Integer engineChill) {
        this.engineChill = engineChill;
    }

    public Integer getPrelaunchChecks() {
        return prelaunchChecks;
    }

    public void setPrelaunchChecks(Integer prelaunchChecks) {
        this.prelaunchChecks = prelaunchChecks;
    }

    public Integer getPropellantPressurization() {
        return propellantPressurization;
    }

    public void setPropellantPressurization(Integer propellantPressurization) {
        this.propellantPressurization = propellantPressurization;
    }

    public Integer getGoForLaunch() {
        return goForLaunch;
    }

    public void setGoForLaunch(Integer goForLaunch) {
        this.goForLaunch = goForLaunch;
    }

    public Integer getIgnition() {
        return ignition;
    }

    public void setIgnition(Integer ignition) {
        this.ignition = ignition;
    }

    public Integer getLiftoff() {
        return liftoff;
    }

    public void setLiftoff(Integer liftoff) {
        this.liftoff = liftoff;
    }

    public Integer getMaxq() {
        return maxq;
    }

    public void setMaxq(Integer maxq) {
        this.maxq = maxq;
    }

    public Integer getMeco() {
        return meco;
    }

    public void setMeco(Integer meco) {
        this.meco = meco;
    }

    public Integer getStageSep() {
        return stageSep;
    }

    public void setStageSep(Integer stageSep) {
        this.stageSep = stageSep;
    }

    public Integer getSecondStageIgnition() {
        return secondStageIgnition;
    }

    public void setSecondStageIgnition(Integer secondStageIgnition) {
        this.secondStageIgnition = secondStageIgnition;
    }

    public Integer getFairingDeploy() {
        return fairingDeploy;
    }

    public void setFairingDeploy(Integer fairingDeploy) {
        this.fairingDeploy = fairingDeploy;
    }

    public Integer getFirstStageEntryBurn() {
        return firstStageEntryBurn;
    }

    public void setFirstStageEntryBurn(Integer firstStageEntryBurn) {
        this.firstStageEntryBurn = firstStageEntryBurn;
    }

    public Integer getSeco1() {
        return seco1;
    }

    public void setSeco1(Integer seco1) {
        this.seco1 = seco1;
    }

    public Integer getFirstStageLanding() {
        return firstStageLanding;
    }

    public void setFirstStageLanding(Integer firstStageLanding) {
        this.firstStageLanding = firstStageLanding;
    }

    public Integer getSecondStageRestart() {
        return secondStageRestart;
    }

    public void setSecondStageRestart(Integer secondStageRestart) {
        this.secondStageRestart = secondStageRestart;
    }

    public Integer getSeco2() {
        return seco2;
    }

    public void setSeco2(Integer seco2) {
        this.seco2 = seco2;
    }

    public Integer getPayloadDeploy() {
        return payloadDeploy;
    }

    public void setPayloadDeploy(Integer payloadDeploy) {
        this.payloadDeploy = payloadDeploy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("webcastLiftoff", webcastLiftoff).append("goForPropLoading", goForPropLoading).append("rp1Loading", rp1Loading).append("stage1LoxLoading", stage1LoxLoading).append("stage2LoxLoading", stage2LoxLoading).append("engineChill", engineChill).append("prelaunchChecks", prelaunchChecks).append("propellantPressurization", propellantPressurization).append("goForLaunch", goForLaunch).append("ignition", ignition).append("liftoff", liftoff).append("maxq", maxq).append("meco", meco).append("stageSep", stageSep).append("secondStageIgnition", secondStageIgnition).append("fairingDeploy", fairingDeploy).append("firstStageEntryBurn", firstStageEntryBurn).append("seco1", seco1).append("firstStageLanding", firstStageLanding).append("secondStageRestart", secondStageRestart).append("seco2", seco2).append("payloadDeploy", payloadDeploy).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(webcastLiftoff);
        dest.writeValue(goForPropLoading);
        dest.writeValue(rp1Loading);
        dest.writeValue(stage1LoxLoading);
        dest.writeValue(stage2LoxLoading);
        dest.writeValue(engineChill);
        dest.writeValue(prelaunchChecks);
        dest.writeValue(propellantPressurization);
        dest.writeValue(goForLaunch);
        dest.writeValue(ignition);
        dest.writeValue(liftoff);
        dest.writeValue(maxq);
        dest.writeValue(meco);
        dest.writeValue(stageSep);
        dest.writeValue(secondStageIgnition);
        dest.writeValue(fairingDeploy);
        dest.writeValue(firstStageEntryBurn);
        dest.writeValue(seco1);
        dest.writeValue(firstStageLanding);
        dest.writeValue(secondStageRestart);
        dest.writeValue(seco2);
        dest.writeValue(payloadDeploy);
    }

    public int describeContents() {
        return  0;
    }

}
