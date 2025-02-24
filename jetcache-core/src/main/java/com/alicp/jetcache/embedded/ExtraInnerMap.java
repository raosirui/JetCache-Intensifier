/**
 * Created on  13-10-17 22:34
 */
package com.alicp.jetcache.embedded;

import java.util.SortedMap;

/**
 * @author huangli
 */
public interface ExtraInnerMap extends InnerMap {

    SortedMap<Object, Object> prefixMap(final Object key);
}
