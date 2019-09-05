package org.wangb.radosgw.enums;

import com.google.gson.annotations.SerializedName;

/** Access permission for sub-user. */
public enum Permission {
    @SerializedName("<none>")
    NONE,

    @SerializedName("read")
    READ,

    @SerializedName("write")
    WRITE,

    @SerializedName(
            value = "*",
            alternate = {"readwrite", "read, write", "read,write", "write, read", "write,read", "read-write"}
          )
    READ_WRITE,

    @SerializedName(value = "full", alternate = { "full-control" })
    FULL;

    @Override
    public String toString() {
        if (this.equals(NONE)) {
            return "";
        }else if (this.equals(READ_WRITE)) {
            return "readwrite";
        } else {
            return super.toString().toLowerCase();
        }
    }
    public static Permission select(String key){
        switch (key) {
            case "READ":
                return Permission.READ;
            case "WRITE":
                return Permission.WRITE;
            case "READ_WRITE":
                return Permission.READ_WRITE;
            case "FULL_CONTROL":
                return Permission.FULL;
            default:
                return Permission.READ;
        }
    }
}
