/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class CommitTxnRequest implements org.apache.thrift.TBase<CommitTxnRequest, CommitTxnRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CommitTxnRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommitTxnRequest");

  private static final org.apache.thrift.protocol.TField TXNID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField REPL_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("replPolicy", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WRITE_EVENT_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("writeEventInfos", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommitTxnRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommitTxnRequestTupleSchemeFactory());
  }

  private long txnid; // required
  private String replPolicy; // optional
  private List<WriteEventInfo> writeEventInfos; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXNID((short)1, "txnid"),
    REPL_POLICY((short)2, "replPolicy"),
    WRITE_EVENT_INFOS((short)3, "writeEventInfos");

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
        case 1: // TXNID
          return TXNID;
        case 2: // REPL_POLICY
          return REPL_POLICY;
        case 3: // WRITE_EVENT_INFOS
          return WRITE_EVENT_INFOS;
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
  private static final int __TXNID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.REPL_POLICY,_Fields.WRITE_EVENT_INFOS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXNID, new org.apache.thrift.meta_data.FieldMetaData("txnid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REPL_POLICY, new org.apache.thrift.meta_data.FieldMetaData("replPolicy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WRITE_EVENT_INFOS, new org.apache.thrift.meta_data.FieldMetaData("writeEventInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "WriteEventInfo"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommitTxnRequest.class, metaDataMap);
  }

  public CommitTxnRequest() {
  }

  public CommitTxnRequest(
    long txnid)
  {
    this();
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommitTxnRequest(CommitTxnRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txnid = other.txnid;
    if (other.isSetReplPolicy()) {
      this.replPolicy = other.replPolicy;
    }
    if (other.isSetWriteEventInfos()) {
      List<WriteEventInfo> __this__writeEventInfos = new ArrayList<WriteEventInfo>(other.writeEventInfos.size());
      for (WriteEventInfo other_element : other.writeEventInfos) {
        __this__writeEventInfos.add(other_element);
      }
      this.writeEventInfos = __this__writeEventInfos;
    }
  }

  public CommitTxnRequest deepCopy() {
    return new CommitTxnRequest(this);
  }

  @Override
  public void clear() {
    setTxnidIsSet(false);
    this.txnid = 0;
    this.replPolicy = null;
    this.writeEventInfos = null;
  }

  public long getTxnid() {
    return this.txnid;
  }

  public void setTxnid(long txnid) {
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  public void unsetTxnid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnid is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnid() {
    return EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public String getReplPolicy() {
    return this.replPolicy;
  }

  public void setReplPolicy(String replPolicy) {
    this.replPolicy = replPolicy;
  }

  public void unsetReplPolicy() {
    this.replPolicy = null;
  }

  /** Returns true if field replPolicy is set (has been assigned a value) and false otherwise */
  public boolean isSetReplPolicy() {
    return this.replPolicy != null;
  }

  public void setReplPolicyIsSet(boolean value) {
    if (!value) {
      this.replPolicy = null;
    }
  }

  public int getWriteEventInfosSize() {
    return (this.writeEventInfos == null) ? 0 : this.writeEventInfos.size();
  }

  public java.util.Iterator<WriteEventInfo> getWriteEventInfosIterator() {
    return (this.writeEventInfos == null) ? null : this.writeEventInfos.iterator();
  }

  public void addToWriteEventInfos(WriteEventInfo elem) {
    if (this.writeEventInfos == null) {
      this.writeEventInfos = new ArrayList<WriteEventInfo>();
    }
    this.writeEventInfos.add(elem);
  }

  public List<WriteEventInfo> getWriteEventInfos() {
    return this.writeEventInfos;
  }

  public void setWriteEventInfos(List<WriteEventInfo> writeEventInfos) {
    this.writeEventInfos = writeEventInfos;
  }

  public void unsetWriteEventInfos() {
    this.writeEventInfos = null;
  }

  /** Returns true if field writeEventInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteEventInfos() {
    return this.writeEventInfos != null;
  }

  public void setWriteEventInfosIsSet(boolean value) {
    if (!value) {
      this.writeEventInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TXNID:
      if (value == null) {
        unsetTxnid();
      } else {
        setTxnid((Long)value);
      }
      break;

    case REPL_POLICY:
      if (value == null) {
        unsetReplPolicy();
      } else {
        setReplPolicy((String)value);
      }
      break;

    case WRITE_EVENT_INFOS:
      if (value == null) {
        unsetWriteEventInfos();
      } else {
        setWriteEventInfos((List<WriteEventInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TXNID:
      return getTxnid();

    case REPL_POLICY:
      return getReplPolicy();

    case WRITE_EVENT_INFOS:
      return getWriteEventInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TXNID:
      return isSetTxnid();
    case REPL_POLICY:
      return isSetReplPolicy();
    case WRITE_EVENT_INFOS:
      return isSetWriteEventInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommitTxnRequest)
      return this.equals((CommitTxnRequest)that);
    return false;
  }

  public boolean equals(CommitTxnRequest that) {
    if (that == null)
      return false;

    boolean this_present_txnid = true;
    boolean that_present_txnid = true;
    if (this_present_txnid || that_present_txnid) {
      if (!(this_present_txnid && that_present_txnid))
        return false;
      if (this.txnid != that.txnid)
        return false;
    }

    boolean this_present_replPolicy = true && this.isSetReplPolicy();
    boolean that_present_replPolicy = true && that.isSetReplPolicy();
    if (this_present_replPolicy || that_present_replPolicy) {
      if (!(this_present_replPolicy && that_present_replPolicy))
        return false;
      if (!this.replPolicy.equals(that.replPolicy))
        return false;
    }

    boolean this_present_writeEventInfos = true && this.isSetWriteEventInfos();
    boolean that_present_writeEventInfos = true && that.isSetWriteEventInfos();
    if (this_present_writeEventInfos || that_present_writeEventInfos) {
      if (!(this_present_writeEventInfos && that_present_writeEventInfos))
        return false;
      if (!this.writeEventInfos.equals(that.writeEventInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_txnid = true;
    list.add(present_txnid);
    if (present_txnid)
      list.add(txnid);

    boolean present_replPolicy = true && (isSetReplPolicy());
    list.add(present_replPolicy);
    if (present_replPolicy)
      list.add(replPolicy);

    boolean present_writeEventInfos = true && (isSetWriteEventInfos());
    list.add(present_writeEventInfos);
    if (present_writeEventInfos)
      list.add(writeEventInfos);

    return list.hashCode();
  }

  @Override
  public int compareTo(CommitTxnRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTxnid()).compareTo(other.isSetTxnid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnid, other.txnid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReplPolicy()).compareTo(other.isSetReplPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replPolicy, other.replPolicy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteEventInfos()).compareTo(other.isSetWriteEventInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteEventInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeEventInfos, other.writeEventInfos);
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
    StringBuilder sb = new StringBuilder("CommitTxnRequest(");
    boolean first = true;

    sb.append("txnid:");
    sb.append(this.txnid);
    first = false;
    if (isSetReplPolicy()) {
      if (!first) sb.append(", ");
      sb.append("replPolicy:");
      if (this.replPolicy == null) {
        sb.append("null");
      } else {
        sb.append(this.replPolicy);
      }
      first = false;
    }
    if (isSetWriteEventInfos()) {
      if (!first) sb.append(", ");
      sb.append("writeEventInfos:");
      if (this.writeEventInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.writeEventInfos);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxnid()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnid' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CommitTxnRequestStandardSchemeFactory implements SchemeFactory {
    public CommitTxnRequestStandardScheme getScheme() {
      return new CommitTxnRequestStandardScheme();
    }
  }

  private static class CommitTxnRequestStandardScheme extends StandardScheme<CommitTxnRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXNID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnid = iprot.readI64();
              struct.setTxnidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPL_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.replPolicy = iprot.readString();
              struct.setReplPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WRITE_EVENT_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list594 = iprot.readListBegin();
                struct.writeEventInfos = new ArrayList<WriteEventInfo>(_list594.size);
                WriteEventInfo _elem595;
                for (int _i596 = 0; _i596 < _list594.size; ++_i596)
                {
                  _elem595 = new WriteEventInfo();
                  _elem595.read(iprot);
                  struct.writeEventInfos.add(_elem595);
                }
                iprot.readListEnd();
              }
              struct.setWriteEventInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXNID_FIELD_DESC);
      oprot.writeI64(struct.txnid);
      oprot.writeFieldEnd();
      if (struct.replPolicy != null) {
        if (struct.isSetReplPolicy()) {
          oprot.writeFieldBegin(REPL_POLICY_FIELD_DESC);
          oprot.writeString(struct.replPolicy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.writeEventInfos != null) {
        if (struct.isSetWriteEventInfos()) {
          oprot.writeFieldBegin(WRITE_EVENT_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.writeEventInfos.size()));
            for (WriteEventInfo _iter597 : struct.writeEventInfos)
            {
              _iter597.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommitTxnRequestTupleSchemeFactory implements SchemeFactory {
    public CommitTxnRequestTupleScheme getScheme() {
      return new CommitTxnRequestTupleScheme();
    }
  }

  private static class CommitTxnRequestTupleScheme extends TupleScheme<CommitTxnRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.txnid);
      BitSet optionals = new BitSet();
      if (struct.isSetReplPolicy()) {
        optionals.set(0);
      }
      if (struct.isSetWriteEventInfos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReplPolicy()) {
        oprot.writeString(struct.replPolicy);
      }
      if (struct.isSetWriteEventInfos()) {
        {
          oprot.writeI32(struct.writeEventInfos.size());
          for (WriteEventInfo _iter598 : struct.writeEventInfos)
          {
            _iter598.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.txnid = iprot.readI64();
      struct.setTxnidIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.replPolicy = iprot.readString();
        struct.setReplPolicyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list599 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.writeEventInfos = new ArrayList<WriteEventInfo>(_list599.size);
          WriteEventInfo _elem600;
          for (int _i601 = 0; _i601 < _list599.size; ++_i601)
          {
            _elem600 = new WriteEventInfo();
            _elem600.read(iprot);
            struct.writeEventInfos.add(_elem600);
          }
        }
        struct.setWriteEventInfosIsSet(true);
      }
    }
  }

}
