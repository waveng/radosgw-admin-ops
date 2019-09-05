package org.wangb.radosgw.model.req;
/**
 * @author wangbo 2019年9月4日 下午4:28:43
 */

import java.util.HashMap;
import java.util.Map;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GetUsage implements BaseMap<Object> {
    /**
     * Description: The user for which the information is requested. If not
     * specified will apply to all users. Example: foo_user Required: No
     */
    private String  uid;

    /**
     * Description: Date and (optional) time that specifies the start time of
     * the requested data. Example: 2012-09-25 16:00:00 Required: No
     */
    private String  start;

    /**
     * Description: Date and (optional) time that specifies the end time of the
     * requested data (non-inclusive). Example: 2012-09-25 16:00:00 Required: No
     */
    private String  end;

    /**
     * Description: Specifies whether data entries should be returned. Example:
     * True [True] Required: No
     */
    private Boolean showEntries;

    /**
     * Description: Specifies whether data summary should be returned. Example:
     * True [True] Required: No
     */
    private Boolean showEummary;

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        //        map.put(key, value);
        //        map.put(key, value);
        //        map.put(key, value);
        //        map.put(key, value);

        return map;
    }
}
