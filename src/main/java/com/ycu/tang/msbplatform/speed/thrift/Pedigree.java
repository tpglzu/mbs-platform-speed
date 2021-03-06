/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ycu.tang.msbplatform.speed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-11-03")
public class Pedigree implements org.apache.thrift.TBase<Pedigree, Pedigree._Fields>, java.io.Serializable, Cloneable, Comparable<Pedigree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pedigree");

  private static final org.apache.thrift.protocol.TField TRUE_AS_OF_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("true_as_of_secs", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PedigreeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PedigreeTupleSchemeFactory();

  public int true_as_of_secs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRUE_AS_OF_SECS((short)1, "true_as_of_secs");

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
        case 1: // TRUE_AS_OF_SECS
          return TRUE_AS_OF_SECS;
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
  private static final int __TRUE_AS_OF_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRUE_AS_OF_SECS, new org.apache.thrift.meta_data.FieldMetaData("true_as_of_secs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pedigree.class, metaDataMap);
  }

  public Pedigree() {
  }

  public Pedigree(
    int true_as_of_secs)
  {
    this();
    this.true_as_of_secs = true_as_of_secs;
    setTrue_as_of_secsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pedigree(Pedigree other) {
    __isset_bitfield = other.__isset_bitfield;
    this.true_as_of_secs = other.true_as_of_secs;
  }

  public Pedigree deepCopy() {
    return new Pedigree(this);
  }

  @Override
  public void clear() {
    setTrue_as_of_secsIsSet(false);
    this.true_as_of_secs = 0;
  }

  public int getTrue_as_of_secs() {
    return this.true_as_of_secs;
  }

  public Pedigree setTrue_as_of_secs(int true_as_of_secs) {
    this.true_as_of_secs = true_as_of_secs;
    setTrue_as_of_secsIsSet(true);
    return this;
  }

  public void unsetTrue_as_of_secs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID);
  }

  /** Returns true if field true_as_of_secs is set (has been assigned a value) and false otherwise */
  public boolean isSetTrue_as_of_secs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID);
  }

  public void setTrue_as_of_secsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRUE_AS_OF_SECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      if (value == null) {
        unsetTrue_as_of_secs();
      } else {
        setTrue_as_of_secs((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      return getTrue_as_of_secs();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TRUE_AS_OF_SECS:
      return isSetTrue_as_of_secs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Pedigree)
      return this.equals((Pedigree)that);
    return false;
  }

  public boolean equals(Pedigree that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_true_as_of_secs = true;
    boolean that_present_true_as_of_secs = true;
    if (this_present_true_as_of_secs || that_present_true_as_of_secs) {
      if (!(this_present_true_as_of_secs && that_present_true_as_of_secs))
        return false;
      if (this.true_as_of_secs != that.true_as_of_secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + true_as_of_secs;

    return hashCode;
  }

  @Override
  public int compareTo(Pedigree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTrue_as_of_secs(), other.isSetTrue_as_of_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrue_as_of_secs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.true_as_of_secs, other.true_as_of_secs);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Pedigree(");
    boolean first = true;

    sb.append("true_as_of_secs:");
    sb.append(this.true_as_of_secs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'true_as_of_secs' because it's a primitive and you chose the non-beans generator.
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

  private static class PedigreeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PedigreeStandardScheme getScheme() {
      return new PedigreeStandardScheme();
    }
  }

  private static class PedigreeStandardScheme extends org.apache.thrift.scheme.StandardScheme<Pedigree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRUE_AS_OF_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.true_as_of_secs = iprot.readI32();
              struct.setTrue_as_of_secsIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetTrue_as_of_secs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'true_as_of_secs' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pedigree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TRUE_AS_OF_SECS_FIELD_DESC);
      oprot.writeI32(struct.true_as_of_secs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PedigreeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PedigreeTupleScheme getScheme() {
      return new PedigreeTupleScheme();
    }
  }

  private static class PedigreeTupleScheme extends org.apache.thrift.scheme.TupleScheme<Pedigree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.true_as_of_secs);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.true_as_of_secs = iprot.readI32();
      struct.setTrue_as_of_secsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

