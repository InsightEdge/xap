/*
 * 
 * Copyright 2005 Sun Microsystems, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package net.jini.url.httpmd;

import net.jini.security.IntegrityVerifier;
import net.jini.security.Security;

import java.net.URL;

/**
 * Integrity verifier for HTTPMD URLs. This class is intended to be specified in a resource to
 * configure the operation of {@link Security#verifyCodebaseIntegrity
 * Security.verifyCodebaseIntegrity}.
 *
 * @author Sun Microsystems, Inc.
 * @see net.jini.url.httpmd
 * @since 2.0
 */
@com.gigaspaces.api.InternalApi
public class HttpmdIntegrityVerifier implements IntegrityVerifier {
    /**
     * Returns <code>true</code> if the specified URL uses the "httpmd" protocol; returns
     * <code>false</code> otherwise.
     *
     * @throws NullPointerException {@inheritDoc}
     */
    public boolean providesIntegrity(URL url) {
        return "httpmd".equals(url.getProtocol());
    }
}
