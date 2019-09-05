package org.wangb.radosgw.model.resp.usage;

import java.util.List;

/*
Example:
{
    "entries": [
        {
            "user": "testuser",
            "buckets": [
                {
                    "bucket": "test",
                    "time": "2018-07-19 09:00:00.000000Z",
                    "epoch": 1531990800,
                    "owner": "testuser",
                    "categories": [
                        {
                            "category": "get_obj",
                            "bytes_sent": 1026399,
                            "bytes_received": 0,
                            "ops": 53,
                            "successful_ops": 44
                        },
                        {
                            "category": "list_bucket",
                            "bytes_sent": 214,
                            "bytes_received": 0,
                            "ops": 1,
                            "successful_ops": 0
                        },
                        {
                            "category": "put_acls",
                            "bytes_sent": 532,
                            "bytes_received": 0,
                            "ops": 28,
                            "successful_ops": 28
                        },
                        {
                            "category": "put_obj",
                            "bytes_sent": 0,
                            "bytes_received": 1371324,
                            "ops": 28,
                            "successful_ops": 28
                        }
                    ]
                }
            ]
        }
    ],
    "summary": [
        {
            "user": "testuser",
            "categories": [
                {
                    "category": "get_obj",
                    "bytes_sent": 1026399,
                    "bytes_received": 0,
                    "ops": 53,
                    "successful_ops": 44
                },
                {
                    "category": "list_bucket",
                    "bytes_sent": 214,
                    "bytes_received": 0,
                    "ops": 1,
                    "successful_ops": 0
                },
                {
                    "category": "put_acls",
                    "bytes_sent": 532,
                    "bytes_received": 0,
                    "ops": 28,
                    "successful_ops": 28
                },
                {
                    "category": "put_obj",
                    "bytes_sent": 0,
                    "bytes_received": 1371324,
                    "ops": 28,
                    "successful_ops": 28
                }
            ],
            "total": {
                "bytes_sent": 1027145,
                "bytes_received": 1371324,
                "ops": 110,
                "successful_ops": 100
            }
        }
    ]
}
 */
/** Represents the request bandwidth usage information. */
public class Usage {
  
    /**
     * A container for the usage entries information.
     */
  private List<Entries> entries;
  /**
   * A container for stats summary.
   */
  private List<Summary> summary;

  public List<Entries> getEntries() {
    return entries;
  }

  public void setEntries(List<Entries> entries) {
    this.entries = entries;
  }

  public List<Summary> getSummary() {
    return summary;
  }

  public void setSummary(List<Summary> summary) {
    this.summary = summary;
  }
}
