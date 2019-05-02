package support;

import model.McResponse;
import model.vnode.McTransactionByHash;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McTransactionByHashCallback<T> implements Callback<McResponse<McTransactionByHash>> {
    public void onResponse(Call<McResponse<McTransactionByHash>> call, Response<McResponse<McTransactionByHash>> response){
        if (response.body().isSuccess()){
            System.out.println("this is a test");
        }else{
            System.out.println("something going wrong");
        }
    }

    public void onFailure(Call call, Throwable t){

    }
}

