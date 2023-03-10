/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-06-30")
public class TLoadedClass implements org.apache.thrift.TBase<TLoadedClass, TLoadedClass._Fields>, java.io.Serializable, Cloneable, Comparable<TLoadedClass> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLoadedClass");

  private static final org.apache.thrift.protocol.TField LOADED_CLASS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("loadedClassCount", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField UNLOADED_CLASS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unloadedClassCount", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLoadedClassStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLoadedClassTupleSchemeFactory();

  private long loadedClassCount; // required
  private long unloadedClassCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOADED_CLASS_COUNT((short)1, "loadedClassCount"),
    UNLOADED_CLASS_COUNT((short)2, "unloadedClassCount");

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
        case 1: // LOADED_CLASS_COUNT
          return LOADED_CLASS_COUNT;
        case 2: // UNLOADED_CLASS_COUNT
          return UNLOADED_CLASS_COUNT;
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
  private static final int __LOADEDCLASSCOUNT_ISSET_ID = 0;
  private static final int __UNLOADEDCLASSCOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOADED_CLASS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("loadedClassCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UNLOADED_CLASS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("unloadedClassCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLoadedClass.class, metaDataMap);
  }

  public TLoadedClass() {
  }

  public TLoadedClass(
    long loadedClassCount,
    long unloadedClassCount)
  {
    this();
    this.loadedClassCount = loadedClassCount;
    setLoadedClassCountIsSet(true);
    this.unloadedClassCount = unloadedClassCount;
    setUnloadedClassCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLoadedClass(TLoadedClass other) {
    __isset_bitfield = other.__isset_bitfield;
    this.loadedClassCount = other.loadedClassCount;
    this.unloadedClassCount = other.unloadedClassCount;
  }

  public TLoadedClass deepCopy() {
    return new TLoadedClass(this);
  }

  @Override
  public void clear() {
    setLoadedClassCountIsSet(false);
    this.loadedClassCount = 0;
    setUnloadedClassCountIsSet(false);
    this.unloadedClassCount = 0;
  }

  public long getLoadedClassCount() {
    return this.loadedClassCount;
  }

  public void setLoadedClassCount(long loadedClassCount) {
    this.loadedClassCount = loadedClassCount;
    setLoadedClassCountIsSet(true);
  }

  public void unsetLoadedClassCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LOADEDCLASSCOUNT_ISSET_ID);
  }

  /** Returns true if field loadedClassCount is set (has been assigned a value) and false otherwise */
  public boolean isSetLoadedClassCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LOADEDCLASSCOUNT_ISSET_ID);
  }

  public void setLoadedClassCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LOADEDCLASSCOUNT_ISSET_ID, value);
  }

  public long getUnloadedClassCount() {
    return this.unloadedClassCount;
  }

  public void setUnloadedClassCount(long unloadedClassCount) {
    this.unloadedClassCount = unloadedClassCount;
    setUnloadedClassCountIsSet(true);
  }

  public void unsetUnloadedClassCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UNLOADEDCLASSCOUNT_ISSET_ID);
  }

  /** Returns true if field unloadedClassCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnloadedClassCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UNLOADEDCLASSCOUNT_ISSET_ID);
  }

  public void setUnloadedClassCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UNLOADEDCLASSCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LOADED_CLASS_COUNT:
      if (value == null) {
        unsetLoadedClassCount();
      } else {
        setLoadedClassCount((java.lang.Long)value);
      }
      break;

    case UNLOADED_CLASS_COUNT:
      if (value == null) {
        unsetUnloadedClassCount();
      } else {
        setUnloadedClassCount((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LOADED_CLASS_COUNT:
      return getLoadedClassCount();

    case UNLOADED_CLASS_COUNT:
      return getUnloadedClassCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LOADED_CLASS_COUNT:
      return isSetLoadedClassCount();
    case UNLOADED_CLASS_COUNT:
      return isSetUnloadedClassCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TLoadedClass)
      return this.equals((TLoadedClass)that);
    return false;
  }

  public boolean equals(TLoadedClass that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_loadedClassCount = true;
    boolean that_present_loadedClassCount = true;
    if (this_present_loadedClassCount || that_present_loadedClassCount) {
      if (!(this_present_loadedClassCount && that_present_loadedClassCount))
        return false;
      if (this.loadedClassCount != that.loadedClassCount)
        return false;
    }

    boolean this_present_unloadedClassCount = true;
    boolean that_present_unloadedClassCount = true;
    if (this_present_unloadedClassCount || that_present_unloadedClassCount) {
      if (!(this_present_unloadedClassCount && that_present_unloadedClassCount))
        return false;
      if (this.unloadedClassCount != that.unloadedClassCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(loadedClassCount);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(unloadedClassCount);

    return hashCode;
  }

  @Override
  public int compareTo(TLoadedClass other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLoadedClassCount(), other.isSetLoadedClassCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoadedClassCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loadedClassCount, other.loadedClassCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUnloadedClassCount(), other.isSetUnloadedClassCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnloadedClassCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unloadedClassCount, other.unloadedClassCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLoadedClass(");
    boolean first = true;

    sb.append("loadedClassCount:");
    sb.append(this.loadedClassCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unloadedClassCount:");
    sb.append(this.unloadedClassCount);
    first = false;
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

  private static class TLoadedClassStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLoadedClassStandardScheme getScheme() {
      return new TLoadedClassStandardScheme();
    }
  }

  private static class TLoadedClassStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLoadedClass> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLoadedClass struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOADED_CLASS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.loadedClassCount = iprot.readI64();
              struct.setLoadedClassCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNLOADED_CLASS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.unloadedClassCount = iprot.readI64();
              struct.setUnloadedClassCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLoadedClass struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LOADED_CLASS_COUNT_FIELD_DESC);
      oprot.writeI64(struct.loadedClassCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNLOADED_CLASS_COUNT_FIELD_DESC);
      oprot.writeI64(struct.unloadedClassCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLoadedClassTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLoadedClassTupleScheme getScheme() {
      return new TLoadedClassTupleScheme();
    }
  }

  private static class TLoadedClassTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLoadedClass> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLoadedClass struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLoadedClassCount()) {
        optionals.set(0);
      }
      if (struct.isSetUnloadedClassCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLoadedClassCount()) {
        oprot.writeI64(struct.loadedClassCount);
      }
      if (struct.isSetUnloadedClassCount()) {
        oprot.writeI64(struct.unloadedClassCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLoadedClass struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.loadedClassCount = iprot.readI64();
        struct.setLoadedClassCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.unloadedClassCount = iprot.readI64();
        struct.setUnloadedClassCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

