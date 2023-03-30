package edu.ntnu.idatt2001.lectures.dp.builder.ex_lombok;

public class App {
    public static void main(String... arg) {
        ApiClientConfiguration config = ApiClientConfiguration.builder()
                .host("api.server.com")
                .port(443)
                .useHttps(true)
                .connectTimeout(15_000L)
                .readTimeout(5_000L)
                .username("myusername")
                .password("secret")
                .build();

                System.out.println(config.toString());
    }
}
