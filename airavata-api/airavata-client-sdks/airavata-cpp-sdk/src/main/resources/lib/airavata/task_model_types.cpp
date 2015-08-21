/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "task_model_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace apache { namespace airavata { namespace model { namespace task {

int _kTaskTypesValues[] = {
  TaskTypes::ENV_SETUP,
  TaskTypes::DATA_STAGING,
  TaskTypes::JOB_SUBMISSION,
  TaskTypes::ENV_CLEANUP,
  TaskTypes::MONITORING
};
const char* _kTaskTypesNames[] = {
  "ENV_SETUP",
  "DATA_STAGING",
  "JOB_SUBMISSION",
  "ENV_CLEANUP",
  "MONITORING"
};
const std::map<int, const char*> _TaskTypes_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(5, _kTaskTypesValues, _kTaskTypesNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));


TaskModel::~TaskModel() throw() {
}


void TaskModel::__set_taskId(const std::string& val) {
  this->taskId = val;
}

void TaskModel::__set_taskType(const TaskTypes::type val) {
  this->taskType = val;
}

void TaskModel::__set_parentProcessId(const std::string& val) {
  this->parentProcessId = val;
}

void TaskModel::__set_creationTime(const int64_t val) {
  this->creationTime = val;
}

void TaskModel::__set_lastUpdateTime(const int64_t val) {
  this->lastUpdateTime = val;
}

void TaskModel::__set_taskStatus(const  ::apache::airavata::model::status::TaskStatus& val) {
  this->taskStatus = val;
}

void TaskModel::__set_taskDetail(const std::string& val) {
  this->taskDetail = val;
__isset.taskDetail = true;
}

void TaskModel::__set_subTaskModel(const std::string& val) {
  this->subTaskModel = val;
__isset.subTaskModel = true;
}

void TaskModel::__set_taskError(const  ::apache::airavata::model::commons::ErrorModel& val) {
  this->taskError = val;
__isset.taskError = true;
}

const char* TaskModel::ascii_fingerprint = "CE3A1BEFC350140F2B4D2EF1424A7C4F";
const uint8_t TaskModel::binary_fingerprint[16] = {0xCE,0x3A,0x1B,0xEF,0xC3,0x50,0x14,0x0F,0x2B,0x4D,0x2E,0xF1,0x42,0x4A,0x7C,0x4F};

