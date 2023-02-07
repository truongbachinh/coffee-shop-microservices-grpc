package dev.grpc.user.resource;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "dev.grpc.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.CreateUserRequest,
      dev.grpc.user.Resources.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = dev.grpc.user.Resources.CreateUserRequest.class,
      responseType = dev.grpc.user.Resources.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.CreateUserRequest,
      dev.grpc.user.Resources.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.CreateUserRequest, dev.grpc.user.Resources.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.CreateUserRequest, dev.grpc.user.Resources.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.CreateListUserRequest,
      dev.grpc.user.Resources.CreateListUserResponse> getCreateListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateListUser",
      requestType = dev.grpc.user.Resources.CreateListUserRequest.class,
      responseType = dev.grpc.user.Resources.CreateListUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.CreateListUserRequest,
      dev.grpc.user.Resources.CreateListUserResponse> getCreateListUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.CreateListUserRequest, dev.grpc.user.Resources.CreateListUserResponse> getCreateListUserMethod;
    if ((getCreateListUserMethod = UserServiceGrpc.getCreateListUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateListUserMethod = UserServiceGrpc.getCreateListUserMethod) == null) {
          UserServiceGrpc.getCreateListUserMethod = getCreateListUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.CreateListUserRequest, dev.grpc.user.Resources.CreateListUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.CreateListUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.CreateListUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateListUser"))
              .build();
        }
      }
    }
    return getCreateListUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.GetUserRequest,
      dev.grpc.user.Resources.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = dev.grpc.user.Resources.GetUserRequest.class,
      responseType = dev.grpc.user.Resources.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.GetUserRequest,
      dev.grpc.user.Resources.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.GetUserRequest, dev.grpc.user.Resources.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.GetUserRequest, dev.grpc.user.Resources.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      dev.grpc.user.Resources.GetListUserResponse> getGetListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListUser",
      requestType = com.google.protobuf.Empty.class,
      responseType = dev.grpc.user.Resources.GetListUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      dev.grpc.user.Resources.GetListUserResponse> getGetListUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, dev.grpc.user.Resources.GetListUserResponse> getGetListUserMethod;
    if ((getGetListUserMethod = UserServiceGrpc.getGetListUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetListUserMethod = UserServiceGrpc.getGetListUserMethod) == null) {
          UserServiceGrpc.getGetListUserMethod = getGetListUserMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, dev.grpc.user.Resources.GetListUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.GetListUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetListUser"))
              .build();
        }
      }
    }
    return getGetListUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.SearchUserByFullNameRequest,
      dev.grpc.user.Resources.SearchUserByFullNameResponse> getSearchUserByFullNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUserByFullName",
      requestType = dev.grpc.user.Resources.SearchUserByFullNameRequest.class,
      responseType = dev.grpc.user.Resources.SearchUserByFullNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.SearchUserByFullNameRequest,
      dev.grpc.user.Resources.SearchUserByFullNameResponse> getSearchUserByFullNameMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.SearchUserByFullNameRequest, dev.grpc.user.Resources.SearchUserByFullNameResponse> getSearchUserByFullNameMethod;
    if ((getSearchUserByFullNameMethod = UserServiceGrpc.getSearchUserByFullNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchUserByFullNameMethod = UserServiceGrpc.getSearchUserByFullNameMethod) == null) {
          UserServiceGrpc.getSearchUserByFullNameMethod = getSearchUserByFullNameMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.SearchUserByFullNameRequest, dev.grpc.user.Resources.SearchUserByFullNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUserByFullName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.SearchUserByFullNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.SearchUserByFullNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchUserByFullName"))
              .build();
        }
      }
    }
    return getSearchUserByFullNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.UpdateUserRequest,
      dev.grpc.user.Resources.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = dev.grpc.user.Resources.UpdateUserRequest.class,
      responseType = dev.grpc.user.Resources.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.UpdateUserRequest,
      dev.grpc.user.Resources.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.UpdateUserRequest, dev.grpc.user.Resources.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.UpdateUserRequest, dev.grpc.user.Resources.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.UpdateListUserRequest,
      dev.grpc.user.Resources.UpdateListUserResponse> getUpdateListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateListUser",
      requestType = dev.grpc.user.Resources.UpdateListUserRequest.class,
      responseType = dev.grpc.user.Resources.UpdateListUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.UpdateListUserRequest,
      dev.grpc.user.Resources.UpdateListUserResponse> getUpdateListUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.UpdateListUserRequest, dev.grpc.user.Resources.UpdateListUserResponse> getUpdateListUserMethod;
    if ((getUpdateListUserMethod = UserServiceGrpc.getUpdateListUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateListUserMethod = UserServiceGrpc.getUpdateListUserMethod) == null) {
          UserServiceGrpc.getUpdateListUserMethod = getUpdateListUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.UpdateListUserRequest, dev.grpc.user.Resources.UpdateListUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.UpdateListUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.UpdateListUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateListUser"))
              .build();
        }
      }
    }
    return getUpdateListUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.DeleteUserRequest,
      dev.grpc.user.Resources.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = dev.grpc.user.Resources.DeleteUserRequest.class,
      responseType = dev.grpc.user.Resources.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.DeleteUserRequest,
      dev.grpc.user.Resources.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.DeleteUserRequest, dev.grpc.user.Resources.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.DeleteUserRequest, dev.grpc.user.Resources.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dev.grpc.user.Resources.DeleteListUserRequest,
      dev.grpc.user.Resources.DeleteListUserResponse> getDeleteListUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteListUser",
      requestType = dev.grpc.user.Resources.DeleteListUserRequest.class,
      responseType = dev.grpc.user.Resources.DeleteListUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dev.grpc.user.Resources.DeleteListUserRequest,
      dev.grpc.user.Resources.DeleteListUserResponse> getDeleteListUserMethod() {
    io.grpc.MethodDescriptor<dev.grpc.user.Resources.DeleteListUserRequest, dev.grpc.user.Resources.DeleteListUserResponse> getDeleteListUserMethod;
    if ((getDeleteListUserMethod = UserServiceGrpc.getDeleteListUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteListUserMethod = UserServiceGrpc.getDeleteListUserMethod) == null) {
          UserServiceGrpc.getDeleteListUserMethod = getDeleteListUserMethod =
              io.grpc.MethodDescriptor.<dev.grpc.user.Resources.DeleteListUserRequest, dev.grpc.user.Resources.DeleteListUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteListUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.DeleteListUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dev.grpc.user.Resources.DeleteListUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteListUser"))
              .build();
        }
      }
    }
    return getDeleteListUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(dev.grpc.user.Resources.CreateUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void createListUser(dev.grpc.user.Resources.CreateListUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.CreateListUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateListUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(dev.grpc.user.Resources.GetUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void getListUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.GetListUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListUserMethod(), responseObserver);
    }

    /**
     */
    public void searchUserByFullName(dev.grpc.user.Resources.SearchUserByFullNameRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.SearchUserByFullNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUserByFullNameMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(dev.grpc.user.Resources.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void updateListUser(dev.grpc.user.Resources.UpdateListUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.UpdateListUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateListUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(dev.grpc.user.Resources.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteListUser(dev.grpc.user.Resources.DeleteListUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.DeleteListUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteListUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.CreateUserRequest,
                dev.grpc.user.Resources.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getCreateListUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.CreateListUserRequest,
                dev.grpc.user.Resources.CreateListUserResponse>(
                  this, METHODID_CREATE_LIST_USER)))
          .addMethod(
            getGetUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.GetUserRequest,
                dev.grpc.user.Resources.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getGetListUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                dev.grpc.user.Resources.GetListUserResponse>(
                  this, METHODID_GET_LIST_USER)))
          .addMethod(
            getSearchUserByFullNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.SearchUserByFullNameRequest,
                dev.grpc.user.Resources.SearchUserByFullNameResponse>(
                  this, METHODID_SEARCH_USER_BY_FULL_NAME)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.UpdateUserRequest,
                dev.grpc.user.Resources.UpdateUserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getUpdateListUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.UpdateListUserRequest,
                dev.grpc.user.Resources.UpdateListUserResponse>(
                  this, METHODID_UPDATE_LIST_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.DeleteUserRequest,
                dev.grpc.user.Resources.DeleteUserResponse>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getDeleteListUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dev.grpc.user.Resources.DeleteListUserRequest,
                dev.grpc.user.Resources.DeleteListUserResponse>(
                  this, METHODID_DELETE_LIST_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(dev.grpc.user.Resources.CreateUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createListUser(dev.grpc.user.Resources.CreateListUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.CreateListUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateListUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(dev.grpc.user.Resources.GetUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.GetListUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUserByFullName(dev.grpc.user.Resources.SearchUserByFullNameRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.SearchUserByFullNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUserByFullNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(dev.grpc.user.Resources.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateListUser(dev.grpc.user.Resources.UpdateListUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.UpdateListUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateListUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(dev.grpc.user.Resources.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteListUser(dev.grpc.user.Resources.DeleteListUserRequest request,
        io.grpc.stub.StreamObserver<dev.grpc.user.Resources.DeleteListUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteListUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dev.grpc.user.Resources.CreateUserResponse createUser(dev.grpc.user.Resources.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.CreateListUserResponse createListUser(dev.grpc.user.Resources.CreateListUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateListUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.GetUserResponse getUser(dev.grpc.user.Resources.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.GetListUserResponse getListUser(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.SearchUserByFullNameResponse searchUserByFullName(dev.grpc.user.Resources.SearchUserByFullNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUserByFullNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.UpdateUserResponse updateUser(dev.grpc.user.Resources.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.UpdateListUserResponse updateListUser(dev.grpc.user.Resources.UpdateListUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateListUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.DeleteUserResponse deleteUser(dev.grpc.user.Resources.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dev.grpc.user.Resources.DeleteListUserResponse deleteListUser(dev.grpc.user.Resources.DeleteListUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteListUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.CreateUserResponse> createUser(
        dev.grpc.user.Resources.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.CreateListUserResponse> createListUser(
        dev.grpc.user.Resources.CreateListUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateListUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.GetUserResponse> getUser(
        dev.grpc.user.Resources.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.GetListUserResponse> getListUser(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.SearchUserByFullNameResponse> searchUserByFullName(
        dev.grpc.user.Resources.SearchUserByFullNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUserByFullNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.UpdateUserResponse> updateUser(
        dev.grpc.user.Resources.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.UpdateListUserResponse> updateListUser(
        dev.grpc.user.Resources.UpdateListUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateListUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.DeleteUserResponse> deleteUser(
        dev.grpc.user.Resources.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.grpc.user.Resources.DeleteListUserResponse> deleteListUser(
        dev.grpc.user.Resources.DeleteListUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteListUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_CREATE_LIST_USER = 1;
  private static final int METHODID_GET_USER = 2;
  private static final int METHODID_GET_LIST_USER = 3;
  private static final int METHODID_SEARCH_USER_BY_FULL_NAME = 4;
  private static final int METHODID_UPDATE_USER = 5;
  private static final int METHODID_UPDATE_LIST_USER = 6;
  private static final int METHODID_DELETE_USER = 7;
  private static final int METHODID_DELETE_LIST_USER = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((dev.grpc.user.Resources.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.CreateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_LIST_USER:
          serviceImpl.createListUser((dev.grpc.user.Resources.CreateListUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.CreateListUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((dev.grpc.user.Resources.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_USER:
          serviceImpl.getListUser((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.GetListUserResponse>) responseObserver);
          break;
        case METHODID_SEARCH_USER_BY_FULL_NAME:
          serviceImpl.searchUserByFullName((dev.grpc.user.Resources.SearchUserByFullNameRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.SearchUserByFullNameResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((dev.grpc.user.Resources.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LIST_USER:
          serviceImpl.updateListUser((dev.grpc.user.Resources.UpdateListUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.UpdateListUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((dev.grpc.user.Resources.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_LIST_USER:
          serviceImpl.deleteListUser((dev.grpc.user.Resources.DeleteListUserRequest) request,
              (io.grpc.stub.StreamObserver<dev.grpc.user.Resources.DeleteListUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.grpc.user.resource.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getCreateListUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetListUserMethod())
              .addMethod(getSearchUserByFullNameMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getUpdateListUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getDeleteListUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
