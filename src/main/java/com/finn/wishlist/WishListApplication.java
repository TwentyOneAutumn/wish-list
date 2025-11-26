package com.finn.wishlist;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class WishListApplication {

    public static void main(String[] args) {
        SpringApplication.run(WishListApplication.class, args);
        log.info("WishListApplication started");
    }
}
