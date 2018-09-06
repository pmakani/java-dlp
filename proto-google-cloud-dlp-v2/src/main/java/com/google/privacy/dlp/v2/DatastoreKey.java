// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Record key for a finding in Cloud Datastore.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DatastoreKey}
 */
public  final class DatastoreKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DatastoreKey)
    DatastoreKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DatastoreKey.newBuilder() to construct.
  private DatastoreKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DatastoreKey() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DatastoreKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.privacy.dlp.v2.Key.Builder subBuilder = null;
            if (entityKey_ != null) {
              subBuilder = entityKey_.toBuilder();
            }
            entityKey_ = input.readMessage(com.google.privacy.dlp.v2.Key.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entityKey_);
              entityKey_ = subBuilder.buildPartial();
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
    return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_DatastoreKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_DatastoreKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DatastoreKey.class, com.google.privacy.dlp.v2.DatastoreKey.Builder.class);
  }

  public static final int ENTITY_KEY_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.Key entityKey_;
  /**
   * <pre>
   * Datastore entity key.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
   */
  public boolean hasEntityKey() {
    return entityKey_ != null;
  }
  /**
   * <pre>
   * Datastore entity key.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
   */
  public com.google.privacy.dlp.v2.Key getEntityKey() {
    return entityKey_ == null ? com.google.privacy.dlp.v2.Key.getDefaultInstance() : entityKey_;
  }
  /**
   * <pre>
   * Datastore entity key.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
   */
  public com.google.privacy.dlp.v2.KeyOrBuilder getEntityKeyOrBuilder() {
    return getEntityKey();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (entityKey_ != null) {
      output.writeMessage(1, getEntityKey());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entityKey_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntityKey());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2.DatastoreKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DatastoreKey other = (com.google.privacy.dlp.v2.DatastoreKey) obj;

    boolean result = true;
    result = result && (hasEntityKey() == other.hasEntityKey());
    if (hasEntityKey()) {
      result = result && getEntityKey()
          .equals(other.getEntityKey());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEntityKey()) {
      hash = (37 * hash) + ENTITY_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getEntityKey().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DatastoreKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2.DatastoreKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Record key for a finding in Cloud Datastore.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DatastoreKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DatastoreKey)
      com.google.privacy.dlp.v2.DatastoreKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_DatastoreKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_DatastoreKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DatastoreKey.class, com.google.privacy.dlp.v2.DatastoreKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DatastoreKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (entityKeyBuilder_ == null) {
        entityKey_ = null;
      } else {
        entityKey_ = null;
        entityKeyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage.internal_static_google_privacy_dlp_v2_DatastoreKey_descriptor;
    }

    public com.google.privacy.dlp.v2.DatastoreKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
    }

    public com.google.privacy.dlp.v2.DatastoreKey build() {
      com.google.privacy.dlp.v2.DatastoreKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.privacy.dlp.v2.DatastoreKey buildPartial() {
      com.google.privacy.dlp.v2.DatastoreKey result = new com.google.privacy.dlp.v2.DatastoreKey(this);
      if (entityKeyBuilder_ == null) {
        result.entityKey_ = entityKey_;
      } else {
        result.entityKey_ = entityKeyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.DatastoreKey) {
        return mergeFrom((com.google.privacy.dlp.v2.DatastoreKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DatastoreKey other) {
      if (other == com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance()) return this;
      if (other.hasEntityKey()) {
        mergeEntityKey(other.getEntityKey());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.DatastoreKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.DatastoreKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.Key entityKey_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.Key, com.google.privacy.dlp.v2.Key.Builder, com.google.privacy.dlp.v2.KeyOrBuilder> entityKeyBuilder_;
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public boolean hasEntityKey() {
      return entityKeyBuilder_ != null || entityKey_ != null;
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.Key getEntityKey() {
      if (entityKeyBuilder_ == null) {
        return entityKey_ == null ? com.google.privacy.dlp.v2.Key.getDefaultInstance() : entityKey_;
      } else {
        return entityKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public Builder setEntityKey(com.google.privacy.dlp.v2.Key value) {
      if (entityKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityKey_ = value;
        onChanged();
      } else {
        entityKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public Builder setEntityKey(
        com.google.privacy.dlp.v2.Key.Builder builderForValue) {
      if (entityKeyBuilder_ == null) {
        entityKey_ = builderForValue.build();
        onChanged();
      } else {
        entityKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public Builder mergeEntityKey(com.google.privacy.dlp.v2.Key value) {
      if (entityKeyBuilder_ == null) {
        if (entityKey_ != null) {
          entityKey_ =
            com.google.privacy.dlp.v2.Key.newBuilder(entityKey_).mergeFrom(value).buildPartial();
        } else {
          entityKey_ = value;
        }
        onChanged();
      } else {
        entityKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public Builder clearEntityKey() {
      if (entityKeyBuilder_ == null) {
        entityKey_ = null;
        onChanged();
      } else {
        entityKey_ = null;
        entityKeyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.Key.Builder getEntityKeyBuilder() {
      
      onChanged();
      return getEntityKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    public com.google.privacy.dlp.v2.KeyOrBuilder getEntityKeyOrBuilder() {
      if (entityKeyBuilder_ != null) {
        return entityKeyBuilder_.getMessageOrBuilder();
      } else {
        return entityKey_ == null ?
            com.google.privacy.dlp.v2.Key.getDefaultInstance() : entityKey_;
      }
    }
    /**
     * <pre>
     * Datastore entity key.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Key entity_key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.Key, com.google.privacy.dlp.v2.Key.Builder, com.google.privacy.dlp.v2.KeyOrBuilder> 
        getEntityKeyFieldBuilder() {
      if (entityKeyBuilder_ == null) {
        entityKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.Key, com.google.privacy.dlp.v2.Key.Builder, com.google.privacy.dlp.v2.KeyOrBuilder>(
                getEntityKey(),
                getParentForChildren(),
                isClean());
        entityKey_ = null;
      }
      return entityKeyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DatastoreKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DatastoreKey)
  private static final com.google.privacy.dlp.v2.DatastoreKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DatastoreKey();
  }

  public static com.google.privacy.dlp.v2.DatastoreKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatastoreKey>
      PARSER = new com.google.protobuf.AbstractParser<DatastoreKey>() {
    public DatastoreKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DatastoreKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DatastoreKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatastoreKey> getParserForType() {
    return PARSER;
  }

  public com.google.privacy.dlp.v2.DatastoreKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

