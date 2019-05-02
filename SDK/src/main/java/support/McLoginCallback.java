package support;

import model.McResponse;
import model.acount.McLogin;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McLoginCallback<T> implements Callback<McLogin> {
        public void onResponse(Call<McLogin> call, Response<McLogin> response){
                if (response.body().isSuccess()){
                        System.out.println("this is a test");
                }else{
                        System.out.println("something going wrong");
                }
        }

        public void onFailure(Call call, Throwable t){

        }
}
