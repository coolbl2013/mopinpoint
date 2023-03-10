/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-06-30")
public class TApiMetaData implements org.apache.thrift.TBase<TApiMetaData, TApiMetaData._Fields>, java.io.Serializable, Cloneable, Comparable<TApiMetaData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TApiMetaData");

  private static final org.apache.thrift.protocol.TField AGENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("agentId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AGENT_START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("agentStartTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField API_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("apiId", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField API_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("apiInfo", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField LINE_FIELD_DESC = new org.apache.thrift.protocol.TField("line", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)10);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TApiMetaDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TApiMetaDataTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String agentId; // required
  private long agentStartTime; // required
  private int apiId; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String apiInfo; // required
  private int line; // optional
  private int type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AGENT_ID((short)1, "agentId"),
    AGENT_START_TIME((short)2, "agentStartTime"),
    API_ID((short)4, "apiId"),
    API_INFO((short)5, "apiInfo"),
    LINE((short)6, "line"),
    TYPE((short)10, "type");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // AGENT_ID
          return AGENT_ID;
        case 2: // AGENT_START_TIME
          return AGENT_START_TIME;
        case 4: // API_ID
          return API_ID;
        case 5: // API_INFO
          return API_INFO;
        case 6: // LINE
          return LINE;
        case 10: // TYPE
          return TYPE;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AGENTSTARTTIME_ISSET_ID = 0;
  private static final int __APIID_ISSET_ID = 1;
  private static final int __LINE_ISSET_ID = 2;
  private static final int __TYPE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.LINE,_Fields.TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AGENT_ID, new org.apache.thrift.meta_data.FieldMetaData("agentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGENT_START_TIME, new org.apache.thrift.meta_data.FieldMetaData("agentStartTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.API_ID, new org.apache.thrift.meta_data.FieldMetaData("apiId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.API_INFO, new org.apache.thrift.meta_data.FieldMetaData("apiInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINE, new org.apache.thrift.meta_data.FieldMetaData("line", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TApiMetaData.class, metaDataMap);
  }

  public TApiMetaData() {
  }

  public TApiMetaData(
    java.lang.String agentId,
    long agentStartTime,
    int apiId,
    java.lang.String apiInfo)
  {
    this();
    this.agentId = agentId;
    this.agentStartTime = agentStartTime;
    setAgentStartTimeIsSet(true);
    this.apiId = apiId;
    setApiIdIsSet(true);
    this.apiInfo = apiInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TApiMetaData(TApiMetaData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAgentId()) {
      this.agentId = other.agentId;
    }
    this.agentStartTime = other.agentStartTime;
    this.apiId = other.apiId;
    if (other.isSetApiInfo()) {
      this.apiInfo = other.apiInfo;
    }
    this.line = other.line;
    this.type = other.type;
  }

  public TApiMetaData deepCopy() {
    return new TApiMetaData(this);
  }

  @Override
  public void clear() {
    this.agentId = null;
    setAgentStartTimeIsSet(false);
    this.agentStartTime = 0;
    setApiIdIsSet(false);
    this.apiId = 0;
    this.apiInfo = null;
    setLineIsSet(false);
    this.line = 0;
    setTypeIsSet(false);
    this.type = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAgentId() {
    return this.agentId;
  }

  public void setAgentId(@org.apache.thrift.annotation.Nullable java.lang.String agentId) {
    this.agentId = agentId;
  }

  public void unsetAgentId() {
    this.agentId = null;
  }

  /** Returns true if field agentId is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentId() {
    return this.agentId != null;
  }

  public void setAgentIdIsSet(boolean value) {
    if (!value) {
      this.agentId = null;
    }
  }

  public long getAgentStartTime() {
    return this.agentStartTime;
  }

  public void setAgentStartTime(long agentStartTime) {
    this.agentStartTime = agentStartTime;
    setAgentStartTimeIsSet(true);
  }

  public void unsetAgentStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AGENTSTARTTIME_ISSET_ID);
  }

  /** Returns true if field agentStartTime is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AGENTSTARTTIME_ISSET_ID);
  }

  public void setAgentStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AGENTSTARTTIME_ISSET_ID, value);
  }

  public int getApiId() {
    return this.apiId;
  }

  public void setApiId(int apiId) {
    this.apiId = apiId;
    setApiIdIsSet(true);
  }

  public void unsetApiId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APIID_ISSET_ID);
  }

  /** Returns true if field apiId is set (has been assigned a value) and false otherwise */
  public boolean isSetApiId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APIID_ISSET_ID);
  }

  public void setApiIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APIID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getApiInfo() {
    return this.apiInfo;
  }

  public void setApiInfo(@org.apache.thrift.annotation.Nullable java.lang.String apiInfo) {
    this.apiInfo = apiInfo;
  }

  public void unsetApiInfo() {
    this.apiInfo = null;
  }

  /** Returns true if field apiInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetApiInfo() {
    return this.apiInfo != null;
  }

  public void setApiInfoIsSet(boolean value) {
    if (!value) {
      this.apiInfo = null;
    }
  }

  public int getLine() {
    return this.line;
  }

  public void setLine(int line) {
    this.line = line;
    setLineIsSet(true);
  }

  public void unsetLine() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LINE_ISSET_ID);
  }

  /** Returns true if field line is set (has been assigned a value) and false otherwise */
  public boolean isSetLine() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LINE_ISSET_ID);
  }

  public void setLineIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LINE_ISSET_ID, value);
  }

  public int getType() {
    return this.type;
  }

  public void setType(int type) {
    this.type = type;
    setTypeIsSet(true);
  }

  public void unsetType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case AGENT_ID:
      if (value == null) {
        unsetAgentId();
      } else {
        setAgentId((java.lang.String)value);
      }
      break;

    case AGENT_START_TIME:
      if (value == null) {
        unsetAgentStartTime();
      } else {
        setAgentStartTime((java.lang.Long)value);
      }
      break;

    case API_ID:
      if (value == null) {
        unsetApiId();
      } else {
        setApiId((java.lang.Integer)value);
      }
      break;

    case API_INFO:
      if (value == null) {
        unsetApiInfo();
      } else {
        setApiInfo((java.lang.String)value);
      }
      break;

    case LINE:
      if (value == null) {
        unsetLine();
      } else {
        setLine((java.lang.Integer)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AGENT_ID:
      return getAgentId();

    case AGENT_START_TIME:
      return getAgentStartTime();

    case API_ID:
      return getApiId();

    case API_INFO:
      return getApiInfo();

    case LINE:
      return getLine();

    case TYPE:
      return getType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AGENT_ID:
      return isSetAgentId();
    case AGENT_START_TIME:
      return isSetAgentStartTime();
    case API_ID:
      return isSetApiId();
    case API_INFO:
      return isSetApiInfo();
    case LINE:
      return isSetLine();
    case TYPE:
      return isSetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TApiMetaData)
      return this.equals((TApiMetaData)that);
    return false;
  }

  public boolean equals(TApiMetaData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_agentId = true && this.isSetAgentId();
    boolean that_present_agentId = true && that.isSetAgentId();
    if (this_present_agentId || that_present_agentId) {
      if (!(this_present_agentId && that_present_agentId))
        return false;
      if (!this.agentId.equals(that.agentId))
        return false;
    }

    boolean this_present_agentStartTime = true;
    boolean that_present_agentStartTime = true;
    if (this_present_agentStartTime || that_present_agentStartTime) {
      if (!(this_present_agentStartTime && that_present_agentStartTime))
        return false;
      if (this.agentStartTime != that.agentStartTime)
        return false;
    }

    boolean this_present_apiId = true;
    boolean that_present_apiId = true;
    if (this_present_apiId || that_present_apiId) {
      if (!(this_present_apiId && that_present_apiId))
        return false;
      if (this.apiId != that.apiId)
        return false;
    }

    boolean this_present_apiInfo = true && this.isSetApiInfo();
    boolean that_present_apiInfo = true && that.isSetApiInfo();
    if (this_present_apiInfo || that_present_apiInfo) {
      if (!(this_present_apiInfo && that_present_apiInfo))
        return false;
      if (!this.apiInfo.equals(that.apiInfo))
        return false;
    }

    boolean this_present_line = true && this.isSetLine();
    boolean that_present_line = true && that.isSetLine();
    if (this_present_line || that_present_line) {
      if (!(this_present_line && that_present_line))
        return false;
      if (this.line != that.line)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAgentId()) ? 131071 : 524287);
    if (isSetAgentId())
      hashCode = hashCode * 8191 + agentId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(agentStartTime);

    hashCode = hashCode * 8191 + apiId;

    hashCode = hashCode * 8191 + ((isSetApiInfo()) ? 131071 : 524287);
    if (isSetApiInfo())
      hashCode = hashCode * 8191 + apiInfo.hashCode();

    hashCode = hashCode * 8191 + ((isSetLine()) ? 131071 : 524287);
    if (isSetLine())
      hashCode = hashCode * 8191 + line;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type;

    return hashCode;
  }

  @Override
  public int compareTo(TApiMetaData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAgentId(), other.isSetAgentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentId, other.agentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAgentStartTime(), other.isSetAgentStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentStartTime, other.agentStartTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetApiId(), other.isSetApiId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApiId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apiId, other.apiId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetApiInfo(), other.isSetApiInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApiInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apiInfo, other.apiInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLine(), other.isSetLine());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLine()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.line, other.line);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TApiMetaData(");
    boolean first = true;

    sb.append("agentId:");
    if (this.agentId == null) {
      sb.append("null");
    } else {
      sb.append(this.agentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("agentStartTime:");
    sb.append(this.agentStartTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("apiId:");
    sb.append(this.apiId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("apiInfo:");
    if (this.apiInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.apiInfo);
    }
    first = false;
    if (isSetLine()) {
      if (!first) sb.append(", ");
      sb.append("line:");
      sb.append(this.line);
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      sb.append(this.type);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TApiMetaDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TApiMetaDataStandardScheme getScheme() {
      return new TApiMetaDataStandardScheme();
    }
  }

  private static class TApiMetaDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<TApiMetaData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TApiMetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AGENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.agentId = iprot.readString();
              struct.setAgentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AGENT_START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.agentStartTime = iprot.readI64();
              struct.setAgentStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // API_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.apiId = iprot.readI32();
              struct.setApiIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // API_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.apiInfo = iprot.readString();
              struct.setApiInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LINE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.line = iprot.readI32();
              struct.setLineIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TApiMetaData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.agentId != null) {
        oprot.writeFieldBegin(AGENT_ID_FIELD_DESC);
        oprot.writeString(struct.agentId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGENT_START_TIME_FIELD_DESC);
      oprot.writeI64(struct.agentStartTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(API_ID_FIELD_DESC);
      oprot.writeI32(struct.apiId);
      oprot.writeFieldEnd();
      if (struct.apiInfo != null) {
        oprot.writeFieldBegin(API_INFO_FIELD_DESC);
        oprot.writeString(struct.apiInfo);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLine()) {
        oprot.writeFieldBegin(LINE_FIELD_DESC);
        oprot.writeI32(struct.line);
        oprot.writeFieldEnd();
      }
      if (struct.isSetType()) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TApiMetaDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TApiMetaDataTupleScheme getScheme() {
      return new TApiMetaDataTupleScheme();
    }
  }

  private static class TApiMetaDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<TApiMetaData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TApiMetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAgentId()) {
        optionals.set(0);
      }
      if (struct.isSetAgentStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetApiId()) {
        optionals.set(2);
      }
      if (struct.isSetApiInfo()) {
        optionals.set(3);
      }
      if (struct.isSetLine()) {
        optionals.set(4);
      }
      if (struct.isSetType()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetAgentId()) {
        oprot.writeString(struct.agentId);
      }
      if (struct.isSetAgentStartTime()) {
        oprot.writeI64(struct.agentStartTime);
      }
      if (struct.isSetApiId()) {
        oprot.writeI32(struct.apiId);
      }
      if (struct.isSetApiInfo()) {
        oprot.writeString(struct.apiInfo);
      }
      if (struct.isSetLine()) {
        oprot.writeI32(struct.line);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TApiMetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.agentId = iprot.readString();
        struct.setAgentIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.agentStartTime = iprot.readI64();
        struct.setAgentStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.apiId = iprot.readI32();
        struct.setApiIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.apiInfo = iprot.readString();
        struct.setApiInfoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.line = iprot.readI32();
        struct.setLineIsSet(true);
      }
      if (incoming.get(5)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

