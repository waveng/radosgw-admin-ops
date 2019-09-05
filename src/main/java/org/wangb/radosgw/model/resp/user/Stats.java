package org.wangb.radosgw.model.resp.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Stats {
    @SerializedName("num_objects")
    @Expose
    private String numObjects;
    
    @SerializedName("size_kb")
    @Expose
    private String sizeKb;
    
    @SerializedName("size_kb_actual")
    @Expose
    private String sizeKbActual;
    
    @SerializedName("size_kb_utilized")
    @Expose
    private String  sizeKbUtilized;
    
    
    @SerializedName("size")
    @Expose
    private String size;
    
    @SerializedName("size_actual")
    @Expose
    private String sizeActual;
    
    @SerializedName("size_utilized")
    @Expose
    private String  sizeUtilized;


}
