package edu.ntnu.idatt2001.lectures.dp.builder.ex_lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ApiClientConfiguration {

    private String host;
    private int port;
    private boolean useHttps;

    private long connectTimeout;
    private long readTimeout;

    private String username;
    private String password;

    // Whatever other options you may thing.

    // Empty constructor? All combinations?

    // getters... and setters?
}