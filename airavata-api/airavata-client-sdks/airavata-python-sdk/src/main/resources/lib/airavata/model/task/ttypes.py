#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
import sys
import airavata.model.commons.ttypes
import airavata.model.appcatalog.computeresource.ttypes
import airavata.model.data.movement.ttypes
import airavata.model.application.io.ttypes
import airavata.model.status.ttypes
import airavata.model.job.ttypes

from thrift.transport import TTransport


class TaskTypes(object):
    """
    TaskTypes: An enumerated list of TaskTypes. Task being generic, the task type will provide the concrete interpretation.

    """
    ENV_SETUP = 0
    DATA_STAGING = 1
    JOB_SUBMISSION = 2
    ENV_CLEANUP = 3
    MONITORING = 4
    OUTPUT_FETCHING = 5

    _VALUES_TO_NAMES = {
        0: "ENV_SETUP",
        1: "DATA_STAGING",
        2: "JOB_SUBMISSION",
        3: "ENV_CLEANUP",
        4: "MONITORING",
        5: "OUTPUT_FETCHING",
    }

    _NAMES_TO_VALUES = {
        "ENV_SETUP": 0,
        "DATA_STAGING": 1,
        "JOB_SUBMISSION": 2,
        "ENV_CLEANUP": 3,
        "MONITORING": 4,
        "OUTPUT_FETCHING": 5,
    }


class DataStageType(object):
    """
    DataStagingTaskModel: A structure holding the data staging task details.

    Source and Destination locations includes standard representation of protocol, host, port and path
      A friendly description of the task, usally used to communicate information to users.

    """
    INPUT = 0
    OUPUT = 1
    ARCHIVE_OUTPUT = 2

    _VALUES_TO_NAMES = {
        0: "INPUT",
        1: "OUPUT",
        2: "ARCHIVE_OUTPUT",
    }

    _NAMES_TO_VALUES = {
        "INPUT": 0,
        "OUPUT": 1,
        "ARCHIVE_OUTPUT": 2,
    }


