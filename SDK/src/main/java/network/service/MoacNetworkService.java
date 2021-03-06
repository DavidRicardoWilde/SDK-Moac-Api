package network.service;

import network.MoacInterface;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoacNetworkService {
    private Retrofit retrofit;
    private MoacInterface moacInterface;

    public MoacNetworkService(String baseURL){
        //
        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        moacInterface = retrofit.create(MoacInterface.class);
    }

    public MoacInterface getMoacInterface(){
        return moacInterface;
    }
}
