package org.wangb.radosgw.model.resp.usage;

import java.util.List;

public class BucketUsage {

    /**
     * The bucket name.
     */
    private String      bucket;
    /**
     * Time lower bound for which data is being specified (rounded to the
     * beginning of the first relevant hour).
     */
    private String      time;
    /**
     * The time specified in seconds since 1/1/1970
     */
    private long        epoch;
    /**
     * The name of the user that owns the buckets.
     */
    private String      owner;
    /**
     * A container for stats categories.
     */
    private List<Categorie> categories;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getEpoch() {
        return epoch;
    }

    public void setEpoch(long epoch) {
        this.epoch = epoch;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }
}
