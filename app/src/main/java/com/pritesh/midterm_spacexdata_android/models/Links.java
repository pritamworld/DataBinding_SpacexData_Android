
package com.pritesh.midterm_spacexdata_android.models;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import androidx.databinding.BindingAdapter;

public class Links implements Parcelable
{

    @SerializedName("mission_patch")
    @Expose
    private String missionPatch;
    @SerializedName("mission_patch_small")
    @Expose
    private String missionPatchSmall;
    @SerializedName("reddit_campaign")
    @Expose
    private String redditCampaign;
    @SerializedName("reddit_launch")
    @Expose
    private String redditLaunch;
    @SerializedName("reddit_recovery")
    @Expose
    private Object redditRecovery;
    @SerializedName("reddit_media")
    @Expose
    private String redditMedia;
    @SerializedName("presskit")
    @Expose
    private String presskit;
    @SerializedName("article_link")
    @Expose
    private String articleLink;
    @SerializedName("wikipedia")
    @Expose
    private String wikipedia;
    @SerializedName("video_link")
    @Expose
    private String videoLink;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("flickr_images")
    @Expose
    private List<String> flickrImages = new ArrayList<>();
    public final static Creator<Links> CREATOR = new Creator<Links>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links createFromParcel(Parcel in) {
            return new Links(in);
        }

        public Links[] newArray(int size) {
            return (new Links[size]);
        }

    }
    ;

    protected Links(Parcel in) {
        this.missionPatch = ((String) in.readValue((String.class.getClassLoader())));
        this.missionPatchSmall = ((String) in.readValue((String.class.getClassLoader())));
        this.redditCampaign = ((String) in.readValue((String.class.getClassLoader())));
        this.redditLaunch = ((String) in.readValue((String.class.getClassLoader())));
        this.redditRecovery = ((Object) in.readValue((Object.class.getClassLoader())));
        this.redditMedia = ((String) in.readValue((String.class.getClassLoader())));
        this.presskit = ((String) in.readValue((String.class.getClassLoader())));
        this.articleLink = ((String) in.readValue((String.class.getClassLoader())));
        this.wikipedia = ((String) in.readValue((String.class.getClassLoader())));
        this.videoLink = ((String) in.readValue((String.class.getClassLoader())));
        this.youtubeId = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.flickrImages, (String.class.getClassLoader()));
    }

    public Links() {
    }

    public String getMissionPatch() {
        return missionPatch;
    }

    public void setMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
    }

    public String getMissionPatchSmall() {
        return missionPatchSmall;
    }

    public void setMissionPatchSmall(String missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }

    public String getRedditCampaign() {
        return redditCampaign;
    }

    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    public String getRedditLaunch() {
        return redditLaunch;
    }

    public void setRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    public Object getRedditRecovery() {
        return redditRecovery;
    }

    public void setRedditRecovery(Object redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    public String getRedditMedia() {
        return redditMedia;
    }

    public void setRedditMedia(String redditMedia) {
        this.redditMedia = redditMedia;
    }

    public String getPresskit() {
        return presskit;
    }

    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public String getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("missionPatch", missionPatch).append("missionPatchSmall", missionPatchSmall).append("redditCampaign", redditCampaign).append("redditLaunch", redditLaunch).append("redditRecovery", redditRecovery).append("redditMedia", redditMedia).append("presskit", presskit).append("articleLink", articleLink).append("wikipedia", wikipedia).append("videoLink", videoLink).append("youtubeId", youtubeId).append("flickrImages", flickrImages).toString();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(missionPatch);
        dest.writeValue(missionPatchSmall);
        dest.writeValue(redditCampaign);
        dest.writeValue(redditLaunch);
        dest.writeValue(redditRecovery);
        dest.writeValue(redditMedia);
        dest.writeValue(presskit);
        dest.writeValue(articleLink);
        dest.writeValue(wikipedia);
        dest.writeValue(videoLink);
        dest.writeValue(youtubeId);
        dest.writeList(flickrImages);
    }

    public int describeContents() {
        return  0;
    }

    @BindingAdapter("launchesImage")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                //.load(imageUrl).apply(new RequestOptions().circleCrop())
                .load(imageUrl)
                .into(view);
    }

}
