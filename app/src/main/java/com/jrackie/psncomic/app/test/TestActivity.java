package com.jrackie.psncomic.app.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jrackie.psncomic.R;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by Administrator on 2016/12/4.
 */

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//            Log.i("wxy","main thread id is "+Thread.currentThread().getId());
//            String url = "http://apicloud.mob.com/v1/weather/query?key=146d30f8f3b93&city=长沙&province=湖南";
//            OkHttpClient client = new OkHttpClient();
//            Request request = new Request.Builder().url(url).build();
//            client.newCall(request).enqueue(new okhttp3.Callback() {
//                @Override
//                public void onFailure(okhttp3.Call call, IOException e) {
//
//                }
//                @Override
//                public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
//                    // 注：该回调是子线程，非主线程
//                    Log.i("wxy","callback thread id is "+Thread.currentThread().getId());
//                    Log.i("wxy",response.body().string());
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//            }
//        }).start();
        try {
            Log.i("wxy","main thread id is "+Thread.currentThread().getId());
//            String url = "http://apicloud.mob.com/v1/weather/query?key=146d30f8f3b93&city=长沙&province=湖南";
            String url = "http://www.kuaidi100.com/query?type=快递公司代号&postid=快递单号";
            OkHttpClient client = new OkHttpClient();
            FormBody formBody=new FormBody.Builder().add("test","123").build();
            Request request = new Request.Builder().url(url).method("POST",formBody).build();
            client.newCall(request).enqueue(new okhttp3.Callback() {
                @Override
                public void onFailure(okhttp3.Call call, IOException e) {

                }
                @Override
                public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                    // 注：该回调是子线程，非主线程
                    Log.i("wxy","callback thread id is "+Thread.currentThread().getId());
                    Log.i("wxy",response.body().string());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
