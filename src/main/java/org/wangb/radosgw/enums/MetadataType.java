package org.wangb.radosgw.enums;

public enum MetadataType {
    USER("user"),
    BUCKET("bucket"),
    BUCKET_INSTANCE("bucket.instance");

    String s;

    MetadataType(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}