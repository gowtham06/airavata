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
package org.apache.airavata.model.dbevent;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class DBEventPublisherContext implements org.apache.thrift.TBase<DBEventPublisherContext, DBEventPublisherContext._Fields>, java.io.Serializable, Cloneable, Comparable<DBEventPublisherContext> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DBEventPublisherContext");

  private static final org.apache.thrift.protocol.TField CRUD_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("crudType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENTITY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("entityType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ENTITY_DATA_MODEL_FIELD_DESC = new org.apache.thrift.protocol.TField("entityDataModel", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DBEventPublisherContextStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DBEventPublisherContextTupleSchemeFactory());
  }

  private CrudType crudType; // required
  private EntityType entityType; // required
  private ByteBuffer entityDataModel; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see CrudType
     */
    CRUD_TYPE((short)1, "crudType"),
    /**
     * 
     * @see EntityType
     */
    ENTITY_TYPE((short)2, "entityType"),
    ENTITY_DATA_MODEL((short)3, "entityDataModel");

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
        case 1: // CRUD_TYPE
          return CRUD_TYPE;
        case 2: // ENTITY_TYPE
          return ENTITY_TYPE;
        case 3: // ENTITY_DATA_MODEL
          return ENTITY_DATA_MODEL;
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
    tmpMap.put(_Fields.CRUD_TYPE, new org.apache.thrift.meta_data.FieldMetaData("crudType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CrudType.class)));
    tmpMap.put(_Fields.ENTITY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("entityType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, EntityType.class)));
    tmpMap.put(_Fields.ENTITY_DATA_MODEL, new org.apache.thrift.meta_data.FieldMetaData("entityDataModel", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DBEventPublisherContext.class, metaDataMap);
  }

  public DBEventPublisherContext() {
  }

  public DBEventPublisherContext(
    CrudType crudType,
    EntityType entityType,
    ByteBuffer entityDataModel)
  {
    this();
    this.crudType = crudType;
    this.entityType = entityType;
    this.entityDataModel = org.apache.thrift.TBaseHelper.copyBinary(entityDataModel);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DBEventPublisherContext(DBEventPublisherContext other) {
    if (other.isSetCrudType()) {
      this.crudType = other.crudType;
    }
    if (other.isSetEntityType()) {
      this.entityType = other.entityType;
    }
    if (other.isSetEntityDataModel()) {
      this.entityDataModel = org.apache.thrift.TBaseHelper.copyBinary(other.entityDataModel);
    }
  }

  public DBEventPublisherContext deepCopy() {
    return new DBEventPublisherContext(this);
  }

  @Override
  public void clear() {
    this.crudType = null;
    this.entityType = null;
    this.entityDataModel = null;
  }

  /**
   * 
   * @see CrudType
   */
  public CrudType getCrudType() {
    return this.crudType;
  }

  /**
   * 
   * @see CrudType
   */
  public void setCrudType(CrudType crudType) {
    this.crudType = crudType;
  }

  public void unsetCrudType() {
    this.crudType = null;
  }

  /** Returns true if field crudType is set (has been assigned a value) and false otherwise */
  public boolean isSetCrudType() {
    return this.crudType != null;
  }

  public void setCrudTypeIsSet(boolean value) {
    if (!value) {
      this.crudType = null;
    }
  }

  /**
   * 
   * @see EntityType
   */
  public EntityType getEntityType() {
    return this.entityType;
  }

  /**
   * 
   * @see EntityType
   */
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }

  public void unsetEntityType() {
    this.entityType = null;
  }

  /** Returns true if field entityType is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityType() {
    return this.entityType != null;
  }

  public void setEntityTypeIsSet(boolean value) {
    if (!value) {
      this.entityType = null;
    }
  }

  public byte[] getEntityDataModel() {
    setEntityDataModel(org.apache.thrift.TBaseHelper.rightSize(entityDataModel));
    return entityDataModel == null ? null : entityDataModel.array();
  }

  public ByteBuffer bufferForEntityDataModel() {
    return org.apache.thrift.TBaseHelper.copyBinary(entityDataModel);
  }

  public void setEntityDataModel(byte[] entityDataModel) {
    this.entityDataModel = entityDataModel == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(entityDataModel, entityDataModel.length));
  }

  public void setEntityDataModel(ByteBuffer entityDataModel) {
    this.entityDataModel = org.apache.thrift.TBaseHelper.copyBinary(entityDataModel);
  }

  public void unsetEntityDataModel() {
    this.entityDataModel = null;
  }

  /** Returns true if field entityDataModel is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityDataModel() {
    return this.entityDataModel != null;
  }

  public void setEntityDataModelIsSet(boolean value) {
    if (!value) {
      this.entityDataModel = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CRUD_TYPE:
      if (value == null) {
        unsetCrudType();
      } else {
        setCrudType((CrudType)value);
      }
      break;

    case ENTITY_TYPE:
      if (value == null) {
        unsetEntityType();
      } else {
        setEntityType((EntityType)value);
      }
      break;

    case ENTITY_DATA_MODEL:
      if (value == null) {
        unsetEntityDataModel();
      } else {
        setEntityDataModel((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CRUD_TYPE:
      return getCrudType();

    case ENTITY_TYPE:
      return getEntityType();

    case ENTITY_DATA_MODEL:
      return getEntityDataModel();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CRUD_TYPE:
      return isSetCrudType();
    case ENTITY_TYPE:
      return isSetEntityType();
    case ENTITY_DATA_MODEL:
      return isSetEntityDataModel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DBEventPublisherContext)
      return this.equals((DBEventPublisherContext)that);
    return false;
  }

  public boolean equals(DBEventPublisherContext that) {
    if (that == null)
      return false;

    boolean this_present_crudType = true && this.isSetCrudType();
    boolean that_present_crudType = true && that.isSetCrudType();
    if (this_present_crudType || that_present_crudType) {
      if (!(this_present_crudType && that_present_crudType))
        return false;
      if (!this.crudType.equals(that.crudType))
        return false;
    }

    boolean this_present_entityType = true && this.isSetEntityType();
    boolean that_present_entityType = true && that.isSetEntityType();
    if (this_present_entityType || that_present_entityType) {
      if (!(this_present_entityType && that_present_entityType))
        return false;
      if (!this.entityType.equals(that.entityType))
        return false;
    }

    boolean this_present_entityDataModel = true && this.isSetEntityDataModel();
    boolean that_present_entityDataModel = true && that.isSetEntityDataModel();
    if (this_present_entityDataModel || that_present_entityDataModel) {
      if (!(this_present_entityDataModel && that_present_entityDataModel))
        return false;
      if (!this.entityDataModel.equals(that.entityDataModel))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_crudType = true && (isSetCrudType());
    list.add(present_crudType);
    if (present_crudType)
      list.add(crudType.getValue());

    boolean present_entityType = true && (isSetEntityType());
    list.add(present_entityType);
    if (present_entityType)
      list.add(entityType.getValue());

    boolean present_entityDataModel = true && (isSetEntityDataModel());
    list.add(present_entityDataModel);
    if (present_entityDataModel)
      list.add(entityDataModel);

    return list.hashCode();
  }

  @Override
  public int compareTo(DBEventPublisherContext other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCrudType()).compareTo(other.isSetCrudType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrudType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crudType, other.crudType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityType()).compareTo(other.isSetEntityType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityType, other.entityType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityDataModel()).compareTo(other.isSetEntityDataModel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityDataModel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityDataModel, other.entityDataModel);
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
    StringBuilder sb = new StringBuilder("DBEventPublisherContext(");
    boolean first = true;

    sb.append("crudType:");
    if (this.crudType == null) {
      sb.append("null");
    } else {
      sb.append(this.crudType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entityType:");
    if (this.entityType == null) {
      sb.append("null");
    } else {
      sb.append(this.entityType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entityDataModel:");
    if (this.entityDataModel == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.entityDataModel, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCrudType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'crudType' is unset! Struct:" + toString());
    }

    if (!isSetEntityType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'entityType' is unset! Struct:" + toString());
    }

    if (!isSetEntityDataModel()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'entityDataModel' is unset! Struct:" + toString());
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

  private static class DBEventPublisherContextStandardSchemeFactory implements SchemeFactory {
    public DBEventPublisherContextStandardScheme getScheme() {
      return new DBEventPublisherContextStandardScheme();
    }
  }

  private static class DBEventPublisherContextStandardScheme extends StandardScheme<DBEventPublisherContext> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DBEventPublisherContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CRUD_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.crudType = org.apache.airavata.model.dbevent.CrudType.findByValue(iprot.readI32());
              struct.setCrudTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTITY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.entityType = org.apache.airavata.model.dbevent.EntityType.findByValue(iprot.readI32());
              struct.setEntityTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ENTITY_DATA_MODEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entityDataModel = iprot.readBinary();
              struct.setEntityDataModelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DBEventPublisherContext struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.crudType != null) {
        oprot.writeFieldBegin(CRUD_TYPE_FIELD_DESC);
        oprot.writeI32(struct.crudType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.entityType != null) {
        oprot.writeFieldBegin(ENTITY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.entityType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.entityDataModel != null) {
        oprot.writeFieldBegin(ENTITY_DATA_MODEL_FIELD_DESC);
        oprot.writeBinary(struct.entityDataModel);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DBEventPublisherContextTupleSchemeFactory implements SchemeFactory {
    public DBEventPublisherContextTupleScheme getScheme() {
      return new DBEventPublisherContextTupleScheme();
    }
  }

  private static class DBEventPublisherContextTupleScheme extends TupleScheme<DBEventPublisherContext> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DBEventPublisherContext struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.crudType.getValue());
      oprot.writeI32(struct.entityType.getValue());
      oprot.writeBinary(struct.entityDataModel);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DBEventPublisherContext struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.crudType = org.apache.airavata.model.dbevent.CrudType.findByValue(iprot.readI32());
      struct.setCrudTypeIsSet(true);
      struct.entityType = org.apache.airavata.model.dbevent.EntityType.findByValue(iprot.readI32());
      struct.setEntityTypeIsSet(true);
      struct.entityDataModel = iprot.readBinary();
      struct.setEntityDataModelIsSet(true);
    }
  }

}

