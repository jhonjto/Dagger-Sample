package com.test.xyz.daggersample1.service.di;

import android.app.Application;

import com.test.xyz.daggersample1.service.api.HelloService;
import com.test.xyz.daggersample1.service.impl.HelloServiceManager;
import com.test.xyz.daggersample1.service.impl.HelloServiceReleaseManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    @Provides
    @Singleton
    HelloService provideHelloService() {
        return new HelloServiceReleaseManager();
    }
}