
package com.pritesh.midterm_spacexdata_android.models;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SecondStage implements Parcelable
{

    @SerializedName("block")
    @Expose
    private Integer block;
    @SerializedName("payloads")
    @Expose
    private List<Payload> payloads = new ArrayList<>();
    public final static Creator<SecondStage> CREATOR = new Creator<SecondStage>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SecondStage createFromParcel(Parcel in) {
            return new SecondStage(in);
        }

        public SecondStage[] newArray(int size) {
            return (new SecondStage[size]);
        }

    }
    ;

    protected SecondStage(Parcel in) {
        this.block = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.payloads, (Payload.class.getClassLoader()));
    }

    public SecondStage() {
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public List<Payload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("block", block).append("payloads", payloads).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(block);
        dest.writeList(payloads);
    }

    public int describeContents() {
        return  0;
    }

}
