package com.mzy.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author mzy
 * @since 2020-05-22
 */
@Data
//  @EqualsAndHashCode(callSuper = false)
//  @Accessors(chain = true)
public class Seat_type implements Serializable {

    private static final long serialVersionUID=1L;

      private String seat_number;

    private String seat_type;


}
