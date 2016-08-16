/*
 * Copyright 2015, Yahoo Inc.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package com.yahoo.elide.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * On Commit trigger annotation.
 * The onCommit invoked function takes a Requestscope as parameter.
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface OnCommit {

    String value() default "";
}
