/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.collector.mapper.thrift.event;

import com.navercorp.pinpoint.collector.mapper.thrift.ThriftBoMapper;
import com.navercorp.pinpoint.common.server.bo.event.MonitorInfoBo;
import com.navercorp.pinpoint.thrift.dto.command.TMonitorInfo;
import org.springframework.stereotype.Component;

/**
 * @author jaehong.kim
 */
@Component
public class ThriftMonitorInfoBoMapper implements ThriftBoMapper<MonitorInfoBo, TMonitorInfo> {

    public MonitorInfoBo map(final TMonitorInfo monitorInfo) {
        return new MonitorInfoBo(monitorInfo.getStackDepth(), monitorInfo.getStackFrame());
    }
}