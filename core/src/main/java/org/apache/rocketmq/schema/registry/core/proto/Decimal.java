// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: decimal.proto

package org.apache.rocketmq.schema.registry.core.proto;

/**
 * Protobuf type {@code confluent.type.Decimal}
 */
public final class Decimal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:confluent.type.Decimal)
		io.confluent.protobuf.type.DecimalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Decimal.newBuilder() to construct.
  private Decimal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Decimal() {
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new Decimal();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Decimal(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            value_ = input.readBytes();
            break;
          }
          case 16: {

            precision_ = input.readUInt32();
            break;
          }
          case 24: {

            scale_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.confluent.protobuf.type.DecimalProto.internal_static_confluent_type_Decimal_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.confluent.protobuf.type.DecimalProto.internal_static_confluent_type_Decimal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Decimal.class, Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString value_;
  /**
   * <pre>
   * The two's-complement representation of the unscaled integer value in big-endian byte order
   * </pre>
   *
   * <code>bytes value = 1;</code>
   * @return The value.
   */
  @Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int PRECISION_FIELD_NUMBER = 2;
  private int precision_;
  /**
   * <pre>
   * The precision
   * </pre>
   *
   * <code>uint32 precision = 2;</code>
   * @return The precision.
   */
  @Override
  public int getPrecision() {
    return precision_;
  }

  public static final int SCALE_FIELD_NUMBER = 3;
  private int scale_;
  /**
   * <pre>
   * The scale
   * </pre>
   *
   * <code>int32 scale = 3;</code>
   * @return The scale.
   */
  @Override
  public int getScale() {
    return scale_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!value_.isEmpty()) {
      output.writeBytes(1, value_);
    }
    if (precision_ != 0) {
      output.writeUInt32(2, precision_);
    }
    if (scale_ != 0) {
      output.writeInt32(3, scale_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, value_);
    }
    if (precision_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, precision_);
    }
    if (scale_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, scale_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Decimal)) {
      return super.equals(obj);
    }
    Decimal other = (Decimal) obj;

    if (!getValue()
        .equals(other.getValue())) return false;
    if (getPrecision()
        != other.getPrecision()) return false;
    if (getScale()
        != other.getScale()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + getPrecision();
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + getScale();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Decimal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Decimal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Decimal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Decimal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Decimal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Decimal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Decimal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Decimal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Decimal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Decimal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Decimal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Decimal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Decimal prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code confluent.type.Decimal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:confluent.type.Decimal)
      io.confluent.protobuf.type.DecimalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.protobuf.type.DecimalProto.internal_static_confluent_type_Decimal_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.protobuf.type.DecimalProto.internal_static_confluent_type_Decimal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Decimal.class, Builder.class);
    }

    // Construct using io.confluent.protobuf.type.Decimal.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      value_ = com.google.protobuf.ByteString.EMPTY;

      precision_ = 0;

      scale_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.confluent.protobuf.type.DecimalProto.internal_static_confluent_type_Decimal_descriptor;
    }

    @Override
    public Decimal getDefaultInstanceForType() {
      return Decimal.getDefaultInstance();
    }

    @Override
    public Decimal build() {
      Decimal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Decimal buildPartial() {
      Decimal result = new Decimal(this);
      result.value_ = value_;
      result.precision_ = precision_;
      result.scale_ = scale_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Decimal) {
        return mergeFrom((Decimal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Decimal other) {
      if (other == Decimal.getDefaultInstance()) return this;
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getPrecision() != 0) {
        setPrecision(other.getPrecision());
      }
      if (other.getScale() != 0) {
        setScale(other.getScale());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Decimal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Decimal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The two's-complement representation of the unscaled integer value in big-endian byte order
     * </pre>
     *
     * <code>bytes value = 1;</code>
     * @return The value.
     */
    @Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * The two's-complement representation of the unscaled integer value in big-endian byte order
     * </pre>
     *
     * <code>bytes value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The two's-complement representation of the unscaled integer value in big-endian byte order
     * </pre>
     *
     * <code>bytes value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private int precision_ ;
    /**
     * <pre>
     * The precision
     * </pre>
     *
     * <code>uint32 precision = 2;</code>
     * @return The precision.
     */
    @Override
    public int getPrecision() {
      return precision_;
    }
    /**
     * <pre>
     * The precision
     * </pre>
     *
     * <code>uint32 precision = 2;</code>
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(int value) {
      
      precision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The precision
     * </pre>
     *
     * <code>uint32 precision = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      
      precision_ = 0;
      onChanged();
      return this;
    }

    private int scale_ ;
    /**
     * <pre>
     * The scale
     * </pre>
     *
     * <code>int32 scale = 3;</code>
     * @return The scale.
     */
    @Override
    public int getScale() {
      return scale_;
    }
    /**
     * <pre>
     * The scale
     * </pre>
     *
     * <code>int32 scale = 3;</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(int value) {
      
      scale_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The scale
     * </pre>
     *
     * <code>int32 scale = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      
      scale_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:confluent.type.Decimal)
  }

  // @@protoc_insertion_point(class_scope:confluent.type.Decimal)
  private static final Decimal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Decimal();
  }

  public static Decimal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Decimal>
      PARSER = new com.google.protobuf.AbstractParser<Decimal>() {
    @Override
    public Decimal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Decimal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Decimal> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Decimal> getParserForType() {
    return PARSER;
  }

  @Override
  public Decimal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

