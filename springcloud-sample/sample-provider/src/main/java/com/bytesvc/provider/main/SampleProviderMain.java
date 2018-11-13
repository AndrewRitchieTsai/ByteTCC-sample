package com.bytesvc.provider.main;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudConfiguration;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * ���������ȸ��ؾ���(ʹ��MongoDB�洢������־):������SpringCloudConfiguration; <br />
 * ���������ȸ��ؾ���(ʹ���ļ�ϵͳ�洢������־):������SpringCloudSecondaryConfiguration;
 */
@Import(SpringCloudConfiguration.class)
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.bytesvc.provider")
public class SampleProviderMain {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SampleProviderMain.class).bannerMode(Banner.Mode.OFF).run(args);
		System.out.println("springcloud-sample-provider started!");
	}

}
