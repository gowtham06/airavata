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

CREATE TABLE IF NOT EXISTS GATEWAY (
  AIRAVATA_INTERNAL_GATEWAY_ID varchar(255) NOT NULL,
  DECLINED_REASON varchar(255) DEFAULT NULL,
  GATEWAY_DOMAIN varchar(255) DEFAULT NULL,
  EMAIL_ADDRESS varchar(255) DEFAULT NULL,
  GATEWAY_ACRONYM varchar(255) DEFAULT NULL,
  GATEWAY_ADMIN_EMAIL varchar(255) DEFAULT NULL,
  GATEWAY_ADMIN_FIRST_NAME varchar(255) DEFAULT NULL,
  GATEWAY_ADMIN_LAST_NAME varchar(255) DEFAULT NULL,
  GATEWAY_APPROVAL_STATUS varchar(255) DEFAULT NULL,
  GATEWAY_ID varchar(255) DEFAULT NULL,
  GATEWAY_NAME varchar(255) DEFAULT NULL,
  GATEWAY_PUBLIC_ABSTRACT varchar(255) DEFAULT NULL,
  GATEWAY_URL varchar(255) DEFAULT NULL,
  IDENTITY_SERVER_PASSWORD_TOKEN varchar(255) DEFAULT NULL,
  IDENTITY_SERVER_USERNAME varchar(255) DEFAULT NULL,
  OAUTH_CLIENT_ID varchar(255) DEFAULT NULL,
  OAUTH_CLIENT_SECRET varchar(255) DEFAULT NULL,
  REQUEST_CREATION_TIME bigint(20) DEFAULT NULL,
  REQUESTER_USERNAME varchar(255) DEFAULT NULL,
  GATEWAY_REVIEW_PROPOSAL_DESCRIPTION varchar(255) DEFAULT NULL,
  PRIMARY KEY (AIRAVATA_INTERNAL_GATEWAY_ID)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS USER_PROFILE (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    USER_ID VARCHAR (255) NOT NULL,
    GATEWAY_ID VARCHAR (255) NOT NULL,
    USER_MODEL_VERSION VARCHAR (255),
    FIRST_NAME VARCHAR (255),
    LAST_NAME VARCHAR (255),
    MIDDLE_NAME VARCHAR (255),
    NAME_PREFIX VARCHAR (255),
    NAME_PREFIX VARCHAR (255),
    ORCID_ID VARCHAR (255),
    COUNTRY VARCHAR (255),
    HOME_ORGANIZATION VARCHAR (255),
    ORIGINATION_AFFILIATION VARCHAR (255),
    CREATION_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    LAST_ACCESS_TIME TIMESTAMP,
    VALID_UNTIL TIMESTAMP,
    STATE VARCHAR (255),
    COMMENTS TEXT,
    GPG_KEY TEXT,
    TIME_ZONE VARCHAR (255),
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS USER_PROFILE_EMAIL (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    EMAIL VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, EMAIL),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES USER_PROFILE(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS USER_PROFILE_PHONE (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    PHONE VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, PHONE ),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES USER_PROFILE(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS USER_PROFILE_NATIONALITY (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    NATIONALITY VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, NATIONALITY ),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES USER_PROFILE(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS USER_PROFILE_LABELED_URI (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    LABELED_URI VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, LABELED_URI ),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES USER_PROFILE(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS NSF_DEMOGRAPHIC (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    GENDER VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES USER_PROFILE(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS NSF_DEMOGRAPHIC_ETHNICITY (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    ETHNICITY VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, ETHNICITY ),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES NSF_DEMOGRAPHIC(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS NSF_DEMOGRAPHIC_RACE (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    RACE VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, RACE ),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES NSF_DEMOGRAPHIC(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS NSF_DEMOGRAPHIC_DISABILITY (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    DISABILITY VARCHAR (255) NOT NULL,
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID, DISABILITY ),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES NSF_DEMOGRAPHIC(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS CUSTOMIZED_DASHBOARD (
    AIRAVATA_INTERNAL_USER_ID VARCHAR (255) NOT NULL,
    ENABLED_EXPERIMENT_ID VARCHAR (255),
    ENABLED_NAME VARCHAR (255),
    ENABLED_DESCRIPTION VARCHAR (255),
    ENABLED_PROJECT VARCHAR (255),
    ENABLED_OWNER VARCHAR (255),
    ENABLED_APPLICATION VARCHAR (255),
    ENABLED_COMPUTE_RESOURCE VARCHAR (255),
    ENABLED_JOB_NAME VARCHAR (255),
    ENABLED_JOB_ID VARCHAR (255),
    ENABLED_JOB_STATUS VARCHAR (255),
    ENABLED_JOB_CREATION_TIME VARCHAR (255),
    ENABLED_NOTIFICATIONS_TO VARCHAR (255),
    ENABLED_WORKING_DIR VARCHAR (255),
    ENABLED_JOB_DESCRIPTION VARCHAR (255),
    ENABLED_CREATION_TIME VARCHAR (255),
    ENABLED_LAST_MODIFIED_TIME VARCHAR (255),
    ENABLED_WALL_TIME VARCHAR (255),
    ENABLED_CPU_COUNT VARCHAR (255),
    ENABLED_NODE_COUNT VARCHAR (255),
    ENABLED_QUEUE VARCHAR (255),
    ENABLED_INPUTS VARCHAR (255),
    ENABLED_OUTPUTS VARCHAR (255),
    ENABLED_STORAGE_DIR VARCHAR (255),
    ENABLED_ERRORS VARCHAR (255),
    PRIMARY KEY (AIRAVATA_INTERNAL_USER_ID),
    FOREIGN KEY (AIRAVATA_INTERNAL_USER_ID) REFERENCES USER_PROFILE(AIRAVATA_INTERNAL_USER_ID) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE CONFIGURATION
(
        CONFIG_KEY VARCHAR(255) NOT NULL,
        CONFIG_VAL VARCHAR(255) NOT NULL,
        PRIMARY KEY(CONFIG_KEY, CONFIG_VAL)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO CONFIGURATION (CONFIG_KEY, CONFIG_VAL) VALUES('user_profile_catalog_version', '0.17');
