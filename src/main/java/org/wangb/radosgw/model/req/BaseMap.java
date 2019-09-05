
package org.wangb.radosgw.model.req;
/**
 * @author wangbo 2019年9月4日 下午4:40:15
 */

import java.util.Map;

public interface BaseMap<V> {
    public Map<String, V> toMap();
}
