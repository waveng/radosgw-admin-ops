package org.wangb.radosgw.model.resp.user;

import org.wangb.radosgw.enums.CapsType.Perm;
import org.wangb.radosgw.enums.CapsType.Type;

/**
 * Administrative capabilities
 *
 */
public class Cap {
  private final Type type;

  private final Perm perm;

  public Cap(Type type, Perm perm) {
    this.type = type;
    this.perm = perm;
  }

  public Type getType() {
    return type;
  }

  public Perm getPerm() {
    return perm;
  }

  /**
   * Format as the request parameter
   *
   * @return foo=bar
   */
  @Override
  public String toString() {
    return type + "=" + perm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cap cap = (Cap) o;

    return type == cap.type && perm == cap.perm;
  }

  @Override
  public int hashCode() {
    int result = type != null ? type.hashCode() : 0;
    result = 31 * result + (perm != null ? perm.hashCode() : 0);
    return result;
  }
}
