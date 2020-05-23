package com.mzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Passenger implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "passenger_id", type = IdType.AUTO)
      private Integer passenger_id;

    private String id_card_number;

    private String name;

    private String phone_number;

    private Integer gender;

    private String indentity;

    public Passenger( String name, String id_card_number,String phone_number, String indentity) {

        this.id_card_number = id_card_number;
        this.name = name;
        this.phone_number = phone_number;
        this.indentity = indentity;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(Integer passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getId_card_number() {
        return id_card_number;
    }

    public void setId_card_number(String id_card_number) {
        this.id_card_number = id_card_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIndentity() {
        return indentity;
    }

    public void setIndentity(String indentity) {
        this.indentity = indentity;
    }
}
