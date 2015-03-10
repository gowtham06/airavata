/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/

package org.apache.aiaravata.application.catalog.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNICORE_SUBMISSION")
public class UnicoreJobSubmission {
	@Id
    @Column(name = "SUBMISSION_ID")
    private String submissionID;
    @Column(name = "SECURITY_PROTOCAL")
    private String securityProtocol;

    @Column(name = "UNICORE_ENDPOINT_URL")
    private String unicoreEndpointUrl;
    
    @Column(name = "AUTHENTICATION_MODE")
    private String authenticationMode;


    public String getAuthenticationMode() {
		return authenticationMode;
	}

    public void setAuthenticationMode(String authenticationMode) {
		this.authenticationMode = authenticationMode;
	}

    
    public String getUnicoreEndpointUrl() {
		return unicoreEndpointUrl;
	}

    public void setUnicoreEndpointUrl(String unicoreEndpointUrl) {
		this.unicoreEndpointUrl = unicoreEndpointUrl;
	}
    
    
	public String getSubmissionID() {
        return submissionID;
    }

    public void setSubmissionID(String submissionID) {
        this.submissionID = submissionID;
    }

    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

}
