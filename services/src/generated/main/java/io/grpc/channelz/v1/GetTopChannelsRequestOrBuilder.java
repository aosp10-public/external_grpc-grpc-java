// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface GetTopChannelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.GetTopChannelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * start_channel_id indicates that only channels at or above this id should be
   * included in the results.
   * </pre>
   *
   * <code>int64 start_channel_id = 1;</code>
   */
  long getStartChannelId();
}
