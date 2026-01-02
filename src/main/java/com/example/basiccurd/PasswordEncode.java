package com.example.basiccurd;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncode {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String pt="admin1234";
        String hashed=encoder.encode(pt);
        System.out.println("hashed :"+hashed);

    }
}
