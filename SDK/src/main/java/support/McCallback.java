package support;

import model.McResponse;
import model.acount.McRegister;
import model.vnode.McTransactionByHash;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McCallback<T> implements Callback<McResponse> {
    public void onResponse(Call<McResponse> call, Response<McResponse> response){
        if (response.body().isSuccess()){
            System.out.println("this is a test");
        }else{
            System.out.println("something going wrong");
        }
    }

    public void onFailure(Call call, Throwable t){

    }
}
