package com.parker.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication : 자동 설정, 이 부분부터 설정을 읽어 나감, 프로젝트 최상단 위치 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /* SpringApplication.run : 내장 WAS 실행 */
        SpringApplication.run(Application.class, args);
    }
}
