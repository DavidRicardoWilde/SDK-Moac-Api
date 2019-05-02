package support;

import model.McResponse;
import model.acount.McImport;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class McImportCallback<T> implements Callback<McImport> {
    public void onResponse(Call<McImport> call, Response<McImport> response){
        if (response.body().isSuccess()){
            System.out.println("this is a test");
        }else{
            System.out.println("something going wrong");
        }
    }

    public void onFailure(Call call, Throwable t){

    }
}
