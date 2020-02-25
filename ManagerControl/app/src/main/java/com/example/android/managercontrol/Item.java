package com.example.android.managercontrol;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.sql.Array;

public class Item {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("slide_num")
    @Expose
    private String slideNum;
    @SerializedName("delay")
    @Expose
    private String delay;
    @SerializedName("isactive")
    @Expose
    private String isactive;
    @SerializedName("slide_content")
    @Expose
    private String slideContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlideNum() {
        return slideNum;
    }

    public void setSlideNum(String slideNum) {
        this.slideNum = slideNum;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getSlideContent() {
        return slideContent;
    }

    public void setSlideContent(String slideContent) {
        this.slideContent = slideContent;
    }

}