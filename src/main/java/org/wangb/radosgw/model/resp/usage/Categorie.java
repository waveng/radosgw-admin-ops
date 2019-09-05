package org.wangb.radosgw.model.resp.usage;

public class Categorie {
    /**
     * Name of request category for which the stats are provided.
     */
  private String category;
  /**
   * Number of bytes sent by the RADOS Gateway.
   */
  private long bytes_sent;
  /**
   * Number of bytes received by the RADOS Gateway.
   */
  private long bytes_received;
  /**
   * Number of operations.
   */
  private long ops;
  /**
   * Number of successful operations.
   */
  private long successful_ops;

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public long getBytes_sent() {
    return bytes_sent;
  }

  public void setBytes_sent(long bytes_sent) {
    this.bytes_sent = bytes_sent;
  }

  public long getBytes_received() {
    return bytes_received;
  }

  public void setBytes_received(long bytes_received) {
    this.bytes_received = bytes_received;
  }

  public long getOps() {
    return ops;
  }

  public void setOps(long ops) {
    this.ops = ops;
  }

  public long getSuccessful_ops() {
    return successful_ops;
  }

  public void setSuccessful_ops(long successful_ops) {
    this.successful_ops = successful_ops;
  }
}