class TaskModel(object):
    """
    TaskModel: A structure holding the generic task details.

    taskDetail:
      A friendly description of the task, usally used to communicate information to users.

    subTaskModel:
      A generic byte object for the Task developer to store internal serialized data into registry catalogs.

    Attributes:
     - taskId
     - taskType
     - parentProcessId
     - creationTime
     - lastUpdateTime
     - taskStatuses
     - taskDetail
     - subTaskModel
     - taskErrors
     - jobs
    """

    thrift_spec = (
        None,  # 0
        (1, TType.STRING, 'taskId', 'UTF8', "DO_NOT_SET_AT_CLIENTS", ),  # 1
        (2, TType.I32, 'taskType', None, None, ),  # 2
        (3, TType.STRING, 'parentProcessId', 'UTF8', None, ),  # 3
        (4, TType.I64, 'creationTime', None, None, ),  # 4
        (5, TType.I64, 'lastUpdateTime', None, None, ),  # 5
        (6, TType.LIST, 'taskStatuses', (TType.STRUCT, (airavata.model.status.ttypes.TaskStatus, airavata.model.status.ttypes.TaskStatus.thrift_spec), False), None, ),  # 6
        (7, TType.STRING, 'taskDetail', 'UTF8', None, ),  # 7
        (8, TType.STRING, 'subTaskModel', 'BINARY', None, ),  # 8
        (9, TType.LIST, 'taskErrors', (TType.STRUCT, (airavata.model.commons.ttypes.ErrorModel, airavata.model.commons.ttypes.ErrorModel.thrift_spec), False), None, ),  # 9
        (10, TType.LIST, 'jobs', (TType.STRUCT, (airavata.model.job.ttypes.JobModel, airavata.model.job.ttypes.JobModel.thrift_spec), False), None, ),  # 10
    )

    def __init__(self, taskId=thrift_spec[1][4], taskType=None, parentProcessId=None, creationTime=None, lastUpdateTime=None, taskStatuses=None, taskDetail=None, subTaskModel=None, taskErrors=None, jobs=None,):
        self.taskId = taskId
        self.taskType = taskType
        self.parentProcessId = parentProcessId
        self.creationTime = creationTime
        self.lastUpdateTime = lastUpdateTime
        self.taskStatuses = taskStatuses
        self.taskDetail = taskDetail
        self.subTaskModel = subTaskModel
        self.taskErrors = taskErrors
        self.jobs = jobs

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.taskId = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.I32:
                    self.taskType = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.STRING:
                    self.parentProcessId = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 4:
                if ftype == TType.I64:
                    self.creationTime = iprot.readI64()
                else:
                    iprot.skip(ftype)
            elif fid == 5:
                if ftype == TType.I64:
                    self.lastUpdateTime = iprot.readI64()
                else:
                    iprot.skip(ftype)
            elif fid == 6:
                if ftype == TType.LIST:
                    self.taskStatuses = []
                    (_etype3, _size0) = iprot.readListBegin()
                    for _i4 in range(_size0):
                        _elem5 = airavata.model.status.ttypes.TaskStatus()
                        _elem5.read(iprot)
                        self.taskStatuses.append(_elem5)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 7:
                if ftype == TType.STRING:
                    self.taskDetail = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 8:
                if ftype == TType.STRING:
                    self.subTaskModel = iprot.readBinary()
                else:
                    iprot.skip(ftype)
            elif fid == 9:
                if ftype == TType.LIST:
                    self.taskErrors = []
                    (_etype9, _size6) = iprot.readListBegin()
                    for _i10 in range(_size6):
                        _elem11 = airavata.model.commons.ttypes.ErrorModel()
                        _elem11.read(iprot)
                        self.taskErrors.append(_elem11)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 10:
                if ftype == TType.LIST:
                    self.jobs = []
                    (_etype15, _size12) = iprot.readListBegin()
                    for _i16 in range(_size12):
                        _elem17 = airavata.model.job.ttypes.JobModel()
                        _elem17.read(iprot)
                        self.jobs.append(_elem17)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('TaskModel')
        if self.taskId is not None:
            oprot.writeFieldBegin('taskId', TType.STRING, 1)
            oprot.writeString(self.taskId.encode('utf-8') if sys.version_info[0] == 2 else self.taskId)
            oprot.writeFieldEnd()
        if self.taskType is not None:
            oprot.writeFieldBegin('taskType', TType.I32, 2)
            oprot.writeI32(self.taskType)
            oprot.writeFieldEnd()
        if self.parentProcessId is not None:
            oprot.writeFieldBegin('parentProcessId', TType.STRING, 3)
            oprot.writeString(self.parentProcessId.encode('utf-8') if sys.version_info[0] == 2 else self.parentProcessId)
            oprot.writeFieldEnd()
        if self.creationTime is not None:
            oprot.writeFieldBegin('creationTime', TType.I64, 4)
            oprot.writeI64(self.creationTime)
            oprot.writeFieldEnd()
        if self.lastUpdateTime is not None:
            oprot.writeFieldBegin('lastUpdateTime', TType.I64, 5)
            oprot.writeI64(self.lastUpdateTime)
            oprot.writeFieldEnd()
        if self.taskStatuses is not None:
            oprot.writeFieldBegin('taskStatuses', TType.LIST, 6)
            oprot.writeListBegin(TType.STRUCT, len(self.taskStatuses))
            for iter18 in self.taskStatuses:
                iter18.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.taskDetail is not None:
            oprot.writeFieldBegin('taskDetail', TType.STRING, 7)
            oprot.writeString(self.taskDetail.encode('utf-8') if sys.version_info[0] == 2 else self.taskDetail)
            oprot.writeFieldEnd()
        if self.subTaskModel is not None:
            oprot.writeFieldBegin('subTaskModel', TType.STRING, 8)
            oprot.writeBinary(self.subTaskModel)
            oprot.writeFieldEnd()
        if self.taskErrors is not None:
            oprot.writeFieldBegin('taskErrors', TType.LIST, 9)
            oprot.writeListBegin(TType.STRUCT, len(self.taskErrors))
            for iter19 in self.taskErrors:
                iter19.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.jobs is not None:
            oprot.writeFieldBegin('jobs', TType.LIST, 10)
            oprot.writeListBegin(TType.STRUCT, len(self.jobs))
            for iter20 in self.jobs:
                iter20.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.taskId is None:
            raise TProtocolException(message='Required field taskId is unset!')
        if self.taskType is None:
            raise TProtocolException(message='Required field taskType is unset!')
        if self.parentProcessId is None:
            raise TProtocolException(message='Required field parentProcessId is unset!')
        if self.creationTime is None:
            raise TProtocolException(message='Required field creationTime is unset!')
        if self.lastUpdateTime is None:
            raise TProtocolException(message='Required field lastUpdateTime is unset!')
        if self.taskStatuses is None:
            raise TProtocolException(message='Required field taskStatuses is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class DataStagingTaskModel(object):
    """
    Attributes:
     - source
     - destination
     - type
     - transferStartTime
     - transferEndTime
     - transferRate
     - processInput
     - processOutput
    """

    thrift_spec = (
        None,  # 0
        (1, TType.STRING, 'source', 'UTF8', None, ),  # 1
        (2, TType.STRING, 'destination', 'UTF8', None, ),  # 2
        (3, TType.I32, 'type', None, None, ),  # 3
        (4, TType.I64, 'transferStartTime', None, None, ),  # 4
        (5, TType.I64, 'transferEndTime', None, None, ),  # 5
        (6, TType.STRING, 'transferRate', 'UTF8', None, ),  # 6
        (7, TType.STRUCT, 'processInput', (airavata.model.application.io.ttypes.InputDataObjectType, airavata.model.application.io.ttypes.InputDataObjectType.thrift_spec), None, ),  # 7
        (8, TType.STRUCT, 'processOutput', (airavata.model.application.io.ttypes.OutputDataObjectType, airavata.model.application.io.ttypes.OutputDataObjectType.thrift_spec), None, ),  # 8
    )

    def __init__(self, source=None, destination=None, type=None, transferStartTime=None, transferEndTime=None, transferRate=None, processInput=None, processOutput=None,):
        self.source = source
        self.destination = destination
        self.type = type
        self.transferStartTime = transferStartTime
        self.transferEndTime = transferEndTime
        self.transferRate = transferRate
        self.processInput = processInput
        self.processOutput = processOutput

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.source = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.destination = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.I32:
                    self.type = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 4:
                if ftype == TType.I64:
                    self.transferStartTime = iprot.readI64()
                else:
                    iprot.skip(ftype)
            elif fid == 5:
                if ftype == TType.I64:
                    self.transferEndTime = iprot.readI64()
                else:
                    iprot.skip(ftype)
            elif fid == 6:
                if ftype == TType.STRING:
                    self.transferRate = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 7:
                if ftype == TType.STRUCT:
                    self.processInput = airavata.model.application.io.ttypes.InputDataObjectType()
                    self.processInput.read(iprot)
                else:
                    iprot.skip(ftype)
            elif fid == 8:
                if ftype == TType.STRUCT:
                    self.processOutput = airavata.model.application.io.ttypes.OutputDataObjectType()
                    self.processOutput.read(iprot)
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('DataStagingTaskModel')
        if self.source is not None:
            oprot.writeFieldBegin('source', TType.STRING, 1)
            oprot.writeString(self.source.encode('utf-8') if sys.version_info[0] == 2 else self.source)
            oprot.writeFieldEnd()
        if self.destination is not None:
            oprot.writeFieldBegin('destination', TType.STRING, 2)
            oprot.writeString(self.destination.encode('utf-8') if sys.version_info[0] == 2 else self.destination)
            oprot.writeFieldEnd()
        if self.type is not None:
            oprot.writeFieldBegin('type', TType.I32, 3)
            oprot.writeI32(self.type)
            oprot.writeFieldEnd()
        if self.transferStartTime is not None:
            oprot.writeFieldBegin('transferStartTime', TType.I64, 4)
            oprot.writeI64(self.transferStartTime)
            oprot.writeFieldEnd()
        if self.transferEndTime is not None:
            oprot.writeFieldBegin('transferEndTime', TType.I64, 5)
            oprot.writeI64(self.transferEndTime)
            oprot.writeFieldEnd()
        if self.transferRate is not None:
            oprot.writeFieldBegin('transferRate', TType.STRING, 6)
            oprot.writeString(self.transferRate.encode('utf-8') if sys.version_info[0] == 2 else self.transferRate)
            oprot.writeFieldEnd()
        if self.processInput is not None:
            oprot.writeFieldBegin('processInput', TType.STRUCT, 7)
            self.processInput.write(oprot)
            oprot.writeFieldEnd()
        if self.processOutput is not None:
            oprot.writeFieldBegin('processOutput', TType.STRUCT, 8)
            self.processOutput.write(oprot)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.source is None:
            raise TProtocolException(message='Required field source is unset!')
        if self.destination is None:
            raise TProtocolException(message='Required field destination is unset!')
        if self.type is None:
            raise TProtocolException(message='Required field type is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class EnvironmentSetupTaskModel(object):
    """
    EnvironmentSetupTaskModel: A structure holding the environment creation task details


    Attributes:
     - location
     - protocol
    """

    thrift_spec = (
        None,  # 0
        (1, TType.STRING, 'location', 'UTF8', None, ),  # 1
        (2, TType.I32, 'protocol', None, None, ),  # 2
    )

    def __init__(self, location=None, protocol=None,):
        self.location = location
        self.protocol = protocol

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.location = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.I32:
                    self.protocol = iprot.readI32()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('EnvironmentSetupTaskModel')
        if self.location is not None:
            oprot.writeFieldBegin('location', TType.STRING, 1)
            oprot.writeString(self.location.encode('utf-8') if sys.version_info[0] == 2 else self.location)
            oprot.writeFieldEnd()
        if self.protocol is not None:
            oprot.writeFieldBegin('protocol', TType.I32, 2)
            oprot.writeI32(self.protocol)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.location is None:
            raise TProtocolException(message='Required field location is unset!')
        if self.protocol is None:
            raise TProtocolException(message='Required field protocol is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class JobSubmissionTaskModel(object):
    """
    Attributes:
     - jobSubmissionProtocol
     - monitorMode
     - wallTime
    """

    thrift_spec = (
        None,  # 0
        (1, TType.I32, 'jobSubmissionProtocol', None, None, ),  # 1
        (2, TType.I32, 'monitorMode', None, None, ),  # 2
        (3, TType.I32, 'wallTime', None, None, ),  # 3
    )

    def __init__(self, jobSubmissionProtocol=None, monitorMode=None, wallTime=None,):
        self.jobSubmissionProtocol = jobSubmissionProtocol
        self.monitorMode = monitorMode
        self.wallTime = wallTime

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.I32:
                    self.jobSubmissionProtocol = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.I32:
                    self.monitorMode = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.I32:
                    self.wallTime = iprot.readI32()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('JobSubmissionTaskModel')
        if self.jobSubmissionProtocol is not None:
            oprot.writeFieldBegin('jobSubmissionProtocol', TType.I32, 1)
            oprot.writeI32(self.jobSubmissionProtocol)
            oprot.writeFieldEnd()
        if self.monitorMode is not None:
            oprot.writeFieldBegin('monitorMode', TType.I32, 2)
            oprot.writeI32(self.monitorMode)
            oprot.writeFieldEnd()
        if self.wallTime is not None:
            oprot.writeFieldBegin('wallTime', TType.I32, 3)
            oprot.writeI32(self.wallTime)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.jobSubmissionProtocol is None:
            raise TProtocolException(message='Required field jobSubmissionProtocol is unset!')
        if self.monitorMode is None:
            raise TProtocolException(message='Required field monitorMode is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class MonitorTaskModel(object):
    """
    Attributes:
     - monitorMode
    """

    thrift_spec = (
        None,  # 0
        (1, TType.I32, 'monitorMode', None, None, ),  # 1
    )

    def __init__(self, monitorMode=None,):
        self.monitorMode = monitorMode

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.I32:
                    self.monitorMode = iprot.readI32()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('MonitorTaskModel')
        if self.monitorMode is not None:
            oprot.writeFieldBegin('monitorMode', TType.I32, 1)
            oprot.writeI32(self.monitorMode)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.monitorMode is None:
            raise TProtocolException(message='Required field monitorMode is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)