package com.mzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
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

public class Travel_dynamic implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "travel_dynamic_id", type = IdType.AUTO)
      private Integer travel_dynamic_id;

    private Integer travel_id;

    private LocalDateTime date;

    private Integer soft_seat_rest_ticket;

    private Integer hard_seat_rest_ticket;

    private Integer soft_bed_rest_ticket;

    private Integer hard_bed_rest_ticket;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getTravel_dynamic_id() {
        return travel_dynamic_id;
    }

    public void setTravel_dynamic_id(Integer travel_dynamic_id) {
        this.travel_dynamic_id = travel_dynamic_id;
    }

    public Integer getTravel_id() {
        return travel_id;
    }

    public void setTravel_id(Integer travel_id) {
        this.travel_id = travel_id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getSoft_seat_rest_ticket() {
        return soft_seat_rest_ticket;
    }

    public void setSoft_seat_rest_ticket(Integer soft_seat_rest_ticket) {
        this.soft_seat_rest_ticket = soft_seat_rest_ticket;
    }

    public Integer getHard_seat_rest_ticket() {
        return hard_seat_rest_ticket;
    }

    public void setHard_seat_rest_ticket(Integer hard_seat_rest_ticket) {
        this.hard_seat_rest_ticket = hard_seat_rest_ticket;
    }

    public Integer getSoft_bed_rest_ticket() {
        return soft_bed_rest_ticket;
    }

    public void setSoft_bed_rest_ticket(Integer soft_bed_rest_ticket) {
        this.soft_bed_rest_ticket = soft_bed_rest_ticket;
    }

    public Integer getHard_bed_rest_ticket() {
        return hard_bed_rest_ticket;
    }

    public void setHard_bed_rest_ticket(Integer hard_bed_rest_ticket) {
        this.hard_bed_rest_ticket = hard_bed_rest_ticket;
    }
}
