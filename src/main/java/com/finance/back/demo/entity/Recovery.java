package com.finance.back.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "recoveries")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recovery {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    private String recovery_code;

    private Date expire_code;

    private Boolean enabled;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
