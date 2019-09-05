package org.wangb.radosgw.enums;

/**
 * Represents credential type.
 *
 */
public enum CredentialType {
  S3,
  SWIFT;

  @Override
  public String toString() {
    return super.toString().toLowerCase();
  }
}
