package support;

import model.McResponse;
import model.vnode.McTransactionReceiptByHash;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McTransactionReceiptByHashCallback<T> implements Callback<McResponse<McTransactionReceiptByHash>> {
    public void onResponse(Call<McResponse<McTransactionReceiptByHash>> call, Response<McResponse<McTransactionReceiptByHash>> response){
        if (response.body().isSuccess()){
            System.out.println("this is a test");
        }else{
            System.out.println("something going wrong");
        }
    }

    public void onFailure(Call call, Throwable t){

    }
}


