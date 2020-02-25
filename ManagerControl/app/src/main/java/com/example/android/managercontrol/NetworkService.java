//package com.example.android.managercontrol;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
////public class NetworkService {
////
////    private static NetworkService mInstance;
////    private static final String BASE_URL = "http://192.168.1.215:3012/api/";
////    private Retrofit mRetrofit;
////
////    private NetworkService() {
////        mRetrofit = new Retrofit.Builder()
////                .baseUrl(BASE_URL)
////                .addConverterFactory(GsonConverterFactory.create())
////                .build();
////    }
////
////    public static NetworkService getInstance() {
////        if (mInstance == null) {
////            mInstance = new NetworkService();
////        }
////        return mInstance;
////    }
////
////    public JSONPlaceHolderApi getJSONApi() {
////        return mRetrofit.create(JSONPlaceHolderApi.class);
////    }
////
////}
//public class ApiClient {
//
//    private static final String BASE_URL="http://192.168.1.215:3012/api/";
//    public static Retrofit retrofit = null;
//    public static ApiInterface instance=null;
//
//    public static Retrofit getApiClient(){
//
//        if (retrofit==null){
//            retrofit=new Retrofit.Builder().baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create()).build();
//        }
//        return retrofit;
//    }
//
//    public static ApiInterface getInterface(){
//
//        if (instance==null){
//            instance=getApiClient().create(ApiInterface.class);
//        }
//
//
//        return instance;
//    }
//
//}