
Copyright (c) 2020-2021 Pinecone Systems Inc. All right reserved.


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/vector_service.proto

package io.pinecone.proto;

public interface QueryVectorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QueryVector)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The query vector values. This should be the same length as the dimension of the index being queried.
   * </pre>
   *
   * <code>repeated float values = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.Float> getValuesList();
  /**
   * <pre>
   * The query vector values. This should be the same length as the dimension of the index being queried.
   * </pre>
   *
   * <code>repeated float values = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * The query vector values. This should be the same length as the dimension of the index being queried.
   * </pre>
   *
   * <code>repeated float values = 1 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  float getValues(int index);

  /**
   * <pre>
   * An override for the number of results to return for this query vector.
   * </pre>
   *
   * <code>uint32 top_k = 2 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The topK.
   */
  int getTopK();

  /**
   * <pre>
   * An override the namespace to search.
   * </pre>
   *
   * <code>string namespace = 3 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <pre>
   * An override the namespace to search.
   * </pre>
   *
   * <code>string namespace = 3 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <pre>
   * An override for the metadata filter to apply. This replaces the request-level filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct filter = 4 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * An override for the metadata filter to apply. This replaces the request-level filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct filter = 4 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The filter.
   */
  com.google.protobuf.Struct getFilter();
  /**
   * <pre>
   * An override for the metadata filter to apply. This replaces the request-level filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct filter = 4 [(.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.StructOrBuilder getFilterOrBuilder();
}
