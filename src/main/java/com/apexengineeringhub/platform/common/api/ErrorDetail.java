package com.apexengineeringhub.platform.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
@AllArgsConstructor
public class ErrorDetail {
    private final  String field;
    private final String code;
    private final String message;

}
