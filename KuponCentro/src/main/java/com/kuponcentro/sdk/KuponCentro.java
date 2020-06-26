package com.kuponcentro.sdk;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class KuponCentro {

    public static void RecordInstall(String APP_ID, String MSISDN){

        OkHttpClient Client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("APP_ID", APP_ID)
                .add("MSISDN", MSISDN)
                .build();

        Request request = new Request.Builder()
                .url("https://www.kuponcentro.com/api/apps/install")
                .post(formBody)
                .build();

        Client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                }
            }
        });
    }
}
