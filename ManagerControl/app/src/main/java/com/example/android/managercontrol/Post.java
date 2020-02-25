package com.example.android.managercontrol;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


//public class Result {
//
//    @SerializedName("result")
//    private List<Workers> result = null;
//
//    public List<Workers> getResult() {
//        return result;
//    }
//
//    public void setResult(List<Workers> result) {
//        this.result = result;
//    }
//
//}

public class Post {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("resultCode")
    @Expose
    private Integer resultCode;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

}

