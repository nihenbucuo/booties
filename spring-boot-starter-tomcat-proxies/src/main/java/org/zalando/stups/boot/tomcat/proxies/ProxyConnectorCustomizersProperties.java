/**
 * Copyright 2015 Zalando SE
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
package org.zalando.stups.boot.tomcat.proxies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author  jbellmann
 */
@ConfigurationProperties("booties.tomcat.proxies")
public class ProxyConnectorCustomizersProperties {

    private boolean enabled = false;

    private List<ConnectorCustomizer> customizers = new ArrayList<ConnectorCustomizer>(0);

    public List<ConnectorCustomizer> getCustomizers() {
        return customizers;
    }

    public void setCustomizers(final List<ConnectorCustomizer> customizers) {
        this.customizers = customizers;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
}