package me.brunols.api_restful_java.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Setter
@Getter
@Entity(name="tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @NotNull
    private String agency;

    @Column(scale = 2, precision = 13)
    private BigDecimal balance;

    @Column(name="additional_limit",scale = 2, precision = 13)
    private BigDecimal limit;

}
