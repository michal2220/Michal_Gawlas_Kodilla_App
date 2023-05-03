package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
@Getter
public class Mail {
    private final String mailTo;
    private final String subject;
    private final String message;
    private final String toCc;
}
