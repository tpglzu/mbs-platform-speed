/**
 * Autogenerated by Thrift Compiler (0.14.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ycu.tang.msbplatform.speed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.2)", date = "2021-11-03")
public class Location implements org.apache.thrift.TBase<Location, Location._Fields>, java.io.Serializable, Cloneable, Comparable<Location> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Location");

  private static final org.apache.thrift.protocol.TField CITY_FIELD_DESC = new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("country", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LocationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LocationTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String city; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String state; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String country; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CITY((short)1, "city"),
    STATE((short)2, "state"),
    COUNTRY((short)3, "country");

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
        case 1: // CITY
          return CITY;
        case 2: // STATE
          return STATE;
        case 3: // COUNTRY
          return COUNTRY;
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
  private static final _Fields optionals[] = {_Fields.CITY,_Fields.STATE,_Fields.COUNTRY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CITY, new org.apache.thrift.meta_data.FieldMetaData("city", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("country", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Location.class, metaDataMap);
  }

  public Location() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Location(Location other) {
    if (other.isSetCity()) {
      this.city = other.city;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetCountry()) {
      this.country = other.country;
    }
  }

  public Location deepCopy() {
    return new Location(this);
  }

  @Override
  public void clear() {
    this.city = null;
    this.state = null;
    this.country = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCity() {
    return this.city;
  }

  public Location setCity(@org.apache.thrift.annotation.Nullable java.lang.String city) {
    this.city = city;
    return this;
  }

  public void unsetCity() {
    this.city = null;
  }

  /** Returns true if field city is set (has been assigned a value) and false otherwise */
  public boolean isSetCity() {
    return this.city != null;
  }

  public void setCityIsSet(boolean value) {
    if (!value) {
      this.city = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getState() {
    return this.state;
  }

  public Location setState(@org.apache.thrift.annotation.Nullable java.lang.String state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCountry() {
    return this.country;
  }

  public Location setCountry(@org.apache.thrift.annotation.Nullable java.lang.String country) {
    this.country = country;
    return this;
  }

  public void unsetCountry() {
    this.country = null;
  }

  /** Returns true if field country is set (has been assigned a value) and false otherwise */
  public boolean isSetCountry() {
    return this.country != null;
  }

  public void setCountryIsSet(boolean value) {
    if (!value) {
      this.country = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CITY:
      if (value == null) {
        unsetCity();
      } else {
        setCity((java.lang.String)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((java.lang.String)value);
      }
      break;

    case COUNTRY:
      if (value == null) {
        unsetCountry();
      } else {
        setCountry((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CITY:
      return getCity();

    case STATE:
      return getState();

    case COUNTRY:
      return getCountry();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CITY:
      return isSetCity();
    case STATE:
      return isSetState();
    case COUNTRY:
      return isSetCountry();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Location)
      return this.equals((Location)that);
    return false;
  }

  public boolean equals(Location that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_city = true && this.isSetCity();
    boolean that_present_city = true && that.isSetCity();
    if (this_present_city || that_present_city) {
      if (!(this_present_city && that_present_city))
        return false;
      if (!this.city.equals(that.city))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_country = true && this.isSetCountry();
    boolean that_present_country = true && that.isSetCountry();
    if (this_present_country || that_present_country) {
      if (!(this_present_country && that_present_country))
        return false;
      if (!this.country.equals(that.country))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCity()) ? 131071 : 524287);
    if (isSetCity())
      hashCode = hashCode * 8191 + city.hashCode();

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.hashCode();

    hashCode = hashCode * 8191 + ((isSetCountry()) ? 131071 : 524287);
    if (isSetCountry())
      hashCode = hashCode * 8191 + country.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Location other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCity(), other.isSetCity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.city, other.city);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetState(), other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCountry(), other.isSetCountry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.country, other.country);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(");
    boolean first = true;

    if (isSetCity()) {
      sb.append("city:");
      if (this.city == null) {
        sb.append("null");
      } else {
        sb.append(this.city);
      }
      first = false;
    }
    if (isSetState()) {
      if (!first) sb.append(", ");
      sb.append("state:");
      if (this.state == null) {
        sb.append("null");
      } else {
        sb.append(this.state);
      }
      first = false;
    }
    if (isSetCountry()) {
      if (!first) sb.append(", ");
      sb.append("country:");
      if (this.country == null) {
        sb.append("null");
      } else {
        sb.append(this.country);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LocationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LocationStandardScheme getScheme() {
      return new LocationStandardScheme();
    }
  }

  private static class LocationStandardScheme extends org.apache.thrift.scheme.StandardScheme<Location> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.city = iprot.readString();
              struct.setCityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.state = iprot.readString();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.country = iprot.readString();
              struct.setCountryIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Location struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.city != null) {
        if (struct.isSetCity()) {
          oprot.writeFieldBegin(CITY_FIELD_DESC);
          oprot.writeString(struct.city);
          oprot.writeFieldEnd();
        }
      }
      if (struct.state != null) {
        if (struct.isSetState()) {
          oprot.writeFieldBegin(STATE_FIELD_DESC);
          oprot.writeString(struct.state);
          oprot.writeFieldEnd();
        }
      }
      if (struct.country != null) {
        if (struct.isSetCountry()) {
          oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
          oprot.writeString(struct.country);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LocationTupleScheme getScheme() {
      return new LocationTupleScheme();
    }
  }

  private static class LocationTupleScheme extends org.apache.thrift.scheme.TupleScheme<Location> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCity()) {
        optionals.set(0);
      }
      if (struct.isSetState()) {
        optionals.set(1);
      }
      if (struct.isSetCountry()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCity()) {
        oprot.writeString(struct.city);
      }
      if (struct.isSetState()) {
        oprot.writeString(struct.state);
      }
      if (struct.isSetCountry()) {
        oprot.writeString(struct.country);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Location struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.city = iprot.readString();
        struct.setCityIsSet(true);
      }
      if (incoming.get(1)) {
        struct.state = iprot.readString();
        struct.setStateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.country = iprot.readString();
        struct.setCountryIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

