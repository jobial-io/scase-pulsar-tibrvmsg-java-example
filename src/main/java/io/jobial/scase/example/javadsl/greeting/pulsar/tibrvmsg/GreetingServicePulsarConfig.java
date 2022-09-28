/*
 * Copyright (c) 2020 Jobial OÜ. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package io.jobial.scase.example.javadsl.greeting.pulsar.tibrvmsg;


import com.tibco.tibrv.TibrvMsg;
import io.jobial.scase.marshalling.tibrv.raw.javadsl.TibrvMsgRawMarshalling;
import io.jobial.scase.pulsar.javadsl.PulsarRequestResponseServiceConfiguration;

import static io.jobial.scase.pulsar.javadsl.PulsarServiceConfiguration.requestResponse;

interface GreetingServicePulsarConfig {

    PulsarRequestResponseServiceConfiguration<TibrvMsg, TibrvMsg> greetingServiceConfig =
            requestResponse("greeting", new TibrvMsgRawMarshalling(), new TibrvMsgRawMarshalling());
}