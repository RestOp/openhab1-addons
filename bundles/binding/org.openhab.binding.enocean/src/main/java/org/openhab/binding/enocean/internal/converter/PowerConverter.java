/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.enocean.internal.converter;

import java.math.BigDecimal;

import org.opencean.core.common.values.NumberWithUnit;
import org.opencean.core.common.values.Unit;
import org.openhab.core.library.types.DecimalType;
import org.openhab.core.library.types.PercentType;

/**
 * A converter to convert a NumberWithUnit WATT to a DecimalType
 *
 * @author Thomas Letsch (contact@thomas-letsch.de)
 * @since 1.4.0
 *
 */
public class PowerConverter extends StateConverter<NumberWithUnit, DecimalType> {

    @Override
    protected NumberWithUnit convertFromImpl(DecimalType source) {
        return new NumberWithUnit(Unit.WATT, source.toBigDecimal());
    }

    @Override
    protected DecimalType convertToImpl(NumberWithUnit source) {
        return new PercentType((BigDecimal) source.getValue());
    }

}
