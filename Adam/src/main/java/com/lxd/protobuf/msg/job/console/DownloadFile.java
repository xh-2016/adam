// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: J_C_DownloadFile.proto

package com.lxd.protobuf.msg.job.console;

public final class DownloadFile {
  private DownloadFile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DownloadFile_OrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool state = 1;
    /**
     * <code>required bool state = 1;</code>
     *
     * <pre>
     *&#47;&lt; 文件是否下载成功
     * </pre>
     */
    boolean hasState();
    /**
     * <code>required bool state = 1;</code>
     *
     * <pre>
     *&#47;&lt; 文件是否下载成功
     * </pre>
     */
    boolean getState();
  }
  /**
   * Protobuf type {@code msg.job.console.DownloadFile_}
   */
  public static final class DownloadFile_ extends
      com.google.protobuf.GeneratedMessage
      implements DownloadFile_OrBuilder {
    // Use DownloadFile_.newBuilder() to construct.
    private DownloadFile_(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DownloadFile_(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DownloadFile_ defaultInstance;
    public static DownloadFile_ getDefaultInstance() {
      return defaultInstance;
    }

    public DownloadFile_ getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DownloadFile_(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              state_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lxd.protobuf.msg.job.console.DownloadFile.internal_static_msg_job_console_DownloadFile__descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lxd.protobuf.msg.job.console.DownloadFile.internal_static_msg_job_console_DownloadFile__fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.class, com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.Builder.class);
    }

    public static com.google.protobuf.Parser<DownloadFile_> PARSER =
        new com.google.protobuf.AbstractParser<DownloadFile_>() {
      public DownloadFile_ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DownloadFile_(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DownloadFile_> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool state = 1;
    public static final int STATE_FIELD_NUMBER = 1;
    private boolean state_;
    /**
     * <code>required bool state = 1;</code>
     *
     * <pre>
     *&#47;&lt; 文件是否下载成功
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool state = 1;</code>
     *
     * <pre>
     *&#47;&lt; 文件是否下载成功
     * </pre>
     */
    public boolean getState() {
      return state_;
    }

    private void initFields() {
      state_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, state_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, state_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code msg.job.console.DownloadFile_}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lxd.protobuf.msg.job.console.DownloadFile.internal_static_msg_job_console_DownloadFile__descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lxd.protobuf.msg.job.console.DownloadFile.internal_static_msg_job_console_DownloadFile__fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.class, com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.Builder.class);
      }

      // Construct using com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        state_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lxd.protobuf.msg.job.console.DownloadFile.internal_static_msg_job_console_DownloadFile__descriptor;
      }

      public com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ getDefaultInstanceForType() {
        return com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.getDefaultInstance();
      }

      public com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ build() {
        com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ buildPartial() {
        com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ result = new com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.state_ = state_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_) {
          return mergeFrom((com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ other) {
        if (other == com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_.getDefaultInstance()) return this;
        if (other.hasState()) {
          setState(other.getState());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasState()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.lxd.protobuf.msg.job.console.DownloadFile.DownloadFile_) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool state = 1;
      private boolean state_ ;
      /**
       * <code>required bool state = 1;</code>
       *
       * <pre>
       *&#47;&lt; 文件是否下载成功
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool state = 1;</code>
       *
       * <pre>
       *&#47;&lt; 文件是否下载成功
       * </pre>
       */
      public boolean getState() {
        return state_;
      }
      /**
       * <code>required bool state = 1;</code>
       *
       * <pre>
       *&#47;&lt; 文件是否下载成功
       * </pre>
       */
      public Builder setState(boolean value) {
        bitField0_ |= 0x00000001;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool state = 1;</code>
       *
       * <pre>
       *&#47;&lt; 文件是否下载成功
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:msg.job.console.DownloadFile_)
    }

    static {
      defaultInstance = new DownloadFile_(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:msg.job.console.DownloadFile_)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_msg_job_console_DownloadFile__descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_msg_job_console_DownloadFile__fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026J_C_DownloadFile.proto\022\017msg.job.consol" +
      "e\"\036\n\rDownloadFile_\022\r\n\005state\030\001 \002(\010B0\n com" +
      ".lxd.protobuf.msg.job.consoleB\014DownloadF" +
      "ile"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_msg_job_console_DownloadFile__descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_msg_job_console_DownloadFile__fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_msg_job_console_DownloadFile__descriptor,
              new java.lang.String[] { "State", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}