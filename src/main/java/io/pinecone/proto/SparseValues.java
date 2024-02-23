// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vector_service.proto

// Protobuf Java Version: 3.25.2
package io.pinecone.proto;

/**
 * Protobuf type {@code SparseValues}
 */
public final class SparseValues extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SparseValues)
    SparseValuesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SparseValues.newBuilder() to construct.
  private SparseValues(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SparseValues() {
    indices_ = emptyIntList();
    values_ = emptyFloatList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SparseValues();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return VectorServiceOuterClass.internal_static_SparseValues_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return VectorServiceOuterClass.internal_static_SparseValues_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SparseValues.class, Builder.class);
  }

  public static final int INDICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList indices_ =
      emptyIntList();
  /**
   * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return A list containing the indices.
   */
  @Override
  public java.util.List<Integer>
      getIndicesList() {
    return indices_;
  }
  /**
   * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The count of indices.
   */
  public int getIndicesCount() {
    return indices_.size();
  }
  /**
   * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The indices at the given index.
   */
  public int getIndices(int index) {
    return indices_.getInt(index);
  }
  private int indicesMemoizedSerializedSize = -1;

  public static final int VALUES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.FloatList values_ =
      emptyFloatList();
  /**
   * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return A list containing the values.
   */
  @Override
  public java.util.List<Float>
      getValuesList() {
    return values_;
  }
  /**
   * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public float getValues(int index) {
    return values_.getFloat(index);
  }
  private int valuesMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getIndicesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(indicesMemoizedSerializedSize);
    }
    for (int i = 0; i < indices_.size(); i++) {
      output.writeUInt32NoTag(indices_.getInt(i));
    }
    if (getValuesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(valuesMemoizedSerializedSize);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeFloatNoTag(values_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < indices_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(indices_.getInt(i));
      }
      size += dataSize;
      if (!getIndicesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      indicesMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 4 * getValuesList().size();
      size += dataSize;
      if (!getValuesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valuesMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SparseValues)) {
      return super.equals(obj);
    }
    SparseValues other = (SparseValues) obj;

    if (!getIndicesList()
        .equals(other.getIndicesList())) return false;
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getIndicesCount() > 0) {
      hash = (37 * hash) + INDICES_FIELD_NUMBER;
      hash = (53 * hash) + getIndicesList().hashCode();
    }
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SparseValues parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SparseValues parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SparseValues parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SparseValues parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SparseValues parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SparseValues parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SparseValues parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SparseValues parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static SparseValues parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static SparseValues parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SparseValues parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SparseValues parseFrom(
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
  public static Builder newBuilder(SparseValues prototype) {
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
   * Protobuf type {@code SparseValues}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SparseValues)
      SparseValuesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VectorServiceOuterClass.internal_static_SparseValues_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VectorServiceOuterClass.internal_static_SparseValues_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SparseValues.class, Builder.class);
    }

    // Construct using io.pinecone.proto.SparseValues.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      indices_ = emptyIntList();
      values_ = emptyFloatList();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return VectorServiceOuterClass.internal_static_SparseValues_descriptor;
    }

    @Override
    public SparseValues getDefaultInstanceForType() {
      return SparseValues.getDefaultInstance();
    }

    @Override
    public SparseValues build() {
      SparseValues result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public SparseValues buildPartial() {
      SparseValues result = new SparseValues(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(SparseValues result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        indices_.makeImmutable();
        result.indices_ = indices_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        values_.makeImmutable();
        result.values_ = values_;
      }
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
      if (other instanceof SparseValues) {
        return mergeFrom((SparseValues)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SparseValues other) {
      if (other == SparseValues.getDefaultInstance()) return this;
      if (!other.indices_.isEmpty()) {
        if (indices_.isEmpty()) {
          indices_ = other.indices_;
          indices_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureIndicesIsMutable();
          indices_.addAll(other.indices_);
        }
        onChanged();
      }
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          values_.makeImmutable();
          bitField0_ |= 0x00000002;
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int v = input.readUInt32();
              ensureIndicesIsMutable();
              indices_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureIndicesIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                indices_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 21: {
              float v = input.readFloat();
              ensureValuesIsMutable();
              values_.addFloat(v);
              break;
            } // case 21
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              int alloc = length > 4096 ? 4096 : length;
              ensureValuesIsMutable(alloc / 4);
              while (input.getBytesUntilLimit() > 0) {
                values_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList indices_ = emptyIntList();
    private void ensureIndicesIsMutable() {
      if (!indices_.isModifiable()) {
        indices_ = makeMutableCopy(indices_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return A list containing the indices.
     */
    public java.util.List<Integer>
        getIndicesList() {
      indices_.makeImmutable();
      return indices_;
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The count of indices.
     */
    public int getIndicesCount() {
      return indices_.size();
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param index The index of the element to return.
     * @return The indices at the given index.
     */
    public int getIndices(int index) {
      return indices_.getInt(index);
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The indices to set.
     * @return This builder for chaining.
     */
    public Builder setIndices(
        int index, int value) {

      ensureIndicesIsMutable();
      indices_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The indices to add.
     * @return This builder for chaining.
     */
    public Builder addIndices(int value) {

      ensureIndicesIsMutable();
      indices_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param values The indices to add.
     * @return This builder for chaining.
     */
    public Builder addAllIndices(
        Iterable<? extends Integer> values) {
      ensureIndicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, indices_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 indices = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearIndices() {
      indices_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList values_ = emptyFloatList();
    private void ensureValuesIsMutable() {
      if (!values_.isModifiable()) {
        values_ = makeMutableCopy(values_);
      }
      bitField0_ |= 0x00000002;
    }
    private void ensureValuesIsMutable(int capacity) {
      if (!values_.isModifiable()) {
        values_ = makeMutableCopy(values_, capacity);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return A list containing the values.
     */
    public java.util.List<Float>
        getValuesList() {
      values_.makeImmutable();
      return values_;
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public float getValues(int index) {
      return values_.getFloat(index);
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, float value) {

      ensureValuesIsMutable();
      values_.setFloat(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(float value) {

      ensureValuesIsMutable();
      values_.addFloat(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        Iterable<? extends Float> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, values_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float values = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:SparseValues)
  }

  // @@protoc_insertion_point(class_scope:SparseValues)
  private static final SparseValues DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SparseValues();
  }

  public static SparseValues getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SparseValues>
      PARSER = new com.google.protobuf.AbstractParser<SparseValues>() {
    @Override
    public SparseValues parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SparseValues> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SparseValues> getParserForType() {
    return PARSER;
  }

  @Override
  public SparseValues getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

