package com.mzy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

      private String user_id;

    private String password;

    private String authority;

      /**
     * 用户本人的乘车人id
     */
      @TableField("Passenger")
    private Integer Passenger;


}
