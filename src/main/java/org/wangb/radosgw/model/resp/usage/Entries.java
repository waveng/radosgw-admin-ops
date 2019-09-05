package org.wangb.radosgw.model.resp.usage;

import java.util.List;

public class Entries {

  private String user;

  private List<BucketUsage> buckets;

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public List<BucketUsage> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<BucketUsage> buckets) {
    this.buckets = buckets;
  }
}
