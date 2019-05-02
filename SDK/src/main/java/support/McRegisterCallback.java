package support;

import model.McResponse;
import model.acount.McRegister;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McRegisterCallback<T> implements Callback<McRegister> {
    public void onResponse(Call<McRegister> call, Response<McRegister> response){
        if (response.body().isSuccess()){
            System.out.println("this is a test");
        }else{
            System.out.println("something going wrong");
        }
    }

    public void onFailure(Call call, Throwable t){

    }
}
