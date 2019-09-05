package org.wangb.radosgw.builder;

import org.wangb.radosgw.adminops.AdminBucket;
import org.wangb.radosgw.adminops.AdminCapability;
import org.wangb.radosgw.adminops.AdminQuotas;
import org.wangb.radosgw.adminops.AdminUsage;
import org.wangb.radosgw.adminops.AdminUser;

/**
 * @author wangbo 2019年9月4日 下午4:17:08
 */
public interface AdminOps extends AdminBucket, AdminCapability, AdminQuotas, AdminUsage, AdminUser {

}
