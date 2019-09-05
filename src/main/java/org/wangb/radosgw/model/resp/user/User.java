package org.wangb.radosgw.model.resp.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

import java.util.List;

/**
 * Represents the user information. eg:
 * 
 * <pre>
 * {
        "tenant": "",
        "user_id": "aggregation-dev",
        "display_name": "aggregation dev",
        "email": "",
        "suspended": 0,
        "max_buckets": 10,
        "subusers": [
            {
                "id": "aggregation-dev:sub1",
                "permissions": "full-control"
            }
        ],
        "keys": [
            {
                "user": "aggregation-dev",
                "access_key": "895DWHUK9H97VWNPT8QP",
                "secret_key": "CY8HsE2YsP8B3W02qPm5g1GAvI1ekBhrZ1g6h0c7"
            },
            {
                "user": "aggregation-dev:sub1",
                "access_key": "FCXSGOPRPAM542ZLFEK9",
                "secret_key": "UuznIMmhNaXAZaG5IYwbf6Nq7q9CdimTvMvvG60r"
            }
        ],
        "swift_keys": [],
        "caps": [
            {
                "type": "buckets",
                "perm": "*"
            }
        ],
        "stats": {
            "size": 813825,
            "size_actual": 823296,
            "size_utilized": 0,
            "size_kb": 795,
            "size_kb_actual": 804,
            "size_kb_utilized": 0,
            "num_objects": 3
        }
    }
 * </pre>
 */
@Data
public class User {
    @SerializedName("tenant")
    @Expose
    private String                tenant;

    @SerializedName("user_id")
    @Expose
    private String                userId;

    @SerializedName("display_name")
    @Expose
    private String                displayName;

    @SerializedName("email")
    @Expose
    private String                email;

    @SerializedName("suspended")
    @Expose
    private Integer               suspended;

    @SerializedName("max_buckets")
    @Expose
    private Integer               maxBuckets;

    @SerializedName("subusers")
    @Expose
    private List<SubUser>         subusers         = null;

    @SerializedName("keys")
    @Expose
    private List<S3Credential>    s3Credentials    = null;

    @SerializedName("swift_keys")
    @Expose
    private List<SwiftCredential> swiftCredentials = null;

    @SerializedName("caps")
    @Expose
    private List<Cap>             caps             = null;

    @SerializedName("stats")
    @Expose
    private Stats                 stats           = null;

    @SerializedName("user_quota")
    @Expose
    private Quota                 userQuota        = null;

    @SerializedName("bucket_quota")
    @Expose
    private Quota                 bucketQuota      = null;

}
