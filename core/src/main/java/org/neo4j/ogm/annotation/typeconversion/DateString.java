/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 *  conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package org.neo4j.ogm.annotation.typeconversion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates OGM to store dates as String in ISO_8601 format in the database.
 * Applicable to `java.util.Date` and `java.time.Instant`
 *
 * @author Vince Bickers
 * @author Gerrit Meier
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface DateString {

    String FORMAT = "value";

    String ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    String value() default ISO_8601;

    /**
     * Toggle lenient conversion mode by setting this flag to true (defaults to false).
     * Has to be supported by the corresponding converter.
     * @return flag that represents the desired conversion mode.
     */
    boolean lenient() default false;
}

