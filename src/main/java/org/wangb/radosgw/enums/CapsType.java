package org.wangb.radosgw.enums;

import com.google.gson.annotations.SerializedName;

public interface CapsType {
    
    public enum Type {
        @SerializedName("users")
        USERS,

        @SerializedName("buckets")
        BUCKETS,

        @SerializedName("metadata")
        METADATA,

        @SerializedName("usage")
        USAGE,

        @SerializedName("zone")
        ZONE;

        @Override
        public String toString() {
          return super.toString().toLowerCase();
        }
      }

      public enum Perm {
        @SerializedName("read")
        READ,

        @SerializedName("write")
        WRITE,

        @SerializedName(
          value = "*",
          alternate = {"read, write", "read,write", "write, read", "write,read"}
        )
        READ_WRITE;

        @Override
        public String toString() {
          if (this.equals(Perm.READ_WRITE)) {
            return "read, write";
          } else {
            return super.toString().toLowerCase();
          }
        }
      }
}
