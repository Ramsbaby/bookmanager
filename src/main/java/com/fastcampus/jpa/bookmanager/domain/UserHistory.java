package com.fastcampus.jpa.bookmanager.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@EntityListeners(value = MyEntitiyListener.class)
public class UserHistory extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private String name;

    private String email;

}
