package support;

import model.McResponse;
import model.vnode.McBlockInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McBlockInfoCallback<T> implements Callback<McResponse<McBlockInfo>> {
    public void onResponse(Call<McResponse<McBlockInfo>> call, Response<McResponse<McBlockInfo>> response){
        if (response.body().isSuccess()){
            System.out.println("this is a test");
        }else{
            System.out.println("something going wrong");
        }
    }

    public void onFailure(Call call, Throwable t){

    }
}