uint32_t TaskModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_taskId = false;
  bool isset_taskType = false;
  bool isset_parentProcessId = false;
  bool isset_creationTime = false;
  bool isset_lastUpdateTime = false;
  bool isset_taskStatus = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->taskId);
          isset_taskId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast0;
          xfer += iprot->readI32(ecast0);
          this->taskType = (TaskTypes::type)ecast0;
          isset_taskType = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->parentProcessId);
          isset_parentProcessId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->creationTime);
          isset_creationTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->lastUpdateTime);
          isset_lastUpdateTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->taskStatus.read(iprot);
          isset_taskStatus = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->taskDetail);
          this->__isset.taskDetail = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readBinary(this->subTaskModel);
          this->__isset.subTaskModel = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 9:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->taskError.read(iprot);
          this->__isset.taskError = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_taskId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_taskType)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_parentProcessId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_creationTime)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_lastUpdateTime)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_taskStatus)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t TaskModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  oprot->incrementRecursionDepth();
  xfer += oprot->writeStructBegin("TaskModel");

  xfer += oprot->writeFieldBegin("taskId", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->taskId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("taskType", ::apache::thrift::protocol::T_I32, 2);
  xfer += oprot->writeI32((int32_t)this->taskType);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("parentProcessId", ::apache::thrift::protocol::T_STRING, 3);
  xfer += oprot->writeString(this->parentProcessId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("creationTime", ::apache::thrift::protocol::T_I64, 4);
  xfer += oprot->writeI64(this->creationTime);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("lastUpdateTime", ::apache::thrift::protocol::T_I64, 5);
  xfer += oprot->writeI64(this->lastUpdateTime);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("taskStatus", ::apache::thrift::protocol::T_STRUCT, 6);
  xfer += this->taskStatus.write(oprot);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.taskDetail) {
    xfer += oprot->writeFieldBegin("taskDetail", ::apache::thrift::protocol::T_STRING, 7);
    xfer += oprot->writeString(this->taskDetail);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.subTaskModel) {
    xfer += oprot->writeFieldBegin("subTaskModel", ::apache::thrift::protocol::T_STRING, 8);
    xfer += oprot->writeBinary(this->subTaskModel);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.taskError) {
    xfer += oprot->writeFieldBegin("taskError", ::apache::thrift::protocol::T_STRUCT, 9);
    xfer += this->taskError.write(oprot);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  oprot->decrementRecursionDepth();
  return xfer;
}

void swap(TaskModel &a, TaskModel &b) {
  using ::std::swap;
  swap(a.taskId, b.taskId);
  swap(a.taskType, b.taskType);
  swap(a.parentProcessId, b.parentProcessId);
  swap(a.creationTime, b.creationTime);
  swap(a.lastUpdateTime, b.lastUpdateTime);
  swap(a.taskStatus, b.taskStatus);
  swap(a.taskDetail, b.taskDetail);
  swap(a.subTaskModel, b.subTaskModel);
  swap(a.taskError, b.taskError);
  swap(a.__isset, b.__isset);
}

TaskModel::TaskModel(const TaskModel& other1) {
  taskId = other1.taskId;
  taskType = other1.taskType;
  parentProcessId = other1.parentProcessId;
  creationTime = other1.creationTime;
  lastUpdateTime = other1.lastUpdateTime;
  taskStatus = other1.taskStatus;
  taskDetail = other1.taskDetail;
  subTaskModel = other1.subTaskModel;
  taskError = other1.taskError;
  __isset = other1.__isset;
}
TaskModel& TaskModel::operator=(const TaskModel& other2) {
  taskId = other2.taskId;
  taskType = other2.taskType;
  parentProcessId = other2.parentProcessId;
  creationTime = other2.creationTime;
  lastUpdateTime = other2.lastUpdateTime;
  taskStatus = other2.taskStatus;
  taskDetail = other2.taskDetail;
  subTaskModel = other2.subTaskModel;
  taskError = other2.taskError;
  __isset = other2.__isset;
  return *this;
}
std::ostream& operator<<(std::ostream& out, const TaskModel& obj) {
  using apache::thrift::to_string;
  out << "TaskModel(";
  out << "taskId=" << to_string(obj.taskId);
  out << ", " << "taskType=" << to_string(obj.taskType);
  out << ", " << "parentProcessId=" << to_string(obj.parentProcessId);
  out << ", " << "creationTime=" << to_string(obj.creationTime);
  out << ", " << "lastUpdateTime=" << to_string(obj.lastUpdateTime);
  out << ", " << "taskStatus=" << to_string(obj.taskStatus);
  out << ", " << "taskDetail="; (obj.__isset.taskDetail ? (out << to_string(obj.taskDetail)) : (out << "<null>"));
  out << ", " << "subTaskModel="; (obj.__isset.subTaskModel ? (out << to_string(obj.subTaskModel)) : (out << "<null>"));
  out << ", " << "taskError="; (obj.__isset.taskError ? (out << to_string(obj.taskError)) : (out << "<null>"));
  out << ")";
  return out;
}


DataStagingTaskModel::~DataStagingTaskModel() throw() {
}


void DataStagingTaskModel::__set_source(const std::string& val) {
  this->source = val;
}

void DataStagingTaskModel::__set_destination(const std::string& val) {
  this->destination = val;
}

void DataStagingTaskModel::__set_transferStartTime(const int64_t val) {
  this->transferStartTime = val;
__isset.transferStartTime = true;
}

void DataStagingTaskModel::__set_transferEndTime(const int64_t val) {
  this->transferEndTime = val;
__isset.transferEndTime = true;
}

void DataStagingTaskModel::__set_transferRate(const std::string& val) {
  this->transferRate = val;
__isset.transferRate = true;
}

const char* DataStagingTaskModel::ascii_fingerprint = "3224DD8D1EC3134AB6350703A4B92D60";
const uint8_t DataStagingTaskModel::binary_fingerprint[16] = {0x32,0x24,0xDD,0x8D,0x1E,0xC3,0x13,0x4A,0xB6,0x35,0x07,0x03,0xA4,0xB9,0x2D,0x60};

uint32_t DataStagingTaskModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_source = false;
  bool isset_destination = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->source);
          isset_source = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->destination);
          isset_destination = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->transferStartTime);
          this->__isset.transferStartTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->transferEndTime);
          this->__isset.transferEndTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->transferRate);
          this->__isset.transferRate = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_source)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_destination)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t DataStagingTaskModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  oprot->incrementRecursionDepth();
  xfer += oprot->writeStructBegin("DataStagingTaskModel");

  xfer += oprot->writeFieldBegin("source", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->source);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("destination", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->destination);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.transferStartTime) {
    xfer += oprot->writeFieldBegin("transferStartTime", ::apache::thrift::protocol::T_I64, 3);
    xfer += oprot->writeI64(this->transferStartTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.transferEndTime) {
    xfer += oprot->writeFieldBegin("transferEndTime", ::apache::thrift::protocol::T_I64, 4);
    xfer += oprot->writeI64(this->transferEndTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.transferRate) {
    xfer += oprot->writeFieldBegin("transferRate", ::apache::thrift::protocol::T_STRING, 5);
    xfer += oprot->writeString(this->transferRate);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  oprot->decrementRecursionDepth();
  return xfer;
}

void swap(DataStagingTaskModel &a, DataStagingTaskModel &b) {
  using ::std::swap;
  swap(a.source, b.source);
  swap(a.destination, b.destination);
  swap(a.transferStartTime, b.transferStartTime);
  swap(a.transferEndTime, b.transferEndTime);
  swap(a.transferRate, b.transferRate);
  swap(a.__isset, b.__isset);
}

DataStagingTaskModel::DataStagingTaskModel(const DataStagingTaskModel& other3) {
  source = other3.source;
  destination = other3.destination;
  transferStartTime = other3.transferStartTime;
  transferEndTime = other3.transferEndTime;
  transferRate = other3.transferRate;
  __isset = other3.__isset;
}
DataStagingTaskModel& DataStagingTaskModel::operator=(const DataStagingTaskModel& other4) {
  source = other4.source;
  destination = other4.destination;
  transferStartTime = other4.transferStartTime;
  transferEndTime = other4.transferEndTime;
  transferRate = other4.transferRate;
  __isset = other4.__isset;
  return *this;
}
std::ostream& operator<<(std::ostream& out, const DataStagingTaskModel& obj) {
  using apache::thrift::to_string;
  out << "DataStagingTaskModel(";
  out << "source=" << to_string(obj.source);
  out << ", " << "destination=" << to_string(obj.destination);
  out << ", " << "transferStartTime="; (obj.__isset.transferStartTime ? (out << to_string(obj.transferStartTime)) : (out << "<null>"));
  out << ", " << "transferEndTime="; (obj.__isset.transferEndTime ? (out << to_string(obj.transferEndTime)) : (out << "<null>"));
  out << ", " << "transferRate="; (obj.__isset.transferRate ? (out << to_string(obj.transferRate)) : (out << "<null>"));
  out << ")";
  return out;
}

}}}} // namespace