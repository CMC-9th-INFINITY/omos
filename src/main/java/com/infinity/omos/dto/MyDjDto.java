package com.infinity.omos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
public class MyDjDto {
    private Long userId;
    private String nickName;
    private String profileUrl;
}