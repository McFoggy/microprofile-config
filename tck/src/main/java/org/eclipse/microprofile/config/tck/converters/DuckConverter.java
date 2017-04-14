/**********************************************************************
 * Copyright (c) 2016-2017 Contributors to the Eclipse Foundation 
 *
 * See the NOTICES file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * SPDX-License-Identifier: Apache-2.0
 **********************************************************************/
package org.eclipse.microprofile.config.tck.converters;

import org.eclipse.microprofile.config.spi.Converter;

/**
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 */
public class DuckConverter implements Converter<Duck> {

    @Override
    public Duck convert(String value) {
        return new Duck(value);
    }
}
