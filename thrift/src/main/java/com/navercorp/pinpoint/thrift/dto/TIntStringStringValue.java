/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-06-30")
public class TIntStringStringValue implements org.apache.thrift.TBase<TIntStringStringValue, TIntStringStringValue._Fields>, java.io.Serializable, Cloneable, Comparable<TIntStringStringValue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TIntStringStringValue");

  private static final org.apache.thrift.protocol.TField INT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("intValue", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STRING_VALUE1_FIELD_DESC = new org.apache.thrift.protocol.TField("stringValue1", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STRING_VALUE2_FIELD_DESC = new org.apache.thrift.protocol.TField("stringValue2", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TIntStringStringValueStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TIntStringStringValueTupleSchemeFactory();

  private int intValue; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String stringValue1; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String stringValue2; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INT_VALUE((short)1, "intValue"),
    STRING_VALUE1((short)2, "stringValue1"),
    STRING_VALUE2((short)3, "stringValue2");

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
        case 1: // INT_VALUE
          return INT_VALUE;
        case 2: // STRING_VALUE1
          return STRING_VALUE1;
        case 3: // STRING_VALUE2
          return STRING_VALUE2;
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
  private static final int __INTVALUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STRING_VALUE1,_Fields.STRING_VALUE2};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("intValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STRING_VALUE1, new org.apache.thrift.meta_data.FieldMetaData("stringValue1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STRING_VALUE2, new org.apache.thrift.meta_data.FieldMetaData("stringValue2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TIntStringStringValue.class, metaDataMap);
  }

  public TIntStringStringValue() {
  }

  public TIntStringStringValue(
    int intValue)
  {
    this();
    this.intValue = intValue;
    setIntValueIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TIntStringStringValue(TIntStringStringValue other) {
    __isset_bitfield = other.__isset_bitfield;
    this.intValue = other.intValue;
    if (other.isSetStringValue1()) {
      this.stringValue1 = other.stringValue1;
    }
    if (other.isSetStringValue2()) {
      this.stringValue2 = other.stringValue2;
    }
  }

  public TIntStringStringValue deepCopy() {
    return new TIntStringStringValue(this);
  }

  @Override
  public void clear() {
    setIntValueIsSet(false);
    this.intValue = 0;
    this.stringValue1 = null;
    this.stringValue2 = null;
  }

  public int getIntValue() {
    return this.intValue;
  }

  public void setIntValue(int intValue) {
    this.intValue = intValue;
    setIntValueIsSet(true);
  }

  public void unsetIntValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTVALUE_ISSET_ID);
  }

  /** Returns true if field intValue is set (has been assigned a value) and false otherwise */
  public boolean isSetIntValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTVALUE_ISSET_ID);
  }

  public void setIntValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTVALUE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStringValue1() {
    return this.stringValue1;
  }

  public void setStringValue1(@org.apache.thrift.annotation.Nullable java.lang.String stringValue1) {
    this.stringValue1 = stringValue1;
  }

  public void unsetStringValue1() {
    this.stringValue1 = null;
  }

  /** Returns true if field stringValue1 is set (has been assigned a value) and false otherwise */
  public boolean isSetStringValue1() {
    return this.stringValue1 != null;
  }

  public void setStringValue1IsSet(boolean value) {
    if (!value) {
      this.stringValue1 = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStringValue2() {
    return this.stringValue2;
  }

  public void setStringValue2(@org.apache.thrift.annotation.Nullable java.lang.String stringValue2) {
    this.stringValue2 = stringValue2;
  }

  public void unsetStringValue2() {
    this.stringValue2 = null;
  }

  /** Returns true if field stringValue2 is set (has been assigned a value) and false otherwise */
  public boolean isSetStringValue2() {
    return this.stringValue2 != null;
  }

  public void setStringValue2IsSet(boolean value) {
    if (!value) {
      this.stringValue2 = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INT_VALUE:
      if (value == null) {
        unsetIntValue();
      } else {
        setIntValue((java.lang.Integer)value);
      }
      break;

    case STRING_VALUE1:
      if (value == null) {
        unsetStringValue1();
      } else {
        setStringValue1((java.lang.String)value);
      }
      break;

    case STRING_VALUE2:
      if (value == null) {
        unsetStringValue2();
      } else {
        setStringValue2((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INT_VALUE:
      return getIntValue();

    case STRING_VALUE1:
      return getStringValue1();

    case STRING_VALUE2:
      return getStringValue2();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INT_VALUE:
      return isSetIntValue();
    case STRING_VALUE1:
      return isSetStringValue1();
    case STRING_VALUE2:
      return isSetStringValue2();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TIntStringStringValue)
      return this.equals((TIntStringStringValue)that);
    return false;
  }

  public boolean equals(TIntStringStringValue that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_intValue = true;
    boolean that_present_intValue = true;
    if (this_present_intValue || that_present_intValue) {
      if (!(this_present_intValue && that_present_intValue))
        return false;
      if (this.intValue != that.intValue)
        return false;
    }

    boolean this_present_stringValue1 = true && this.isSetStringValue1();
    boolean that_present_stringValue1 = true && that.isSetStringValue1();
    if (this_present_stringValue1 || that_present_stringValue1) {
      if (!(this_present_stringValue1 && that_present_stringValue1))
        return false;
      if (!this.stringValue1.equals(that.stringValue1))
        return false;
    }

    boolean this_present_stringValue2 = true && this.isSetStringValue2();
    boolean that_present_stringValue2 = true && that.isSetStringValue2();
    if (this_present_stringValue2 || that_present_stringValue2) {
      if (!(this_present_stringValue2 && that_present_stringValue2))
        return false;
      if (!this.stringValue2.equals(that.stringValue2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + intValue;

    hashCode = hashCode * 8191 + ((isSetStringValue1()) ? 131071 : 524287);
    if (isSetStringValue1())
      hashCode = hashCode * 8191 + stringValue1.hashCode();

    hashCode = hashCode * 8191 + ((isSetStringValue2()) ? 131071 : 524287);
    if (isSetStringValue2())
      hashCode = hashCode * 8191 + stringValue2.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TIntStringStringValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetIntValue(), other.isSetIntValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intValue, other.intValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStringValue1(), other.isSetStringValue1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringValue1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringValue1, other.stringValue1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStringValue2(), other.isSetStringValue2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringValue2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringValue2, other.stringValue2);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TIntStringStringValue(");
    boolean first = true;

    sb.append("intValue:");
    sb.append(this.intValue);
    first = false;
    if (isSetStringValue1()) {
      if (!first) sb.append(", ");
      sb.append("stringValue1:");
      if (this.stringValue1 == null) {
        sb.append("null");
      } else {
        sb.append(this.stringValue1);
      }
      first = false;
    }
    if (isSetStringValue2()) {
      if (!first) sb.append(", ");
      sb.append("stringValue2:");
      if (this.stringValue2 == null) {
        sb.append("null");
      } else {
        sb.append(this.stringValue2);
      }
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

  private static class TIntStringStringValueStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TIntStringStringValueStandardScheme getScheme() {
      return new TIntStringStringValueStandardScheme();
    }
  }

  private static class TIntStringStringValueStandardScheme extends org.apache.thrift.scheme.StandardScheme<TIntStringStringValue> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TIntStringStringValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INT_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intValue = iprot.readI32();
              struct.setIntValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STRING_VALUE1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stringValue1 = iprot.readString();
              struct.setStringValue1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STRING_VALUE2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stringValue2 = iprot.readString();
              struct.setStringValue2IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TIntStringStringValue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INT_VALUE_FIELD_DESC);
      oprot.writeI32(struct.intValue);
      oprot.writeFieldEnd();
      if (struct.stringValue1 != null) {
        if (struct.isSetStringValue1()) {
          oprot.writeFieldBegin(STRING_VALUE1_FIELD_DESC);
          oprot.writeString(struct.stringValue1);
          oprot.writeFieldEnd();
        }
      }
      if (struct.stringValue2 != null) {
        if (struct.isSetStringValue2()) {
          oprot.writeFieldBegin(STRING_VALUE2_FIELD_DESC);
          oprot.writeString(struct.stringValue2);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TIntStringStringValueTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TIntStringStringValueTupleScheme getScheme() {
      return new TIntStringStringValueTupleScheme();
    }
  }

  private static class TIntStringStringValueTupleScheme extends org.apache.thrift.scheme.TupleScheme<TIntStringStringValue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TIntStringStringValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIntValue()) {
        optionals.set(0);
      }
      if (struct.isSetStringValue1()) {
        optionals.set(1);
      }
      if (struct.isSetStringValue2()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetIntValue()) {
        oprot.writeI32(struct.intValue);
      }
      if (struct.isSetStringValue1()) {
        oprot.writeString(struct.stringValue1);
      }
      if (struct.isSetStringValue2()) {
        oprot.writeString(struct.stringValue2);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TIntStringStringValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.intValue = iprot.readI32();
        struct.setIntValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stringValue1 = iprot.readString();
        struct.setStringValue1IsSet(true);
      }
      if (incoming.get(2)) {
        struct.stringValue2 = iprot.readString();
        struct.setStringValue2IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

