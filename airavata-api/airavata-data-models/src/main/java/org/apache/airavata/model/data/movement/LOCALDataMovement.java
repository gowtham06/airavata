/**
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
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.data.movement;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * LOCAL
 * 
 * alternativeSCPHostName:
 *  If the login to scp is different than the hostname itself, specify it here
 * 
 * sshPort:
 *  If a non-defualt port needs to used, specify it.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class LOCALDataMovement implements org.apache.thrift.TBase<LOCALDataMovement, LOCALDataMovement._Fields>, java.io.Serializable, Cloneable, Comparable<LOCALDataMovement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LOCALDataMovement");

  private static final org.apache.thrift.protocol.TField DATA_MOVEMENT_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dataMovementInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LOCALDataMovementStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LOCALDataMovementTupleSchemeFactory());
  }

  private String dataMovementInterfaceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA_MOVEMENT_INTERFACE_ID((short)1, "dataMovementInterfaceId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DATA_MOVEMENT_INTERFACE_ID
          return DATA_MOVEMENT_INTERFACE_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA_MOVEMENT_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("dataMovementInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LOCALDataMovement.class, metaDataMap);
  }

  public LOCALDataMovement() {
    this.dataMovementInterfaceId = "DO_NOT_SET_AT_CLIENTS";

  }

  public LOCALDataMovement(
    String dataMovementInterfaceId)
  {
    this();
    this.dataMovementInterfaceId = dataMovementInterfaceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LOCALDataMovement(LOCALDataMovement other) {
    if (other.isSetDataMovementInterfaceId()) {
      this.dataMovementInterfaceId = other.dataMovementInterfaceId;
    }
  }

  public LOCALDataMovement deepCopy() {
    return new LOCALDataMovement(this);
  }

  @Override
  public void clear() {
    this.dataMovementInterfaceId = "DO_NOT_SET_AT_CLIENTS";

  }

  public String getDataMovementInterfaceId() {
    return this.dataMovementInterfaceId;
  }

  public void setDataMovementInterfaceId(String dataMovementInterfaceId) {
    this.dataMovementInterfaceId = dataMovementInterfaceId;
  }

  public void unsetDataMovementInterfaceId() {
    this.dataMovementInterfaceId = null;
  }

  /** Returns true if field dataMovementInterfaceId is set (has been assigned a value) and false otherwise */
  public boolean isSetDataMovementInterfaceId() {
    return this.dataMovementInterfaceId != null;
  }

  public void setDataMovementInterfaceIdIsSet(boolean value) {
    if (!value) {
      this.dataMovementInterfaceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      if (value == null) {
        unsetDataMovementInterfaceId();
      } else {
        setDataMovementInterfaceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      return getDataMovementInterfaceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      return isSetDataMovementInterfaceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LOCALDataMovement)
      return this.equals((LOCALDataMovement)that);
    return false;
  }

  public boolean equals(LOCALDataMovement that) {
    if (that == null)
      return false;

    boolean this_present_dataMovementInterfaceId = true && this.isSetDataMovementInterfaceId();
    boolean that_present_dataMovementInterfaceId = true && that.isSetDataMovementInterfaceId();
    if (this_present_dataMovementInterfaceId || that_present_dataMovementInterfaceId) {
      if (!(this_present_dataMovementInterfaceId && that_present_dataMovementInterfaceId))
        return false;
      if (!this.dataMovementInterfaceId.equals(that.dataMovementInterfaceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dataMovementInterfaceId = true && (isSetDataMovementInterfaceId());
    list.add(present_dataMovementInterfaceId);
    if (present_dataMovementInterfaceId)
      list.add(dataMovementInterfaceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(LOCALDataMovement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDataMovementInterfaceId()).compareTo(other.isSetDataMovementInterfaceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataMovementInterfaceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataMovementInterfaceId, other.dataMovementInterfaceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LOCALDataMovement(");
    boolean first = true;

    sb.append("dataMovementInterfaceId:");
    if (this.dataMovementInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.dataMovementInterfaceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDataMovementInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataMovementInterfaceId' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LOCALDataMovementStandardSchemeFactory implements SchemeFactory {
    public LOCALDataMovementStandardScheme getScheme() {
      return new LOCALDataMovementStandardScheme();
    }
  }

  private static class LOCALDataMovementStandardScheme extends StandardScheme<LOCALDataMovement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LOCALDataMovement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_MOVEMENT_INTERFACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataMovementInterfaceId = iprot.readString();
              struct.setDataMovementInterfaceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LOCALDataMovement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dataMovementInterfaceId != null) {
        oprot.writeFieldBegin(DATA_MOVEMENT_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.dataMovementInterfaceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LOCALDataMovementTupleSchemeFactory implements SchemeFactory {
    public LOCALDataMovementTupleScheme getScheme() {
      return new LOCALDataMovementTupleScheme();
    }
  }

  private static class LOCALDataMovementTupleScheme extends TupleScheme<LOCALDataMovement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LOCALDataMovement struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dataMovementInterfaceId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LOCALDataMovement struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dataMovementInterfaceId = iprot.readString();
      struct.setDataMovementInterfaceIdIsSet(true);
    }
  }

}

