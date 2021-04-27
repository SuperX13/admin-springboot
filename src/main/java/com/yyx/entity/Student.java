package com.yyx.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xin
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private String name;

    private String gender;

    private String birthday;

    private Integer tid;


}
