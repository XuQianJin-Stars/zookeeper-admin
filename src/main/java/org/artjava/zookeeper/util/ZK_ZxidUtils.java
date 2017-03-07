/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.artjava.zookeeper.util;

import org.apache.commons.lang.StringUtils;

public class ZK_ZxidUtils {
    static public long getEpochFromZxid(long zxid) {
        return zxid >> 32L;
    }

    static public long getCounterFromZxid(long zxid) {
        return zxid & 0xffffffffL;
    }

    static public long makeZxid(long epoch, long counter) {
        return (epoch << 32L) | (counter & 0xffffffffL);
    }

    static public String zxidToString(long zxid) {
        return Long.toHexString(zxid);
    }


    public static void main(String[] args) {


        System.out.println(1 << 32);
        System.out.println(1L << 32);


        System.out.println(makeZxid(1, 268435457));

        long l = Long.parseLong(StringUtils.substring("0x10000001", 2), 16);

        System.out.println(getCounterFromZxid(l));
        System.out.println(getEpochFromZxid(l));


        System.out.println(0xffffffffL);


    }

}
